package com.nt.test;

import com.nt.dao.Dao;
import com.nt.factory.ExcelDAOFactory;

public class GoodCLientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao stDao=ExcelDAOFactory.createDao("student");
		Dao crsDao=ExcelDAOFactory.createDao("course");
		stDao.insert();
		crsDao.insert();

	}

}
