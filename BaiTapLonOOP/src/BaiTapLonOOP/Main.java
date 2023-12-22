package BaiTapLonOOP;

import java.util.Scanner;
public class Main{
	
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
		System.out.println("");
		System.out.println("QUAY LAI");
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
		System.out.println("1. HIỂN THỊ KHÁCH HÀNG THEO MÃ");
		System.out.println("2. HIỂN THỊ KHÁCH HÀNG THEO TÊN");
		System.out.println("3. THÊM KHÁCH HÀNG");
		System.out.println("4. XÓA KHÁCH HÀNG THEO MÃ");
		System.out.println("5. XÓA KHÁCH HÀNG THEO TÊN");
		System.out.println("6. SỬA THÔNG TIN KHÁCH HÀNG");
		System.out.println("7. TÌM KIẾM KHÁCH HÀNG");

		System.out.println("QUAY LAI");
	}

	public static void menuCSKH() {
		System.out.println("QUAN LY CHAM SOC KHACH HANG");
		System.out.println("1. TẠO GIẢM GIÁ");
		System.out.println("2. TÍCH ĐIỂM");
		System.out.println("3. FEEDBACK");
		System.out.println("QUAY LAI");
	}

	public static void main(String[] args) {
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
				// Thực hiện công việc 1
				menuNV();
				do{
					chon1 = sc.nextInt();
					switch (chon1){
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
				}while(chon1 > 1 || chon1 < 6);
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
				}while(chon3 > 1 || chon3 < 6);
				System.out.println("Đã thực hiện công việc 3");
				break;
			case 0:
				// Kết thúc vòng lặp khi lựa chọn là 0
				System.out.println("Chương trình kết thúc.");
				return;
			default:
				// Hiển thị thông báo nếu lựa chọn không hợp lệ
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}
}