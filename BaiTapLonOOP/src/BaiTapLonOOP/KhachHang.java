package BaiTapLonOOP;

import java.text.ParseException;
import java.util.Scanner;

public class KhachHang {
	private static final Scanner SC = new Scanner(System.in);
	private static int dem;
	private int maKH = ++dem;
	private String hoTen;
	private String soDT;
	private int cccd;
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

	public boolean isThanhVien() {
		return isThanhVien;
	}

	public void setThanhVien(boolean thanhVien) {
		this.isThanhVien = thanhVien;
	}

	public int getCccd() {
		return cccd;
	}

	public void setCccd(int cccd) {
		this.cccd = cccd;
	}

	public KhachHang(String hoTen, String soDT, boolean isThanhVien) throws ParseException {
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.isThanhVien = isThanhVien;
	}

	public KhachHang(String hoTen, int cccd, String soDT) {
		this.hoTen = hoTen;
		this.cccd = cccd;
		this.soDT = soDT;
	}

	// In danh sách khách hàng
	public void hienThi() {
		System.out.println("Mã khách hàng: " + this.maKH);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Số điện thoại: " + this.soDT);
		if (this.isThanhVien()) {
			System.out.println("Là thành viên");
		} else {
			System.out.println("Không phải thành viên");
		}
		System.out.println("-----------------------");
	}

	public String toString() {
		return maKH + ";" + hoTen + ";" + soDT + ";" + isThanhVien;
	}

}
