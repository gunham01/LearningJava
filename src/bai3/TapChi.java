package bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private String soPH;
	private int thangPH;
	
	public TapChi() {
		super();
	}
	
	public TapChi(String maTaiLieu, String tenNXB, int soBanPH, String soPH, int thangPH) {
		super(maTaiLieu, tenNXB, soBanPH);
		this.soPH = soPH;
		this.thangPH = thangPH;
	}


	public String getSoPH() {
		return soPH;
	}
	public int getThangPH() {
		return thangPH;
	}

	public void setSoPH(String soPH) {
		this.soPH = soPH;
	}
	public void setThangPH(int thangPH) {
		this.thangPH = thangPH;
	}
	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap so phat hanh: ");
		this.soPH    = sc.nextLine();
		System.out.print("Nhap thang phat hanh: ");
		this.thangPH = sc.nextInt(); sc.nextLine();
	}
	
	public void inRa() {
		super.inRa();
		System.out.println("So phat hanh: " + this.soPH);
		System.out.println("Thang phat hanh: " + this.thangPH);
	}
}
