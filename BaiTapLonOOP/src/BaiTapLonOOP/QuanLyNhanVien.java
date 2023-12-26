package BaiTapLonOOP;

import java.io.BufferedReader;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien {

	private SimpleDateFormat H = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private Scanner sc = new Scanner(System.in);
	private List<NhanVien> ds = new ArrayList<>();

	public QuanLyNhanVien() {
		this.ds = new ArrayList<>();
	}

	public void them(NhanVien nv) {
		ds.add(nv);
	}

	public void hienThi() {
		ds.forEach(ds -> ds.hienThi());
	}

	/*
	 * System.out.println("1. TRA CUU THEO TEN");
	 * System.out.println("2. TRA CUU THEO MA NHAN VIEN");
	 * System.out.println("3. TRA CUU GIOI TINH");
	 * System.out.println("4. SUA DOI CO BAN");
	 * System.out.println("5. SUA DOI NANG CAO");
	 * System.out.println("6. THEM NHAN VIEN");
	 * System.out.println("7. XOA NHAN VIEN");
	 */
	public void hienThiTheoMa() {
		System.out.print("Nhập mã Nhân Viên cần tìm: ");
		int manv = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= ds.size() + 1; i++) {
			if (i == manv) {
				ds.get(i - 1).hienThi();
				break;
			} else if (i == ds.size() + 1) {
				System.out.println("Không có mã nhân viên cần tìm");
				break;
			}

		}
		System.out.println("Đã thực hiện yêu cầu!!");

	}

	public void hienThiTheoTen() {
		System.out.print("Nhập Tên Nhân Viên cần tìm: ");
		String tenNV = sc.nextLine();
		for (int i = 1; i <= ds.size(); i++) {
			if (ds.get(i - 1).getTenNV().equals(tenNV)) {
				ds.get(i - 1).hienThi();
				break;
			} else if (i == ds.size()) {
				System.out.println("Khong tim thay nhan vien co ten: " + tenNV);
				break;
			}
		}
		System.out.println("Đã thực hiện yêu cầu!!");
	}

	public NhanVien timKiem(int id) {
		return ds.stream().filter(sp -> sp.getMaNV() == id).findFirst().get();
	}

	public void hienThiTheoGT() {
		System.out.print("Nhập Giới tính Nhân Viên cần tìm: ");
		String gt = sc.nextLine();
		List<NhanVien> nv = timKiemGT(gt);
		for (int i = 1; i <= nv.size(); i++) {
			nv.get(i - 1).hienThi();
		}
		if (nv.size() == 0)
			System.out.println("Khong tim thay nhan vien co gioi tinh: " + gt);
	}

	public List<NhanVien> timKiemQQ(String kw) {
		return ds.stream().filter(nv -> nv.getGioiTinh().contains(kw))
				.collect(Collectors.toList());
	}

	public void hienThiTheoQQ() {
		System.out.print("Nhập Quê Quán Nhân Viên cần tìm: ");
		String qq = sc.nextLine();
		List<NhanVien> nv = timKiemQQ(qq);
		for (int i = 1; i <= nv.size(); i++) {
			nv.get(i - 1).hienThi();
		}
		if (nv.size() == 0)
			System.out.println("Khong tim thay nhan vien co que quan: " + qq);
	}

	public void ghiFileBH(String d, String h) throws IOException,
			ParseException {

		System.out.print("Nhap Ma Nhan Vien ban hang: ");
		String i = sc.nextLine();
		int id = Integer.parseInt(i);
		d = d + ' ' + h;
		Date date = H.parse(d);

		NhanVien nv = timKiem(id);
		String duongDan = "src/BaiTapLonOOP/data/DSBanHang.txt";
		try (FileWriter writer = new FileWriter(duongDan, true)) {
			// Ghi thông tin sản phẩm vào tập tin sử dụng toString
			writer.write(i + ';' + nv.getTenNV() + ';' + H.format(date)
					+ System.lineSeparator());
		} catch (IOException e) {
			System.out.println("Lỗi khi ghi tập tin: " + e.getMessage());
			throw e; // Re-throw để cho phép lớp gọi xử lý lỗi nếu cần
		}
	}

	public List<NhanVien> timKiemGT(String kw) {
		return ds.stream().filter(nv -> nv.getGioiTinh().contains(kw))
				.collect(Collectors.toList());
	}

	public void sapXepTheoTen() {
		Collections.sort(ds, Comparator.comparing(nv -> {
			String ten = nv.getTenNV();
			return ten.charAt(ten.lastIndexOf(' ') + 1);
		}));

		System.out
				.println("Đã sắp xếp danh sách theo chữ cái cuối cùng trong tên.");

		for (NhanVien NhanVien : ds) {
			NhanVien.hienThi();
		}
	}

	public void them() throws ParseException {
		System.out.println("Tuyen them nhan vien PT: ---------");
		System.out.print("Nhap ten:");
		String name = sc.nextLine();
		System.out.print("Nhap gioi tinh:");
		String sex = sc.nextLine();
		System.out.print("Nhap dia chi:");
		String adr = sc.nextLine();
		System.out.print("Nhap ngay sinh:");
		String bird = sc.nextLine();
		boolean kind = false;
		int sal = 25000;
		int time = 0;

		NhanVienPT nv = new NhanVienPT(name, sex, adr, bird, kind, sal, time);
		ds.add(nv);

	}

	public void xoaNVTheoMa() {
		System.out.print("Nhập mã Nhân Viên cần xóa: ");
		int manv = sc.nextInt();

		for (int i = 1; i <= ds.size(); i++) {
			if (i == manv) {
				ds.remove(i - 1);
				break;
			} else if (i == ds.size()) {
				System.out.println("Khong tim thay nhan vien");
				break;
			}
		}
	}

	public void xoaNVTheoTen() {
		System.out.print("Nhập tên Nhân Viên cần xóa: ");
		String tenNV = sc.nextLine();
		for (int i = 1; i <= ds.size(); i++) {
			if (ds.get(i).getTenNV().equals(tenNV)) {
				ds.remove(i - 1);
				System.out.println("Da xoa nhân viên co ten la: " + tenNV);
				return;
			}
		}
		System.out.println("Khong tim thay nhan vien co ten: " + tenNV);
	}

	public void suaTTCB() throws ParseException {
		System.out.println("Sua thong tin nhan Vien: ---------\n");
		System.out.print("Nhap ma Nhan Vien: ");
		int manv = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= ds.size(); i++) {
			if (i == manv) {
				--i;
				System.out.print("Nhap ten:");
				String name = sc.nextLine();
				System.out.print("Nhap gioi tinh:");
				String sex = sc.nextLine();
				System.out.print("Nhap dia chi:");
				String adr = sc.nextLine();
				System.out.print("Nhap ngay sinh:");
				String bird = sc.nextLine();
				Date ngay = F.parse(bird);
				ds.get(i).setTenNV(name);
				ds.get(i).setGioiTinh(sex);
				ds.get(i).setDiaChi(adr);
				ds.get(i).setNgaySinh(ngay);
				break;
			} else if (i == ds.size())
				System.out.println("Không tìm thấy mã nhân viên!!");
		}
	}

	public void sualuong() throws ParseException {
		System.out.println("Sua thong tin nhan Vien: ---------");
		System.out.print("Mã Nhân viên: ");
		int manv = sc.nextInt();
		for (NhanVien nv : ds) {
			if (nv instanceof NhanVienFT && nv.getMaNV() == manv) {
				nv.hienThi();
				System.out.print("Nhap luong theo thang moi:");
				int nNP = sc.nextInt();

				NhanVienFT nvft = (NhanVienFT) nv;
				nvft.setNghiPhep(nNP);
				return;
			} else if (nv instanceof NhanVienPT && nv.getMaNV() == manv) {

				nv.hienThi();
				System.out.print("Nhap luong theo gio moi:");
				int sgl = sc.nextInt();
				NhanVienPT nvpt = (NhanVienPT) nv;
				nvpt.setSoGioLamViec(sgl);
				return;
			} else if (nv.getMaNV() == ds.size())
				System.out.println("Khong tim thay ma nhan vien");
		}
	}

	public void suaTTlamviec() throws ParseException {
		System.out.print("Mã Nhân viên: ");
		int manv = sc.nextInt();
		for (NhanVien nv : ds) {
			if (nv instanceof NhanVienFT && nv.getMaNV() == manv) {

				nv.hienThi();
				System.out.print("Nhap ngay nghi phep:");
				int nNP = sc.nextInt();

				NhanVienFT nvft = (NhanVienFT) nv;
				nvft.setNghiPhep(nNP);
				return;
			} else if (nv instanceof NhanVienPT && nv.getMaNV() == manv) {
				nv.hienThi();
				System.out.print("Nhap so gio lam:");
				int sgl = sc.nextInt();
				NhanVienPT nvpt = (NhanVienPT) nv;
				nvpt.setSoGioLamViec(sgl);
				return;
			} else if (nv.getMaNV() == ds.size())
				System.out.println("Khong tim thay ma nhan vien");
		}
	}

	public void thangHaChuc(String d) throws ParseException {
		System.out.println("Sua thong tin nhan Vien: ---------");
		System.out.print("Mã Nhân viên: ");
		int manv = sc.nextInt();
		for (NhanVien nv : ds) {
			// Ghi thông tin sản phẩm vào tập tin sử dụng toString
			if (nv instanceof NhanVienFT && nv.getMaNV() == manv) {
				nv.hienThi();
				sc.nextLine();
				System.out.print("Nhập Lương Nhân viên theo gio: ");
				int luong = Integer.parseInt(sc.nextLine());
				NhanVienPT nvpt = nv.formFT(nv, luong);
				ds.add(nvpt);
				ds.remove(nv);
				break;
			} else if (nv instanceof NhanVienPT && nv.getMaNV() == manv) {
				nv.hienThi();
				System.out.print("Nhập Lương Nhân viên thang: ");
				sc.nextLine();
				Date date = F.parse(d);
				long luong = Integer.parseInt(sc.nextLine());
				NhanVienFT nvft = nv.formPT(nv, luong, date);
				ds.add(nvft);
				ds.remove(nv);
				break;
			} else if (nv.getMaNV() == ds.size())
				System.out.println("Khong tim thay ma nhan vien");
		}
	}

	public void ghiTapTin() throws IOException {
		String duongDan = "src/BaiTapLonOOP/data/NhanVienPT.txt";
		try (FileWriter writer = new FileWriter(duongDan)) {
			for (NhanVien nv : ds) {
				// Ghi thông tin sản phẩm vào tập tin sử dụng toString
				if (nv instanceof NhanVienPT) {
					writer.write(nv.toString() + System.lineSeparator());
				}
			}
		} catch (IOException e) {
			System.out.println("Lỗi khi ghi tập tin: " + e.getMessage());
			throw e; // Re-throw để cho phép lớp gọi xử lý lỗi nếu cần
		}
		String duongDan1 = "src/BaiTapLonOOP/data/NhanVienFT.txt";
		try (FileWriter writer = new FileWriter(duongDan1)) {
			for (NhanVien nv : ds) {
				// Ghi thông tin sản phẩm vào tập tin sử dụng toString
				if (nv instanceof NhanVienFT) {
					writer.write(nv.toString() + System.lineSeparator());
				}
			}
		} catch (IOException e) {
			System.out.println("Lỗi khi ghi tập tin: " + e.getMessage());
			throw e; // Re-throw để cho phép lớp gọi xử lý lỗi nếu cần
		}

		System.out.println("Đã ghi dữ liệu vào tập tin thành công.");
	}

	public void docTapTinPT() throws ParseException, IOException {
		// Tạo đối tượng File để đại diện cho tập tin
		File file = new File("src/BaiTapLonOOP/data/NhanVienPT.txt");

		// Mở tập tin
		FileReader fileReader = new FileReader(file);

		// Đọc từng dòng dữ liệu của tập tin
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			// Xử lý dữ liệu của dòng
			String[] data = line.split(";");

			// Tạo đối tượng NhanVien
			NhanVienPT nv = new NhanVienPT(data[0], data[1], data[2], data[3],
					Boolean.parseBoolean(data[4]), Integer.parseInt(data[5]),
					Integer.parseInt(data[6]));

			// Thêm đối tượng NhanVien vào ArrayList
			ds.add(nv);
		}

		// Đóng tập tin
		bufferedReader.close();
	}

	public void docTapTinFT() throws ParseException, IOException {
		// Tạo đối tượng File để đại diện cho tập tin
		File file = new File("src/BaiTapLonOOP/data/NhanVienFT.txt");

		// Mở tập tin
		FileReader fileReader = new FileReader(file);

		// Đọc từng dòng dữ liệu của tập tin
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			// Xử lý dữ liệu của dòng
			String[] data = line.split(";");

			// Tạo đối tượng NhanVien
			NhanVienFT nv = new NhanVienFT(data[0], data[1], data[2], data[3],
					Boolean.parseBoolean(data[4]), Integer.parseInt(data[5]),
					Integer.parseInt(data[6]), data[7]);

			// Thêm đối tượng NhanVien vào ArrayList
			ds.add(nv);
		}

		// Đóng tập tin
		bufferedReader.close();
	}

	// public void setLthang(int index, long l) {
	// if (ds.get(index) instanceof NhanVienFT) {
	// NhanVienFT nv = (NhanVienFT) ds.get(index);
	// nv.setlThang(l);
	// }
	// }

}
