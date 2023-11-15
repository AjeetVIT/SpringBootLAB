package com.nt.factory;

import com.nt.comps.BajajBike;

//class having factory method design pattern
public abstract class BajajBikeFactory {
	public abstract void paint();
	public abstract void assemble();
	public abstract void oiling();
	public abstract void roadTest();
	public abstract BajajBike createBike(String type);
	//method having Factory Method Design Pattern logic
	public final BajajBike orderBike(String type) {
		//BajajBike bike = createBike(type);
		paint();
		assemble();
		oiling();
		roadTest();
		BajajBike bike=createBike(type);
		roadTest();
		return bike;
	}

}
