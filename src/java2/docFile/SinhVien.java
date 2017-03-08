/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.docFile;

import java.io.Serializable;

/**
 *
 * @author Thinh Nguyen
 */
public class SinhVien implements Serializable{
    private String masv;
    private String ten;
    private int sotien;
    private String ngaydongtien;

    public SinhVien() {
    }

    public SinhVien(String masv, String ten, int sotien, String ngaydongtien) {
        this.masv = masv;
        this.ten = ten;
        this.sotien = sotien;
        this.ngaydongtien = ngaydongtien;
    }
    
    

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public String getNgaydongtien() {
        return ngaydongtien;
    }

    public void setNgaydongtien(String ngaydongtien) {
        this.ngaydongtien = ngaydongtien;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-20s %-10s %-16s \n", masv, ten, sotien, ngaydongtien);
    }
}
