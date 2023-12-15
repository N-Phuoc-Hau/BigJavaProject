package BaiTapLonOOP;

public class MainNo {
		public static void main(String[] args) {
			KhachHang kh1 = new KhachHang(1, "Nguyễn Văn A", 123456789, true);
			KhachHang kh2 = new KhachHang(2, "Trần Thị B", 987654321, false);
			KhachHang kh3 = new KhachHang(3, "Lê Văn C", 987654321, false);

			ChamSocKhachHang danhSachKH = new ChamSocKhachHang();
			danhSachKH.themKhachHang(kh1);
			danhSachKH.themKhachHang(kh2);
			danhSachKH.themKhachHang(kh3);

			System.out.println("DANH SÁCH KHÁCH HÀNG");
			danhSachKH.inDanhSachKH();
			
//			System.out.println("THÊM KHÁCH HÀNG");
//			danhSachKH.themKhachHang();
//			danhSachKH.inDanhSachKH();
//			
//			System.out.println("XÓA KHÁCH HÀNG");
//			danhSachKH.xoaKhachHang();
//			danhSachKH.inDanhSachKH();
			
//			System.out.println("SỬA THÔNG TIN KHÁCH HÀNG");
//			danhSachKH.suaThongTinKhachHang();
//			danhSachKH.inDanhSachKH();

//			System.out.println("TÌM KIẾM KHÁCH HÀNG");
//			danhSachKH.timKiemKH();
			
//			kh1.tichDiem(700000);
//			kh1.taoGiamGia();
//			kh1.tichDiem();
			
		
			
		}

}
