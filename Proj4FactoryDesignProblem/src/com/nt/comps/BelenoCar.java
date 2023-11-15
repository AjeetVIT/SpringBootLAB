package com.nt.comps;


public class BelenoCar implements Car {
	private CarTyres tyres;
	
	public BelenoCar(CarTyres tyres) {
		System.out.println("BelenoCar::1-param constructor");
		//super();
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Baleno:: car is assembled");

	}

	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
		System.out.println("Baleno:: car is tested");

	}

	@Override
	public String toString() {
		return "BelenoCar [tyres=" + tyres + "]";
	}

}
