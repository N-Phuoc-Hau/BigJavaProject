package test;

import BaiTapLonOOP.NhanVien;

public class NhanVien {

	private int maNV;

	private String tenNV;

	private boolean loaiNhanVienFT;

	private String diaChi;

	private int namSinh;

	public NhanVien(int maNV, String tenNV, boolean loaiNhanVienFT, String diaChi, int namSinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.loaiNhanVienFT = loaiNhanVienFT;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
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

    public boolean isLoaiNhanVien() {
        return loaiNhanVienFT;
    }

    public void setLoaiNhanVien(boolean loaiNhanVien) {
        this.loaiNhanVienFT = loaiNhanVien;
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

    NhanVien nhanVien[] = new NhanVien[]{new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", 1990),
        new NhanVien(2, "Nguyễn Văn B", false, "Đà Nẵng", 1991),
        new NhanVien(3, "Nguyễn Văn C", true, "Hồ Chí Minh", 1992)};
	public void NhanVienFT() {

	}

	public void NhanVienPT() {

	}
	public void in1NV() {
        System.out.println( "NhanVien{" +
                "maNV=" + maNV +
                ", tenNV='" + tenNV + '\'' +
                ", loaiNhanVien=" + loaiNhanVienFT +
                ", diaChi='" + diaChi + '\'' +
                ", namSinh=" + namSinh +
                '}');
    }

	public void inDSNV() {
		for(NhanVien nv : nhanVien )
			System.out.print(" " + nv.in1NV());
	}

	public void timKiemNV() {

	}
	

}
