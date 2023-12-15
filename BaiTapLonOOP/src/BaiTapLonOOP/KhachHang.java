package BaiTapLonOOP;

import java.util.Scanner;

public class KhachHang {
	private static final Scanner SC = new Scanner(System.in);
	private static int dem;
	private int maKH = ++dem;
	private String hoTen;
	private int soDT;
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

	public int getSoDT() {
		return soDT;
	}

	public void setSoDT(int soDT) {
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

	public KhachHang(int maKH, String hoTen, int soDT, boolean isThanhVien) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.isThanhVien = isThanhVien;
	}

	public KhachHang(String hoTen, int cccd, int soDT) {
		this.hoTen = hoTen;
		this.cccd = cccd;
		this.soDT = soDT;
	}

	// In danh sách khách hàng
	public void hienThi() {
		System.out.println("Mã khách hàng: " + this.getMaKH());
		System.out.println("Họ tên: " + this.getHoTen());
		System.out.println("Số điện thoại: " + this.getSoDT());
		if (this.isThanhVien()) {
			System.out.println("Là thành viên");
		} else {
			System.out.println("Không phải thành viên");
		}
		System.out.println("-----------------------");
	}

	public String toString() {
		return maKH + ";" + hoTen + ";" + soDT + ";" + isThanhVien();
	}

}
