package work.stream.java.lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Car();
		v.horn();

		
		v.speedMeter();
		Vehicle v1=new Bike();
		v1.horn();
		//by useing static we call direct by interface name
		v1.speedMeter();

	}

}
