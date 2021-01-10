package bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac;
	
	public CongNhan() {
		super();
	}
	
	public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.bac = bac;
	}
	
	public String getBac() {
		return this.bac;
	}
	
	public void setBac(String bac) {
		this.bac = bac;
	}
	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap bac: ");
		this.bac = sc.nextLine();
	}
	
	public void inRa() {
		super.inRa();
		System.out.println("Bac: " + bac);
	}
}
