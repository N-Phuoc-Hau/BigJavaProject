package BaiTapLonOOP;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QuanLyNhanVien {

	private SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
	private Scanner sc = new Scanner(System.in);

	private ArrayList<NhanVien> ds = new ArrayList<>();
	public QuanLyNhanVien() {
		this.ds = new ArrayList<>();
	}

	public void them(NhanVien nv) {
		ds.add(nv);
	}

	public void hienThi() {
		ds.forEach(ds -> ds.hienThi());
	}
	public void hienThiTheoMa(){
		System.out.println("Nháº­p mÃ£ NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		int manv = sc.nextInt();
		for (int i = 1; i <= ds.size(); i++) {
			if(i == manv) ds.get(i).hienThi();
		}
	}
	public void hienThiTheoTen(){
		System.out.println("Nháº­p TÃªn NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		String tenNV = sc.nextLine();
		for(int i = 1; i <= ds.size(); i++){
			if (ds.get(i).getTenNV().equals(tenNV)) {
				ds.get(i).hienThi();
			}
		}
		System.out.println("Khong tim thay nhan vien co ten: " + tenNV);
	}
	public void hienThiTheoGT(){
		System.out.println("Nháº­p Giá»›i tÃ­nh NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		String tenNV = sc.nextLine();
		for(int i = 1; i <= ds.size(); i++){
			if (ds.get(i).getTenNV().equals(tenNV)) {
				ds.get(i).hienThi();
			}
		}
		System.out.println("Khong tim thay nhan vien co GT: " + tenNV);
	}
	public void hienThiTheoQQ(){
		System.out.println("Nháº­p QuÃª QuÃ¡n NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		String tenNV = sc.nextLine();
		for(int i = 1; i <= ds.size(); i++){
			if (ds.get(i).getTenNV().equals(tenNV)) {
				ds.get(i).hienThi();
			}
		}
		System.out.println("Khong tim thay nhan vien co QuÃª quÃ¡n: " + tenNV);
	}

	public void them() throws ParseException {
		System.out.print("Tuyen them nhan vien PT: ---------");
		System.out.print("Nhap ten:");
		String name = sc.nextLine();
		System.out.print("Nhap gioi tinh:");
		String sex = sc.nextLine();
		System.out.print("Nhap dia chi:");
		String adr = sc.nextLine();
		System.out.print("Nhap ngay sinh:");
		String bird = sc.nextLine();
		boolean kind = false;
		int sal = 25000;
		int time = 0;

		NhanVienPT nv = new NhanVienPT(name, sex, adr, bird, kind, sal, time);
		ds.add(nv);

	}

	public void xoaNVTheoMa() {
		System.out.println("Nháº­p mÃ£ NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		int manv = sc.nextInt();
		
		for (int i = 1; i <= ds.size(); i++) {
			if (i == manv) {
				ds.remove(i - 1);
				break;
			}
		}
	}
	public void xoaNVTheoTen() {
		System.out.print("Nháº­p tÃªn NhÃ¢n ViÃªn cáº§n xÃ³a: ");
		String tenNV = sc.nextLine();
		for(int i = 1; i <= ds.size(); i++){
			if (ds.get(i).getTenNV().equals(tenNV)) {
				ds.remove(i - 1);
				System.out.println("Da xoa nhÃ¢n viÃªn co ten la: " + tenNV);
				return; 
			}
		}
		System.out.println("Khong tim thay nhan vien co ten: " + tenNV);
	}
	public void suaTTCB() throws ParseException {
		System.out.println("Sua thong tin nhan Vien: ---------\n");
		System.out.println("Nhap ma Nhan Vien: ");
		int manv = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= ds.size(); i++) {
			if (i == manv) {
				--i;
				System.out.print("Nhap ten:");
				String name = sc.nextLine();
				System.out.print("Nhap gioi tinh:");
				String sex = sc.nextLine();
				System.out.print("Nhap dia chi:");
				String adr = sc.nextLine();
				System.out.print("Nhap ngay sinh:");
				String bird = sc.nextLine();
				Date ngay = F.parse(bird);
				ds.get(i).setTenNV(name);
				ds.get(i).setGioiTinh(sex);
				ds.get(i).setDiaChi(adr);
				ds.get(i).setNgaySinh(ngay);
				break;
			}
		}
	}
	public void ghiTapTin() throws IOException {
		String duongDan = "src/data/NhanVienPT.txt";
        try (FileWriter writer = new FileWriter(duongDan)) {
            for (NhanVien nv : ds) {
                // Ghi thÃ´ng tin sáº£n pháº©m vÃ o táº­p tin sá»­ dá»¥ng toString
                if (nv instanceof NhanVienPT) {
                   writer.write(nv.toString() + System.lineSeparator());
     	       }
            }
        } catch (IOException e) {
            System.out.println("Lá»—i khi ghi táº­p tin: " + e.getMessage());
            throw e; // Re-throw Ä‘á»ƒ cho phÃ©p lá»›p gá»�i xá»­ lÃ½ lá»—i náº¿u cáº§n
        }
        String duongDan1 = "src/data/NhanVienFT.txt";
        try (FileWriter writer = new FileWriter(duongDan1)) {
            for (NhanVien nv : ds) {
                // Ghi thÃ´ng tin sáº£n pháº©m vÃ o táº­p tin sá»­ dá»¥ng toString
                if (nv instanceof NhanVienFT) {
                   writer.write(nv.toString() + System.lineSeparator());
     	       }
            }
        } catch (IOException e) {
            System.out.println("Lá»—i khi ghi táº­p tin: " + e.getMessage());
            throw e; // Re-throw Ä‘á»ƒ cho phÃ©p lá»›p gá»�i xá»­ lÃ½ lá»—i náº¿u cáº§n
        }

        System.out.println("Ä�Ã£ ghi dá»¯ liá»‡u vÃ o táº­p tin thÃ nh cÃ´ng.");
    }
	
	public void suaTTNC()throws ParseException{
		System.out.println("Sua thong tin nhan Vien: ---------");
		System.out.print("FullTime:True === Partime:false   : ");
		boolean chon = sc.nextBoolean();
		System.out.print("MÃ£ NhÃ¢n viÃªn: ");
		int manv = sc.nextInt();
		manv -= 1;
		for (int i = 0; i < ds.size(); i++) {	
				if (i == manv && chon == true) {
					
//					System.out.print("Nhap loai:");
//					boolean loai = sc.nextBoolean();
					System.out.print("Nhap luong thang:");
					long lTh = sc.nextLong();
					System.out.print("Nhap ngay nghi phep:");
					int nNP = sc.nextInt();
//					ds.get(i).setLoaiNV(loai);
					setLthang(i, lTh);
					setNP(i, nNP);
					ds.get(i).hienThi();
					return;
				}
				else if (i == manv && chon == false) {
					System.out.print("Nhap loai:");
//					boolean loai = sc.nextBoolean();
					System.out.print("Nhap luong:");
					int l = sc.nextInt();
					System.out.print("Nhap so gio lam:");
					int sgl = sc.nextInt();
//					ds.get(i).setLoaiNV(loai);
					setSGL(i, sgl);
					setL(i, l);
					ds.get(i).hienThi();
					return;
				}
			}
		System.out.println("Ma hoac loai Nhan Vien khong dung");
		}
	public void docTapTinPT() throws ParseException, IOException {
	    // Táº¡o Ä‘á»‘i tÆ°á»£ng File Ä‘á»ƒ Ä‘áº¡i diá»‡n cho táº­p tin
	    File file = new File("src/data/NhanVienPT.txt");

	    // Má»Ÿ táº­p tin
	    FileReader fileReader = new FileReader(file);

	    // Ä�á»�c tá»«ng dÃ²ng dá»¯ liá»‡u cá»§a táº­p tin
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    String line;
	    while ((line = bufferedReader.readLine()) != null) {
	        // Xá»­ lÃ½ dá»¯ liá»‡u cá»§a dÃ²ng
	        String[] data = line.split(";");

	        // Táº¡o Ä‘á»‘i tÆ°á»£ng NhanVien
	        NhanVienPT nv = new NhanVienPT(
	            data[0],
	            data[1],
	            data[2],
	            data[3],
	            Boolean.parseBoolean(data[4]),
	            Integer.parseInt(data[5]),
	            Integer.parseInt(data[6])
	        );

	        // ThÃªm Ä‘á»‘i tÆ°á»£ng NhanVien vÃ o ArrayList
	        ds.add(nv);
	    }

	    // Ä�Ã³ng táº­p tin
	    bufferedReader.close();
	}
	
	public void docTapTinFT() throws ParseException, IOException {
	    // Táº¡o Ä‘á»‘i tÆ°á»£ng File Ä‘á»ƒ Ä‘áº¡i diá»‡n cho táº­p tin
	    File file = new File("src/data/NhanVienFT.txt");

	    // Má»Ÿ táº­p tin
	    FileReader fileReader = new FileReader(file);

	    // Ä�á»�c tá»«ng dÃ²ng dá»¯ liá»‡u cá»§a táº­p tin
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    String line;
	    while ((line = bufferedReader.readLine()) != null) {
	        // Xá»­ lÃ½ dá»¯ liá»‡u cá»§a dÃ²ng
	        String[] data = line.split(";");

	        // Táº¡o Ä‘á»‘i tÆ°á»£ng NhanVien
	        NhanVienFT nv = new NhanVienFT(
	            data[0],
	            data[1],
	            data[2],
	            data[3],
	            Boolean.parseBoolean(data[4]),
	            Integer.parseInt(data[5]),
	            Integer.parseInt(data[6]),
	            data[7]
	        );

	        // ThÃªm Ä‘á»‘i tÆ°á»£ng NhanVien vÃ o ArrayList
	        ds.add(nv);
	    }

	    // Ä�Ã³ng táº­p tin
	    bufferedReader.close();
	}
	public void setLthang(int index, long l) {
	       if (ds.get(index) instanceof NhanVienFT) {
	           NhanVienFT nv = (NhanVienFT) ds.get(index);
	           nv.setlThang(l);
	       }
	}
	public void setNP(int index, int l) {
		if (ds.get(index) instanceof NhanVienFT) {
			NhanVienFT nv = (NhanVienFT) ds.get(index);
			nv.setNghiPhep(l);
		}
	}
	public void setL(int index, int l) {
		if (ds.get(index) instanceof NhanVienPT) {
			NhanVienPT nv = (NhanVienPT) ds.get(index);
			nv.setLuongNV(l);
		}
	}
	public void setSGL(int index, int l) {
		if (ds.get(index) instanceof NhanVienPT) {
			NhanVienPT nv = (NhanVienPT) ds.get(index);
			nv.setSoGioLamViec(l);
		}
	}
//	public void setLthang(int index, long l) {
//	       if (ds.get(index) instanceof NhanVienFT) {
//	           NhanVienFT nv = (NhanVienFT) ds.get(index);
//	           nv.setlThang(l);
//	       }
//	}
	


}
	
