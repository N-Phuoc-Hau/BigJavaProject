package test;

public class Main {
	public static void main(String agrs[]){

		PhanSo A = new PhanSo(2,3);
		PhanSo B = new PhanSo(5,3);

		DsPhanSo ds = new DsPhanSo();
		ds.them(A);
		ds.them(B);
		ds.them();
		ds.hienThi();
		ds.tinhTong().hienThi();
		ds.timMax().hienThi();
		ds.sapXep();
		ds.hienThi();


	}
}
