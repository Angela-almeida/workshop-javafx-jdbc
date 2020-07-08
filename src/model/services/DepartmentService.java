package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate (Department obj) { //ver se é para adiconar um novo departamento no banco ou atualizar
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	
	}
	
	public void remove(Department obj) { //remove um departamento do banco de dados
		dao.deleteById(obj.getId());
	}
}