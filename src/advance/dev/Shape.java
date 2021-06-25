package advance.dev;

public abstract class Shape {

	String name;

	public Shape(String name) {
		super();
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	abstract double chuVi();
	abstract double dienTich();
	
	@Override
	public String toString() {
		return String.format("Name, %s", name);
	}
	
}
