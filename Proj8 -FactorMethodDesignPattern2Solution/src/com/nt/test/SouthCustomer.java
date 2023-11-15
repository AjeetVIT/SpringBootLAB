package com.nt.test;

//import java.lang.invoke.ClassSpecializer.Factory;

import com.nt.comps.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajNoidaFactory;
import com.nt.factory.BajajbikeFactoryLocator;

public class SouthCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//BajajBikeFacory factory=new BajajChennaiFactory();
		//BajajBikeFactory factory=new BajajChennaiFactory();
		BajajBikeFactory factory=BajajbikeFactoryLocator.buildBikeFactory("chennai");
			BajajBike bike=factory.orderBike("pulsor");
			bike.drive();
			
		}

	
}
