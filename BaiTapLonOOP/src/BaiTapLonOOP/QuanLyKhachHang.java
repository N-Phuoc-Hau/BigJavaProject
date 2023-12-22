package BaiTapLonOOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachHang {
	private ArrayList<KhachHang> danhSachKH = new ArrayList<>();
	private static final Scanner SC = new Scanner(System.in);

	public QuanLyKhachHang() {
		this.danhSachKH = new ArrayList<>();
	}

	public void them(KhachHang kh) {
		danhSachKH.add(kh);
	}

	public void hienThi() {
		danhSachKH.forEach(danhSachKH -> danhSachKH.hienThi());
	}

	public void hienThiTheoMa() {
		System.out.println("Nhập mã khách hàng cần hiển thị: ");
		int maKH = SC.nextInt();
		for (int i = 1; i <= danhSachKH.size(); i++) {
			if (i == maKH)
				danhSachKH.get(i).hienThi();
		}
	}

	public void hienThiTheoTen() {
		System.out.println("Nhập Tên khách hàng cần hiển thị: ");
		String hoTen = SC.nextLine();
		for (int i = 1; i <= danhSachKH.size(); i++) {
			if (danhSachKH.get(i).getHoTen().equals(hoTen)) {
				danhSachKH.get(i).hienThi();
			}
		}
		System.out.println("Không tìm thấy khách hàng có tên: " + hoTen);
	}

	public void themKhachHang() throws ParseException{
	//	int maKhachHang = danhSachKH.size() + 1; // Tạo mã khách hàng tự động

		System.out.print("Nhập họ tên khách hàng: ");
		String hoTen = SC.nextLine();
		
		System.out.print("Nhập ngày sinh khách hàng: ");
		String ngaySinh = SC.nextLine();

		System.out.print("Nhập số điện thoại khách hàng: ");
		String soDienThoai = SC.nextLine();

		System.out.print("Là thành viên (true/false): ");
		boolean laThanhVien = SC.nextBoolean();

		KhachHang khachHang = new KhachHang(hoTen,ngaySinh, soDienThoai,laThanhVien);
		danhSachKH.add(khachHang);
		System.out.println("Thêm khách hàng thành công!");
		System.out.println("---------------");
	}

	public void xoaKHTheoMa() {
		System.out.print("Nhập mã khách hàng cần xóa: ");
		int maKhachHangXoa = SC.nextInt();
		boolean found = false;

		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == maKhachHangXoa) {
				danhSachKH.remove(khachHang);
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
		System.out.print("Nhập tên khách hàng cần xóa: ");
		int tenKhachHangXoa = SC.nextInt();
		boolean found = false;

		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == tenKhachHangXoa) {
				danhSachKH.remove(khachHang);
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

		boolean timThay = false;
		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == maKhachHang) {
				System.out.println("Thông tin khách hàng cần sửa:");
				khachHang.hienThi();

				System.out.println("Nhập thông tin mới:");
				SC.nextLine();
				System.out.print("Họ và tên: ");
				String hoTenMoi = SC.nextLine();
				System.out.print("Số điện thoại: ");
				String soDienThoaiMoi = SC.nextLine();
				System.out.print("Là thành viên (true/false): ");
				boolean isThanhVien = SC.nextBoolean();

				khachHang.setHoTen(hoTenMoi);
				khachHang.setSoDT(soDienThoaiMoi);
				khachHang.setThanhVien(isThanhVien);

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

	public void timKiemKH() {
		System.out.print("Nhập từ khóa tìm kiếm: ");
		String tuKhoa = SC.nextLine();

		List<KhachHang> ketQuaTimKiem = new ArrayList<>();
		for (KhachHang khachHang : danhSachKH) {
			if (String.valueOf(khachHang.getSoDT()).contains(tuKhoa)
					|| khachHang.getHoTen().contains(tuKhoa)
					|| String.valueOf(khachHang.getMaKH()).contains(tuKhoa)) {
				ketQuaTimKiem.add(khachHang);
			}
		}

		if (ketQuaTimKiem.isEmpty()) {
			System.out
					.println("Không tìm thấy khách hàng nào phù hợp với từ khóa \""
							+ tuKhoa + "\".");
		} else {
			System.out.println("Kết quả tìm kiếm:");
			for (KhachHang khachHang : ketQuaTimKiem) {
				khachHang.hienThi();
			}
		}
	}
	
	public void docTapTin(String duongDan) throws FileNotFoundException, ParseException {
	    File f = new File(duongDan);
	    try (Scanner SC = new Scanner(f)) {
	        while (SC.hasNext()) {
	            String hoTen = SC.nextLine();
	            String ngaySinh = SC.nextLine();
	            String soDT = SC.nextLine();
	            boolean isThanhVien = Boolean.parseBoolean(SC.nextLine());
	            if (SC.hasNext()) {
	                SC.nextLine();
	            }
	            KhachHang kh = new KhachHang(hoTen, ngaySinh, soDT, isThanhVien);
	            danhSachKH.add(kh);

	            System.out.println("Đã đọc: " + hoTen + " - " + ngaySinh + " - " + soDT + " - " + isThanhVien);
	        }
	    }
	}
	
	public void ghiTapTin(String duongDan) throws IOException {
        try (Scanner input = new Scanner(System.in);
             FileWriter writer = new FileWriter(duongDan, true)) {  //True để không ghi đè tập tin
            System.out.print("Nhập họ tên khách hàng: ");
            String hoTen = input.nextLine();
            System.out.print("Nhập ngày sinh khách hàng: ");
            String ngaySinh = input.nextLine();
            System.out.print("Nhập số điện thoại khách hàng: ");
            String soDienThoai = input.nextLine();
            System.out.print("Là thành viên (true/false): ");
            boolean laThanhVien = input.nextBoolean();
           
            writer.write(hoTen + "\n");
            writer.write(ngaySinh + "\n");
            writer.write(soDienThoai + "\n");
            writer.write(laThanhVien + "\n");

            System.out.println("Ghi tập tin thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi tập tin: " + e.getMessage());
            throw e;
        }
    }
	

	
	

}
