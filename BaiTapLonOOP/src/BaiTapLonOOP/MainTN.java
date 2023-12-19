package BaiTapLonOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainTN {

	public static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) throws ParseException, IOException{
		SanPham sp1 = new SanPham("Cafe Sua", 35000, 1, "25/10/2023");
		SanPham sp2 = new SanPham("Tra Xanh", 20000, 3, "25/10/2023");
//		SanPham hd6 = new SanPham("Bac Xiu", 23000, 4, "26/10/2023");
//		SanPham hd7 = new SanPham("Tra Sua", 30000, 5, "24/10/2023");
//		SanPham hd8 = new SanPham("Topping", 5000, 2, "24/10/2023");
		
		
		QuanLySanPham ql = new QuanLySanPham();
//		QuanLyHoaDon qls = new QuanLyHoaDon();
		ql.themSP(sp1);
		ql.themSP(sp2);
		
		
		String duongDan = "./src/ortherFile/data/quanlihoadon.txt";
		ql.docTapTin(duongDan);

		ql.hienThi();
		
		String duongDandoc = "./src/ortherFile/data/quanlysanpham.txt";
		ql.ghiTapTin(duongDandoc);
		
		
//////////////////////////////		
//		try {
//            ql.ghiTapTin("./src/ortherFile/data/quanlysanpham.txt");
//            System.out.println("Ä�Ã£ ghi dá»¯ liá»‡u vÃ o táº­p tin thÃ nh cÃ´ng.");
//        } catch (IOException e) {
//            System.out.println("Lá»—i khi ghi táº­p tin: " + e.getMessage());
//        }
/////////////////////////////		
		//Xoa theo ten san pham
//		System.out.println("--->>>>>>>Xoa theo ten: ");
//		System.out.print("->>>Nhap ten san pham muon xoa: ");
//		String b = SC.nextLine();
//		ql.xoaSPTheoTen(b);
//		ql.hienThi();
//		
//		//Xoa theo ma san pham 
//		System.out.println("--->>>>>>>Xoa theo ma: ");
//		System.out.print("->>>Nhap ma san pham muon xoa: ");
//		int a = SC.nextInt();
//		ql.xoaSPTheoMa(a);
//		ql.hienThi();
//		
		//Nhap san pham moi:
		ql.nhapSanPham();
//		ql.hienThi();
//		
		String duongDandoc1 = "./src/ortherFile/data/quanlysanpham.txt";
		ql.ghiTapTin(duongDandoc1);
//		System.out.println("--->>>>>>>Cap nhat gia san pham: ");
//		System.out.print("->>>>Nhap ma san pham: ");
//		int masanpham = SC.nextInt();
//		System.out.print("->>>>Nhap gia moi cua san pham: ");
//		int giaMoi = SC.nextInt();
//		  
//        ql.capNhatGiaTien(masanpham, giaMoi);
//        ql.hienThi();
	
//		System.out.print("Nhap ma san pham can tim: ");
//		int s = SC.nextInt();
//		SanPham kqTimKiem = ql.timKiem(s);
//		if (kqTimKiem != null)
//			kqTimKiem.hienThi();
		
		
//		System.out.print("->>>Nhap ten san pham muon tim: ");
//		String ten = SC.nextLine();
//		ql.timKiemTheoTen(ten);
//		String tenSPCanTim = "TÃªn sáº£n pháº©m cáº§n tÃ¬m";
//	    SanPham ketQuaTimKiem = ql.timKiemTheoTen(ten);
//
//	    if (ketQuaTimKiem == null) {
//	        System.out.println("KhÃ´ng tÃ¬m tháº¥y sáº£n pháº©m cÃ³ tÃªn: " + ten);
//	    } else {
//	        System.out.println("Sáº£n pháº©m cÃ³ tÃªn " + ten);
//	        System.out.println(ketQuaTimKiem);
//	    }
		
//		double tongSoLuong = ql.tinhTongSoLuong();
//		System.out.print("Tong so luong san pham la: " + tongSoLuong);
//		
//		System.out.print("Nhap so luong muon chon: ");
//		int soLuong = SC.nextInt();
		
		
//		ql.muaSanPham();
//		ql.timKiem(ten).forEach(hd->hd.hienThi());
		
//		ql.sapXepGiamTheoGia();
//		ql.hienThi();
		
	}

}
