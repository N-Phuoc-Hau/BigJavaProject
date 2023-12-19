package BaiTapLonOOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLySanPham {
	private ArrayList<SanPham> ds = new ArrayList<>();
	private static final Scanner SC = new Scanner(System.in);
	private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private List<SanPham> danhSachDaMua; // Danh sach san pham da mua

	//Phuong thuc khoi tao
	public QuanLySanPham() {
		this.ds = new ArrayList<>();
		danhSachDaMua = new ArrayList<>();
	}

	//Phuong thuc them san pham
	public void themSP(SanPham sp) {
		ds.add(sp);
	}
 
	//Xoa san pham theo ten va theo ma san pham
	public void xoaSPTheoTen(String tenSP) {
		Iterator<SanPham> iterator = ds.iterator();
		while (iterator.hasNext()) {
			SanPham sanPham = iterator.next();
			// In gia tri debug
			System.out.println("Ten SP trong danh sach: [" + sanPham.getTenSP()
					+ "]");
			// Su dung phuong thuc trim() de loai bo khoang trang o dau va cuoi
			// ten san pham
			if (sanPham.getTenSP().trim().equalsIgnoreCase(tenSP.trim())) {
				iterator.remove();
				System.out.println("Da xoa san pham co ten la : " + tenSP);
				return;
			}
		}
		System.out.println("Khong tim thay san pham co ten: " + tenSP);
	}

	public void xoaSPTheoMa(int maSP) {
		Iterator<SanPham> iterator = ds.iterator();
		while (iterator.hasNext()) {
			SanPham sp = iterator.next();
			if (sp.getMaSP() == maSP) {
				iterator.remove();
				System.out.println("Da xoa hoa don co ma: " + maSP);
				return; // Co the dung vong lap
			}
		}
		System.out.println("Khong tim thay hoa don co ma: " + maSP);
	}

	//Phuong thuc hien thi danh sach san pham
	public void hienThi() {
		ds.forEach(hd -> hd.hienThi());
	}

	//Phuong thuc them san pham moi
	public void nhapSanPham() throws ParseException {
		System.out.print("Nhap ten san pham: ");
		String m = SC.nextLine();
		System.out.print("Nhap gia san pham: ");
		int n = SC.nextInt();
		System.out.print("Nhap so luong san pham: ");
		int l = SC.nextInt();
		String d;
		do {
			d = SC.nextLine();
			if (d.isEmpty()) {
				System.out.println("Chuoi khong duoc rong! Hay nhap lai!");
			}
			System.out.print("Ngay tao hoa don (dd/MM/yyyy): ");
			d = SC.nextLine();
		} while (d.isEmpty());
		System.out.println("-----------------------------------");

		try {
			Date date = F.parse(d);
			SanPham sp = new SanPham(m, n, l, date);
			themSP(sp);
		} catch (ParseException e) {
			System.out.println("Loi!!!");
			throw e; // Nem ngoai le cho phia goi
		}
	}

	
	//Phuong thuc doc tap tin
	public void docTapTin(String duongDan) throws FileNotFoundException,
			ParseException {
		File f = new File(duongDan);
		try (Scanner sc = new Scanner(f)) {
			while (sc.hasNext()) {
				String tenSP = sc.nextLine();
				String n = sc.nextLine();
				int giaTien = Integer.parseInt(n);
				String m = sc.nextLine();
				int soLuong = Integer.parseInt(m);
				String ngayTao = sc.nextLine();

				SanPham sp = new SanPham(tenSP, giaTien, soLuong, ngayTao);

				ds.add(sp);
			}
			sc.close();
		}
	}

	//Phuong thuc ghi tap tin
	public void ghiTapTin(String duongDan) throws IOException {
		try (FileWriter writer = new FileWriter(duongDan)) {
			for (SanPham sp : ds) {
				// Ghi thong tin san pham vao tap tin 
				writer.write(sp.toString() + System.lineSeparator());
			}
			System.out.println("Da ghi thong tin vao tap tin thanh cong!!!");
		} catch (IOException e) {
			System.out.println("Loi ghi tap tin: " + e.getMessage());
			throw e; // Goi xu li loi neu can
		}
	}

	//Phuong thuc tim kiem theo ma san pham
	public SanPham timKiem(int maSP) {
		for (SanPham h : ds) {
			if (h.getMaSP() == maSP)
				return h;
		}
		System.out.println("Khong tim thay hoa don co ma hoa don: " + maSP);
		return null;
	}

	//Phuong thuc cap nhat gia tien
	public void capNhatGiaTien(int maSanPham, int giaMoi) {
		for (SanPham sp : ds) {
			if (sp.getMaSP() == maSanPham) {
				sp.setGiaTien(giaMoi);
				System.out.println("Da cap nhat gia san pham " + maSanPham
						+ " thanh " + giaMoi);
				return;
			}
		}
		System.out.println("Khong tim thay san pham co ma " + maSanPham);
	}

	// Phuong thuc tim kiem theo ten san pham
	public SanPham timKiemTheoTen(String tenSP) {
		for (SanPham sp : ds) {
			// Su dung phuong thuc trim() de loai bo khoang trang o ten san pham
			if (sp.getTenSP().trim().equalsIgnoreCase(tenSP.trim())) {
				return sp; //Tra ve san pham neu tim thay
			}
		}

		return null; //Tra ve neu khong tim thay san pham
	}

	//Phuong thuc tinh tong so luong san pham
	public int tinhTongSoLuong() {
		int tongSoLuong = 0;
		for (SanPham sp : ds) {
			tongSoLuong += sp.getSoLuong();
		}

		return tongSoLuong;
	}

	// Phuong thuc hien thi danh sach san pham da mua
	public void hienThiDanhSachDaMua1() {
		System.out.println("Danh sach san pham da mua:");
		for (SanPham sp : danhSachDaMua) {
			System.out.println(sp);
		}
	}

	public void hienThiDanhSachDaMua() {
		if (danhSachDaMua.isEmpty()) {
			System.out.println("Danh sach san pham da mua trong.");
		} else {
			System.out.println("Danh sach san pham da mua:");
			for (SanPham sp : danhSachDaMua) {
				System.out.println(sp);
			}
		}
	}

	// Phuong thuc de nhap so luong muon mua va tinh so luong san pham con lai
	public void muaSanPham() throws ParseException {
		Scanner scanner = new Scanner(System.in);

		// Hien thi danh sach san pham
		// hienThiDanhSachSanPham();

		// Nhap ma san pham 
		System.out.print("Nhap ma san pham muon mua: ");
		int maSanPham = scanner.nextInt();

		// Tim kiem san pham theo ma san pham
		SanPham sanPham = timKiem(maSanPham);

		if (sanPham != null) {
			// Hien thi thong tin san pham
			System.out.println("Thong tin san pham:");
			System.out.println(sanPham);

			// Nhap so luong san pham mua
			System.out.print("Nhap so luong mua: ");
			int soLuongMua = scanner.nextInt();

			if (soLuongMua > 0 && soLuongMua <= sanPham.getSoLuong()) {
				// Gia so luong san pham xuong
				sanPham.giamSoLuong(soLuongMua);
				System.out.println("Da mua " + soLuongMua + " san pham "
						+ sanPham.getTenSP());

				// Them san pham vao danh sach san pham da mua
				String d;
				do {
					System.out.print("Ngay tao hoa don (dd/MM/yyyy): ");
					d = scanner.nextLine();
					if (d.isEmpty()) {
						System.out
								.println("Chuoi khong duoc rong! Hay nhap lai");
					}
				} while (d.isEmpty());

				System.out.println("-----------------------------------");
				System.out.println("Sau khi nhap hoa don: ");
				try {
					Date date = F.parse(d);
					SanPham sanPhamDaMua = new SanPham(sanPham.getTenSP(),
							sanPham.getGiaTien(), soLuongMua, date);
					danhSachDaMua.add(sanPhamDaMua);
				} catch (ParseException e) {
					System.out.println("Loi!!!");
					throw e; // Nem ngoai le cho phia goi
				}
			} else {
				System.out
						.println("So luong san pham khong hop le hoac khong du hang!! Xin hay bo sung.");
			}
		} else {
			System.out.println("Khong tim thay san pham co ma " + maSanPham);
		}
		hienThiDanhSachDaMua();
	}

	//Phuong thuc sap xep san pham theo gia giam dan
	public void sapXepGiamTheoGia() {
		this.ds.sort((sp1, sp2) -> {
			int k = sp1.getGiaTien() - sp2.getGiaTien();

			if (k > 0)
				return -1;
			else if (k < 0)
				return 1;
			return 0;
		});
	}
	public ArrayList<SanPham> getDs() {
		return ds;
	}

	public void setDs(ArrayList<SanPham> ds) {
		this.ds = ds;
	}
}
