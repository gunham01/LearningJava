package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static ArrayList<TaiLieu> dsTaiLieu;
	
	private static void nhapDanhSachCanBo(Scanner sc) {
		System.out.print("Nhap so tai lieu can nhap: ");
		int soTaiLieu = sc.nextInt();
		
		for (int i = 0; i < soTaiLieu; i++) {
			System.out.println("\nChon loai tai lieu ban muon nhap:");
			System.out.println("1. Sach");
			System.out.println("2. Tap chi");
			System.out.println("3. Bao");
			System.out.print("Lua chon cua ban: ");
			int luaChon = sc.nextInt(); sc.nextLine();
			
			TaiLieu tl = chonTaiLieu(luaChon);
			tl.nhap(sc);
			
			dsTaiLieu.add(tl);
		}
	}
	
	private static TaiLieu chonTaiLieu(int luaChon) {
		TaiLieu tl = null;
		switch (luaChon) {
		case 1:
			tl = new Sach();
			break;
		case 2:
			tl = new TapChi();
			break;
		case 3:
			tl = new Bao();
			break;			
		}
		
		return tl;
	}
	
	public static ArrayList<TaiLieu> timKiemTaiLieu(String tenLop) {
		try {
			tenLop = "bai3." + tenLop;
			Class<?> obj;
			System.out.println("Class: " + dsTaiLieu.get(0).getClass().toString());
			obj = Class.forName(tenLop);
			ArrayList<TaiLieu> result = new ArrayList<TaiLieu>();		
			for (TaiLieu tl: dsTaiLieu) {
				if (tl.getClass().equals(obj)) {
					result.add(tl);
				}
			}
			return result;
		} catch (ClassNotFoundException e) {
			System.out.println("Khong tim thay lop " + tenLop);
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		dsTaiLieu = new ArrayList<TaiLieu>();
		Scanner sc = new Scanner(System.in);
		nhapDanhSachCanBo(sc);
		
		System.out.print("Nhap loai tai lieu can tim: ");
		String hoTen = sc.nextLine();
		ArrayList<TaiLieu> dstl = timKiemTaiLieu(hoTen);
		
		if (dstl != null) {
			System.out.println("Da tim thay tai lieu. Danh sach cac tai lieu tim thay duoc:");
			for (int i = 0, n = dstl.size(); i < n; i++) {
				System.out.printf("Tai lieu thu %d:\n", i+1);
				dstl.get(i).inRa();
				System.out.println();
			}
		}
	}
}
