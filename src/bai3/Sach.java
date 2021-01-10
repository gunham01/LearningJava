package bai3;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	
	public Sach() {
		super();
	}

	public Sach(String maTaiLieu, String tenNXB, int soBanPH, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPH);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}


	public String getTenTacGia() {
		return tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}


	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap ten tac gia: ");
		this.tenTacGia = sc.nextLine();
		System.out.print("Nhap so trang: ");
		this.soTrang    = sc.nextInt(); sc.nextLine();
	}
	
	public void inRa() {
		super.inRa();
		System.out.println("Ten tac gia: " + this.tenTacGia);
		System.out.println("So trang: " + this.soTrang);
	}
}
