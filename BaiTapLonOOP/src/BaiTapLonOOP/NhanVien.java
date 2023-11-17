
package BaiTapLonOOP;
import java.util.Scanner;
public class NhanVien {

	private int maNV;

	private String tenNV;	

	private boolean loaiNhanVienFT;

	private String diaChi;

	private int namSinh;
	private int sDT;

	public NhanVien(int maNV, String tenNV, boolean loaiNhanVienFT,
			String diaChi, int namSinh, int sDT) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.loaiNhanVienFT = loaiNhanVienFT;
		this.diaChi = diaChi;
		this.namSinh = namSinh;
		this.sDT = sDT;
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public boolean isLoaiNhanVienFT() {
		return loaiNhanVienFT;
	}

	public void setLoaiNhanVienFT(boolean loaiNhanVienFT) {
		this.loaiNhanVienFT = loaiNhanVienFT;
	}

	public int getsDT() {
		return sDT;
	}

	public void setsDT(int sDT) {
		this.sDT = sDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void NhanVienFT() {

	}

	public void NhanVienPT() {

	}


	public void hienThi() {
		System.out.print("NhanVien{" + "Mã nhân viên=" + this.maNV + ", Họ Tên='" + this.tenNV + '\''
				+ ", NV FullTtime=" + this.loaiNhanVienFT + ", Địa chỉ='" + this.diaChi
				+ '\'' + ", Năm Sinh=" + this.namSinh + ", Số ĐT=" + this.sDT + '}') ;
	}

	public void inDSNV(NhanVien[] nhanVien) {
		for (NhanVien nv : nhanVien) {
			nv.hienThi();
        }
	}

	public void timKiemNV(NhanVien[] nhanVien) {
		int maNV = 1;

        for (NhanVien nv : nhanVien) {
            if (nv.getMaNV() == maNV) {
                System.out.println(nv);
            }
        }
	}
	public static void xoaNV(NhanVien[] nhanVien, int maNV) {
	    for (int i = 0; i < nhanVien.length; i++) {
	        if (nhanVien[i].getMaNV() == maNV) {
	            for (int j = i; j < nhanVien.length - 1; j++) {
	                nhanVien[j] = nhanVien[j + 1];
	            }
	            nhanVien[nhanVien.length - 1] = null;
	            break;
	        }
	    }
	}
	public static void themNV(NhanVien[] nhanVien, NhanVien nv) {
		Scanner sc = new Scanner(System.in);
	    int index = nhanVien.length;
	    System.out.print("Nhập mã nhân viên: ");
	    nhanVien[index].maNV = sc.nextInt();
	    System.out.print("Nhập tên nhân viên: ");
	    nhanVien[index].tenNV = sc.next();
	    System.out.print("Nhân viên FullTime?: ");
	    nhanVien[index].loaiNhanVienFT = sc.nextBoolean();
	    System.out.print("Nhập số điện thoại nhân viên: ");
	    nhanVien[index].sDT = sc.nextInt();
	    System.out.print("Nhập địa chỉ nhân viên: ");
	    nhanVien[index].diaChi = sc.next();
	    System.out.print("Nhập năm sinh nhân viên: ");
	    nhanVien[index].namSinh = sc.nextInt();
	}
	


}
