package com.nt.test;


import com.nt.comps.Car;

import com.nt.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=CarFactory.getCar("beleno");
		System.out.println(car1);
		
		

	}

}
