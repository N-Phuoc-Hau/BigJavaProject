package BaiTapLonOOP;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class HoaDon {

	private String maHD;

	public double tongTien;

	private String ngayTao;

	public int tinhTong;

	public int giaTien;

	public KhachHang[] k;

	public NhanVien[] nv;

	public SanPham[] sp;

	private ArrayList<SanPham> danhSachMatHang;

	public HoaDon(String maHD, String ngayTao) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.danhSachMatHang = new ArrayList<>();
    }

	public void Menu() {

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
        for (SanPham matHang : danhSachMatHang) {
            tongCong += matHang.tinhThanhTien();
        }
        return tongCong;
	}

	public double capNhatGia() {
		double giaCapNhat = 0;
		giaCapNhat = matHang.tinhThanhTien();
		return giaCapNhat;
	}
	// @Override
    // public String toString() {
    //     return tenMatHang + " - Đơn giá: " + giaSP + " - Số lượng: " + soLuong + " - Thành tiền: " + tinhThanhTien();
    // }
}
