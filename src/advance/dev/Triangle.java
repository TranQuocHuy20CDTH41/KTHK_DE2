package advance.dev;

public class Triangle extends Shape{

	double canhA, canhB, canhC;
	
	public Triangle(String name, double canhA,double canhB, double canhC) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
		// TODO Auto-generated constructor stub
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return canhA + canhB + canhC;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double P = chuVi() / 2;
		return Math.sqrt(P * (P - canhA) * (P - canhB) * (P - canhC));
	}

	@Override
	public String toString() {
		return String.format("Do dai ba canh A, B, C lan luot la:%f, %f, %f", canhA, canhB,canhC);
	}

}
