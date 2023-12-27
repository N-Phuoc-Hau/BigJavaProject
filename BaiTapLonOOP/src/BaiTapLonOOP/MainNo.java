package BaiTapLonOOP;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainNo {
	private static final Scanner SC = new Scanner(System.in);
		public static void main(String[] args) throws ParseException, IOException, InterruptedException {
			KhachHang kh1 = new KhachHang("Nguyễn Văn A","03/08/2005", "123456789", false,0);
			KhachHang kh2 = new KhachHang("Trần Thị B","03/09/2000", "987654321", false,0);
			KhachHang kh3 = new KhachHang("Lê Văn C","07/08/2010", "987654321", true,0);
			KhachHang kh4 = new KhachHang("Lý Thái D", "01/02/2007", "012345679", true, 0);
			KhachHang kh5 = new KhachHang("Ngô Phước E", "06/06/2004", "07986456123", true, 0);
			
			QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
		
			danhSachKH.them(kh1,kh2,kh3,kh4, kh5);
			
//			System.out.println("DS SAU KHI DOC FILE");
//			String duongDanKH = "src/BaiTapLonOOP/data/KhachHang.txt";
	//		danhSachKH.docTapTinKH(duongDanKH);
	//		danhSachKH.hienThi();
			//String duongDanGhi = "src/BaiTapLonOOP/data/KhachHang.txt";
	//		danhSachKH.ghiTapTin(duongDan);
//			danhSachKH.themKhachHang();
//			danhSachKH.hienThi();
			int chon;
			
			
			while (true) {
				System.out.println("========QUẢN LÝ KHÁCH HÀNG========");
				System.out.println("1. HIỂN THỊ KHÁCH HÀNG");
				System.out.println("2. THÊM KHÁCH HÀNG");
				System.out.println("3. XÓA KHÁCH HÀNG");
				System.out.println("4. SỬA THÔNG TIN KHÁCH HÀNG");				
				System.out.println("5. TÌM KIẾM KHÁCH HÀNG");
				System.out.println("6. SẮP XẾP KHÁCH HÀNG");
				System.out.println("7. TẠO GIẢM GIÁ CHO KHÁCH HÀNG");
				System.out.println("8. TÍCH ĐIỂM CHO KHÁCH HÀNG");
				System.out.println("9. FEEDBACK CỦA KHÁCH HÀNG");
				System.out.println("10. Đặt bàn");
				System.out.println("0. QUAY LAI");
				System.out.print("Nhập lựa chọn của bạn: ");

				chon = SC.nextInt();

				switch (chon) {
				case 1:
					System.out.println("1. Hiển thị toàn bộ khách hàng");
					System.out.println("2. Hiển thị khách hàng theo Mã");
					System.out.println("3. Hiển thị khách hàng theo Tên");
					System.out.print(">>>>>Nhập lựa chọn của bạn: ");
					int chon1 = SC.nextInt();
                    SC.nextLine(); 
					if(chon1==1){
						danhSachKH.hienThi();						
					}
					else if(chon1 == 2){
						danhSachKH.hienThiTheoMa();						
					}
					else if(chon1 == 3){
						danhSachKH.hienThiTheoTen();						
					}
					else {
						System.out.println("Lựa chọn không hợp lệ.");
					}
					break;					
				case 2:
					danhSachKH.themKhachHang();
					break;				
				case 3:
					System.out.println("1. Xóa theo mã");
					System.out.println("2. Xóa theo tên");
					System.out.print(">>>>>Nhập lựa chọn của bạn: ");
					int chon3 = SC.nextInt();
                    SC.nextLine(); 
					if(chon3==1){
						danhSachKH.xoaKHTheoMa();						
					}
					else if(chon3 == 2){
						danhSachKH.xoaKHTheoTen();						
					}
					else {
						System.out.println("Lựa chọn không hợp lệ.");
					}
					break;					
				case 4:
					danhSachKH.suaThongTinKH();
					break;
				case 5:
					System.out.println("1. Tìm kiếm theo mã");
					System.out.println("2. Tìm kiếm theo tên");
					System.out.print(">>>>>Nhập lựa chọn của bạn: ");
					int chon5 = SC.nextInt();
                    SC.nextLine(); 
					if(chon5==1){
						danhSachKH.timKiemTheoMaKH();						
					}
					else if(chon5 == 2){
						danhSachKH.timKiemTheoTenKH();						
					}
					else {
						System.out.println("Lựa chọn không hợp lệ.");
					}
					break;
				case 6:
					System.out.println("1. Sắp xếp theo mã");
					System.out.println("2. Sắp xếp theo tên");
					System.out.println("3. Sắp xếp theo ngày sinh");
					System.out.print(">>>>>Nhập lựa chọn của bạn: ");
					int chon6 = SC.nextInt();
                    SC.nextLine();
					if(chon6==1){
						danhSachKH.sapXepTheoMaKH();	
						danhSachKH.hienThi();
					}
					else if(chon6 == 2){
						danhSachKH.sapXepTheoTen();	
						danhSachKH.hienThi();
					}
					else if(chon6==3){
						danhSachKH.sapXepTheoNgaySinh();
						danhSachKH.hienThi();
					}
					else {
						System.out.println("Lựa chọn không hợp lệ.");
					}
					break;
				case 7:
		            danhSachKH.tinhToanGiamGia(danhSachKH);
				    break;
				case 8:
		            danhSachKH.tinhToanTichDiem(danhSachKH);
					break;
				case 9:
					danhSachKH.xuLyFeedBack(danhSachKH);
					break;
				case 10:
					danhSachKH.datBan();
					danhSachKH.hienThiDatBan();
					break;
				case 0:
					System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
					return;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				}
			}
		}
}		