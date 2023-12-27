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
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyKhachHang {
	private ArrayList<KhachHang> danhSachKH = new ArrayList<>();
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

	//Hiển thị khách hàng theo mã
	public void hienThiTheoMa() {
		System.out.print("Nhập mã khách hàng cần hiển thị: ");
		int maKH = Integer.parseInt(SC.nextLine());
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

	//Hiển thị khách hàng theo tên
	public void hienThiTheoTen() {
		SC.nextLine();
		System.out.print("Nhập Tên khách hàng cần hiển thị: ");
		String hoTen = SC.nextLine().trim();
		boolean found = false;
		for (int i = 0; i < danhSachKH.size(); i++) {
			if (danhSachKH.get(i).getHoTen().equals(hoTen)) {
				danhSachKH.get(i).hienThi();
				return;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy khách hàng có tên: " + hoTen);
		}
	}

	//Thêm thông tin khách hàng
	public void themKhachHang() throws ParseException {
	    System.out.print("Nhập họ tên khách hàng: ");
	    String hoTen = SC.nextLine();
	    System.out.print("Nhập ngày sinh khách hàng: ");
	    String ngaySinh = SC.nextLine();
	    System.out.print("Nhập số điện thoại khách hàng: ");
	    String soDienThoai = SC.nextLine();
	    System.out.print("Là thành viên (true/false): ");
	    boolean laThanhVien = SC.nextBoolean();

	    int diemTichLuy = 0;  

	    if (laThanhVien) {
	        System.out.print("Nhập điểm tích lũy: ");
	        diemTichLuy = Integer.parseInt(SC.nextLine());
	    }

	    KhachHang khachHang = new KhachHang(hoTen, ngaySinh, soDienThoai, laThanhVien, diemTichLuy);
	    danhSachKH.add(khachHang);
	    System.out.println("Thêm khách hàng thành công!");
	    System.out.println("---------------");
	}

	//Xóa khách hàng
	public void xoaKhachHang(){
		System.out.println("Chọn cách Xóa khách hàng:");
	    System.out.println("1. Xóa theo Mã khách hàng");
	    System.out.println("2. Xóa theo Tên khách hàng");
	    System.out.print("Nhập lựa chọn: ");
	    int luaChonTimKiem = Integer.parseInt(SC.nextLine());
	    SC.nextLine(); 
	    if (luaChonTimKiem != 1 && luaChonTimKiem != 2) {
	        System.out.println("Lựa chọn không hợp lệ.");
	        return;
	    }
	    System.out.print("Nhập thông tin cần tìm kiếm: ");
	    String thongTinTimKiem = SC.nextLine();
	    Iterator<KhachHang> iterator = danhSachKH.iterator();
	    boolean timThay = false;
	    while (iterator.hasNext()) {
			KhachHang khachHang = iterator.next();
			if ((luaChonTimKiem == 1 && khachHang.getMaKH() == Integer.parseInt(thongTinTimKiem))
	                || (luaChonTimKiem == 2 && khachHang.getHoTen().equalsIgnoreCase(thongTinTimKiem))) {
				iterator.remove();
				System.out.println("Thông tin khách hàng đã xóa:");
				khachHang.hienThi();
				System.out.println("Xóa khách hàng thành công!");
				timThay = true;
				break;
			}
		}
	    if (!timThay) {
			System.out.println("Không tìm thấy khách hàng.");
		}
	    
	}
	//Sửa thông tin khách hàng
	public void suaThongTinKH() throws IOException {
	    System.out.println("Chọn cách Sửa khách hàng:");
	    System.out.println("1. Sửa theo Mã khách hàng");
	    System.out.println("2. Sửa theo Tên khách hàng");
	    System.out.print("Nhập lựa chọn: ");
	    int luaChonTimKiem = Integer.parseInt(SC.nextLine());
	    SC.nextLine(); 
	    if (luaChonTimKiem != 1 && luaChonTimKiem != 2) {
	        System.out.println("Lựa chọn không hợp lệ.");
	        return;
	    }
	    System.out.print("Nhập thông tin cần tìm kiếm: ");
	    String thongTinTimKiem = SC.nextLine();

	    boolean timThay = false;
	    for (KhachHang khachHang : danhSachKH) {
	        if ((luaChonTimKiem == 1 && khachHang.getMaKH() == Integer.parseInt(thongTinTimKiem))
	                || (luaChonTimKiem == 2 && khachHang.getHoTen().equalsIgnoreCase(thongTinTimKiem))) {
	            System.out.println("Thông tin khách hàng cần sửa:");
	            khachHang.hienThi();
	            System.out.println("Nhập thông tin mới:");
	            System.out.print("Họ và tên: ");
	            String hoTenMoi = SC.nextLine();
	            System.out.print("Số điện thoại: ");
	            String soDienThoaiMoi = SC.nextLine();
	            System.out.print("Là thành viên (true/false): ");
	            boolean isThanhVienMoi = SC.nextBoolean();
	            
	            if (isThanhVienMoi) {
	                System.out.print("Nhập số điểm tích lũy mới: ");
	                int diemTichLuyMoi = Integer.parseInt(SC.nextLine());
	                khachHang.setDiem(diemTichLuyMoi);
	            } else {
	                khachHang.setDiem(0);
	            }

	            khachHang.setHoTen(hoTenMoi);
	            khachHang.setSoDT(soDienThoaiMoi);
	            khachHang.setThanhVien(isThanhVienMoi);
	            System.out.println("Thông tin khách hàng sau khi sửa:");
	            khachHang.hienThi();
	            khachHang.luuDiemVaoTepTin();

	            timThay = true;
	            break;
	        }
	    }
	    if (!timThay) {
	        System.out.println("Không tìm thấy khách hàng.");
	    }
	}
	
	//Tìm kiếm khách hàng
	public void timKiemKH(){
		System.out.println("Chọn cách Tìm khách hàng:");
	    System.out.println("1. Tìm theo Mã khách hàng");
	    System.out.println("2. Tìm theo Tên khách hàng");
	    System.out.print("Nhập lựa chọn: ");
	    int luaChonTimKiem = Integer.parseInt(SC.nextLine());
	    SC.nextLine(); 
	    if (luaChonTimKiem != 1 && luaChonTimKiem != 2) {
	        System.out.println("Lựa chọn không hợp lệ.");
	        return;
	    }
	    System.out.print("Nhập thông tin cần tìm kiếm: ");
	    String thongTinTimKiem = SC.nextLine();

	    boolean timThay = false;
	    for (KhachHang khachHang : danhSachKH) {
	        if ((luaChonTimKiem == 1 && khachHang.getMaKH() == Integer.parseInt(thongTinTimKiem))
	                || (luaChonTimKiem == 2 && khachHang.getHoTen().equalsIgnoreCase(thongTinTimKiem))) {
	        	System.out.println("Khách hàng đã tìm thấy:");
				khachHang.hienThi();
				timThay = true;
				break;
	        }
	    }
	    if (!timThay) {
			System.out.println("Không tìm thấy khách hàng.");
		}
	}

	//Sắp xếp khách hàng theo tên
	public void sapXepTheoTen() {
		Collections.sort(danhSachKH, Comparator.comparing(kh -> {
			String ten = kh.getHoTen();
			return ten.charAt(ten.lastIndexOf(' ') + 1);
		}));

		System.out.println("Đã sắp xếp danh sách theo tên khách hàng.");
	}

	//Sắp xếp khách hàng theo mã 
	public void sapXepTheoMaKH() {
		Collections.sort(danhSachKH,
				Comparator.comparingInt(KhachHang::getMaKH));
		System.out.println("Đã sắp xếp danh sách theo mã khách hàng.");
	}

	//Sắp xếp khách hàng theo ngày sinh
	public void sapXepTheoNgaySinh() {
		Collections.sort(danhSachKH,
				Comparator.comparing(KhachHang::getNgaySinh));
		System.out.println("Đã sắp xếp danh sách theo ngày sinh.");
	}

	//Lấy mã khách hàng
	public KhachHang layKhachHangTheoMa(int maKhachHangCanTim) {
		for (KhachHang kh : danhSachKH) {
			if (kh.getMaKH() == maKhachHangCanTim) {
				return kh;
			}
		}
		System.out.println("Không tìm thấy khách hàng với mã: " + maKhachHangCanTim);
		return null;
	}

	//Lấy tên khách hàng
	public KhachHang layKhachHangTheoTen(String tenKhachHang) {
		for (KhachHang kh : danhSachKH) {
			if (kh.getHoTen().trim().equalsIgnoreCase(tenKhachHang.trim())) {
				return kh;
			}
		}
		System.out.println("Không tìm thấy khách hàng với tên: " + tenKhachHang);
		return null;
	}

	
	public void docTapTinKH(String duongDanKH) throws FileNotFoundException, ParseException {
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
				FileWriter writer = new FileWriter(duongDan, true)) { 
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



}
