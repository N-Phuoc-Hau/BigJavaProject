
package BaiTapLonOOP;
import java.util.Scanner;
import java.util.ArrayList;

public class NhanVien {

	private int maNV;

	private String tenNV;	

	private boolean loaiNhanVienFT;

	private String diaChi;

	private int sDT;
		
	private int namSinh;

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

	public void inDSNV() {
		for (NhanVien nv : nv) {
			nv.hienThi();
			System.out.println("");
        }
	}

	public void timKiemNVbangMaNV() {
		int ktra = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Mã Nhân viên");
		int maNV = sc.nextInt();
        for (NhanVien nv : nv) {
            if (nv.getMaNV() == maNV) {
                nv.hienThi();
            }
            else ktra = 0;
        }
        if (ktra == 0)System.out.println("Khong tim thấy");
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
	    nv.maNV = sc.nextInt();
	    System.out.print("Nhập tên nhân viên: ");
	    nv.tenNV = sc.next();
	    System.out.print("Nhân viên FullTime?: ");
	    nv.loaiNhanVienFT = sc.hasNextBoolean();
	    System.out.print("Nhập số điện thoại nhân viên: ");
	    nv.sDT = sc.nextInt();
	    System.out.print("Nhập năm sinh nhân viên: ");
	    nv.namSinh = sc.nextInt();
	    System.out.print("Nhập địa chỉ nhân viên: ");
	    nv.diaChi = sc.next();
	    nv = nhanVien[index] ;
	}

	private ArrayList<NhanVien> nv = new ArrayList<>();
	public void them (NhanVien nhanvien){
		nv.add(nhanvien);
	}
	public int TimPhantucuoicung(){
		int lastElement = 0;
        for (int i = 0; i < nv.size(); i++) {
            if (i == nv.size() - 1) {
                lastElement = nv.get(i).maNV;
                break;
            }
        }
		return lastElement;
		
	}
	public void them(){
		Scanner sc = new Scanner (System.in);
		int manv = nv.lastIndexOf(maNV);
		manv += 1;
	    System.out.print("Nhập tên nhân viên: ");
	    String ten = sc.next();
	    System.out.print("Nhân viên FullTime?: ");
	    boolean loai = sc.nextBoolean();
	    System.out.print("Nhập số điện thoại nhân viên: ");
	    int sdt = sc.nextInt();
	    System.out.print("Nhập năm sinh nhân viên: ");
	    int nam = sc.nextInt();
	    System.out.print("Nhập địa chỉ nhân viên: ");
	    String diachi = sc.next();
	    
		
		NhanVien nvx = new NhanVien(manv,ten,loai,diachi,nam,sdt);
		nv.add(nvx);
	}
	


}
