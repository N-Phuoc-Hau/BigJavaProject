package BaiTapLonOOP;

public class NhanVien {

	private int maNV;

	private String tenNV;	

	private boolean loaiNhanVienFT;

	private String diaChi;

	private int namSinh;

	public NhanVien(int maNV, String tenNV, boolean loaiNhanVienFT,
			String diaChi, int namSinh) {
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

    NhanVien nhanVien[] = new NhanVien[]{new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", 1990),
        new NhanVien(2, "Nguyễn Văn B", false, "Đà Nẵng", 1991),
        new NhanVien(3, "Nguyễn Văn C", true, "Hồ Chí Minh", 1992)};

	public String NV() {
		return "NhanVien{" + "maNV=" + maNV + ", tenNV='" + tenNV + '\''
				+ ", loaiNhanVien=" + loaiNhanVienFT + ", diaChi='" + diaChi
				+ '\'' + ", namSinh=" + namSinh + '}';
	}

	public void inDSNV() {
		for (NhanVien nv : nhanVien) {
            System.out.println(nv.NV());
        }
	}

	public void timKiemNV() {
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
	    int index = nhanVien.length;
	    nhanVien[index] = nv;
	}
	


}
