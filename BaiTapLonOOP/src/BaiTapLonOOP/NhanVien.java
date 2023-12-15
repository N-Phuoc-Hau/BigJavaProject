package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NhanVien {
	private NhanVienFT ft;
	private NhanVienPT pt;
	protected static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private static final Scanner sc = new Scanner(System.in);
	private static int dem;
	private int maNV = ++dem;
	private String tenNV;
	private String gioiTinh;
	private String diaChi;
	protected Date ngaySinh;
	protected boolean loaiNV;

	public NhanVien(String ht, String gt, String dc, Date ns, boolean loai) {
		this.tenNV = ht;
		this.gioiTinh = gt;
		this.diaChi = dc;
		this.ngaySinh = ns;
		this.loaiNV = loai;
	}

	public NhanVien(String ht, String gt, String dc, String ns, boolean loai)
			throws ParseException {

		this.tenNV = ht;
		this.gioiTinh = gt;
		this.diaChi = dc;
		this.ngaySinh = F.parse(ns);
		this.loaiNV = loai;
	}

	public void hienThi() {
		System.out.printf("Ma Nhan vien: %d\n", this.maNV);
		System.out.printf("Ten Nhan vien: %s\n", this.tenNV);
		System.out.printf("Gioi tinh: %s\n", this.gioiTinh);
		System.out.printf("Dịa chi Nhan vien: %s\n", this.diaChi);
		System.out.printf("Ngay sinh Nhan vien: %s\n", F.format(this.ngaySinh));
		System.out.printf("Loai Nhan vien: %s\n", this.loaiNV ? "FullTime" : "PartTime");
	}
//	public void suaTTNC(int i){
//
//		System.out.print("Nhap loai:");
//		boolean loai = sc.nextBoolean();
//		System.out.print("Nhap luong thang:");
//		long lTh = sc.nextLong();
//		System.out.print("Nhap ngay nghi phep:");
//		int nNP = sc.nextInt();
//		this.get()
//	}
	public void ghiFilePT(ArrayList<NhanVienPT> ds) throws FileNotFoundException {
        // Tạo đối tượng File để đại diện cho tập tin
        File file;

        file = new File("src/data/NhanVienFT.txt");
        
        if (ds.isEmpty()) {
            return;
        }

        

        // Tạo đối tượng PrintWriter để ghi dữ liệu vào tập tin
        PrintWriter printWriter = new PrintWriter(file);

        // Ghi dữ liệu của các đối tượng NhanVien vào tập tin
        for (NhanVienPT nv : ds) {
        	if(nv.isLoaiNV() == false)
            printWriter.println(nv.getTenNV() + ";" + nv.getGioiTinh() + ";" + nv.getDiaChi() + ";" + nv.getNgaySinh() + ";" + Boolean.toString(nv.loaiNV) + ";" + nv.getLuongNV() + ";" + nv.getSoGioLamViec());
        }

        // Đóng đối tượng PrintWriter
        printWriter.close();
    }
	public void ghiFileFT(ArrayList<NhanVienFT> ds) throws FileNotFoundException {
        // Tạo đối tượng File để đại diện cho tập tin
        File file;
        
        file = new File("src/data/NhanVienFT.txt");

        // Tạo đối tượng PrintWriter để ghi dữ liệu vào tập tin
        PrintWriter printWriter = new PrintWriter(file);

        for (NhanVienFT nv : ds) {
        	if(nv.isLoaiNV() == false)
                printWriter.println(nv.getTenNV() + ";" + nv.getGioiTinh() + ";" + nv.getDiaChi() + ";" + nv.getNgaySinh() + ";" + Boolean.toString(nv.loaiNV) + ";" + nv.getlThang() + ";" + nv.getNghiPhep());

                }
        // Ghi dữ liệu của đối tượng NhanVien vào tập tin

        // Đóng đối tượng PrintWriter
        printWriter.close();
    }
	public String toString() {
        return
            tenNV + ';' + gioiTinh + ';' + diaChi + ';' + F.format(ngaySinh) + ';' + loaiNV ;
    }
	public void ghiFile(ArrayList<NhanVien> ds) throws FileNotFoundException {
        // Tạo đối tượng File để đại diện cho tập tin
        File file = null;

        if (ds.isEmpty()) {
            return;
        }

        // Kiểm tra loại nhân viên
        for (int i = 0; i < ds.size(); i++) {

            PrintWriter printWriter = new PrintWriter(file);
        	if (ds.get(i).loaiNV) {
                // Nếu là nhân viên full-time
                file = new File("src/data/NhanVienFT.txt");
                printWriter.println(ds.get(i).toString());
            } else {
                // Nếu là nhân viên part-time
                file = new File("src/data/NhanVienPT.txt");
                printWriter.println(ds.get(i).toString());
            }

            // Tạo đối tượng PrintWriter để ghi dữ liệu vào tập tin
            
            // Ghi dữ liệu của các đối tượng NhanVien vào tập tin

            printWriter.close();
		}	
        

        // Đóng đối tượng PrintWriter
    }
	public boolean isLoaiNV() {
		return loaiNV;
	}

	public NhanVienPT getPt() {
		return pt;
	}

	public void setPt(NhanVienPT pt) {
		this.pt = pt;
	}

	public NhanVienFT getFt() {
		return ft;
	}

	public void setFt(NhanVienFT ft) {
		this.ft = ft;
	}

	public void setLoaiNV(boolean loaiNV) {
		this.loaiNV = loaiNV;
	}




	public static int getDem() {
		return dem;
	}

	public static void setDem(int dem) {
		NhanVien.dem = dem;
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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public static SimpleDateFormat getF() {
		return F;
	}

	public static Scanner getSc() {
		return sc;
	}

	

}
