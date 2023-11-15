package work.stream.java;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable{
	private static Samosa samosa;
	//constructor will invoke when object is created
	private Samosa() {
		
	}
	public static Samosa getSamosa() {
//object of this class
		if(samosa==null) {
			//samosa  = new Samosa();
			synchronized (Samosa.class) {
				if(samosa==null) {
					samosa=new Samosa();
				}
				
			}
		}
		//Samosa samosa = new Samosa();
		return samosa;
}
	public Object readResolve() {
		return  samosa;
	}
	@Override
	public Object clone()throws CloneNotSupportedException {
		return super.clone();
	}
}
