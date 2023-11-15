package in.wipro.entity;

public class Employee {
	private int id;
	private String name;
	private String address;
	private double Salry;
	public Employee(int id, String name, String address, double salry) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Salry = salry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalry() {
		return Salry;
	}
	public void setSalry(double salry) {
		Salry = salry;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", Salry=" + Salry + "]";
	}

}
