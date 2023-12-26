package BaiTapLonOOP;

import java.util.Scanner;
public class GiaoDien {
	private static final Scanner SC = new Scanner(System.in);
	public static void khoa() {
		do {

			// Hiển thị tiêu đề
			System.out.println("Giao diện đăng nhập");

			// Hiển thị yêu cầu nhập tên đăng nhập
			System.out.print("Tên đăng nhập: ");
			String username = SC.nextLine();

			// Hiển thị yêu cầu nhập mật khẩu
			System.out.print("Mật khẩu: ");
			String password = SC.nextLine();

			// Kiểm tra thông tin đăng nhập
			if ("admin".equals(username) && "123456".equals(password)) {
				// Thông tin đăng nhập đúng
				System.out.println("Đăng nhập thành công");
				break;
			} else {
				// Thông tin đăng nhập sai
				System.out.println("Đăng nhập thất bại");
			}
		} while (true);
	}

	public static void giaoDien() {
		System.out.println("TIEM CAFE NHO!!!");
		System.out.println("1. QUAN LY NHAN VIEN");
		System.out.println("2. QUAN LY SAN PHAM");
		System.out.println("3. QUAN LY HOA DON");
		System.out.println("4. QUAN LY KHACH HANG");
		System.out.println("0. THOAT");

		System.out.print("Nhập lựa chọn của bạn: ");
	}

	public static void menuNV() {
		 System.out.println("------------------------------MENU------------------------------");
		System.out.println("QUAN LY NHAN VIEN");
		System.out.println("1. HIEN THI NHAN VIEN");
		System.out.println("2. SUA DOI CO BAN");
		System.out.println("3. SUA DOI NANG CAO");
		System.out.println("4. SAP XEP NHAN VIEN");
		System.out.println("5. THEM NHAN VIEN");
		System.out.println("6. XOA NHAN VIEN");
		System.out.println("0. QUAY LAI");
	}

	public static void menuSP() {
		 System.out.println("------------------------------MENU------------------------------");
			System.out.println("QUAN LY SAN PHAM");
			System.out.println("1. THEM SAN PHAM");
			System.out.println("2. HIEN THI DANH SACH SAN PHAM");
			System.out.println("3. TONG SO LUONG SAN PHAM");
			System.out.println("4. XOA SAN PHAM");
			System.out.println("5. TIM KIEM SAN PHAM");
			System.out.println("6. CAP NHAT GIA TIEN");
			System.out.println("0. QUAY LAI");
	}
	
	public static void menuHD() {
		 System.out.println("------------------------------MENU------------------------------");
			System.out.println("QUAN LY HOA DON");
			System.out.println("1. MUA SAN PHAM");
			System.out.println("2. HIEN THI DANH SACH SAN PHAM DA MUA");
			System.out.println("3. TINH TONG TIEN");
			System.out
					.println("4. SAP XEP DANH SACH SAN PHAM THEO GIA TIEN");
			System.out
					.println("5. TIM KIEM SAN PHAM THEO TEN SAN PHAM");
			System.out.println("0. QUAY LAI");
	}
	public static void menuKH() {
		 System.out.println("------------------------------MENU------------------------------");
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
}
