package doan.poly;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {

    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> dsNV = new ArrayList<>();

    
//  Chức năng số 1
    public void nhapDSNV() {
        System.out.print("Chọn loại nhân viên[1.NVHC - 2.NVKD]: ");
        int loaiNV = sc.nextInt();
        switch (loaiNV) {
            case 1:
                NVHC hc = new NVHC();
                hc.nhapNV();
                dsNV.add(hc);
                break;
            case 2:
                NVKD kd = new NVKD();
                kd.nhapNV();
                dsNV.add(kd);
                break;
            default:
                System.out.println("Chọn sai loại nhân viên");
        }
    }

//    Chức năng số 2
    public void xuatDSNV() {
        System.out.println("---------------------------DANH SÁCH NHÂN VIÊN---------------------------");
        System.out.printf("%-5s %-25s %-10s %-10s %-10s %-10s\n", "Mã NV", "Tên NV", "Lương CB", "Ngày Công", "Lương KD", "Lương TL");
        for (NhanVien nv : dsNV) {
            nv.xuatNV();
        };
    }

    
//    Chức năng số 3
    public void timNV(){
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String maNV = new Scanner(System.in).nextLine();
        Boolean check = false;
        for(NhanVien nv: dsNV){
            if(maNV.equalsIgnoreCase(nv.maNV)){
                System.out.printf("%-5s %-25s %-10s %-10s %-10s %-10s\n", "Mã NV", "Tên NV", "Lương CB", "Ngày Công", "Lương KD", "Lương TL");
                nv.xuatNV();
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Nhân viên vừa nhập không tồn tại !");
        }
    }
    
//    Chức năng số 4
    public void xoaNV(){
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String maNV = new Scanner(System.in).nextLine();
        Boolean check = false;
        for(NhanVien nv: dsNV){
            if(maNV.equalsIgnoreCase(nv.maNV)){
                System.out.printf("%-5s %-25s %-10s %-10s %-10s %-10s\n", "Mã NV", "Tên NV", "Lương CB", "Ngày Công", "Lương KD", "Lương TL");
                nv.xuatNV();
                dsNV.remove(nv);
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Nhân viên vừa nhập không tồn tại !");
        }else {
            System.out.println("Nhân viên này đã bị xóa !");
        }
    }
    
//    Chức năng số 5
        public void capnhatNV(){
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        String maNV = new Scanner(System.in).nextLine();
        NhanVien nvloi = null;
        int index = 0;
        for(NhanVien nv: dsNV){
            if(maNV.equalsIgnoreCase(nv.maNV)){
                nvloi = nv;
                index = dsNV.indexOf(nv);
//                không có trường hợp trùng id
                break;
            }
        }
        if(nvloi != null){
        System.out.print("Chọn loại nhân viên[1.NVHC - 2.NVKD]: ");
        int loaiNV = sc.nextInt();
        switch (loaiNV) {
            case 1:
                NVHC hc = new NVHC();
                hc.nhapNV();
                dsNV.set(index,hc);
                System.out.println("Nhân viên vừa nhập thành công !");
                break;
            case 2:
                NVKD kd = new NVKD();
                kd.nhapNV();
                dsNV.set(index,kd);
                System.out.println("Nhân viên vừa nhập thành công !");
                break;
            default:
                System.out.println("Chọn sai loại nhân viên");
            
        }
        }else {
            System.out.println("Nhân viên này không tồn tại !");
        }
    }
        
        
//        Chức năng số 6
        
        public void sapxepTen(){
//            Xây dựng tiêu chí xắp xếp theo họ tên
            Comparator<NhanVien> cmp = new Comparator<NhanVien>(){
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return o1.tenNV.compareTo(o2.tenNV);  
                }   
            };
            Collections.sort(dsNV, cmp);
            xuatDSNV();
        }
        
//        Chức năng số 7
        
        public void sapxepLuong(){
//            Xây dựng tiêu chí xắp xếp theo Lương
            Comparator<NhanVien> comp = new Comparator<NhanVien>(){
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
//              Sử dụng if else vì trường hợp lương bằng nhau thì k thay đổi vị trí
                if (o1.tinhLuong() > o2.tinhLuong()){
                    return 1;
                }else {
                    return -1;
                }
                }   
            };
            Collections.sort(dsNV, comp);
            xuatDSNV();
        }
        
        
//        Chương trình số 8
        public void danhsachtop5(){
//            a,b là tham số sau mũi tên là phần thực thi body
//            Phương thức này phải dùng int
            Collections.sort(dsNV,(a,b) ->(int) (b.tinhLuong()-a.tinhLuong()) ); 
            
           
//            Xuất 5 người đầu danh sách ra  
            System.out.printf("%-5s %-25s %-10s %-10s %-10s %-10s\n", "Mã NV", "Tên NV", "Lương CB", "Ngày Công", "Lương KD", "Lương TL");
            for (int i = 0; i < 5; i++){
                dsNV.get(i).xuatNV();
            }
        }
}

