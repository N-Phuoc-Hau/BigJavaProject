public class Circle {
		private static double SOPI=3.14; 
		private double x;
		private double y;
		private double R;
		Circle() {x=y=R=0;}
		Circle(double toadoX, double toadoY, double bankinhR)
	              {x=toadoX; y=toadoY; setR(bankinhR);}
		public double getR(){return R;};
		public void setR(double bk){R=bk>=0?bk:R;}
		public static double getSOPI(){return SOPI;}
		public static void setSOPI(double newvalue)
		 {	 if (newvalue>3.16||newvalue<3.14) return;
			 SOPI=newvalue;
	     	 return;
		 }
		public double ChuVi(){ return 2*R*SOPI;}
		public double DienTich(){ return R*R*SOPI;}
		public String toString()
		 {
			 String s="O("+x+","+y+")\n";
			 s+="R= "+R+"\n";
			 s+="Chu vi= "+ChuVi()+"  Dien tich= "+DienTich()+" (Pi="+SOPI+")\n";
			 return s;
		 }
	}

/*
 	Circle C= new Circle (1,1,1);
	System.out.println(C);
	C.setR(10);
	System.out.println(C);
	Circle.setSOPI(3.14159);
	System.out.println("Chu vi= "+C.ChuVi());
	System.out.println("Dien tich= "+C.DienTich());
	System.out.println("So Pi dang dung= "+Circle.getSOPI());
 
 */

