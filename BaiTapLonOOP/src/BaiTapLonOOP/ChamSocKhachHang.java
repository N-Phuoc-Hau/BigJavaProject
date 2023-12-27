package BaiTapLonOOP;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class ChamSocKhachHang {
		private NhanVien nv;

		private Map<Integer, String> danhSachDatBan = new HashMap<>();
		private static final Scanner SC = new Scanner(System.in);
		//Xử lý feedback của khách hàng
		  // Hàm giải quyết khiếu nại của khách hàng
		  public void giaiQuyet(QuanLyKhachHang ql, QuanLyNhanVien qlnv) throws IOException {
			  System.out.print("Nhập Nhân viên xử lý vấn đề: ");
			  int id = Integer.parseInt(SC.nextLine());
			  nv = qlnv.timKiem(id);
		    // Xác định loại khiếu nại
			  System.out.print("\n 1.Chất lượng sản phẩm \n 2.dịch vụ khách hàng kém \n 3. Trả lời trực tiếp \n Nhập loại khiếu nại:");
		   	  int complaintType = Integer.parseInt(SC.nextLine());
		   	  System.out.print("Nhập Mã Khách hàng feedback: ");
		   	  int maKhachHangfb = Integer.parseInt(SC.nextLine());
		   	  KhachHang kHFB = ql.layKhachHangTheoMa(maKhachHangfb);
		    // Xử lý khiếu nại
		    switch (complaintType) {
		      case 1:
		      case 2:
		        // Gửi sản phẩm thay thế cho khách hàng
		    	  System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ chúng tôi sẽ cố gắng khắc phục!!");
		    	  cauHoiKhachHang(kHFB, nv,complaintType);
		        break;
		      default:
		        // Trả lời khách hàng rằng chúng tôi sẽ xem xét khiếu nại
		    	  cauHoiKhachHang(kHFB, nv, complaintType);
		        break;
		    }
		  }
		  public void cauHoiKhachHang(KhachHang kh, NhanVien nv, int loai) throws IOException {
			  // Tìm kiếm câu trả lời cho câu hỏi
			  // Trả lời khách hàng
			  if(loai == 1) {
				  System.out.println("Xin lỗi khách hàng!!! Chúng tôi sẽ rút kinh nghiệm và điều chỉnh sản phẩm!!");
				  System.out.print("Cảm nhận về món và hương vị của nó khiến bạn không hài lòng!!!:");
				  String Nhap = SC.nextLine();
				  kh.luuFeedbackVaoTepTin(Nhap);
				  return;
			  }
			  else if(loai == 2) {
				  System.out.println("Xin lỗi khách hàng!!! Tên hoặc miêu tả người bạn thấy không hài lòng!!!:");
				  String Nhap = SC.nextLine();
				  kh.luuFeedbackVaoTepTin(Nhap);
				  return;
			  }
			  else {
				  
				  do{
					  System.out.print("Xin lỗi khách hàng!!! Nhập điều bạn cần hỏi:");
					  String Nhap = SC.nextLine();
					  if("Không".equals(Nhap)) {
						  System.out.println("Cảm ơn đã dùng!!!");
						  break;
					  }
					  kh.luuFeedbackVaoTepTin(Nhap);
					  String traloicauhoi = nv.traLoiCauHoi();
					  System.out.println(traloicauhoi);
					  nv.luuTraLoiVaoTepTin(kh,traloicauhoi);
				  }while (true);
			  }
		  }


		  public void datBan(QuanLyKhachHang ql) throws ParseException {
			    System.out.println("Chọn cách Đặt bàn:");
			    System.out.println("1. Đặt bàn theo Mã khách hàng");
			    System.out.println("2. Đặt bàn theo Tên khách hàng");
			    System.out.print("Nhập lựa chọn: ");
			    int luaChon = SC.nextInt();
			    if (luaChon != 1 && luaChon != 2) {
			        System.out.println("Lựa chọn không hợp lệ.");
			        return;
			    }
			    
			    KhachHang khachHangDatBan = null;
			    switch (luaChon) {
			        case 1:
			            System.out.print("Nhập mã khách hàng đặt bàn: ");
			            int maKhachHangDatBan = SC.nextByte();
			            khachHangDatBan = ql.layKhachHangTheoMa(maKhachHangDatBan);
			            break;
			        case 2:
			        	SC.nextLine();
			            System.out.print("Nhập tên khách hàng đặt bàn: ");
			            String tenKhachHangDatBan = SC.nextLine();
			            khachHangDatBan = ql.layKhachHangTheoTen(tenKhachHangDatBan);
			            break;
			        default:
			            System.out.println("Lựa chọn không hợp lệ.");
			            return;
			    }
			    if (khachHangDatBan == null) {
			        System.out.println("Không tìm thấy khách hàng.");
			        return;
			    }
			    SC.nextLine();
			    System.out.print("Nhập thông tin đặt bàn: ");
			    String thongTinDatBan = SC.nextLine();
			    danhSachDatBan.put(khachHangDatBan.getMaKH(), thongTinDatBan);
			    System.out.println("Đặt bàn thành công!");
			}

			//Hiển thị đặt bàn
			public void hienThiDatBan(QuanLyKhachHang ql) {
				System.out.println("Danh sách đặt bàn:");
				for (Map.Entry<Integer, String> entry : danhSachDatBan.entrySet()) {
					int maKhachHang = entry.getKey();
					String thongTinDatBan = entry.getValue();

					KhachHang khachHang = ql.layKhachHangTheoMa(maKhachHang);
					if (khachHang != null) {
						System.out.println("Mã KH: " + maKhachHang + ", Tên KH: " + khachHang.getHoTen() + ", Thông tin đặt bàn: " + thongTinDatBan);
					} else {
						System.out.println("Không tìm thấy thông tin khách hàng cho Mã KH: " + maKhachHang);
					}
				}
			}

			//Tạo giảm giá cho khách hàng
			public void tinhToanGiamGia(QuanLyKhachHang ql) {
				System.out.println("Chọn cách Tạo giảm giá:");
				System.out.println("1. Tạo giảm giá theo Mã khách hàng");
				System.out.println("2. Tạo giảm giá theo Tên khách hàng");
				System.out.print("Nhập lựa chọn: ");
				int luaChon = Integer.parseInt(SC.nextLine());
				KhachHang khachHangGiamGia = null;
				switch (luaChon) {
				case 1:
					System.out.print("Nhập mã khách hàng giảm giá: ");
					int maKhachHangGiamGia = Integer.parseInt(SC.nextLine());
					khachHangGiamGia = ql.layKhachHangTheoMa(maKhachHangGiamGia);
					break;
				case 2:
					System.out.print("Nhập tên khách hàng giảm giá: ");
					String tenKhachHangGiamGia = SC.nextLine();
					khachHangGiamGia = ql.layKhachHangTheoTen(tenKhachHangGiamGia);
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ.");
					return;
				}

				if (khachHangGiamGia != null) {
			        khachHangGiamGia.hienThi();

			        if (khachHangGiamGia.isThanhVien()) {
			            khachHangGiamGia.taoGiamGia();
			            System.out.println("Đã tạo giảm giá cho khách hàng.");
			        } else {
			            System.out.println("Khách hàng không phải là thành viên. Không thể tích điểm.");
			        }
			    } else {
			        System.out.println("Không tìm thấy khách hàng.");
			    }
			}

			//Tích điểm cho khách hàng
			public void tinhToanTichDiem(QuanLyKhachHang ql) throws IOException {
			    System.out.println("Chọn cách Tích điểm:");
			    System.out.println("1. Tích điểm theo Mã khách hàng");
			    System.out.println("2. Tích điểm theo Tên khách hàng");
			    System.out.print("Nhập lựa chọn: ");
			    int luaChon = Integer.parseInt(SC.nextLine());
			    KhachHang khachHangTichDiem = null;
			    switch (luaChon) {
			        case 1:
			            System.out.print("Nhập mã khách hàng tích điểm: ");
			            int maKhachHangTichDiem = Integer.parseInt(SC.nextLine());
			            khachHangTichDiem = ql.layKhachHangTheoMa(maKhachHangTichDiem);
			            break;
			        case 2:
			            System.out.print("Nhập tên khách hàng tích điểm: ");
			            String tenKhachHangTichDiem = SC.nextLine();
			            khachHangTichDiem = ql.layKhachHangTheoTen(tenKhachHangTichDiem);
			            break;
			        default:
			            System.out.println("Lựa chọn không hợp lệ.");
			            return;
			    }
			    if (khachHangTichDiem != null) {
			    	khachHangTichDiem.hienThi();
			        if (khachHangTichDiem.isThanhVien()) {
			            khachHangTichDiem.tichDiem();
			            System.out.println("Điểm tích lũy của khách hàng đã được cập nhật.");
			        } else {
			            System.out.println("Khách hàng không phải là thành viên. Không thể tích điểm.");
			        }
			    } else {
			        System.out.println("Không tìm thấy khách hàng.");
			    }
			}
			
	

	

	

}
