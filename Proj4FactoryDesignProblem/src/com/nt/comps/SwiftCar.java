package com.nt.comps;


public class SwiftCar implements Car {
	private CarTyres tyres;
	
	public SwiftCar(CarTyres tyres) {
		System.out.println("SwiftCar::1-param constructor");
		//super();
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Swift:: car is assembled");

	}

	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
		System.out.println("Swift:: car is tested");

	}

	@Override
	public String toString() {
		return "SwiftCar [tyres=" + tyres + "]";
	}

}
