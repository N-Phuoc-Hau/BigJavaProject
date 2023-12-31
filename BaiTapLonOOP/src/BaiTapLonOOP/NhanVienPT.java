package BaiTapLonOOP;

import java.text.ParseException;
import java.util.Date;

public class NhanVienPT extends NhanVien {


	private int luongNV;
	private int soGioLamViec;
	
	
	
	
	public NhanVienPT(String ht, String gt, String dc, Date ns, boolean loai, int l, int sg) {
		super(ht, gt, dc, ns, loai);
		this.luongNV = l;
		this.soGioLamViec = sg;
		// TODO Auto-generated constructor stub
	}


	public NhanVienPT(String ht, String gt, String dc, String ns,
			boolean loai, int l, int sg) throws ParseException {
		super(ht,gt,dc,F.parse(ns), loai);
		this.luongNV = l;
		this.soGioLamViec = sg;
		// TODO Auto-generated constructor stub
	}


	@Override 
	public String toString() {
        return super.toString() + ";" + luongNV + ";" + soGioLamViec;
    }
	public void hienThi(){
		super.hienThi();

		System.out.printf("Luong gio: %s\n", this.luongNV);
		System.out.printf("So gio lam viec: %s\n", this.soGioLamViec);
		System.out.printf("Luong thang: %s\n", this.getLuongNV()*this.getSoGioLamViec());
	}
		
	
	

	public int getLuongNV() {
		return luongNV;
	}

	public void setLuongNV(int luongNV) {
		this.luongNV = luongNV;
	}

	public int getSoGioLamViec() {
		return soGioLamViec;
	}

	public void setSoGioLamViec(int soGioLamViec) {
		this.soGioLamViec = soGioLamViec;
	}


}