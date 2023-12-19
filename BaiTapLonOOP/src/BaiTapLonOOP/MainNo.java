package BaiTapLonOOP;

public class MainNo {
		public static void main(String[] args) {

			KhachHang kh1 = new KhachHang(1, "Nguyễn Văn A", 123456789, true);
			KhachHang kh2 = new KhachHang(2, "Trần Thị B", 987654321, false);
			KhachHang kh3 = new KhachHang(3, "Lê Văn C", 987654321, false);
			ChamSocKhachHang cs1 = new ChamSocKhachHang(1, "Nguyễn Văn A", 123456789, true);

			QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
			danhSachKH.them(kh1);
			danhSachKH.them(kh2);
			danhSachKH.them(kh3);

			System.out.println("DANH SÁCH KHÁCH HÀNG");
			danhSachKH.hienThi();
			
			System.out.println("THÊM KHÁCH HÀNG");
			danhSachKH.themKhachHang();
			danhSachKH.hienThi();
			
			System.out.println("XÓA KHÁCH HÀNG");
			danhSachKH.xoaKHTheoMa();
////		danhSachKH.hienThi();
			
			System.out.println("SỬA THÔNG TIN KHÁCH HÀNG");
//			danhSachKH.suaThongTinKH();
//			danhSachKH.hienThi();
//
//			System.out.println("TÌM KIẾM KHÁCH HÀNG");
//			danhSachKH.timKiemKH();
			
			cs1.tichDiem();
			cs1.taoGiamGia();
		}
}		
