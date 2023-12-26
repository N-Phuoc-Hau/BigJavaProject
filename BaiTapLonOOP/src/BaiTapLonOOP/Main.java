package BaiTapLonOOP;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) throws ParseException, IOException {
		KhachHang kh1 = new KhachHang("Nguyễn Văn A", "03/08/2005",
				"123456789", false);
		KhachHang kh2 = new KhachHang("Trần Thị B", "03/09/2000", "987654321",
				false);
		KhachHang kh3 = new ChamSocKhachHang("Lê Văn C", "07/08/2010",
				"987654321", true, 0);
		KhachHang kh4 = new ChamSocKhachHang("Lý Thái D", "01/02/2007",
				"012345679", true, 0);
		KhachHang kh5 = new ChamSocKhachHang("Ngô Phước E", "06/06/2004",
				"07986456123", true, 0);
		QuanLyNhanVien qlnv = new QuanLyNhanVien();
		QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
		ChamSocKhachHang cs = new ChamSocKhachHang();
		QuanLySanPham ql = new QuanLySanPham();
		String duongDan = "src/BaiTapLonOOP/data/danhsachsanpham.txt";
		danhSachKH.them(kh1, kh2, kh3, kh4, kh5);
		qlnv.docTapTinFT();
		qlnv.docTapTinPT();
		ql.docTapTin(duongDan);
		int chon1, chon3;
		int choice;
		GiaoDien.khoa();
		System.out.println("======QUÁN CÀ PHÊ NHỎ========");
		// Đọc lựa chọn từ người dùng
		String DATE = GiaoDien.checkNgay();
		// Bắt đầu vòng lặp
		while (true) {
			// Hiển thị menu và yêu cầu người dùng nhập lựa chọn
			GiaoDien.giaoDien();

			// Đọc lựa chọn từ người dùng
			choice = SC.nextInt();

			// Xử lý lựa chọn sử dụng switch-case
			switch (choice) {
			case 1:
				do {
					// Thực hiện công việc 1
					GiaoDien.menuNV();
					System.out.print("Nhập lựa chọn của bạn: ");
					chon1 = SC.nextInt();
					switch (chon1) {
					case 1:
						System.out.println("1. Hiển thị toàn bộ nhân viên");
						System.out.println("2. Hiển thị theo mã nhân viên");
						System.out.println("3. Hiển thị theo tên nhân viên");
						System.out
								.println("4. Hiển thị theo giới tính nhân viên");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int chonnv1 = SC.nextInt();
						SC.nextLine();
						if (chonnv1 == 1) {
							qlnv.hienThi();
						} else if (chonnv1 == 2) {
							qlnv.hienThiTheoMa();
							;
						} else if (chonnv1 == 3) {
							qlnv.hienThiTheoTen();
							;
						} else if (chonnv1 == 4) {
							qlnv.hienThiTheoGT();
						} else {
							System.out.println("Lựa chọn không hợp lệ.");
						}
						break;
					case 2:
						System.out.println("2. SUA DOI CO BAN");
						qlnv.suaTTCB();
						break;
					case 3:
						System.out.println("3. SUA DOI NANG CAO");
						System.out.println("1. Sửa đổi lương");
						System.out
								.println("2. Sửa đổi giờ làm việc & Ngày nghỉ phép");
						System.out.println("3. Sửa đổi Chức vụ");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int chonnv2 = SC.nextInt();
						SC.nextLine();
						if (chonnv2 == 1) {
							qlnv.sualuong();
						} else if (chonnv2 == 2) {
							qlnv.suaTTlamviec();
						} else if (chonnv2 == 3) {
							qlnv.thangHaChuc(DATE);
						} else {
							System.out.println("Lựa chọn không hợp lệ.");
						}
						break;
					case 4:
						System.out.println("4. SAP XEP NHAN VIEN THEO TEN");
						qlnv.sapXepTheoTen();
						break;
					case 5:
						System.out.println("5. THEM NHAN VIEN");
						qlnv.them();
						break;
					case 6:
						System.out.println("6. XOA NHAN VIEN");
						qlnv.xoaNVTheoMa();
						break;
					case 0:
						System.out.println("QUAY LAI");
						break;
					}

					if (chon1 == 0)

						break;
				} while (chon1 > 1 || chon1 < 9);
				qlnv.ghiTapTin();
				System.out.println("Đã thực hiện công việc 1");
				break;
			case 2:
				// Thực hiện công việc 2
				// menuSP();
				int choice1;
				do {
					GiaoDien.menuSP();
					System.out.print("Nhập lựa chọn của bạn: ");
					choice1 = SC.nextInt();
					int luachon1;
					switch (choice1) {
					case 1:
						ql.nhapSanPham(DATE);
						System.out.print("\nĐã thực hiện!");
						break;
					case 2:
						ql.hienThi();
						System.out.println("\nĐã thực hiện!");
						break;
					case 3:
						double tongSoLuong = ql.tinhTongSoLuong();
						System.out.printf("Tong so luong san pham la: %.1f\n",
								tongSoLuong);
						break;
					case 4:
						do {
							System.out.println("--->>>>>>>Xoa theo ten: ");
							System.out
									.print("->>>Nhap ten san pham muon xoa: ");
							SC.nextLine();
							String b = SC.nextLine();
							ql.xoaSPTheoTen(b);
							ql.hienThi();
							System.out
									.print("Đã thực hiện\nBan muon xoa tiep khong(1/0)?: ");
							luachon1 = SC.nextInt();
						} while (luachon1 == 1);
						break;
					case 5:
						do {
							System.out.print("Nhap ma san pham can tim: ");
							int s = SC.nextInt();
							SanPham kqTimKiem = ql.timKiem(s);
							if (kqTimKiem != null)
								kqTimKiem.hienThi();
							System.out
									.print("Đã thực hiện\nBan muon tim kiem tiep khong(1/0)?: ");
							luachon1 = SC.nextInt();
						} while (luachon1 == 1);
						break;
					case 6:
						do {
							System.out
									.println("--->>>>>>>Cap nhat gia san pham: ");
							System.out.print("->>>>Nhap ma san pham: ");
							int masanpham = SC.nextInt();
							System.out
									.print("->>>>Nhap gia moi cua san pham: ");
							int giaMoi = SC.nextInt();

							ql.capNhatGiaTien(masanpham, giaMoi);
							System.out
									.print("Đã thực hiện\nBan muon cap nhat gia tiep khong(1/0)?: ");
							luachon1 = SC.nextInt();
						} while (luachon1 == 1);
						break;
					case 0:
						// Kết thúc vòng lặp khi lựa chọn là 0
						System.out.println("Thoát!!!");
						break;
					default:
						System.out
								.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					}
					if (choice1 == 0)
						break;
				} while (choice1 < 7 || choice1 > 0);
				break;
			case 3:
				// Thực hiện công việc 2
				// menuSP();
				int choice2;
				do {
					GiaoDien.menuHD();
					System.out.print("Nhập lựa chọn của bạn: ");
					choice2 = SC.nextInt();
					SC.nextLine();

					int luachon2 = 0;
					switch (choice2) {
					case 1:
						while (true) {
							// danhSachKH.themKhachHang();
							ql.muaSanPham(DATE);
							System.out
									.print("Đã thực hiện\nBan muon mua tiep khong(1/0)?: ");
							luachon2 = SC.nextInt();
							if (luachon2 == 0)
								break;
						}
						break;
					case 2:
						ql.hienThiDanhSachDaMua();
						break;
					case 3:
						double tongTien = ql.tinhTongTien();
						danhSachKH.hienThi();
						System.out
								.println("Tong tien trong danh sach da mua la: "
										+ tongTien);
						System.out.println("1. Tích Điểm");
						System.out.println("2. Tạo giảm giá");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int c3 = SC.nextInt();
						SC.nextLine();
						if (c3 == 1) {
							cs.tinhToanTichDiem(danhSachKH);
						} else if (c3 == 2) {
							cs.tinhToanGiamGia(danhSachKH);
						} else {
							System.out.println("Lựa chọn không hợp lệ.");
						}
						break;
					case 4:
						ql.sapXepGiamTheoGia();
						ql.hienThi();
						break;
					case 5:
						do {
							System.out.print("Nhap ten san pham can tim: ");
							String tenSanPhamCanTim = SC.nextLine();

							// Duyet qua danh sach va in truc tiep
							boolean timThay = false;
							for (SanPham sp : ql.getDanhSachDaMua()) {
								if (sp.getTenSP()
										.toLowerCase()
										.contains(
												tenSanPhamCanTim.toLowerCase())) {
									System.out.println(sp);
									timThay = true;
								}
							}

							if (!timThay) {
								System.out
										.println("Không tìm thấy sản phẩm có tên "
												+ tenSanPhamCanTim);
							} else {
								System.out.println("Sản phẩm đã mua có tên "
										+ tenSanPhamCanTim);
							}
							System.out
									.print("Đã thực hiện\nBan muon mua tiep khong(1/0)?: ");
							luachon2 = SC.nextInt();
						} while (luachon2 == 1);
						break;
					case 0:
						// Kết thúc vòng lặp khi lựa chọn là 0
						String h = GiaoDien.checkGio(DATE);
						qlnv.ghiFileBH(DATE, h);
						String duongDan2 = "./src/BaiTapLonOOP/data/danhsachsanphambanduoc.txt";
						ql.ghiTapTin(duongDan2, h);
						String duongDan1 = "./src/BaiTapLonOOP/data/danhsachsanphamdamua.txt";
						ql.ghiTapTinDSSPBD(duongDan1, h);
						System.out
								.println("Cảm ơn quý khách đã sử dụng dịch vụ!!");
						break;
					default:
						System.out
								.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");

					}
					if (choice2 == 0)
						break;
				} while (choice2 < 6 || choice2 > 0);
				break;
			case 4:
				do {

					GiaoDien.menuKH();
					chon3 = SC.nextInt();
					switch (chon3) {
					case 1:
						System.out.println("1. Hiển thị toàn bộ khách hàng");
						System.out.println("2. Hiển thị khách hàng theo Mã");
						System.out.println("3. Hiển thị khách hàng theo Tên");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int chonkh1 = SC.nextInt();
						SC.nextLine();
						if (chonkh1 == 1) {
							danhSachKH.hienThi();
						} else if (chonkh1 == 2) {
							danhSachKH.hienThiTheoMa();
						} else if (chonkh1 == 3) {
							danhSachKH.hienThiTheoTen();
						} else {
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
						if (chonkh3 == 1) {
							danhSachKH.xoaKHTheoMa();
						} else if (chonkh3 == 2) {
							danhSachKH.xoaKHTheoTen();
						} else {
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
						if (chonkh5 == 1) {
							danhSachKH.timKiemTheoMaKH();
						} else if (chonkh5 == 2) {
							danhSachKH.timKiemTheoTenKH();
						} else {
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
						if (chonkh6 == 1) {
							danhSachKH.sapXepTheoMaKH();
							danhSachKH.hienThi();
						} else if (chonkh6 == 2) {
							danhSachKH.sapXepTheoTen();
							danhSachKH.hienThi();
						} else if (chonkh6 == 3) {
							danhSachKH.sapXepTheoNgaySinh();
							danhSachKH.hienThi();
						} else {
							System.out.println("Lựa chọn không hợp lệ.");
						}
						break;
					case 7:
						danhSachKH.datBan();
						danhSachKH.hienThiDatBan();
						break;
					case 8:
						cs.tinhToanGiamGia(danhSachKH);
						break;
					case 9:
						cs.tinhToanTichDiem(danhSachKH);
						break;
					case 10:
						cs.xuLyFeedBack(danhSachKH);
						break;
					case 0:
						System.out
								.println("Cảm ơn bạn đã sử dụng chương trình.");
						break;
					default:
						System.out
								.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					}
					if (chon3 == 0)
						break;
				} while (chon3 > 1 || chon3 < 10);
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