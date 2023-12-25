package BaiTapLonOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainNhan {

	private static QuanLyNhanVien qlnv = new QuanLyNhanVien();
	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) throws ParseException, IOException {
		KhachHang kh1 = new KhachHang("Nguyễn Văn A","03/08/2005", "123456789", false);
		KhachHang kh2 = new KhachHang("Trần Thị B","03/09/2000", "987654321", false);
		KhachHang kh3 = new KhachHang("Lê Văn C","07/08/2010", "987654321", false);
		KhachHang kh4 = new ChamSocKhachHang("Lý Thái D", "01/02/2007", "012345679", true, 0);
		ChamSocKhachHang kh5 = new ChamSocKhachHang("Ngô Phước E", "06/06/2004", "07986456123", true, 0);
		QuanLyKhachHang danhSachKH = new QuanLyKhachHang();
		ChamSocKhachHang cs=new ChamSocKhachHang();
		danhSachKH.them(kh1,kh2,kh3,kh4, kh5);
	
		 SanPham sp1 = new SanPham("Cafe Sua", 35000, 30, "25/10/2023");
		 SanPham sp2 = new SanPham("Tra Dao Cam Xa", 20000, 8, "25/10/2023");
		 SanPham sp3 = new SanPham("Caffee Sua", 25000, 10, "25/10/2023");
		 SanPham sp4 = new SanPham("Tra Xanh", 30000, 10, "25/10/2023");
		 SanPham sp5 = new SanPham("Bac Xiu", 25000, 10, "25/10/2023");
		 SanPham sp6 = new SanPham("MatCha Da Xay", 35000, 10, "25/10/2023");
		 SanPham sp7 = new SanPham("Caffee Sua Tuoi", 18000, 10, "25/10/2023");
		 
		 QuanLySanPham ql = new QuanLySanPham();
		 ql.themSP(sp1);
		 ql.themSP(sp2);
		 ql.themSP(sp3);
		 ql.themSP(sp4);
		 ql.themSP(sp5);
		 ql.themSP(sp6);
		 ql.themSP(sp7);
		 
		 String duongDan = "src/BaiTapLonOOP/data/danhsachsanphambanduoc.txt";
		ql.docTapTin(duongDan);
		Scanner scanner = new Scanner(System.in);
		int choice;
		qlnv.docTapTinFT();
		qlnv.docTapTinPT();
		// Bắt đầu vòng lặp

		choice = scanner.nextInt();
		System.out.print("Nhập Ngày bán hàng hôm nay(dd/MM/yyyy): ");
		while (true) {
			// Hiển thị menu và yêu cầu người dùng nhập lựa chọn
			System.out.println("--------------QUAN CAFE NHO--------------");
			System.out.println("1. QUAN LY SAN PHAM");
			System.out.println("2. QUAN LY HOA DON");
			System.out.println("0. Thoát");
			System.out.print("Nhập lựa chọn của bạn: \n------------------------");

			// Đọc lựa chọn từ người dùng
			String DATE = SC.nextLine();
			// Xử lý lựa chọn sử dụng switch-case
			switch (choice) {
			case 1:

				int choice1;
				do {
				System.out.println("QUAN LY SAN PHAM");
				System.out.println("1. THEM SAN PHAM");
				System.out.println("2. HIEN THI DANH SACH SAN PHAM");
				System.out.println("3. TONG SO LUONG SAN PHAM");
				System.out.println("4. XOA SAN PHAM");
				System.out.println("5. TIM KIEM SAN PHAM");
				System.out.println("6. CAP NHAT GIA TIEN");
				System.out.println("0. QUAY LAI");
				
				System.out.print("Nhập lựa chọn của bạn: ");
				choice1 = SC.nextInt();
				int luachon1;
				switch (choice1) {
					case 1:
						ql.nhapSanPham();
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
						System.out.println("Chương trình kết thúc.");
						break;
					}
				if(choice1 == 0) break;
				} while (choice1 < 7 || choice1 > 0);
				break;
			case 2:
				int choice2;
				do {
					
				System.out.println("QUAN LY HOA DON");
				System.out.println("1. MUA SAN PHAM");
				System.out.println("2. HIEN THI DANH SACH SAN PHAM DA MUA");
				System.out.println("3. TINH TONG TIEN");
				System.out
						.println("4. SAP XEP DANH SACH SAN PHAM THEO GIA TIEN");
				System.out.println("5. TIM KIEM SAN PHAM THEO TEN SAN PHAM");
				System.out.println("0. QUAY LAI");
				System.out.print("Nhập lựa chọn của bạn: ");
				choice2 = SC.nextInt();
				SC.nextLine();
				
					int luachon2 =0;
					switch (choice2) {
					case 1:
						while (true) {
//							danhSachKH.themKhachHang();
							ql.muaSanPham(DATE);
							System.out
									.print("Đã thực hiện\nBan muon mua tiep khong(1/0)?: ");
							luachon2 = SC.nextInt();
							if (luachon2 == 0)
								break;
						}
						break;
					case 2:
						danhSachKH.hienThi();
						ql.hienThiDanhSachDaMua();
						break;
					case 3:            
						double tongTien = ql.tinhTongTien();
						System.out.println("Tong tien trong danh sach da mua la: "+ tongTien);
						System.out.println("1. Tích Điểm");
						System.out.println("2. Tạo giảm giá");
						System.out.print(">>>>>Nhập lựa chọn của bạn: ");
						int chon3 = SC.nextInt();
						SC.nextLine();
						if(chon3==1){
							cs.tinhToanTichDiem(danhSachKH);			
						}
						else if(chon3==2){
							cs.tinhToanGiamGia(danhSachKH);
						}
						else {
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
						System.out.println("Chương trình kết thúc.");
						break;
					}
					//qlnv.ghiFileBH();
					if(choice2 == 0) break;
				} while (choice2 < 6 || choice2 > 0);
				break;
			case 0:
				// Kết thúc vòng lặp khi lựa chọn là 0
				System.out.println("Chương trình kết thúc.");
				return;
			default:
				// Hiển thị thông báo nếu lựa chọn không hợp lệ
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
			String duongDandoc = "./src/BaiTapLonOOP/data/danhsachsanpham.txt";
			ql.ghiTapTin(duongDandoc);
		}

		// SanPham sp2 = new SanPham("Tra Xanh", 20000, 3, "25/10/2023");
		// SanPham hd6 = new SanPham("Bac Xiu", 23000, 4, "26/10/2023");
		// SanPham hd7 = new SanPham("Tra Sua", 30000, 5, "24/10/2023");
		// SanPham hd8 = new SanPham("Topping", 5000, 2, "24/10/2023");

		// QuanLyHoaDon qls = new QuanLyHoaDon();
		// ql.themSP(sp1);
		// ql.themSP(sp2);
		//
		//
		// String duongDan = "./src/ortherFile/data/quanlihoadon.txt";
		// ql.docTapTin(duongDan);
		//
		// ql.hienThi();
		//

		//

		// ////////////////////////////
		// try {
		// ql.ghiTapTin("./src/ortherFile/data/quanlysanpham.txt");
		// System.out.println("Đã ghi dữ liệu vào tập tin thành công.");
		// } catch (IOException e) {
		// System.out.println("Lỗi khi ghi tập tin: " + e.getMessage());
		// }
		// ///////////////////////////
		// Xoa theo ten san pham
		// System.out.println("--->>>>>>>Xoa theo ten: ");
		// System.out.print("->>>Nhap ten san pham muon xoa: ");
		// String b = SC.nextLine();
		// ql.xoaSPTheoTen(b);
		// ql.hienThi();
		//
		// //Xoa theo ma san pham
		// System.out.println("--->>>>>>>Xoa theo ma: ");
		// System.out.print("->>>Nhap ma san pham muon xoa: ");
		// int a = SC.nextInt();
		// ql.xoaSPTheoMa(a);
		// ql.hienThi();
		//
		// Nhap san pham moi:
		// ql.nhapSanPham();
		// ql.hienThi();
		//
		// String duongDandoc1 = "./src/ortherFile/data/quanlysanpham.txt";
		// ql.ghiTapTin(duongDandoc1);
		// System.out.println("--->>>>>>>Cap nhat gia san pham: ");
		// System.out.print("->>>>Nhap ma san pham: ");
		// int masanpham = SC.nextInt();
		// System.out.print("->>>>Nhap gia moi cua san pham: ");
		// int giaMoi = SC.nextInt();
		//
		// ql.capNhatGiaTien(masanpham, giaMoi);
		// ql.hienThi();

		// System.out.print("Nhap ma san pham can tim: ");
		// int s = SC.nextInt();
		// SanPham kqTimKiem = ql.timKiem(s);
		// if (kqTimKiem != null)
		// kqTimKiem.hienThi();

		// System.out.print("->>>Nhap ten san pham muon tim: ");
		// String ten = SC.nextLine();
		// ql.timKiemTheoTen(ten);
		// String tenSPCanTim = "Tên sản phẩm cần tìm";
		// SanPham ketQuaTimKiem = ql.timKiemTheoTen(ten);
		//
		// if (ketQuaTimKiem == null) {
		// System.out.println("Không tìm thấy sản phẩm có tên: " + ten);
		// } else {
		// System.out.println("Sản phẩm có tên " + ten);
		// System.out.println(ketQuaTimKiem);
		// }

		// double tongSoLuong = ql.tinhTongSoLuong();
		// System.out.print("Tong so luong san pham la: " + tongSoLuong);
		//
		// System.out.print("Nhap so luong muon chon: ");
		// int soLuong = SC.nextInt();

		// ql.muaSanPham();
		// ql.timKiem(ten).forEach(hd->hd.hienThi());

		// ql.sapXepGiamTheoGia();
		// ql.hienThi();

	}

}
