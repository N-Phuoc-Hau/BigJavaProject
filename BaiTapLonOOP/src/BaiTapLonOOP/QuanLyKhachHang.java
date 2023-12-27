package BaiTapLonOOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class QuanLyKhachHang {
	private ArrayList<KhachHang> danhSachKH = new ArrayList<>();
	private Map<Integer, String> danhSachDatBan = new HashMap<>();
	private static final Scanner SC = new Scanner(System.in);

	public QuanLyKhachHang() {
		this.danhSachKH = new ArrayList<>();
	}

	public void them(KhachHang... kh) {
		danhSachKH.addAll(Arrays.asList(kh));
	}

	public void hienThi() {
		danhSachKH.forEach(danhSachKH -> danhSachKH.hienThi());
	}

	public void hienThiTheoMa() {
		System.out.print("Nhập mã khách hàng cần hiển thị: ");
		int maKH = SC.nextInt();
		boolean found = false;
		for (int i = 0; i < danhSachKH.size(); i++) {
			if (danhSachKH.get(i).getMaKH() == maKH) {
				danhSachKH.get(i).hienThi();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy khách hàng có mã: " + maKH);
		}
	}

	public void hienThiTheoTen() {
		System.out.print("Nhập Tên khách hàng cần hiển thị: ");
		String hoTen = SC.nextLine().trim();
		boolean found = false;
		for (int i = 0; i < danhSachKH.size(); i++) {
			if (danhSachKH.get(i).getHoTen().equals(hoTen)) {
				danhSachKH.get(i).hienThi();
<<<<<<< HEAD
				return;
=======
				found = true;
				break;
>>>>>>> b6cb05154935030d450a9e42f629c99a58c95683
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy khách hàng có tên: " + hoTen);
		}
	}

	public void themKhachHang() throws ParseException {
		System.out.print("Nhập họ tên khách hàng: ");
		String hoTen = SC.nextLine();

		System.out.print("Nhập ngày sinh khách hàng: ");
		String ngaySinh = SC.nextLine();

		System.out.print("Nhập số điện thoại khách hàng: ");
		String soDienThoai = SC.nextLine();

		System.out.print("Là thành viên (true/false): ");
		boolean laThanhVien = SC.nextBoolean();

		System.out.print("Nhập điểm tích lũy: ");
		int diemTichLuy = SC.nextInt();

		KhachHang khachHang = new KhachHang(hoTen, ngaySinh, soDienThoai,
				laThanhVien, diemTichLuy);

		danhSachKH.add(khachHang);
		System.out.println("Thêm khách hàng thành công!");
		System.out.println("---------------");
	}

	public void xoaKHTheoMa() {
		System.out.print("Nhập mã khách hàng cần xóa: ");
		int maKhachHangXoa = SC.nextInt();
		Iterator<KhachHang> iterator = danhSachKH.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			KhachHang khachHang = iterator.next();
			if (khachHang.getMaKH() == maKhachHangXoa) {
				iterator.remove();
				System.out.println("Thông tin khách hàng đã xóa:");
				khachHang.hienThi();
				System.out.println("Xóa khách hàng thành công!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy khách hàng có mã "
					+ maKhachHangXoa);
		}
	}

	public void xoaKHTheoTen() {
		System.out.print("Nhập Tên khách hàng cần xóa: ");
		String tenKhachHangXoa = SC.nextLine().trim();
		Iterator<KhachHang> iterator = danhSachKH.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			KhachHang khachHang = iterator.next();
			if (khachHang.getHoTen().equalsIgnoreCase(tenKhachHangXoa)) {
				iterator.remove();
				System.out.println("Thông tin khách hàng đã xóa:");
				khachHang.hienThi();
				System.out.println("Xóa khách hàng thành công!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy khách hàng có tên "
					+ tenKhachHangXoa);
		}
	}

	public void suaThongTinKH() {
		System.out.print("Nhập mã khách hàng cần sửa: ");
		int maKhachHang = SC.nextInt();
		SC.nextLine();
		boolean timThay = false;

		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == maKhachHang) {
				System.out.println("Thông tin khách hàng cần sửa:");
				khachHang.hienThi();

				System.out.println("Nhập thông tin mới:");
				System.out.print("Họ và tên: ");
				String hoTenMoi = SC.nextLine();
				System.out.print("Số điện thoại: ");
				String soDienThoaiMoi = SC.nextLine();
				System.out.print("Là thành viên (true/false): ");
				boolean isThanhVienMoi = SC.nextBoolean();
				System.out.print("Nhập số điểm tích lũy mới: ");
				int diemTichLuyMoi = SC.nextInt();
				khachHang.setDiem(diemTichLuyMoi);

				khachHang.setHoTen(hoTenMoi);
				khachHang.setSoDT(soDienThoaiMoi);
				khachHang.setThanhVien(isThanhVienMoi);

				System.out.println("Thông tin khách hàng sau khi sửa:");
				khachHang.hienThi();
				timThay = true;
				break;
			}
		}
		if (!timThay) {
			System.out.println("Không tìm thấy khách hàng có mã " + maKhachHang
					+ ".");
		}
	}

	public void timKiemTheoMaKH() {
		System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
		int maCanTim = SC.nextInt();

		boolean timThay = false;

		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == maCanTim) {
				System.out.println("Khách hàng đã tìm thấy:");
				khachHang.hienThi();
				timThay = true;
				break;
			}
		}

		if (!timThay) {
			System.out.println("Không tìm thấy khách hàng có mã tương ứng.");
		}
	}

	public void timKiemTheoTenKH() {
		System.out.print("Nhập tên khách hàng cần tìm: ");
		String tenKH = SC.nextLine();
		boolean timThay = false;

		for (KhachHang kh : danhSachKH) {
			if (kh.getHoTen().trim().equalsIgnoreCase(tenKH.trim())) {
				kh.hienThi();
				timThay = true;
				break;
			}
		}

		if (!timThay) {
			System.out.println("Không tìm thấy khách hàng có tên: " + tenKH);
		}
	}

	// Phương thức sắp xếp theo tên khách hàng
	public void sapXepTheoTen() {
		Collections.sort(danhSachKH, Comparator.comparing(kh -> {
			String ten = kh.getHoTen();
			return ten.charAt(ten.lastIndexOf(' ') + 1);
		}));

		System.out.println("Đã sắp xếp danh sách theo tên khách hàng.");
	}

	// Phương thức sắp xếp theo mã khách hàng
	public void sapXepTheoMaKH() {
		Collections.sort(danhSachKH,
				Comparator.comparingInt(KhachHang::getMaKH));
		System.out.println("Đã sắp xếp danh sách theo mã khách hàng.");
	}

	// Phương thức sắp xếp theo ngày sinh
	public void sapXepTheoNgaySinh() {
		Collections.sort(danhSachKH,
				Comparator.comparing(KhachHang::getNgaySinh));
		System.out.println("Đã sắp xếp danh sách theo ngày sinh.");
	}

	public KhachHang layKhachHangTheoMa(int maKhachHangCanTim) {
		for (KhachHang kh : danhSachKH) {
			if (kh.getMaKH() == maKhachHangCanTim) {
				return kh;
			}
		}
		System.out.println("Không tìm thấy khách hàng với mã: "
				+ maKhachHangCanTim);
		return null;
	}

	public KhachHang layKhachHangTheoTen(String tenKhachHang) {
		for (KhachHang kh : danhSachKH) {
			if (kh.getHoTen().trim().equalsIgnoreCase(tenKhachHang.trim())) {
				return kh;
			}
		}
		System.out
				.println("Không tìm thấy khách hàng với tên: " + tenKhachHang);
		return null;
	}

	public void docTapTinKH(String duongDanKH) throws FileNotFoundException,
			ParseException {
		File f = new File(duongDanKH);
		try (Scanner SC = new Scanner(f)) {
			while (SC.hasNext()) {
				String hoTen = SC.nextLine();
				String ngaySinh = SC.nextLine();
				String soDT = SC.nextLine();
				boolean isThanhVien = Boolean.parseBoolean(SC.nextLine());
				int diem = SC.nextByte();
				if (SC.hasNext()) {
					SC.nextLine();
				}
				KhachHang kh = new KhachHang(hoTen, ngaySinh, soDT,
						isThanhVien, diem);
				danhSachKH.add(kh);

				System.out.println("Đã đọc: " + hoTen + " - " + ngaySinh
						+ " - " + soDT + " - " + isThanhVien + diem);
			}
		}
	}

	public void ghiTapTin(String duongDan) throws IOException {
		try (Scanner input = new Scanner(System.in);
				FileWriter writer = new FileWriter(duongDan, true)) { // True để
																		// không
																		// ghi
																		// đè
																		// tập
																		// tin
			System.out.print("Nhập họ tên khách hàng: ");
			String hoTen = input.nextLine();
			System.out.print("Nhập ngày sinh khách hàng: ");
			String ngaySinh = input.nextLine();
			System.out.print("Nhập số điện thoại khách hàng: ");
			String soDienThoai = input.nextLine();
			System.out.print("Là thành viên (true/false): ");
			boolean laThanhVien = input.nextBoolean();
			System.out.print("Nhập số điểm: ");
			int diem = input.nextByte();

			writer.write(hoTen + "\n");
			writer.write(ngaySinh + "\n");
			writer.write(soDienThoai + "\n");
			writer.write(laThanhVien + "\n");
			writer.write(diem + "\n");

			System.out.println("Ghi tập tin thành công!");
		} catch (IOException e) {
			System.err.println("Lỗi khi ghi tập tin: " + e.getMessage());
			throw e;
		}
	}

	public void datBan() {
		System.out.println("Chọn cách tìm khách hàng:");
		System.out.println("1. Tìm theo Mã khách hàng");
		System.out.println("2. Tìm theo Tên khách hàng");
		System.out.print("Nhập lựa chọn: ");
		int luaChon = SC.nextInt();
		SC.nextLine();

		KhachHang khachHangDatBan = null;

		switch (luaChon) {
		case 1:
			System.out.print("Nhập mã khách hàng đặt bàn: ");
			int maKhachHangDatBan = SC.nextInt();
			khachHangDatBan = layKhachHangTheoMa(maKhachHangDatBan);
			break;
		case 2:
			System.out.print("Nhập tên khách hàng đặt bàn: ");
			String tenKhachHangDatBan = SC.nextLine();
			khachHangDatBan = layKhachHangTheoTen(tenKhachHangDatBan);
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			return;
		}

<<<<<<< HEAD
        if (khachHangDatBan != null) {
            System.out.print("Nhập thông tin đặt bàn: ");
            SC.nextLine();
            String thongTinDatBan = SC.nextLine();
=======
		if (khachHangDatBan != null) {
			System.out.print("Nhập thông tin đặt bàn: ");
			String thongTinDatBan = SC.nextLine();
>>>>>>> b6cb05154935030d450a9e42f629c99a58c95683

			danhSachDatBan.put(khachHangDatBan.getMaKH(), thongTinDatBan);

			System.out.println("Đặt bàn thành công!");
		} else {
			System.out.println("Không tìm thấy khách hàng để đặt bàn.");
		}
	}

	public void hienThiDatBan() {
		System.out.println("Danh sách đặt bàn:");
		for (Map.Entry<Integer, String> entry : danhSachDatBan.entrySet()) {
			int maKhachHang = entry.getKey();
			String thongTinDatBan = entry.getValue();

			KhachHang khachHang = layKhachHangTheoMa(maKhachHang);
			if (khachHang != null) {
				System.out.println("Mã KH: " + maKhachHang + ", Tên KH: "
						+ khachHang.getHoTen() + ", Thông tin đặt bàn: "
						+ thongTinDatBan);
			} else {
				System.out
						.println("Không tìm thấy thông tin khách hàng cho Mã KH: "
								+ maKhachHang);
			}
		}
	}

	public void tinhToanGiamGia(QuanLyKhachHang danhSachKH) {
		System.out.println("Chọn cách tìm khách hàng:");
		System.out.println("1. Tìm theo Mã khách hàng");
		System.out.println("2. Tìm theo Tên khách hàng");
		System.out.print("Nhập lựa chọn: ");
		int luaChon = SC.nextInt();
		SC.nextLine();

		KhachHang khachHangGiamGia = null;

		switch (luaChon) {
		case 1:
			System.out.print("Nhập mã khách hàng giảm giá: ");
			int maKhachHangGiamGia = SC.nextInt();
			khachHangGiamGia = danhSachKH
					.layKhachHangTheoMa(maKhachHangGiamGia);
			break;
		case 2:
			System.out.print("Nhập tên khách hàng giảm giá: ");
			String tenKhachHangGiamGia = SC.nextLine();
			khachHangGiamGia = danhSachKH
					.layKhachHangTheoTen(tenKhachHangGiamGia);
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			return;
		}

		if (khachHangGiamGia != null) {
			// Tạo giảm giá trực tiếp mà không kiểm tra kiểu
			khachHangGiamGia.taoGiamGia();
		} else {
			System.out.println("Không tìm thấy khách hàng.");
		}
	}

	public void tinhToanTichDiem(QuanLyKhachHang danhSachKH) throws IOException {
		System.out.println("Chọn cách tìm khách hàng:");
		System.out.println("1. Tìm theo Mã khách hàng");
		System.out.println("2. Tìm theo Tên khách hàng");
		System.out.print("Nhập lựa chọn: ");
		int luaChon = SC.nextInt();
		SC.nextLine();

		KhachHang khachHangTichDiem = null;

		switch (luaChon) {
		case 1:
			System.out.print("Nhập mã khách hàng tích điểm: ");
			int maKhachHangTichDiem = SC.nextInt();
			khachHangTichDiem = danhSachKH
					.layKhachHangTheoMa(maKhachHangTichDiem);
			break;
		case 2:
			System.out.print("Nhập tên khách hàng tích điểm: ");
			String tenKhachHangTichDiem = SC.nextLine();
			khachHangTichDiem = danhSachKH
					.layKhachHangTheoTen(tenKhachHangTichDiem);
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			return;
		}
		if (khachHangTichDiem != null) {
			khachHangTichDiem.tichDiem();
		} else {
			System.out.println("Không tìm thấy khách hàng.");
		}
	}
	
	public void xuLyFeedBack(QuanLyKhachHang danhSachKH) throws IOException {
		System.out.println("Bạn muốn nhập feedback?");
		System.out.print("Nhập mã khách hàng: ");
		int maKhachHangfb = SC.nextInt();
		SC.nextLine();
		KhachHang khachHangfb = danhSachKH.layKhachHangTheoMa(maKhachHangfb);
		if (khachHangfb != null) {
			khachHangfb.feedBack();

		} else {
			System.out.println("Không tìm thấy khách hàng.");
		}
	}

}
