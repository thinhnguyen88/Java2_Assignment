/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.docFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Thinh Nguyen
 */
public class Controller {

    public static List<SinhVienTotal> tongtien(List<SinhVien> listsv) {
        List<SinhVienTotal> totalList = new ArrayList<>();
        List<String> listUniqueMaSv = new ArrayList<>();
        for (SinhVien sinhVien : listsv) {
            if (!listUniqueMaSv.contains(sinhVien.getMasv())) {
                listUniqueMaSv.add(sinhVien.getMasv());
            }
        }
        for (String string : listUniqueMaSv) {
            int sum = 0;
            String name = null;
            for (SinhVien sinhVien : listsv) {
                if (sinhVien.getMasv().equals(string)) {
                    sum += sinhVien.getSotien();
                    name = sinhVien.getTen();
                }
            }
            SinhVienTotal sv = new SinhVienTotal(string, name, sum);
            totalList.add(sv);
        }
        return totalList;
    }
}
