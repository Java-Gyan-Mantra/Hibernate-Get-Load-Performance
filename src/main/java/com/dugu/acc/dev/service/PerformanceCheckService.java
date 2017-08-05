package com.dugu.acc.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dugu.acc.dev.dao.EmployeeDAO;

@Service
public class PerformanceCheckService {
	@Autowired
	private EmployeeDAO dao;

	long startTime = 0;
	long endTime = 0;
	long totalTime = 0;

	public String getCallTime(int id) {
		startTime = System.currentTimeMillis();
		dao.getCalling(id);
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		return "get() method call take times" + "{" + totalTime + "}";
	}

	public String loadCallTime(int id) {
		startTime = System.currentTimeMillis();
		dao.loadCalling(id);
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		return "load() method call take times" + "{" + totalTime + "}";
	}
}
