package doan.poly;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    //chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy nv = new QuanLy();
        int chon;
        do {
            System.out.println("------ Quản lý nhân viên ------");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("7. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("8. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("9. Thoát chương trình");
            System.out.println("--------------------------------");
            System.out.print("Mời chọn chức năng [1-9]: ");

            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nv.nhapDSNV();
                    break;
                case 2:
                    nv.xuatDSNV();
                    break;
                case 3:
                    nv.timNV();
                    break;
                case 4:
                    nv.xoaNV();
                    break;
                case 5:
                    nv.capnhatNV();
                    break;
                case 6:
                    nv.sapxepTen();
                    break;
                case 7:
                    nv.sapxepLuong();
                    break;
                case 8:
                    nv.danhsachtop5();
                    break;
                case 9:
                    System.out.println(">>>> Bạn đã chọn thoát !");
                    break;
                default:
                    System.out.println(">>> Nhập sai chương trình, mời nhập lại !");
            }
        } while (chon != 9);
    }
}


