package BaiTapLonOOP;

public class MainHau {


	public static void main(String agrs[]){
        	NhanVien A = new NhanVien(1, "Nguyễn Văn A", true, "Hà Nội", "2002", "2002");
        	NhanVien B = new NhanVien(2, "Nguyễn Văn B", false, "Đà Nẵng", "2004","2004");
        	NhanVien C = new NhanVien(3, "Nguyễn Văn C", true, "Hồ Chí Minh", "2001","0942");
        ;
        NhanVien nv = new NhanVien(0,"",true,"","","");
        nv.them(A);
        nv.them(B);
        nv.them(C);
        nv.inDSNV();
        nv.them();
        nv.inDSNV();
	}
}
