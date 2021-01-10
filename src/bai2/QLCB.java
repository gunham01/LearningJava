package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private static ArrayList<CanBo> dsCanBo;
	
	private static void nhapDanhSachCanBo(Scanner sc) {
		System.out.print("Nhap so can bo can nhap: ");
		int soCanBo = sc.nextInt();
		
		for (int i = 0; i < soCanBo; i++) {
			System.out.println("\nChon loai can bo ban muon nhap:");
			System.out.println("1. Cong nhan");
			System.out.println("2. Ky su");
			System.out.println("3. Nhan vien");
			System.out.print("Lua chon cua ban: ");
			int luaChon = sc.nextInt(); sc.nextLine();
			
			CanBo cb = new CanBo();
			switch (luaChon) {
				case 1:
					cb = new CongNhan();
					cb.nhap(sc);
					break;
				case 2:
					cb = new KySu();
					cb.nhap(sc);
					break;
				case 3:
					cb = new NhanVien();
					cb.nhap(sc);	
					break;			
			}
			
			dsCanBo.add(cb);
		}
	}
	
	public static CanBo timKiemCanBo(String hoTen) {
		for (CanBo cb: dsCanBo) {
			if (cb.hoTen.equals(hoTen)) {
				return cb;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		dsCanBo = new ArrayList<CanBo>();
		Scanner sc = new Scanner(System.in);
		nhapDanhSachCanBo(sc);
		
		System.out.print("Nhap ho ten cua can bo can tim: ");
		String hoTen = sc.nextLine();
		CanBo cbTimThayDuoc = timKiemCanBo(hoTen);
		
		if (cbTimThayDuoc == null) {
			System.out.println("Khong tim thay can bo voi ten " + hoTen);
		} else {
			System.out.println("Da tim thay can bo. Thong tin cua can bo tim thay duoc:");
			cbTimThayDuoc.inRa();
		}
	}
}
