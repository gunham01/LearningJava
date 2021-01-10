package bai1;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	// Ham tao khong doi so
	public PhanSo() {}
	
	private int ucln(int a, int b) {
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		
		return b;
	}
	
	// Ham tao 2 tham so: tu so voi mau so
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo  = tuSo;
		this.mauSo = mauSo;
	}
	
	// 4 ham cong tru nhan chia
	public PhanSo cong(PhanSo ps) {
		int tuSoTong  = this.tuSo*ps.mauSo + this.mauSo*ps.tuSo;
		int mauSoTong = this.mauSo * ps.mauSo;
		
		return new PhanSo(tuSoTong, mauSoTong).toiGian();
	}
	
	public PhanSo tru(PhanSo ps) {
		int tuSoHieu  = this.tuSo*ps.mauSo - this.mauSo*ps.tuSo;
		int mauSoHieu = this.mauSo * ps.mauSo;
		
		return new PhanSo(tuSoHieu, mauSoHieu).toiGian();
	}
	
	public PhanSo nhan(PhanSo ps) {
		int tuSoTich  = this.tuSo * ps.tuSo;
		int mauSoTich = this.mauSo * ps.mauSo;
		
		return new PhanSo(tuSoTich, mauSoTich).toiGian();
	}
	
	public PhanSo chia(PhanSo ps) {
		int tuSoThuong  = this.tuSo * ps.mauSo;
		int mauSoThuong = this.mauSo * ps.tuSo;
		
		return new PhanSo(tuSoThuong, mauSoThuong).toiGian();
	}
	
	public boolean kiemTraToiGian() {
		return ucln(this.tuSo, this.mauSo) == 1;
	}
	
	public PhanSo toiGian() {
		int ucln = ucln(this.tuSo, this.mauSo);
		
		return new PhanSo(this.tuSo/ucln, this.mauSo/ucln);
	}
	
	@Override
	public String toString() {
		return this.tuSo + "/" + this.mauSo;
	}
}

