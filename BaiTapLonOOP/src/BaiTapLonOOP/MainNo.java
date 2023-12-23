package BaiTapLonOOP;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainNo {
	private static final Scanner SC = new Scanner(System.in);
		public static void main(String[] args) throws ParseException, IOException, InterruptedException {
			KhachHang kh1 = new KhachHang("Nguyễn Văn A","03/08/2004", "123456789", true);
			KhachHang kh2 = new KhachHang("Trần Thị B","03/09/2000", "987654321", false);
			KhachHang kh3 = new KhachHang("Lê Văn C","07/08/2010", "987654321", false);
			KhachHang kh4 = new ChamSocKhachHang("Lý Thái D", "01/02/1234", "012345679", true, 0);
			ChamSocKhachHang kh5 = new ChamSocKhachHang("Ngô Phước E", "06/06/2004", "07986456123", false, 0);
			
			QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
		
			danhSachKH.them(kh1,kh2,kh3,kh4, kh5);
			
//			System.out.println("DS SAU KHI DOC FILE");
//			String duongDanKH = "src/BaiTapLonOOP/data/KhachHang.txt";
	//		String duongDanCSKH = "src/BaiTapLonOOP/data/ChamSocKhachHang.txt";
	//		danhSachKH.docTapTinKH(duongDanKH);
	//		danhSachKH.docTapTinCSKH(duongDanCSKH);
	//		danhSachKH.hienThi();
			//String duongDanGhi = "src/BaiTapLonOOP/data/KhachHang.txt";
	//		danhSachKH.ghiTapTin(duongDan);
//			danhSachKH.themKhachHang();
//			danhSachKH.hienThi();
			int chon;
			
			while (true) {
				// Hiển thị menu và yêu cầu người dùng nhập lựa chọn
				System.out.println("========QUẢN LÝ KHÁCH HÀNG========");
				System.out.println("1. HIỂN THỊ KHÁCH HÀNG");
				System.out.println("2. THÊM KHÁCH HÀNG");
				System.out.println("3. XÓA KHÁCH HÀNG");
				System.out.println("4. SỬA THÔNG TIN KHÁCH HÀNG");				
				System.out.println("5. TÌM KIẾM KHÁCH HÀNG");
				System.out.println("6. TẠO GIẢM GIÁ CHO KHÁCH HÀNG");
				System.out.println("7. TÍCH ĐIỂM CHO KHÁCH HÀNG");
				System.out.println("8. FEEDBACK CỦA KHÁCH HÀNG");
				System.out.println("0. QUAY LAI");
				System.out.print("Nhập lựa chọn của bạn: ");

				chon = SC.nextInt();

				switch (chon) {
				case 1:
					System.out.println("1. Hiển thị danh sách khách hàng");
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
					System.out.println("Bạn muốn tạo giảm giá cho khách hàng nào?");
				    System.out.print("Nhập mã khách hàng: ");
				    int maKhachHangGiamGia = SC.nextInt();
				    SC.nextLine(); 

				    KhachHang khachHangGiamGia = danhSachKH.layKhachHangTheoMa(maKhachHangGiamGia);

				    if (khachHangGiamGia != null) {
				        if (khachHangGiamGia instanceof ChamSocKhachHang) {
				            ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangGiamGia;
				            chamSocKhachHang.taoGiamGia();
				        } else {
				            System.out.println("Khách hàng không hỗ trợ giảm giá.");
				        }
				    } else {
				        System.out.println("Không tìm thấy khách hàng.");
				    }
				    break;
				case 7:
					System.out.println("Bạn muốn tích điểm cho khách hàng nào?");
				    System.out.print("Nhập mã khách hàng: ");
				    int maKhachHangTichDiem = SC.nextInt();
				    SC.nextLine(); 
				    KhachHang khachHangTichDiem = danhSachKH.layKhachHangTheoMa(maKhachHangTichDiem);
				    if (khachHangTichDiem != null) {
				        if (khachHangTichDiem instanceof ChamSocKhachHang) {
				            ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangTichDiem;
				            chamSocKhachHang.tichDiem();
				        } else {
				            System.out.println("Khách hàng không hỗ trợ tích điểm.");
				        }
				    } else {
				        System.out.println("Không tìm thấy khách hàng.");
				    }
					break;
				case 8:
					System.out.println("Bạn muốn nhập feedback?");
				    System.out.print("Nhập mã khách hàng: ");
				    int maKhachHangfb = SC.nextInt();
				    SC.nextLine(); 
				    KhachHang khachHangfb = danhSachKH.layKhachHangTheoMa(maKhachHangfb);
				    if (khachHangfb != null) {
				        if (khachHangfb instanceof ChamSocKhachHang) {
				            ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangfb;
				            chamSocKhachHang.feedBack();
				        } else {
				            System.out.println("Khách hàng không được hỗ trợ.");
				        }
				    } else {
				        System.out.println("Không tìm thấy khách hàng.");
				    }
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
