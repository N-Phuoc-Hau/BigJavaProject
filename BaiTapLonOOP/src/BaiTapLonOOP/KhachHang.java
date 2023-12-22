package BaiTapLonOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
	private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private static final Scanner SC = new Scanner(System.in);
	private static int dem;
	private int maKH = ++dem;
	private String hoTen;
	private String soDT;
	private Date ngaySinh;
	private boolean isThanhVien;

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isThanhVien() {
		return isThanhVien;
	}

	public void setThanhVien(boolean thanhVien) {
		this.isThanhVien = thanhVien;
	}

	public KhachHang(String hoTen, Date ns, String soDT, boolean isThanhVien) {
		this.hoTen = hoTen;
		this.ngaySinh = ns;
		this.soDT = soDT;
		this.isThanhVien = isThanhVien;
	}
	
	public KhachHang(String hoTen, String ns, String soDT, boolean isThanhVien) throws ParseException {
		this.hoTen = hoTen;
		this.ngaySinh = F.parse(ns);
		this.soDT = soDT;
		this.isThanhVien = isThanhVien;
	}
	
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
		System.out.println("-----------------------");
	}

	public String toString() {
		return maKH + ";" + hoTen + ";" + ngaySinh + ";" + soDT + ";" + isThanhVien;
	}

}
