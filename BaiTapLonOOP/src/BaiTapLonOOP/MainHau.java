package BaiTapLonOOP;


import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainHau {
	private static QuanLyNhanVien DS = new QuanLyNhanVien();
	private static Scanner sc = new Scanner(System.in);
	public static void giaoDienQuanLy(){
		Scanner sc = new Scanner(System.in);
        // Xóa màn hình


        while(true){
        	
        	// Hiển thị tiêu đề
            System.out.println("Vui lòng đăng nhập:--------------------");

            // Hiển thị yêu cầu nhập tên đăng nhập
            System.out.print("Tên đăng nhập: ");
            String username = sc.nextLine();
            // Hiển thị yêu cầu nhập mật khẩu
            System.out.print("Mật khẩu: ");

            // Nhập mật khẩu
            String password = sc.nextLine();
            
            // Kiểm tra thông tin đăng nhập
            if ("admin".equals(username) && "123456".equals(password)) {
                // Thông tin đăng nhập đúng
                System.out.println("Đăng nhập thành công");
                return;
            } else {
                // Thông tin đăng nhập sai
                System.out.println("Đăng nhập thất bại");

            }
        }
	}
	public void menuSP() {
		System.out.println("Quan Ly Nhan Vein");
		System.out.println("1. NHAP SAN PHAM");
		System.out.println("2. IN DANH SACH SAN PHAM");
		System.out.println("3. THEM SAN PHAM VAO KHO");
		System.out.println("4. XOA SAN PHAM TRONG KHO");
		System.out.println("5. TIM KIEM SAN PHAM TRONG KHO");
		System.out.println("6. QUAY LAI");
	}
	public static void main(String agrs[]) throws ParseException, IOException{
//		NhanVienPT nv1 = new NhanVienPT("Nguyen Van A", "Nam", "Vinh Long", "02/06/2004",false, 25000, 40);
//		NhanVienPT nv2 = new NhanVienPT("Nguyen Van B", "Nam", "Tra Vinh", "02/06/2004",false,25000, 120);
//		NhanVienFT nv3 = new NhanVienFT("Nguyen Van C", "Nam", "Ben Tre", "02/06/2004",true, 30000000, 5, "01/02/2022");

		
		giaoDienQuanLy();
		DS.docTapTinFT();
//		while (true) {
		// Hiá»ƒn thá»‹ menu vÃ  yÃªu cáº§u ngÆ°á»�i dÃ¹ng nháº­p lá»±a chá»�n
		System.out.println("1. Thá»±c hiá»‡n cÃ´ng viá»‡c 1");
		System.out.println("2. Thá»±c hiá»‡n cÃ´ng viá»‡c 2");
		System.out.println("3. Thá»±c hiá»‡n cÃ´ng viá»‡c 3");
		System.out.println("0. ThoÃ¡t");

		System.out.print("Nháº­p lá»±a chá»�n cá»§a báº¡n: ");

		// Ä�á»�c lá»±a chá»�n tá»« ngÆ°á»�i dÃ¹ng
		int choice = sc.nextInt();

		// Xá»­ lÃ½ lá»±a chá»�n sá»­ dá»¥ng switch-case
		switch (choice) {
		case 1:
			// Thá»±c hiá»‡n cÃ´ng viá»‡c 1
			System.out.println("Ä�Ã£ thá»±c hiá»‡n cÃ´ng viá»‡c 1");
			break;
		case 2:
			// Thá»±c hiá»‡n cÃ´ng viá»‡c 2
			System.out.println("");
			break;
		case 3:
			// Thá»±c hiá»‡n cÃ´ng viá»‡c 3
			System.out.println("Ä�Ã£ thá»±c hiá»‡n cÃ´ng viá»‡c 3");
			break;
		case 0:
			// Káº¿t thÃºc vÃ²ng láº·p khi lá»±a chá»�n lÃ  0
			System.out.println("ChÆ°Æ¡ng trÃ¬nh káº¿t thÃºc.");
			return;
		default:
			// Hiá»ƒn thá»‹ thÃ´ng bÃ¡o náº¿u lá»±a chá»�n khÃ´ng há»£p lá»‡
			System.out.println("Lá»±a chá»�n khÃ´ng há»£p lá»‡. Vui lÃ²ng chá»�n láº¡i.");
		}
	}
}
// Nhân viên pT nếu làm 100 giờ sẽ được cộng 1k
// 						200					 2k
//						300					 2k chuyển sang nhân viên Ft Edit lại