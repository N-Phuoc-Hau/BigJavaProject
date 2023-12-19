package BaiTapLonOOP;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChamSocKhachHang extends KhachHang {
	public ChamSocKhachHang(int maKH, String hoTen, int soDT, boolean isThanhVien) throws ParseException {
		super(maKH, hoTen, soDT, isThanhVien);
	}

	private static final Scanner SC = new Scanner(System.in);
	private int diem;
	
	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
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
        setHoTen(SC.nextLine());

        System.out.print("Nhập số CMND/CCCD: ");
        setCccd(SC.nextInt());

        System.out.print("Nhập số điện thoại: ");
        setSoDT(SC.nextInt());

        new KhachHang(getHoTen(), getCccd(), getSoDT());

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
	
}


