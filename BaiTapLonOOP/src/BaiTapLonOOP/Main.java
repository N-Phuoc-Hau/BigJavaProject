package BaiTapLonOOP;


public class Main {

	public static void main(String agrs[]){
        NhanVien nhanVien[] = new NhanVien[]{new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", 1990),
            new NhanVien(2, "Nguyễn Văn B", false, "Đà Nẵng", 1991),
            new NhanVien(3, "Nguyễn Văn C", true, "Hồ Chí Minh", 1992)};
        for (NhanVien nv : nhanVien) {
            System.out.println(nv.NV());
        }
	}
}