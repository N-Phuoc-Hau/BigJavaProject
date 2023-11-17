package src.OOP;


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
	public void NhanVienFT() {

	}

	public void NhanVienPT() {

	}
	public String NV() {
        return "NhanVien{" +
                "maNV=" + maNV +
                ", tenNV='" + tenNV + '\'' +
                ", loaiNhanVien=" + loaiNhanVienFT +
                ", diaChi='" + diaChi + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
	

	public void inDSNV() {

	}

	public void timKiemNV() {

	}
	public class Main {

	    public void main(String[] args) {
	        NhanVien nhanVien = new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", 1990);
	        System.out.println(nhanVien);
	    }
	}

}
