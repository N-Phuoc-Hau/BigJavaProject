//package main;
//import java.io.IOException;
//import java.util.Scanner;
//public class GiaoDienQuanLy() {
//
//    public static void main(String[] args) throws IOException {
//    	Scanner sc = new Scanner(System.in);
//        // Xóa màn hình
//        System.out.print("\033[2J");
//
//        // Hiển thị tiêu đề
//        System.out.println("Giao diện đăng nhập");
//
//        // Hiển thị yêu cầu nhập tên đăng nhập
//        System.out.print("Tên đăng nhập: ");
//        String username = sc.nextLine();
//
//        // Hiển thị yêu cầu nhập mật khẩu
//        System.out.print("Mật khẩu: ");
//        String password = sc.nextLine();
//
//        // Kiểm tra thông tin đăng nhập
//        if ("admin".equals(username) && "123456".equals(password)) {
//            // Thông tin đăng nhập đúng
//            System.out.println("Đăng nhập thành công");
//        } else {
//            // Thông tin đăng nhập sai
//            System.out.println("Đăng nhập thất bại");
//        }
//    }
//}
