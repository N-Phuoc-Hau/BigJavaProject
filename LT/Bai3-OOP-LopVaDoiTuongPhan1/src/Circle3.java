/*
 Cai tien:
 Cho phep truy cap ban kinh R bang phuong thuc
 
 */
	public class Circle3 {
  	 private double x;
	 private double y;
	 private double R;
	 Circle3() {x=y=R=0;}
	 Circle3(double toadoX, double toadoY, double bankinhR)
		       {x=toadoX; y=toadoY; setR(bankinhR);}
	 public double getR(){return R;};
	 public void setR(double bk){R=bk>=0?bk:R;}
	 public String toString()
		 {
		 return "Vong tron co tam o ("+x+","+y+") va ban kinh R= "+R;
		 }
	 public static void main(String[] args){
		Circle3 C= new Circle3();
		System.out.println(C);
		C.setR(1);
		System.out.println(C);
		C.setR(-2);
		System.out.println(C);
		System.out.println("Chu vi= "+3.14*C.getR()+
			"   DT="+3.14*C.getR()*C.getR());	
	 }
	}