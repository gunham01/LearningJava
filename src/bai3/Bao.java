package bai3;

import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
	private Date ngayPH;
	
	public Bao() {
		super();
	}
	
	public Bao(String maTaiLieu, String tenNXB, int soBanPH, String ngayPhStr) {
		super(maTaiLieu, tenNXB, soBanPH);
		this.ngayPH = DateUtil.stringToDate(ngayPhStr);
	}
	
	public Date getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(Date ngayPH) {
		this.ngayPH = ngayPH;
	}
	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap so phat hanh: ");
		this.ngayPH    = DateUtil.stringToDate(sc.nextLine());
	}
	
	public void inRa() {
		super.inRa();
		System.out.println("Thang phat hanh: " + DateUtil.dateToString(this.ngayPH));
	}
}
