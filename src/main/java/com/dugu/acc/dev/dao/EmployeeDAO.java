package com.dugu.acc.dev.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dugu.acc.dev.model.EmployeeModel;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory factory;

	public EmployeeModel getCalling(int id) {
		return (EmployeeModel) factory.openSession().get(EmployeeModel.class,
				id);
	}

	public EmployeeModel loadCalling(int id) {
		return (EmployeeModel) factory.openSession().get(EmployeeModel.class,
				id);
	}
}
