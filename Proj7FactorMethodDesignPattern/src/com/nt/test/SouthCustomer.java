package com.nt.test;

import com.nt.comps.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajNoidaFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			BajajBike bike=BajajChennaiFactory.createBike("pulsor");
			bike.drive();
		}

	
}
