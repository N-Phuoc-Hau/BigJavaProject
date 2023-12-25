package BaiTapLonOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang extends Nguoi{
	private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private static int dem;
	private int maKH = ++dem;
	private boolean isThanhVien;

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public boolean isThanhVien() {
		return isThanhVien;
	}

	public void setThanhVien(boolean thanhVien) {
		this.isThanhVien = thanhVien;
	}
	
	public KhachHang(){
		
	}
	
	public KhachHang(String hoTen, String ngaySinh, String soDT, boolean isThanhVien) throws ParseException {
        super(hoTen, ngaySinh, soDT);
        this.isThanhVien = isThanhVien;
    }
	
	@Override
	public void hienThi() {
		System.out.println("Mã khách hàng: " + this.maKH);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngay sinh: " + F.format(this.ngaySinh));
		System.out.println("Số điện thoại: " + this.soDT);
		if (this.isThanhVien()) {
			System.out.println("Là thành viên");
		} else {
			System.out.println("Không phải thành viên");
		}
	}

	public String toString() {
		return maKH + ";" + hoTen + ";" + ngaySinh + ";" + soDT + ";" + isThanhVien;
	}

}
