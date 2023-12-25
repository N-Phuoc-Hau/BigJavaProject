package BaiTapLonOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Nguoi {
	protected static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");

    protected String hoTen;
    protected Date ngaySinh;
    protected String soDT;
    
    public Nguoi(){
    	
    }

    public Nguoi(String hoTen, String ngaySinh, String soDT) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = F.parse(ngaySinh);
        this.soDT = soDT;
    }

    public abstract void hienThi();

    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
        return ngaySinh;
    }


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDT() {
		return soDT;
	}
	
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
    
    
}
