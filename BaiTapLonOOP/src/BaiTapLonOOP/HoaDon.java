package BaiTapLonOOP;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class HoaDon {

	private String maHD;

	public double tongTien;

	private String ngayTao;

	public int giaTien;

	private ArrayList<SanPham> danhSachMatHang;

	public HoaDon(String maHD, String ngayTao) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
		this.giaTien = giaTien;
        this.danhSachMatHang = new ArrayList<>();
    }

	public void Menu() {
		System.out.println(maHD);
	}

	public String getMaHD(){
		return maHD;
	}
	public void setMaHD(String maHD){
		this.maHD = maHD;
	}

	public void ThemHoaDon(SanPham matHang) {
		danhSachMatHang.add(matHang);
	}
	
	public void xoaHoaDon(String maHD) {
        danhSachMatHang.removeIf(hoaDon -> hoaDon.getMaHD().equals(maHD));
    }

	public void in1HoaDon() {
		System.out.println("Hóa đơn: " + maHD);
        System.out.println("Loại hóa đơn: " + ngayTao);
	}

	public void inDSHoaDon() {
		System.out.println("Danh sách mặt hàng:");
		for (SanPham matHang : danhSachMatHang) {
            System.out.println(matHang);
        }
	}

	public double tinhTongDoanhThu() {
		double tongCong = 0;
        for (SanPham sanPham : danhSachMatHang) {
            tongCong += sanPham.tinhThanhTien();
        }
        return tongCong;
	}

	public double capNhatGia(SanPham sanPham) {
		double giaCapNhat = 0;
		giaCapNhat = sanPham.tinhThanhTien();
		return giaCapNhat;
	}
}
