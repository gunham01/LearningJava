package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
	protected String hoTen;
	protected Date ngaySinh;
	protected String gioiTinh;
	protected String diaChi;
	
	public CanBo() {}
	
	public CanBo(String hoTen, String ngaySinhStr, String gioiTinh, String diaChi) {
		this.hoTen 	  = hoTen;
		this.ngaySinh = stringToDate(ngaySinhStr);
		this.gioiTinh = gioiTinh;
		this.diaChi   = diaChi;
	}
	
	public Date stringToDate(String input) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi xay ra khi chuyen tu ngay sinh dang String sang dang Date");
			e.printStackTrace();
			return null;
		}
	}


	public String getHoTen() {
		return hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}


	public void setHoTen(String hoTen) {
		this.hoTen    = hoTen;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi   = diaChi;
	}
	
	public void nhap(Scanner sc) {
		System.out.print("Nhap ho ten: ");
		this.hoTen    = sc.nextLine();
		System.out.print("Nhap ngay sinh (ngay/thang/nam): ");
		this.ngaySinh = stringToDate(sc.nextLine());
		System.out.print("Nhap gioi tinh: ");
		this.gioiTinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi   = sc.nextLine();
	}
	
	public void inRa() {
		String ngaySinhStr = new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh);
		
		System.out.println("Ho ten: "    + this.hoTen);
		System.out.println("Ngay sinh: " + ngaySinhStr);
		System.out.println("Gioi tinh: " + this.gioiTinh);
		System.out.println("Dia chi: "   + this.diaChi);
	}
}
