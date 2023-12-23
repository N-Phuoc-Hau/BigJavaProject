package BaiTapLonOOP;

import java.text.ParseException;
import java.util.Scanner;

public class ChamSocKhachHang extends KhachHang {
	private static final Scanner SC = new Scanner(System.in);
	private int diem;

	public ChamSocKhachHang(String hoTen,String ngaySinh, String soDT, boolean isThanhVien, int diem) throws ParseException {
		super(hoTen,ngaySinh, soDT, isThanhVien);
		this.diem=diem;
	}
	

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}
	
	@Override
	public void hienThi(){
		super.hienThi();
		System.out.println("Số điểm hiện tại: "+this.diem);
		System.out.println("--------------------------");
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
	public int tichDiem() throws ParseException {
		System.out.print("Nhập họ tên khách hàng: ");
		String hoTen = SC.nextLine();
		System.out.print("Nhập ngày sinh khách hàng: ");
		String ngaySinh = SC.nextLine();
		System.out.print("Nhập số điện thoại khách hàng: ");
		String soDienThoai = SC.nextLine();
		System.out.print("Là thành viên (true/false): ");
		boolean laThanhVien = SC.nextBoolean();
 
        KhachHang kh = new KhachHang(hoTen,ngaySinh, soDienThoai,laThanhVien);

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
        System.out.println("CẢM ƠN tất cả các KHÁCH HÀNG đã luôn yêu quý chúng tôi, luôn ủng hộ và góp ý.");
    }
	
	
	
}


