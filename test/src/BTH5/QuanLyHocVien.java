package BTH5;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocVien {
	private ArrayList<HocVien> ds = new ArrayList<>();

	public void them(HocVien hv){
		ds.add(hv);
	}
	
	public void hienThi(){
		for(HocVien h : ds)
			h.hienThi();
	}

	public void nhapDiem(){
		ds.forEach(hv->hv.nhapDiem());
	}
	public ArrayList<HocVien> getDs() {
		return ds;
	}
	public void docTapTin(String duongDan) throws FileNotFoundException, ParseException{
		File f = new File(duongDan);
		try (Scanner sc = new Scanner(f)){
			while(sc.hasNext()){
				String hoTen =  sc.nextLine();
				String gioiTinh = sc.nextLine();
				String queQuan = sc.nextLine();
				String ngaySinh = sc.nextLine();
				
				HocVien hv = new HocVien(hoTen,gioiTinh,queQuan,ngaySinh);
				
			}
	}
		
		
	}
}
