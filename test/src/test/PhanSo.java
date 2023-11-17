package test;


public class PhanSo {
	private int tuSo;
	private int mauSo;
	static int soLuong = 0;
	static int ucln(int a, int b){
		if (a==0||b==0)
			return 1;
		while(a!=b){
			if(a>b) a-=b;
			else if(a < b)
				b-=a;
		}
		return a;
	}
	public PhanSo rutGon(){
		int u = ucln(tuSo,mauSo);
		return new PhanSo(this.tuSo/u,this.mauSo/u);
	}
	public int soSanh(PhanSo p){
		double vt = this.tuSo*1.0/this.mauSo;
		double vp = p.tuSo*1.0/p.mauSo;
		if(vt>vp) return 1;
		else return -1;
	}
	public PhanSo cong(PhanSo p){
		int t = this.tuSo*p.mauSo+this.mauSo*p.tuSo;
		int m = this.mauSo*p.mauSo;
		PhanSo s = new PhanSo(t,m);
		return s.rutGon();
	}
	public PhanSo (int tuSo, int mauSo){
		if (mauSo!= 0) {
			this.tuSo = tuSo;
			this.mauSo = mauSo;
		} else {
			System.out.print("Mau so phai khac 0");
		}	
	}
	public PhanSo(){
		this.tuSo = 0;
		this.mauSo = 1;
	}
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	public void hienThi(){
		System.out.printf("%d/%d",this.tuSo,this.mauSo);
	}
}

