package com.nt.comps;


public class EritigaCar implements Car {
	private CarTyres tyres;
	
	public EritigaCar(CarTyres tyres) {
		System.out.println("EritigaCar::1-param constructor");
		//super();
		this.tyres = tyres;
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Eritiga:: car is assembled");

	}

	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
		System.out.println("Eritiga:: car is tested");

	}

	@Override
	public String toString() {
		return "EritigaCar [tyres=" + tyres + "]";
	}

}
