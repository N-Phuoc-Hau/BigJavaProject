
public class Circle6 {
		private static double SOPI=3.14; 
		private double x;
		private double y;
		private double R;
		Circle6() {x=y=R=0;}
		Circle6(double toadoX, double toadoY, double bankinhR)
	              {x=toadoX; y=toadoY; setR(bankinhR);}
		public double getR(){return R;};
		public void setR(double bk){R=bk>=0?bk:R;}
		
		public static void setSOPI(double newvalue)
		 {
			 if (newvalue>3.16||newvalue<3.14) return;
			 SOPI=newvalue;
	     	 return;
		 }
		
		public String toString()
		 {
			 String s="O("+x+","+y+")\n";
			 s+="R= "+R+"\n";
			 s+="Chu vi= "+2*R*SOPI+"  Dien tich= "+R*R*SOPI+" (Pi="+SOPI+")\n";
			 return s;
		 }
	}

/*
Circle6 C= new Circle6 (1,1,1);
	System.out.println(C);
	C.setSOPI(3.14159); //hoac Circle6.setSOPI(3.14159);
	System.out.println(C);
	Circle6.setSOPI(3.2);
	System.out.println(C);
	Circle6.setSOPI(3.1);
	System.out.println(C);
*/