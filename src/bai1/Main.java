package bai1;

public class Main {
	private static PhanSo ps1 = new PhanSo(3, 4);
	private static PhanSo ps2 = new PhanSo(2, 4);
	
	public static void main(String[] args) {
		System.out.println("Tong cua ps1 va ps2 la: "   + ps1.cong(ps2).toString());
		System.out.println("Hieu cua ps1 va ps2 la: "   + ps1.tru(ps2).toString());
		System.out.println("Tich cua ps1 va ps2 la: "   + ps1.nhan(ps2).toString());
		System.out.println("Thuong cua ps1 va ps2 la: " + ps1.chia(ps2).toString());
		
		System.out.println("ps2 = " + ps2.toString());
		System.out.println("ps2 toi gian hay chua: " + (ps2.kiemTraToiGian() == true ? "dung" : "sai"));
		
		System.out.println("Dang toi gian cua ps2 la: " + ps2.toiGian().toString());
	}
}
