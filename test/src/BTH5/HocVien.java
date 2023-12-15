package BTH5;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HocVien {
	private static final int SOMH = 3;
	private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private static final Scanner sc = new Scanner(System.in);
	private static int dem;
	private int maHV = ++dem;
	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	private Date ngaySinh;
	private double[] diem;

	public HocVien(String ht, String gt, String qq, Date ns) {
		this.hoTen = ht;
		this.gioiTinh = gt;
		this.queQuan = qq;
		this.ngaySinh = ns;
	}

	public HocVien(String ht, String gt, String qq, String ns)
			throws ParseException {

		this.hoTen = ht;
		this.gioiTinh = gt;
		this.queQuan = qq;
		this.ngaySinh = F.parse(ns);
	}

	public void hienThi() {
		System.out.printf("Ma hoc vien: %d\n", this.maHV);
		System.out.printf("Ma hoc vien: %s\n", this.hoTen);
		System.out.printf("Ma hoc vien: %s\n", this.gioiTinh);
		System.out.printf("Ma hoc vien: %s\n", this.queQuan);
		System.out.printf("Ma hoc vien: %s\n", F.format(this.ngaySinh));
		if (diem != null){
			for(double d: diem)
				System.out.printf("%d\t",d);
		}
		
		System.out.printf("--------------------------------------");

	}
	
	public void nhapDiem(){
		diem = new double[SOMH];
		for (int i = 0; i < SOMH; i++) {
			System.out.printf("Nhap diem MH%d", i+1);
			diem[i] = sc.nextDouble();
		}
	}

	public static int getDem() {
		return dem;
	}

	public static void setDem(int dem) {
		HocVien.dem = dem;
	}

	public int getMaHV() {
		return maHV;
	}

	public void setMaHV(int maHV) {
		this.maHV = maHV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double[] getDiem() {
		return diem;
	}

	public void setDiem(double[] diem) {
		this.diem = diem;
	}

	public static int getSomh() {
		return SOMH;
	}

	public static SimpleDateFormat getF() {
		return F;
	}

}
Iterator<NhanVien> iterator = ds.iterator();
while (iterator.hasNext()) {
	NhanVien nv = iterator.next();
	if (nv.getMaNV() == manv) {
		iterator.remove();
		System.out.println("Da xoa nhan vien co ma: " + manv);
		ds.forEach(ds -> ds.hienThi());
		return; // Bạn có thể tiếp tục vòng lặp nếu muốn xóa nhiều hóa
				// đơn có cùng mã
	}
}
System.out.println("Khong tim thay hoa don co ma: " + manv);
