/*
 Co the thay doi gia tri so Pi 
  DT() va CV() la cac methods ==> tinh toan lai theo gia tri PI moi
 */
public class Circle5 {
	public static double SOPI=3.14; 
	private double x;
	private double y;
	private double R;
	Circle5() {x=y=R=0;}
	Circle5(double toadoX, double toadoY, double bankinhR)
              {x=toadoX; y=toadoY; setR(bankinhR);}
	public double getR(){return R;};
	public void setR(double bk){R=bk>=0?bk:R;}
    public String toString()
	 {
		 String s="O("+x+","+y+")\n";
		 s+="R= "+R+"\n";
		 s+="Chu vi= "+2*R*SOPI+"  Dien tich= "+R*R*SOPI+" (Pi="+SOPI+")\n";
		 return s;
	 }
}

/*
	 Circle5 C= new Circle5(0,1,1);
	 System.out.println(C); //in ra thong tin C
	 Circle5.SOPI=3.14159; //thay doi so PI 
	 System.out.println(C); //in ra thong tin C
	 Circle5.SOPI=-3.1;//thay doi so PI
	 System.out.println(C);
*/