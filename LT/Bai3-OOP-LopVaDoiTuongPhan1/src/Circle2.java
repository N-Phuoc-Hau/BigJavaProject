/*
 Cai tien:
 Cac vung du lieu la private
 Chi co the gan du lieu vao cac vung qua ham khoi tao ==> kiem soat du lieu nhap
 Xay dung ham toString tra ve 1 chuoi de co thong tin cua doi tuong 
 */
public class Circle2 {
 private double x;
 private double y;
 private double R;
 Circle2(double toadoX, double toadoY, double bankinhR)
       {x=toadoX; y=toadoY; R=bankinhR>=0?bankinhR:0;}
 public String toString()
   {
	 return "Vong tron co tam o ("+x+","+y+") va ban kinh R= "+R;
   }
}

/*
	Circle2 C= new Circle2(1,-2,-5.5);
	System.out.println(C);
	C= new Circle2();
	C.x=1;
	C= new Circle2(1.13,-0.76,6.75);
	System.out.println(C);	
*/
