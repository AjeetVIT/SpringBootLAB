package com.nt.test;

import com.nt.comps.BajajBike;
import com.nt.factory.BajajBikeFactory;
//import com.nt.factory.BajajNoidaFactory;
import com.nt.factory.BajajbikeFactoryLocator;

public class NorthCustomer {
	public static void main(String[] args) {
		//BajajBikeFactory factory=new BajajNoidaFactory();
		BajajBikeFactory factory=BajajbikeFactoryLocator.buildBikeFactory("noida");
		BajajBike bike=factory.orderBike("pulsor");
		bike.drive();
	}

}
