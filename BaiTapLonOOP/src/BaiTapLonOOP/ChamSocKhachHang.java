package BaiTapLonOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChamSocKhachHang {
	private ArrayList<KhachHang> danhSachKH = new ArrayList<>();
	private static final Scanner SC = new Scanner(System.in);
	private String tenKH;
	private int cccd;
	private int soDT;
	private int diem;
	private KhachHang kh;
	
	public ArrayList<KhachHang> getDanhSachKH() {
		return danhSachKH;
	}

	public void setDanhSachKH(ArrayList<KhachHang> danhSachKH) {
		this.danhSachKH = danhSachKH;
	}
	
	//Thêm khách hàng
	public void themKhachHang() {
		int maKhachHang = danhSachKH.size() + 1; // Tạo mã khách hàng tự động
		
		System.out.print("Nhập họ tên khách hàng: ");
		String hoTen = SC.nextLine();
		
		System.out.print("Nhập số điện thoại khách hàng: ");
		int soDienThoai = SC.nextInt();
		
		System.out.print("Là thành viên (true/false): ");
		boolean laThanhVien = SC.nextBoolean();
		
		KhachHang khachHang = new KhachHang(maKhachHang, hoTen, soDienThoai, laThanhVien);
		danhSachKH.add(khachHang);
		System.out.println("Thêm khách hàng thành công!");
		System.out.println("---------------");
	}
	
	//Xóa khách hàng
	public void xoaKhachHang() {
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
			System.out.println("Không tìm thấy khách hàng có mã " + maKhachHangXoa);
		}
	}
	
	//Sửa khách hàng
	public void suaThongTinKH() {
		System.out.print("Nhập mã khách hàng cần sửa: ");
		int maKhachHang = SC.nextInt();
		
		boolean timThay = false;
		for (KhachHang khachHang : danhSachKH) {
			if (khachHang.getMaKH() == maKhachHang) {
				System.out.println("Thông tin khách hàng cần sửa:");
				khachHang.inDanhSachKH();
				
				System.out.println("Nhập thông tin mới:");
				SC.nextLine(); 
				System.out.print("Họ và tên: ");
				String hoTenMoi = SC.nextLine();
				System.out.print("Số điện thoại: ");
				int soDienThoaiMoi = SC.nextInt();
				System.out.print("Là thành viên (true/false): ");
				boolean isThanhVien = SC.nextBoolean();
				
				khachHang.setHoTen(hoTenMoi);
				khachHang.setSoDT(soDienThoaiMoi);
				khachHang.setThanhVien(isThanhVien);
				
				System.out.println("Thông tin khách hàng sau khi sửa:");
				khachHang.inDanhSachKH();
				
				timThay = true;
				break;
			}
		}
		
		if (!timThay) {
			System.out.println("Không tìm thấy khách hàng có mã " + maKhachHang + ".");
		}
	}
	
	//Tìm kiếm khách hàng
	public void timKiemKH(){
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
			System.out.println("Không tìm thấy khách hàng nào phù hợp với từ khóa \"" + tuKhoa + "\".");
		} else {
			System.out.println("Kết quả tìm kiếm:");
			for (KhachHang khachHang : ketQuaTimKiem) {
				khachHang.inDanhSachKH();
			}
		}
	}

	//Tạo giảm giá
	public void taoGiamGia() {
        System.out.print("Nhập tổng giá trị hóa đơn: ");
        double tongGiaTriHoaDon = SC.nextDouble();
        
        if (tongGiaTriHoaDon >= 200000) {
            double giamGia = tongGiaTriHoaDon * 0.1;
            tongGiaTriHoaDon -= giamGia;
            System.out.println("Sau khi giảm giá 10%: " + tongGiaTriHoaDon);
        } else {
            System.out.println("Không có giảm giá cho hóa đơn này.");
        }
        
        System.out.print("Nhập số lượng sản phẩm đã mua: ");
        int soLuongSanPham = SC.nextInt();
        
        int soSanPhamTang = soLuongSanPham / 4;
        System.out.println("Số sản phẩm được tặng: " + soSanPhamTang);
    }

	//Tích điểm
	public int tichDiem() {
        System.out.print("Nhập tên khách hàng: ");
        tenKH = SC.nextLine();

        System.out.print("Nhập số CMND/CCCD: ");
        cccd = SC.nextInt();

        System.out.print("Nhập số điện thoại: ");
        soDT = SC.nextInt();

        kh = new KhachHang(tenKH, cccd, soDT);

        System.out.print("Nhập tổng giá trị hóa đơn: ");
        int tongGiaTriHoaDon = SC.nextInt();

        int diemTichLuy = tongGiaTriHoaDon / 50000;
        diem += diemTichLuy;

        if (diem >= 15) {
            int soSanPhamMienPhi = diem / 15;
            diem %= 15;
            System.out.println("Bạn được thưởng " + soSanPhamMienPhi + " sản phẩm miễn phí dưới 100,000 đồng.");
        } else {
            System.out.println("Số điểm hiện tại: " + diem);
        }

        return diem;
    }

	//Gửi Feedback
	public void feedBack() { 
        System.out.print("Nhập feedback của bạn: ");
        String feedback = SC.nextLine();
        
        System.out.println("Feedback của bạn: " + feedback);
        System.out.print("CẢM ƠN tất cả các KHÁCH HÀNG đã luôn yêu quý chúng tôi, luôn ủng hộ và góp ý.");
    }
	
	public void themKhachHang(KhachHang kh){
		danhSachKH.add(kh);
	}
	
	public void inDanhSachKH(){
		danhSachKH.forEach(kh->kh.inDanhSachKH());
	}
	
}


