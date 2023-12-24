package BaiTapLonOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class ChamSocKhachHang extends KhachHang {
	private static final Scanner SC = new Scanner(System.in);
	private int diem;

	public ChamSocKhachHang(String hoTen, String ngaySinh, String soDT,
			boolean isThanhVien, int diem) throws ParseException {
		super(hoTen, ngaySinh, soDT, isThanhVien);
		this.diem = diem;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Số điểm hiện tại: " + this.diem);
		System.out.println("--------------------------");
	}

	// Tạo giảm giá
	public void taoGiamGia() {
		System.out.print("Nhập tổng giá trị hóa đơn: ");
		double tongGiaTriHoaDon = SC.nextDouble();

		if (tongGiaTriHoaDon >= 300000) {
			double giamGia = tongGiaTriHoaDon * 0.1;
			tongGiaTriHoaDon -= giamGia;
			System.out.println("Sau khi giảm giá 10%: " + tongGiaTriHoaDon);
		} else {
			System.out.println("Không có giảm giá cho hóa đơn này.");
		}
	}

	// Gửi Feedback
	public void feedBack() throws IOException {
		System.out.print("Nhập feedback của bạn: ");
		String feedback = SC.nextLine();

		System.out.println("Feedback của bạn: " + feedback);
		System.out.println("Cảm ơn bạn đã luôn yêu quý chúng tôi, luôn ủng hộ và góp ý.");

		luuFeedbackVaoTepTin(feedback);
	}

	private void luuFeedbackVaoTepTin(String feedback) throws IOException {
		try (FileWriter writer = new FileWriter("src/BaiTapLonOOP/data/FeedBack.txt", true)) {
			writer.write(getMaKH() + ";" + getHoTen() + ";" + feedback + "\n");
			System.out.println("Đã lưu feedback vào tệp tin.");
		} catch (IOException e) {
			System.err.println("Lỗi khi ghi tệp tin: " + e.getMessage());
			throw e;
		}
	}

	// Tích Điểm
	public void tichDiem() throws IOException {
		System.out.print("Nhập tổng giá trị hóa đơn: ");
		double tongGiaTriHoaDon = SC.nextDouble();

		int diemTichLuy = (int) (tongGiaTriHoaDon / 50000);
		diem += diemTichLuy;

		while (diem >= 15) {
			int soSanPhamMienPhi = diem / 15;
			diem %= 15;
			System.out.println("Bạn được thưởng " + soSanPhamMienPhi + " sản phẩm miễn phí dưới 100,000 đồng.");
		}

		if (diemTichLuy > 0) {
			System.out.println("Đã tích " + diemTichLuy + " điểm cho khách hàng:");
			hienThi();
			System.out.println("Số điểm hiện tại: " + diem);
			luuDiemVaoTepTin();
		} else {
			System.out.println("Không có điểm nào được tích.");
		}
	}

	private void luuDiemVaoTepTin() throws IOException {
		try (FileWriter writer = new FileWriter("src/BaiTapLonOOP/data/TichDiem.txt", true)) {
			writer.write(getMaKH() + ";" + getHoTen() + ";" + getNgaySinh()+ ";" + getSoDT() + ";" + isThanhVien() + ";" + diem + "\n");
			System.out.println("Đã lưu điểm vào tệp tin.");
		} catch (IOException e) {
			System.err.println("Lỗi khi ghi tệp tin: " + e.getMessage());
			throw e;
		}
	}

	// // Cập nhật phương thức datHang()
	// public void datHang() {
	// Scanner input = new Scanner(System.in);
	//
	// System.out.print("Nhập tên sản phẩm: ");
	// String tenSanPham = input.nextLine();
	//
	// System.out.print("Nhập số lượng sản phẩm: ");
	// int soLuong = input.nextInt();
	//
	// System.out.print("Nhập giá sản phẩm: ");
	// double giaSanPham = input.nextDouble();
	//
	// // Tính tổng giá trị đơn hàng
	// double tongGiaTriDonHang = soLuong * giaSanPham;
	//
	// // Thêm vào đơn hàng
	// DonHang.put(tenSanPham, soLuong);
	//
	// System.out.println("Đã thêm sản phẩm vào đơn hàng!");
	//
	// // Xử lý tích điểm và các chức năng khác liên quan
	// tichDiemVaLuuVaoTepTin();
	// }

}
