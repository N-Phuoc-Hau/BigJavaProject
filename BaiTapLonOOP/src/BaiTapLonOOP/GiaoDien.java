package BaiTapLonOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		System.out.println("THE COFFEE HOUSE!!!");
		System.out.println("1. QUẢN LÝ NHÂN VIÊN");
		System.out.println("2. QUẢN LÝ SẢN PHẨM");
		System.out.println("3. QUẢN LÝ HÓA ĐƠN");
		System.out.println("4. QUẢN LÝ KHÁCH HÀNG");
		System.out.println("5. CHĂM SÓC KHÁCH HÀNG");
		System.out.println("0. THOÁT");

		System.out.print("Nhập lựa chọn của bạn: ");
	}

	public static void menuNV() {
		System.out
				.println("------------------------------MENU------------------------------");
		System.out.println("====QUẢN LÝ NHÂN VIÊN====");
		System.out.println("1. HIỂN THỊ NHÂN VIÊN");
		System.out.println("2. SỬA ĐỔI CƠ BẢN");
		System.out.println("3. SỬA ĐỔI NÂNG CAO");
		System.out.println("4. SẮP XẾP NHÂN VIÊN");
		System.out.println("5. THÊM NHÂN VIÊN");
		System.out.println("6. XÓA NHÂN VIÊN");
		System.out.println("0. QUAY LẠI");
	}

	public static void menuSP() {
		System.out
				.println("------------------------------MENU------------------------------");
		System.out.println("====QUAN LY SAN PHAM====");
		System.out.println("1. THÊM SẢN PHẨM");
		System.out.println("2. HIỂN THỊ DANH SÁCH SẢN PHẨM");
		System.out.println("3. TỔNG SỐ LƯỢNG SẢN PHẨM");
		System.out.println("4. XÓA SẢN PHẨM");
		System.out.println("5. TÌM KIẾM SẢN PHẨM");
		System.out.println("6. CẬP NHẬT GIÁ TIỀN");
		System.out.println("0. QUAY LẠI");
	}

	public static void menuHD() {
		System.out
				.println("------------------------------MENU------------------------------");
		System.out.println("====QUAN LY HOA DON====");
		System.out.println("1. MUA SẢN PHẨM");
		System.out.println("2. HIỂN THỊ DANH SÁCH SẢN PHẨM ĐÃ MUA");
		System.out.println("3. TÍNH TỔNG TIỀN");
		System.out.println("4. SẮP XẾP DANH SÁCH SẢN PHẨM THEO GIÁ TIỀN");
		System.out.println("5. TÌM KIẾM SẢN PHẨM THEO TÊN SẢN PHẨM");
		System.out.println("0. QUAY LẠI");
	}

	public static void menuKH() {
		System.out
				.println("------------------------------MENU------------------------------");
		System.out.println("====QUAN LY KHACH HANG====");
		System.out.println("1. HIỂN THỊ KHÁCH HÀNG");
		System.out.println("2. THÊM KHÁCH HÀNG");
		System.out.println("3. XÓA KHÁCH HÀNG");
		System.out.println("4. SỬA THÔNG TIN KHÁCH HÀNG");
		System.out.println("5. TÌM KIẾM KHÁCH HÀNG");
		System.out.println("6. SẮP XẾP KHÁCH HÀNG");
		System.out.println("0. QUAY LAI");
	}
	public static void menuCSKH(){
		System.out
				.println("------------------------------MENU------------------------------");
		System.out.println("1. ĐẶT BÀN");
		System.out.println("2. FEEDBACK CỦA KHÁCH HÀNG");
		System.out.println("0. QUAY LẠI");
	}
	public static String checkNgay() {
		SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");

		do {
			System.out.print("Nhập ngày bán hàng(dd/mm/YYYY):");
			String DATE = SC.nextLine();

			try {
				// Kiểm tra DATE có đúng định dạng không
				Date date = F.parse(DATE);
				if (date == null) {
					throw new Exception("Định dạng ngày nhập không đúng");
				}

				// DATE có đúng định dạng
				return DATE;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	public static String checkGio(String date) {
		SimpleDateFormat F = new SimpleDateFormat("dd/mm/YYYY HH:mm");

		do {
			System.out.print("Nhập giờ bán hàng(HH:mm):");
			String hour = SC.nextLine();
			String DATE = date + ' ' + hour;
			try {
				// Kiểm tra DATE có đúng định dạng không
				Date tmp = F.parse(DATE);
				if (tmp == null) {
					throw new Exception("Định dạng ngày nhập không đúng");
				}

				// DATE có đúng định dạng
				return hour;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
}
