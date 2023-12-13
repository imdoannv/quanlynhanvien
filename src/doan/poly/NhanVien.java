package doan.poly;

import java.util.Scanner;

//Bắt buộc phảo cho phương thức trừu tượng abstract
abstract public class NhanVien {
    Scanner sc = new Scanner(System.in);
    public String maNV, tenNV;
//    sử dụng đc tất cả nếu dùng kế thừa protected
    protected double luongCB;
    
//    khởi tạo có tham số và không có tham số

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
    }
    
    
//    một phương thức nhập dữ liệu
    public void nhapNV(){
        System.out.println("Nhập thông tin nhân viên");
        System.out.print("\t > Mã NV: ");
        maNV = new Scanner(System.in).nextLine();
        System.out.print("\t > Tên nhân viên: ");
        tenNV = new Scanner(System.in).nextLine();
        System.out.print("\t > Lương CB: ");
        luongCB = sc.nextDouble();
    }
    
//    Phương thức thức tính lương cho nhân viên
    abstract public double tinhLuong();
       
//    Xuất dữ liệu
    abstract public void xuatNV();
}

