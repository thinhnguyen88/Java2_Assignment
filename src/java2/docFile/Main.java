/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.docFile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thinh Nguyen
 */
public class Main {
    public static List<SinhVien> taoList() {
        List<SinhVien> listSv = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien("A001", "Nguyen Van A", 500000, "22/12/2016");
        SinhVien sv2 = new SinhVien("A002", "Tran Thi B", 200000, "20/10/2016");
        SinhVien sv3 = new SinhVien("A003", "Nguyen Thi C", 350000, "19/12/2016");
        SinhVien sv4 = new SinhVien("A001", "Nguyen Van A", 700000, "30/12/2016");
        SinhVien sv5 = new SinhVien("A004", "Tran Ngoc D", 200000, "18/12/2016");
        SinhVien sv6 = new SinhVien("A005", "Phan Van E", 200000, "19/12/2016");
        SinhVien sv7 = new SinhVien("A002", "Tran Thi B", 150000, "01/01/2017");
        SinhVien sv8 = new SinhVien("A001", "Nguyen Van A", 300000, "03/01/2017");
        SinhVien sv9 = new SinhVien("A004", "Tran Ngoc D", 200000, "04/01/2017");
        SinhVien sv10 = new SinhVien("A003", "Nguyen Thi C", 300000, "07/01/2017");
        listSv.add(sv1);
        listSv.add(sv2);
        listSv.add(sv3);
        listSv.add(sv4);
        listSv.add(sv5);
        listSv.add(sv6);
        listSv.add(sv7);
        listSv.add(sv8);
        listSv.add(sv9);
        listSv.add(sv10);
        return listSv;
    }
    public static void main(String[] args) {
//1- tao list sinh vien theo yeu cau de bai, ghi ra file quylop.txt
        List<SinhVien> listSv = taoList();
        IO.writeToFile("quylop.txt", listSv);

//2- doc file txt tra ve 1 list cac doi tuong SV , in ra theo template
        List<SinhVien> listsv1 = IO.readFile("quylop.txt");
        System.out.println("MaSv  Ten Sinh Vien        So tien    Ngay dong");
        System.out.println("-----------------------------------------------");
        listsv1.forEach((sinhVien) -> {
            System.out.print(sinhVien);
        });

//3- tinh tong so tien cac sv da dong
        List<SinhVienTotal> totalList = Controller.tongtien(listsv1);
        System.out.println("MaSv  Ten Sinh Vien        Tong so tien");
        System.out.println("---------------------------------------");
        totalList.forEach((sinhVienTotal) -> {
            System.out.print(sinhVienTotal);
        });
        
// ghi doi tuong lay duoc o cau 3 ra file quylop2.txt
        IO.writeTotal("quylop2.txt", totalList);
    }
}
