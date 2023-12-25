package BaiTapLonOOP;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;


public class NhanVienFT extends NhanVien {


	private int nghiPhep;

	private long lThang;

	private Date ngayBDLam;
	
	public NhanVienFT(String ht, String gt, String dc, Date ns, boolean loai, long lthang, int np, Date ng) {
		super(ht, gt, dc, ns, loai);
		this.loaiNV = loai;
		this.lThang = lthang;
		this.nghiPhep = np;
		this.ngayBDLam = ng;
		// TODO Auto-generated constructor stub
	}
	public NhanVienFT(String ht, String gt, String dc, String ns, boolean loai, long lthang, int np, String ng) throws ParseException {
		super(ht, gt, dc, F.parse(ns), loai);
		this.loaiNV = loai;
		this.lThang = lthang;
		this.nghiPhep = np;
		this.ngayBDLam = F.parse(ng);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
        return super.toString() + ";" + nghiPhep + ";" + lThang + ";" + F.format(ngayBDLam);
    }
	public void hienThi(){
		super.hienThi();
		System.out.printf("So ngay nghi phep: %s\n", this.nghiPhep);
		System.out.printf("Luong thang: %s\n", this.lThang);
		System.out.printf("Ngay bat dau lam viec: %s\n", F.format(this.ngayBDLam));
	}
	public void hienThi(int manv){
		super.hienThi();
		System.out.printf("So ngay nghi phep: %s\n", this.nghiPhep);
		System.out.printf("Luong thang: %s\n", this.lThang);
		System.out.printf("Ngay bat dau lam viec: %s\n", F.format(this.ngayBDLam));
	}


	public void ghiFileFT(ArrayList<NhanVienFT> ds) throws FileNotFoundException {
        File file;
        file = new File("src/data/NhanVienFT.txt");
        PrintWriter printWriter = new PrintWriter(file);
	
	        for (NhanVienFT nv : ds) {
        	if(nv.isLoaiNV() == true)
                printWriter.println(nv.getTenNV() + ";" + nv.getGioiTinh() + ";" + nv.getDiaChi() 
                		+ ";" + nv.getNgaySinh() + ";" + Boolean.toString(nv.loaiNV) + ";" + nv.getlThang() 
                		+ ";" + nv.getNghiPhep());
                }
        printWriter.close();
    }
	public int getNghiPhep() {
		return nghiPhep;
	}
	public void setNghiPhep(int nghiPhep) {
		this.nghiPhep = nghiPhep;
	}
	public long getlThang() {
		return lThang;
	}
	public void setlThang(long lThang) {
		this.lThang = lThang;
	}
	public Date getNgayBDLam() {
		return ngayBDLam;
	}
	public void setNgayBDLam(Date ngayBDLam) {
		this.ngayBDLam = ngayBDLam;

	}
}

