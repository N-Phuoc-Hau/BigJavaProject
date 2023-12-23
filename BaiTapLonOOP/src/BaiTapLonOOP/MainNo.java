package BaiTapLonOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MainNo {
		public static void main(String[] args) throws ParseException, IOException {

			KhachHang kh1 = new KhachHang("Nguyễn Văn A","03/08/2004", "123456789", true);
			KhachHang kh2 = new KhachHang("Trần Thị B","03/09/2000", "987654321", false);
			KhachHang kh3 = new KhachHang("Lê Văn C","07/08/2010", "987654321", false);
	//		ChamSocKhachHang cs1 = new ChamSocKhachHang("Nguyễn Văn A", 123456789, true);
			
			QuanLySanPham quanLySanPham = new QuanLySanPham();

			QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
			danhSachKH.them(kh1);
			danhSachKH.them(kh2);
			danhSachKH.them(kh3);
			
			quanLySanPham.muaSanPham();
			kh1.hienThi();

			System.out.println("DANH SÁCH KHÁCH HÀNG");
//			danhSachKH.hienThi();
			
			System.out.println("THÊM KHÁCH HÀNG");
//			danhSachKH.themKhachHang();
//			danhSachKH.hienThi();
			
			System.out.println("XÓA KHÁCH HÀNG");
//			danhSachKH.xoaKHTheoMa();
////		danhSachKH.hienThi();
			
			System.out.println("SỬA THÔNG TIN KHÁCH HÀNG");
//			danhSachKH.suaThongTinKH();
//			danhSachKH.hienThi();
//
//			System.out.println("TÌM KIẾM KHÁCH HÀNG");
//			danhSachKH.timKiemKH();
			

	//		cs1.tichDiem();
	//		cs1.taoGiamGia();
//			System.out.println("DS SAU KHI DOC FILE");
//			String duongDan = "src/BaiTapLonOOP/data/KhachHang.txt";
//			danhSachKH.docTapTin(duongDan);
//			danhSachKH.hienThi();
			//String duongDanGhi = "src/BaiTapLonOOP/data/KhachHang.txt";
	//		danhSachKH.ghiTapTin(duongDan);
//			danhSachKH.themKhachHang();
//			danhSachKH.hienThi();
			
			


		}
}		
