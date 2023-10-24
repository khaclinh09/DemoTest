package test;

import java.util.Scanner;

public class Homework_Unit4_2 {

	public static void main(String[] args) {
		Homework_Unit4_1 xe1 = new Homework_Unit4_1();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap ten xe 1: ");
			xe1.setTenXe(sc.nextLine());
			System.out.println("Nhap loai xe 1: ");
			xe1.setLoaiXe(sc.nextLine());
			System.out.println("Nhap van toc loai xe 1: ");
			xe1.setVanToc(sc.nextInt());
			sc.nextLine();
		}
		System.out.printf("Xe so 1");

	}

}
