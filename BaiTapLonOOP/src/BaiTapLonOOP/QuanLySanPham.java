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
			System.out.println("TÃªn SP trong danh sÃ¡ch: [" + sanPham.getTenSP()
					+ "]");
			// Su dung phuong thuc trim() de loai bo khoang trang o dau va cuoi
			// ten san pham
			if (sanPham.getTenSP().trim().equalsIgnoreCase(tenSP.trim())) {
				iterator.remove();
				System.out.println("Ä�Ã£ xÃ³a sáº£n pháº©m cÃ³ tÃªn lÃ : " + tenSP);
				return;
			}
		}
		System.out.println("KhÃ´ng tÃ¬m tháº¥y sáº£n pháº©m cÃ³ tÃªn: " + tenSP);
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
			System.out.println("Ä�Ã£ ghi dá»¯ liá»‡u vÃ o táº­p tin thÃ nh cÃ´ng.");
		} catch (IOException e) {
			System.out.println("Lá»—i khi ghi táº­p tin: " + e.getMessage());
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

	//PhÆ°Æ¡ng thá»©c cáº­p nháº­t giÃ¡ sáº£n pháº©m
	public void capNhatGiaTien(int maSanPham, int giaMoi) {
		for (SanPham sp : ds) {
			if (sp.getMaSP() == maSanPham) {
				sp.setGiaTien(giaMoi);
				System.out.println("Ä�Ã£ cáº­p nháº­t giÃ¡ sáº£n pháº©m " + maSanPham
						+ " thÃ nh " + giaMoi);
				return;
			}
		}
		System.out.println("KhÃ´ng tÃ¬m tháº¥y sáº£n pháº©m cÃ³ mÃ£ " + maSanPham);
	}

	// PhÆ°Æ¡ng thá»©c Ä‘á»ƒ tÃ¬m kiáº¿m sáº£n pháº©m theo tÃªn
	public SanPham timKiemTheoTen(String tenSP) {
		for (SanPham sp : ds) {
			// Sá»­ dá»¥ng phÆ°Æ¡ng thá»©c trim() Ä‘á»ƒ loáº¡i bá»� khoáº£ng tráº¯ng á»Ÿ Ä‘áº§u vÃ  cuá»‘i
			// tÃªn sáº£n pháº©m
			if (sp.getTenSP().trim().equalsIgnoreCase(tenSP.trim())) {
				return sp; // Tráº£ vá»� sáº£n pháº©m náº¿u tÃ¬m tháº¥y
			}
		}

		return null; // Tráº£ vá»� null náº¿u khÃ´ng tÃ¬m tháº¥y sáº£n pháº©m
	}

	//PhÆ°Æ¡ng thá»©c tÃ­nh tá»•ng sá»‘ lÆ°á»£ng sáº£n pháº©m
	public int tinhTongSoLuong() {
		int tongSoLuong = 0;
		for (SanPham sp : ds) {
			tongSoLuong += sp.getSoLuong();
		}

		return tongSoLuong;
	}

	// PhÆ°Æ¡ng thá»©c hiá»ƒn thá»‹ danh sÃ¡ch Ä‘Ã£ mua
	public void hienThiDanhSachDaMua1() {
		System.out.println("Danh sÃ¡ch sáº£n pháº©m Ä‘Ã£ mua:");
		for (SanPham sp : danhSachDaMua) {
			System.out.println(sp);
		}
	}

	public void hienThiDanhSachDaMua() {
		if (danhSachDaMua.isEmpty()) {
			System.out.println("Danh sÃ¡ch sáº£n pháº©m Ä‘Ã£ mua trá»‘ng.");
		} else {
			System.out.println("Danh sÃ¡ch sáº£n pháº©m Ä‘Ã£ mua:");
			for (SanPham sp : danhSachDaMua) {
				System.out.println(sp);
			}
		}
	}

	// PhÆ°Æ¡ng thá»©c Ä‘á»ƒ nháº­p sá»‘ lÆ°á»£ng muá»‘n mua vÃ  tÃ­nh sá»‘ sáº£n pháº©m cÃ²n láº¡i
	public void muaSanPham() throws ParseException {
		Scanner scanner = new Scanner(System.in);

		// Hiá»ƒn thá»‹ danh sÃ¡ch sáº£n pháº©m
		// hienThiDanhSachSanPham();

		// Nháº­p mÃ£ sáº£n pháº©m
		System.out.print("Nháº­p mÃ£ sáº£n pháº©m muá»‘n mua: ");
		int maSanPham = scanner.nextInt();

		// TÃ¬m sáº£n pháº©m theo mÃ£
		SanPham sanPham = timKiem(maSanPham);

		if (sanPham != null) {
			// Hiá»ƒn thá»‹ thÃ´ng tin sáº£n pháº©m
			System.out.println("ThÃ´ng tin sáº£n pháº©m:");
			System.out.println(sanPham);

			// Nháº­p sá»‘ lÆ°á»£ng muá»‘n mua
			System.out.print("Nháº­p sá»‘ lÆ°á»£ng muá»‘n mua: ");
			int soLuongMua = scanner.nextInt();

			if (soLuongMua > 0 && soLuongMua <= sanPham.getSoLuong()) {
				// Giáº£m sá»‘ lÆ°á»£ng sáº£n pháº©m
				sanPham.giamSoLuong(soLuongMua);
				System.out.println("Ä�Ã£ mua " + soLuongMua + " sáº£n pháº©m "
						+ sanPham.getTenSP());

				// ThÃªm sáº£n pháº©m vÃ o danh sÃ¡ch Ä‘Ã£ mua
				String d;
				do {
					System.out.print("NgÃ y táº¡o hÃ³a Ä‘Æ¡n (dd/MM/yyyy): ");
					d = scanner.nextLine();
					if (d.isEmpty()) {
						System.out
								.println("Chuá»—i khÃ´ng Ä‘Æ°á»£c rá»—ng! HÃ£y nháº­p láº¡i!");
					}
				} while (d.isEmpty());

				System.out.println("-----------------------------------");
				System.out.println("Sau khi nháº­p hÃ³a Ä‘Æ¡n: ");
				try {
					Date date = F.parse(d);
					SanPham sanPhamDaMua = new SanPham(sanPham.getTenSP(),
							sanPham.getGiaTien(), soLuongMua, date);
					danhSachDaMua.add(sanPhamDaMua);
				} catch (ParseException e) {
					System.out.println("Lá»—i!!!");
					throw e; // NÃ©m láº¡i ngoáº¡i lá»‡ cho phÃ­a gá»�i
				}
			} else {
				System.out
						.println("Sá»‘ lÆ°á»£ng mua khÃ´ng há»£p lá»‡ hoáº·c khÃ´ng Ä‘á»§ hÃ ng.");
			}
		} else {
			System.out.println("KhÃ´ng tÃ¬m tháº¥y sáº£n pháº©m cÃ³ mÃ£ " + maSanPham);
		}
		hienThiDanhSachDaMua();
	}

	//PhÆ°Æ¡ng thá»©c sáº¯p xáº¿p sáº£n pháº©m theo giÃ¡ giáº£m dáº§n
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
