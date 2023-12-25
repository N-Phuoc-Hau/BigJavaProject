package BaiTapLonOOP;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
public class Main{
	private static final Scanner SC = new Scanner(System.in);
	private static QuanLyNhanVien qlnv = new QuanLyNhanVien();
	public static void khoa(){
		Scanner sc = new Scanner(System.in);
		do{

		      // Hiển thị tiêu đề
		      System.out.println("Giao diện đăng nhập");

		      // Hiển thị yêu cầu nhập tên đăng nhập
		      System.out.print("Tên đăng nhập: ");
		      String username = sc.nextLine();

		      // Hiển thị yêu cầu nhập mật khẩu
		      System.out.print("Mật khẩu: ");
		      String password = sc.nextLine();

		      // Kiểm tra thông tin đăng nhập
		      if ("admin".equals(username) && "123456".equals(password)) {
		          // Thông tin đăng nhập đúng
		          System.out.println("Đăng nhập thành công");
		          break;
		      } else {
		          // Thông tin đăng nhập sai
		          System.out.println("Đăng nhập thất bại");
		      }
		}while(true);
	}

	public static void giaoDien() {
		System.out.println("TIEM CAFE NHO!!!");
		System.out.println("1. QUAN LY NHAN VIEN");
		System.out.println("2. QUAN LY SAN PHAM");
		System.out.println("3. QUAN LY KHACH HANG");
		System.out.println("0. THOAT");

		System.out.print("Nhập lựa chọn của bạn: ");
	}

	public static void menuNV() {
		// System.out.println("------------------------------MENU------------------------------");
		System.out.println("QUAN LY NHAN VIEN");
		System.out.println("1. HIEN THI TAT CA");
		System.out.println("2. TRA CUU THEO MA NHAN VIEN");
		System.out.println("3. TRA CUU GIOI TINH");
		System.out.println("4. TRA CUU THEO TEN");
		System.out.println("5. SUA DOI CO BAN");
		System.out.println("6. SUA DOI NANG CAO");
		System.out.println("7. THEM NHAN VIEN");
		System.out.println("8. XOA NHAN VIEN");
		System.out.println("0. QUAY LAI");
	}

	public static void menuSP() {
		System.out.println("QUAN LY SAN PHAM");
		System.out.println("1. NHAP SAN PHAM");
		System.out.println("2. IN DANH SACH SAN PHAM");
		System.out.println("3. THEM SAN PHAM VAO KHO");
		System.out.println("4. XOA SAN PHAM TRONG KHO");
		System.out.println("5. TIM KIEM SAN PHAM TRONG KHO");
		System.out.println("6. QUAY LAI");
	}

	public static void menuKH() {
		System.out.println("QUAN LY KHACH HANG");
		System.out.println("1. HIỂN THỊ KHÁCH HÀNG");
		System.out.println("2. THÊM KHÁCH HÀNG");
		System.out.println("3. XÓA KHÁCH HÀNG");
		System.out.println("4. SỬA THÔNG TIN KHÁCH HÀNG");
		System.out.println("5. TÌM KIẾM KHÁCH HÀNG");
		System.out.println("6. SẮP XẾP KHÁCH HÀNG");
		System.out.println("7. Đặt bàn");
		System.out.println("8. TẠO GIẢM GIÁ CHO KHÁCH HÀNG");
		System.out.println("9. TÍCH ĐIỂM CHO KHÁCH HÀNG");
		System.out.println("10. FEEDBACK CỦA KHÁCH HÀNG");
		System.out.println("0. QUAY LAI");
	}

	public static void main(String[] args) throws ParseException, IOException {
		KhachHang kh1 = new KhachHang("Nguyễn Văn A","03/08/2005", "123456789", false);
		KhachHang kh2 = new KhachHang("Trần Thị B","03/09/2000", "987654321", false);
		KhachHang kh3 = new ChamSocKhachHang("Lê Văn C","07/08/2010", "987654321", true,0);
		KhachHang kh4 = new ChamSocKhachHang("Lý Thái D", "01/02/2007", "012345679", true, 0);
		KhachHang kh5 = new ChamSocKhachHang("Ngô Phước E", "06/06/2004", "07986456123", true, 0);
		QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
		ChamSocKhachHang cs=new ChamSocKhachHang();
		danhSachKH.them(kh1,kh2,kh3,kh4, kh5);
		qlnv.docTapTinFT();
		qlnv.docTapTinPT();
		int chon1, chon2, chon3;
		Scanner sc = new Scanner(System.in);
		int choice;

		// Bắt đầu vòng lặp
		while (true) {
			// Hiển thị menu và yêu cầu người dùng nhập lựa chọn
			giaoDien();

			// Đọc lựa chọn từ người dùng
			choice = sc.nextInt();

			// Xử lý lựa chọn sử dụng switch-case
			switch (choice) {
			case 1:
				khoa();
				do{
				// Thực hiện công việc 1
				menuNV();
				

					chon1 = sc.nextInt();
					switch (chon1){
					case 1:
						System.out.println("1. TAT CA NHAN VIEN");
						qlnv.hienThi();
						break;
					case 2:
						System.out.println("2. TRA CUU THEO MA NHAN VIEN");
						qlnv.hienThiTheoMa();
						break;
					case 3: 
						System.out.println("3. TRA CUU GIOI TINH");
						qlnv.hienThiTheoGT();
						break;
					case 4:
						System.out.println("4. TRA CUU THEO TEN");
						qlnv.hienThiTheoTen();
						break;
					case 5:
						System.out.println("5. SUA DOI CO BAN");
						qlnv.suaTTCB();
						break;
					case 6:
						System.out.println("6. SUA DOI NANG CAO");
						qlnv.suaTTNC();
						break;
					case 7: 
						System.out.println("7. THEM NHAN VIEN");
						qlnv.them();
						break;
					case 8:
						System.out.println("8. XOA NHAN VIEN");
						qlnv.xoaNVTheoMa();
						break;
					case 0:
						System.out.println("QUAY LAI");
						break;
					}
					if(chon1 == 0) break;
				}while(chon1 > 1 || chon1 < 9);
				qlnv.ghiTapTin();
				System.out.println("Đã thực hiện công việc 1");
				break;
			case 2:
				khoa();
				// Thực hiện công việc 2
				menuSP();
				do{
					chon2 = sc.nextInt();
					switch (chon2){
					case 1:
						break;
					case 2:
						break;
					case 3: 
						break;
					case 4:
						break;
					case 5:
						break;
					case 6: 
						break;
					}
				}while(chon2 > 1 || chon2 < 6);
				System.out.println("Đã thực hiện công việc 2");
				break;
			case 3:
				khoa();
				menuKH();
				do{
					chon3 = sc.nextInt();
					switch (chon3){
					case 1:
						System.out.println("1. Hiển thị toàn bộ khách hàng");
						System.out.println("2. Hiển thị khách hàng theo Mã");
						System.out.println("3. Hiển thị khách hàng theo Tên");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int chonkh1 = SC.nextInt();
	                    SC.nextLine(); 
						if(chonkh1==1){
							danhSachKH.hienThi();						
						}
						else if(chonkh1 == 2){
							danhSachKH.hienThiTheoMa();						
						}
						else if(chonkh1 == 3){
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
						int chonkh3 = SC.nextInt();
	                    SC.nextLine(); 
						if(chonkh3==1){
							danhSachKH.xoaKHTheoMa();						
						}
						else if(chonkh3 == 2){
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
						int chonkh5 = SC.nextInt();
	                    SC.nextLine(); 
						if(chonkh5==1){
							danhSachKH.timKiemTheoMaKH();						
						}
						else if(chonkh5 == 2){
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
						int chonkh6 = SC.nextInt();
	                    SC.nextLine();
						danhSachKH.sapXepTheoMaKH();
						danhSachKH.hienThi();
						if(chonkh6==1){
							danhSachKH.sapXepTheoMaKH();						
						}
						else if(chonkh6 == 2){
							danhSachKH.sapXepTheoTen();						
						}
						else if(chonkh6==3){
							danhSachKH.sapXepTheoNgaySinh();
						}
						else {
							System.out.println("Lựa chọn không hợp lệ.");
						}
						break;
					case 7:
			            cs.tinhToanGiamGia(danhSachKH);
					    break;
					case 8:
			            cs.tinhToanTichDiem(danhSachKH);
						break;
					case 9:
						cs.xuLyFeedBack(danhSachKH);
						break;
					case 10:
						danhSachKH.datBan();
						danhSachKH.hienThiDatBan();
					case 0:
						System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					}
				}while(chon3 > 1 || chon3 < 10);
				System.out.println("Đã thực hiện công việc 3");
				break;
			case 0:
				System.out.println("Chương trình kết thúc.");
				return;
			default:
				// Hiển thị thông báo nếu lựa chọn không hợp lệ
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}
}