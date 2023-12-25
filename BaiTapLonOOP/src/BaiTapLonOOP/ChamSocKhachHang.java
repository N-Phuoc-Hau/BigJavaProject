package BaiTapLonOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class ChamSocKhachHang extends KhachHang {
	private static final Scanner SC = new Scanner(System.in);
	private int diem;

	public ChamSocKhachHang(){
		
	}

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
	            khachHangGiamGia = danhSachKH.layKhachHangTheoMa(maKhachHangGiamGia);
	            break;
	        case 2:
	            System.out.print("Nhập tên khách hàng giảm giá: ");
	            String tenKhachHangGiamGia = SC.nextLine();
	            khachHangGiamGia = danhSachKH.layKhachHangTheoTen(tenKhachHangGiamGia);
	            break;
	        default:
	            System.out.println("Lựa chọn không hợp lệ.");
	            return;
	    }

	    if (khachHangGiamGia != null) {
	        if (khachHangGiamGia instanceof ChamSocKhachHang) {
	            ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangGiamGia;
	            chamSocKhachHang.taoGiamGia();
	        } else {
	            System.out.println("Khách hàng không hỗ trợ giảm giá do chưa là thành viên.");
	        }
	    } else {
	        System.out.println("Không tìm thấy khách hàng.");
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
	            khachHangTichDiem = danhSachKH.layKhachHangTheoMa(maKhachHangTichDiem);
	            break;
	        case 2:
	            System.out.print("Nhập tên khách hàng tích điểm: ");
	            String tenKhachHangTichDiem = SC.nextLine();
	            khachHangTichDiem = danhSachKH.layKhachHangTheoTen(tenKhachHangTichDiem);
	            break;
	        default:
	            System.out.println("Lựa chọn không hợp lệ.");
	            return;
	    }

	    if (khachHangTichDiem != null) {
	        if (khachHangTichDiem instanceof ChamSocKhachHang) {
	            ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangTichDiem;
	            chamSocKhachHang.tichDiem();
	        } else {
	            System.out.println("Khách hàng không hỗ trợ tích điểm do chưa là thành viên.");
	        }
	    } else {
	        System.out.println("Không tìm thấy khách hàng.");
	    }
	}

	public void luuDiemVaoTepTin() throws IOException {
		try (FileWriter writer = new FileWriter("src/BaiTapLonOOP/data/TichDiem.txt", true)) {
			writer.write(getMaKH() + ";" + getHoTen() + ";" + getNgaySinh()+ ";" + getSoDT() + ";" + isThanhVien() + ";" + diem + "\n");
			System.out.println("Đã lưu điểm vào tệp tin.");
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

	public void xuLyFeedBack(QuanLyKhachHang danhSachKH) throws IOException{
		System.out.println("Bạn muốn nhập feedback?");
		System.out.print("Nhập mã khách hàng: ");
		int maKhachHangfb = SC.nextInt();
		SC.nextLine(); 
		KhachHang khachHangfb = danhSachKH.layKhachHangTheoMa(maKhachHangfb);
		if (khachHangfb != null) {
			if (khachHangfb instanceof ChamSocKhachHang) {
				ChamSocKhachHang chamSocKhachHang = (ChamSocKhachHang) khachHangfb;
				chamSocKhachHang.feedBack();
			} else {
				System.out.println("Khách hàng không được hỗ trợ.");
			}
		} else {
			System.out.println("Không tìm thấy khách hàng.");
		}
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
	
}
