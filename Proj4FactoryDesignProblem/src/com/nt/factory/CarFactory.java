package com.nt.factory;

import com.nt.comps.BelenoCar;
import com.nt.comps.Car;
import com.nt.comps.CarTyres;
import com.nt.comps.EritigaCar;
import com.nt.comps.SwiftCar;

public class CarFactory {
	//static factory method
	public static Car getCar(String type) {
		Car car=null;
		CarTyres tyres=new CarTyres();
		if(type.equalsIgnoreCase("beleno")) {
			car=new BelenoCar(tyres);
		}
		else if(type.equalsIgnoreCase("swift")) {
			car=new SwiftCar(tyres);
			
		}else if (type.equalsIgnoreCase("eritiga")) {
			car=new EritigaCar(tyres);
		}
		else {
			throw new IllegalArgumentException("Invalid car types");
			
		}
		car.assemble();
		car.roadTest();
		return car;
	}

}
