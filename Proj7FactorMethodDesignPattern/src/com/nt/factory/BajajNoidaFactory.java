package com.nt.factory;

import com.nt.comps.BajajBike;
import com.nt.comps.BajajDiscover;
import com.nt.comps.BajajPlatina;
import com.nt.comps.BajajPulsar;

public class BajajNoidaFactory {
	public static void paint() {
		System.out.println("Painting Bajaj Bike");
	}
	public static void assemble() {
		System.out.println("Assembling Bajaj Bike");
	}
		public static void roadTest()
		{
			System.out.println("RoadTesting of Bajaj bike");
		}
		public static void oiling() {
			System.out.println("Oiling of Bajaj bike");
		}
		//factory method
		public static BajajBike createBike(String type) {
			BajajBike bike=null;
			if(type.equalsIgnoreCase("Discover"))
				bike=new BajajDiscover();
			else if(type.equalsIgnoreCase("platina"))
				bike=new BajajPlatina();
			else if(type.equalsIgnoreCase("pulsor"))
				bike=new BajajPulsar();
			else
				throw new IllegalArgumentException("Invalid Bike Type");
			
			assemble();
			paint();
			oiling();
			return bike;
			
		}
	}


