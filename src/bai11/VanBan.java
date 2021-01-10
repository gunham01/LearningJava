package bai11;

public class VanBan {
	private String _noiDung; 
	
	public VanBan() {}
	
	public VanBan(String noiDung) {
		_noiDung = noiDung;
	}
	
	public int doDai() {
		return _noiDung.length();
	}
	
	public int demKiTuH() {
		int count = 0;
		for (int i = 0, n = _noiDung.length(); i < n; i++) {
			if (String.valueOf(_noiDung.charAt(i)).equalsIgnoreCase("H")) {
				count++;
			}
		}
		
		return count;
	}
	
	public String chuanHoa() {
		String result = _noiDung.trim();
		for (int i = 0, n = result.length(); i < n; i++) {
			if (result.charAt(i) == ' ') {
				int j = i;
				while (result.charAt(j) == ' ') { 
					j++;
				}
				result = result.replaceAll(" ".repeat(j - i), " ");
				n = result.length();
			}
		}
		
		return result;
		
//		return _noiDung.trim().replaceAll("\\s+", " ");
	}
}
