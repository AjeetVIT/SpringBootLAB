package work.stream.java.lambda;

public interface Vehicle {
	//void horn();

	void horn();
	default void speedMeter() {
		System.out.println("Common Functionality");

}
}