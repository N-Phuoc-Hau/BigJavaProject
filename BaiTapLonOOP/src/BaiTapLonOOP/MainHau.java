package BaiTapLonOOP;

public class MainHau {


	public static void i(String agrs[]){
        	NhanVien A = new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", 1990, 123);
        	NhanVien B = new NhanVien(2, "Nguyễn Văn B", false, "Đà Nẵng", 1991,234);
        	NhanVien C = new NhanVien(3, "Nguyễn Văn C", true, "Hồ Chí Minh", 1992,456);
        ;
        NhanVien nv = new NhanVien(0,"",true,"",0,0);
        nv.them(A);
        nv.them(B);
        nv.them(C);
        nv.inDSNV();
        nv.them();
        nv.inDSNV();
	
}
