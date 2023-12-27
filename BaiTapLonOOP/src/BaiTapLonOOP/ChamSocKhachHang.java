package BaiTapLonOOP;

import java.util.Scanner;


public class ChamSocKhachHang {
		private NhanVien nv;
		private static final Scanner SC = new Scanner(System.in);
		  // Hàm giải quyết khiếu nại của khách hàng
		  public void resolveCustomerComplaint(KhachHang kh) {
		    // Xác định loại khiếu nại
		   System.out.print("\nNhập loại khiếu nại:\n 1.Chất lượng sản phẩm \n 2.dịch vụ khách hàng kém");
		   Integer complaintType = Integer.parseInt(SC.nextLine());
		    // Xử lý khiếu nại
		    switch (complaintType) {
		      case 1:
		        // Gửi sản phẩm thay thế cho khách hàng
		    	  System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ chúng tôi sẽ cố gắng khắc phục!!");
		        break;
		      case 2:
		        // Xin lỗi khách hàng và đề nghị bồi thường
		    	  System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ chúng tôi sẽ cố gắng khắc phục!!");
		        break;
		      default:
		        // Trả lời khách hàng rằng chúng tôi sẽ xem xét khiếu nại
		        break;
		    }
		  }
		  public void cauHoiKhachHang(KhachHang kh) {
			  // Tìm kiếm câu trả lời cho câu hỏi
			  String question = getAnswer(question);

			  // Trả lời khách hàng
			  nv.traLoiCauHoi(kh, question, answer);
		  }
		  // Hàm trả lời câu hỏi của khách hàng
		  public void answerCustomerQuestion(String question) {
			  // Tìm kiếm câu trả lời cho câu hỏi
			  String answer = getAnswer(question);

			  // Trả lời khách hàng
			  nv.traLoiCauHoi(kh, question, answer);
		  }


		  // Hàm theo dõi lịch sử giao dịch của khách hàng
		  public void trackCustomerTransactionHistory(String customerName) {
		    // Lấy lịch sử giao dịch của khách hàng từ cơ sở dữ liệu
		    nv.theoDoiLichSuGiaoDich(kh);
		  }

	

	

	

}
