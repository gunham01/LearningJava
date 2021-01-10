package bai3;

import java.util.Scanner;

public class TaiLieu {
	protected String maTaiLieu;
	protected String tenNXB;
	protected int soBanPH;
	
	public TaiLieu() {}
	
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPH) {
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPH = soBanPH;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public int getSoBanPH() {
		return soBanPH;
	}


	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public void setSoBanPH(int soBanPH) {
		this.soBanPH = soBanPH;
	}
	
	public void nhap(Scanner sc) {
		System.out.print("Nhap ma tai lieu: ");
		this.maTaiLieu = sc.nextLine();
		System.out.print("Nhap ten nha xuat ban: ");
		this.tenNXB    = sc.nextLine();
		System.out.print("Nhap so ban phat hanh: ");
		this.soBanPH   = sc.nextInt(); sc.nextLine();
	}
	
	public void inRa() {
		System.out.println("Ma tai lieu: " 		+ this.maTaiLieu);
		System.out.println("Ten nha xuat ban: " + this.tenNXB);
		System.out.println("So phat hanh: " 	+ this.soBanPH);
	}
}
