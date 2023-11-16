package BaiTapLonOOP;

public class KhachHang extends ChamSocKhachHang {

	private int maKH;

	private String hoTen;

	private int soDT;

	private boolean thanhVien;

	public HoaDon[] hd;

	public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public boolean isThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(boolean thanhVien) {
        this.thanhVien = thanhVien;
    }

	public void in1KH() {
		System.out.println("Mã KH: " + maKH);
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Số điện thoại: " + soDT);
		System.out.println("Thành viên: " + (thanhVien ? "Có" : "Không"));
	}

	public void inDSKH() {
		for (int i = 0; i < hd.length; i++) {
			System.out.println("Thông tin khách hàng " + (i + 1) + ":");
			System.out.println("Mã KH: " + hd[i].getMaKH());
			System.out.println("Họ và tên: " + hd[i].getHoTen());
			System.out.println("Số điện thoại: " + hd[i].getSoDT());
			System.out.println("Thành viên: " + (hd[i].isThanhVien() ? "Có" : "Không"));
			System.out.println("----------------------");
		}
	}

	public void themKH(int maKH, String hoTen, int soDT, boolean thanhVien) {
		this.maKH = maKH;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.thanhVien = thanhVien;
	}

	public void xoaKH() {
		maKH = 0;
        hoTen = "";
        soDT = 0;
        thanhVien = false;
	}

	public void timKiemKH(String ten) {
		for (int i = 0; i < hd.length; i++) {
            if (hd[i].getHoTen().equals(ten)) {
                System.out.println("Thông tin khách hàng:");
                System.out.println("Mã KH: " + hd[i].getMaKH());
                System.out.println("Họ và tên: " + hd[i].getHoTen());
                System.out.println("Số điện thoại: " + hd[i].getSoDT());
                System.out.println("Thành viên: " + (hd[i].isThanhVien() ? "Có" : "Không"));
                System.out.println("----------------------");
            }
        }
    }
	}

}
