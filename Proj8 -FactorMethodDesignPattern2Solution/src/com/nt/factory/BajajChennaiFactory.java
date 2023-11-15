package com.nt.factory;

import com.nt.comps.BajajBike;
import com.nt.comps.BajajDiscover;
import com.nt.comps.BajajPlatina;
import com.nt.comps.BajajPulsar;

public class BajajChennaiFactory extends BajajBikeFactory{
	public  void paint() {
		System.out.println("Painting Bajaj Bike");
	}
	public  void assemble() {
		System.out.println("Assembling Bajaj Bike");
	}
		public  void roadTest()
		{
			System.out.println("RoadTesting of Bajaj bike");
		}
		public  void oiling() {
			System.out.println("Oiling of Bajaj bike");
		}
		//factory method
		public  BajajBike createBike(String type) {
			BajajBike bike=null;
			if(type.equalsIgnoreCase("Discover"))
				bike=new BajajDiscover();
			else if(type.equalsIgnoreCase("platina"))
				bike=new BajajPlatina();
			else if(type.equalsIgnoreCase("pulsor"))
				bike=new BajajPulsar();
			else
				throw new IllegalArgumentException("Invalid Bike Type");
			
			/*_
			 * assemble();
			 * paint();
			oiling()_*/
			;
		
			return bike;
			
		}
	}


