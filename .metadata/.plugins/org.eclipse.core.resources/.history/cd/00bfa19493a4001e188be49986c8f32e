package BaiTapLonOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class KhachHang extends Nguoi {
	private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private static final Scanner SC = new Scanner(System.in);
	private static int dem = 1;
	private int maKH = dem++;
	private boolean isThanhVien;
	private int diem;

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public boolean isThanhVien() {
		return isThanhVien;
	}

	public void setThanhVien(boolean thanhVien) {
		this.isThanhVien = thanhVien;
	}

	public KhachHang() {

	}

	public KhachHang(String hoTen, String ngaySinh, String soDT, boolean isThanhVien, int diem) throws ParseException {
		super(hoTen, ngaySinh, soDT);
		this.isThanhVien = isThanhVien;
		this.diem = diem;
	}

	@Override
	public void hienThi() {
		System.out.println("Mã khách hàng: " + this.maKH);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngay sinh: " + F.format(this.ngaySinh));
		System.out.println("Số điện thoại: " + this.soDT);
		if (this.isThanhVien()) {
			System.out.println("Là thành viên");
		} else {
			System.out.println("Không phải thành viên");
		}
		System.out.println("Số điểm: " + this.diem);
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
			System.out.println("Đã tích " + diemTichLuy
					+ " điểm cho khách hàng:");
			System.out.println("Số điểm hiện tại: " + diem);
			luuDiemVaoTepTin();
		} else {
			System.out.println("Không có điểm nào được tích.");
		}
	}

	public void luuDiemVaoTepTin() throws IOException {
		try (FileWriter writer = new FileWriter("src/BaiTapLonOOP/data/TichDiem.txt", true)) {
			writer.write(getMaKH() + " - " + getHoTen() + " - " + F.format(getNgaySinh()) + " - " + getSoDT() + " - " + isThanhVien() + " - " + diem + "\n");
		} catch (IOException e) {
			System.err.println("Lỗi khi ghi tệp tin: " + e.getMessage());
			throw e;
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
			writer.write(getMaKH() + " - " + getHoTen() + " - " + feedback + "\n");
			System.out.println("Đã lưu feedback vào tệp tin.");
		} catch (IOException e) {
			System.err.println("Lỗi khi ghi tệp tin: " + e.getMessage());
			throw e;
		}
	}

	public String toString() {
		return maKH + ";" + hoTen + ";" + ngaySinh + ";" + soDT + ";" + isThanhVien + ";" + diem;
	}

}
