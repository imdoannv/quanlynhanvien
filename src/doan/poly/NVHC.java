package doan.poly;

import java.util.Scanner;

//Kế thừa lớp cha
public class NVHC extends NhanVien {

    Scanner sc = new Scanner(System.in);
//    public công khai
    public int ngayCong;

//        gọi phương thức khởi tạo
    public NVHC(){};
    public NVHC(String maNV, String tenNV, double luongCB, int ngayCong) {
        super(maNV, tenNV, luongCB);
        this.ngayCong = ngayCong;
    }

    
//    Ghi đè phương thức nhập nhân viên, kế thừa từ lớp cha
    @Override
    public void nhapNV(){
        super.nhapNV();
        System.out.print("\t > Ngày công: ");
        ngayCong = sc.nextInt();
    }
    
    
//   Ghi đè phương thức tính lương của NVHC
    @Override
    public double tinhLuong(){
        return luongCB*ngayCong;
    }
    
    @Override
    public void xuatNV(){
//        "-" để hiển thị rỗng
//        Khoảng cách -5 là 5 ô trắng , âm là căn lề bên trái, và sử dụng printf
        System.out.printf("%-5s %-25s %-10.1f %-10d %-10s %-10.1f\n",maNV,tenNV,luongCB,ngayCong,"-",tinhLuong());
    }
}

