package com.nt.factory;

import com.nt.dao.DBStudentDAO;
import com.nt.dao.Dao;
import com.nt.dao.DbCourseDao;
import com.nt.dao.ExcelStudentDao;
//import com.nt.dao.ExcelStudentDao;

public class DBDAOFactory {
	public static Dao createDao(String type) {
		if(type.equalsIgnoreCase("student"))
		
		return new DBStudentDAO();
		else if(type.equalsIgnoreCase("course")) 
			return new DbCourseDao();
			else
			throw new IllegalArgumentException("Invalid DAO type");
		}
		
	}


