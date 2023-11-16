/*
Khai bao so Pi-In them thong tin chu vi va dien tich
*/
public class Circle4 {
	private static double SOPI=3.14; 
	private double x;	private double y; 	private double R;
	Circle4() {x=y=R=0;}
	Circle4(double toadoX, double toadoY, double bankinhR)
              {x=toadoX; y=toadoY; setR(bankinhR);}
	public double getR(){return R;};
	//public double MygetR(){return R;};
	public void setR(double bk){R=bk>=0?bk:R;}
	public String toString()
	 {
		 String s="O("+x+","+y+")\n";
		 s+="R= "+R+"\n";
		 s+="Chu vi= "+2*SOPI*R+"  Dien tich= "+R*R*SOPI+" (Pi="+SOPI+")\n";
		 return s;
	 }
}

/*
	Circle4 C= new Circle4();
    System.out.println(C);
    C.setR(10);
    System.out.println(C);
*/