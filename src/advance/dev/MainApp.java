package advance.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	
	//input
	static List<Shape> input(int numberC, int numberR, int numberT){
		Scanner sc = new Scanner(System.in);
		List<Shape> sp = new ArrayList<Shape>();
		for (int i = 0; i < numberC; i++) {
			System.out.println("Nhap ten, ban kinh cua hinh tron: ");
			System.out.print("Ten hinh tron: ");
			String ten = sc.next();
			System.out.print("Ban kinh: ");
			double banKinh = sc.nextFloat();
			Shape cir = new Circle(ten, banKinh);
			sp.add(cir);
		}
		for (int i = 0; i < numberR; i++) {
			System.out.println("Nhap vao ten, canh A, canh B cua hinh chu nhat: ");
			System.out.print("Ten hinh chu nhat: ");
			String ten = sc.next();
			System.out.print("Canh A: ");
			double canhA = sc.nextDouble();
			System.out.print("Canh B: ");
			double canhB = sc.nextDouble();
			Shape rec = new Rectangle(ten, canhA, canhB);
			sp.add(rec);
		}
		for (int i = 0; i < numberT; i++) {
			System.out.println("Nhap vao ten, do dai 3 canh cua hinh tam giac: ");
			System.out.print("Ten hinh tam giac: ");
			String ten = sc.next();
			System.out.print("Canh A: ");
			double canhA = sc.nextDouble();
			System.out.print("Canh B: ");
			double canhB = sc.nextDouble();
			System.out.print("Canh C: ");
			double canhC = sc.nextDouble();
			Shape tri = new Triangle(ten, canhA, canhB, canhC);
			sp.add(tri);
		}
		return sp;
	}
	//Print
	static void print(List<Shape> shapes) {
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext()) {
			Shape shape = it.next();
			System.out.println(shape.toString());
		}
	}
	//findmaxcv
	static void findMaxChuVi(List<Shape> shapes) {
		Iterator<Shape> it = shapes.iterator();
		Shape prevMax = shapes.get(0);
		while (it.hasNext()) {
			Shape shape = it.next();
			if (prevMax.chuVi() < shape.chuVi()) {
				prevMax = shape;
			}
		}
		if (prevMax instanceof Circle) {
			String str1 = String.format("Hinh tron co chu vi lon nhat la: %s -- %f ", prevMax.name, prevMax.chuVi());
			System.out.println(str1);
		}else if(prevMax instanceof Rectangle){
			String str2 = String.format("Hinh chu nhat co chu vi lon nhat la: %s -- %f ", prevMax.name, prevMax.chuVi());
			System.out.println(str2);
		}else {
			String str3 = String.format("Hinh tam giac co chu vi lon nhat la: %s -- %f ", prevMax.name, prevMax.chuVi());
			System.out.println(str3);
		}
	}
	//findMaxDT
	static void findMaxDienTich(List<Shape> shapes) {
		Iterator<Shape> it= shapes.iterator();
		Shape preMax = shapes.get(0);
		while (it.hasNext()) {
			Shape shape = it.next();
			if (preMax.dienTich() < shape.dienTich()) {
				preMax = shape;
			}
		}
		if (preMax instanceof Circle) {
			String str = String.format("Hinh tron co dien tich lon nhat - %s -- %f", preMax.name,preMax.dienTich());
			System.out.println(str);
		}else if (preMax instanceof Rectangle) {
			String str = String.format("Hinh chu nhat co dien tich lon nhat - %s -- %f", preMax.name,preMax.dienTich());
			System.out.println(str);
		}else {
			String str = String.format("Hinh tam giac co dien tich lon nhat - %s -- %f", preMax.name,preMax.dienTich());
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so hinh tron, chu nhat, tam giac theo thu tu: ");
		int numberCir = sc.nextInt();
		int numberRec = sc.nextInt();
		int numberTri = sc.nextInt();
		shapes = input(numberCir, numberRec, numberTri);
		print(shapes);
		findMaxChuVi(shapes);
		findMaxDienTich(shapes);
	}

}
	
