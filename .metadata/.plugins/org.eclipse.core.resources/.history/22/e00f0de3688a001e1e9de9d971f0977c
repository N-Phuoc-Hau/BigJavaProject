package test;
import java.util.ArrayList;
import java.util.Scanner;
public class DsPhanSo {
	private ArrayList<PhanSo> ds = new ArrayList<>();
	public void them (PhanSo p){
		ds.add(p);
	}
	public void them(){
		Scanner sc = new Scanner (System.in);
		System.out.print("nhap tu so:");
		int t = sc.nextInt();
		System.out.print("nhap mau so:");
		int m = sc.nextInt();
		
		PhanSo s = new PhanSo(t,m);
		ds.add(s);
	}
	
	public void hienThi(){

		for(PhanSo ps : ds){
			ps.hienThi();
			System.out.println("");
		}
	}
	public PhanSo tinhTong(){

		PhanSo tong = new PhanSo(0,1);
		for(PhanSo p : ds){
			tong = tong.cong(p);
		}
		return tong;
	}
	public PhanSo timMax(){
		PhanSo max = ds.get(0);
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).soSanh(max) == 1) {
				max = ds.get(i);
			}
			
		}
		return max;
	}
	public void sapXep(){
		ds.sort((p1,p2)->{
			return p1.soSanh(p2);
		});
	}
	
	public ArrayList<PhanSo> getDs() {
		return ds;
	}

	public void setDs(ArrayList<PhanSo> ds) {
		this.ds = ds;
	}
	
			
			
}
