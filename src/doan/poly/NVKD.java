package doan.poly;

import java.util.Scanner;

//Kế thừa lớp cha
public class NVKD extends NhanVien {

    Scanner sc = new Scanner(System.in);
//    public công khai
    public double luongKD;
    
    
//        gọi phương thức khởi tạo
    public NVKD() {
    }

    ;
    public NVKD(String maNV, String tenNV, double luongCB, double luongKD) {
        super(maNV, tenNV, luongCB);
        this.luongKD = luongKD;
    }

//    Ghi đè phương thức nhập nhân viên, kế thừa từ lớp cha
    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.print("\t > Lương Kinh Doanh: ");
        luongKD = sc.nextDouble();
    }

//       Ghi đè phương thức tính lương của NVKD
    @Override
    public double tinhLuong(){
        return luongCB+luongKD;
    }
    
    @Override
    public void xuatNV(){
        System.out.printf("%-5s %-25s %-10.1f %-10s %-10.1f %-10.1f\n",maNV,tenNV,luongCB,"-",luongKD,tinhLuong());
    }
}


