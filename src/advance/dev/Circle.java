package advance.dev;

public class Circle extends Shape{

	double banKinh;
	
	public Circle(String name, double banKinh) {
		super(name);
		this.banKinh = banKinh;
		// TODO Auto-generated constructor stub
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banKinh;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}

	@Override
	public String toString() {
		return String.format("Ban kinh: %f", banKinh);
	}

}
