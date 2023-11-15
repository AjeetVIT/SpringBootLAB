package com.nt.factory;

import com.nt.dao.Dao;
import com.nt.dao.DbCourseDao;
import com.nt.dao.ExcelCourseDAO;
import com.nt.dao.ExcelStudentDao;

public class ExcelDAOFactory {
	public static Dao createDao(String type) {
		if(type.equalsIgnoreCase("student"))
			return new ExcelStudentDao();
		else if(type.equalsIgnoreCase("course"))
			return new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Invalid Dao type");
		
	}

}
