package bai11;

public class Main {
	public static void main(String[] args) {
		VanBan vb = new VanBan("    Hello       hHh    aa    ");
		System.out.println("Length: " + vb.doDai());
		System.out.println("So chu H/h: " + vb.demKiTuH());
		System.out.println("Sau khi chuan hoa: " + vb.chuanHoa());
	}
}
