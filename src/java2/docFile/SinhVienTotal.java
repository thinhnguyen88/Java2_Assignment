/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.docFile;

/**
 *
 * @author Thinh Nguyen
 */
public class SinhVienTotal {
    private String masv;
    private String ten;
    private int tongsotien;

    public SinhVienTotal() {
    }

    public SinhVienTotal(String masv, String ten, int tongsotien) {
        this.masv = masv;
        this.ten = ten;
        this.tongsotien = tongsotien;
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

    public int getTongsotien() {
        return tongsotien;
    }

    public void setTongsotien(int tongsotien) {
        this.tongsotien = tongsotien;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-20s %-10s \n", masv, ten, tongsotien);
    }
}
