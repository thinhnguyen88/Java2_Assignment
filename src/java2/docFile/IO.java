/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.docFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thinh Nguyen
 */
public class IO {


    public static void writeToFile(String filename, List<SinhVien> listsv) {
        OutputStreamWriter osw;
        try {
            osw = new OutputStreamWriter(new FileOutputStream(new File(filename)), Charset.forName("UTF8"));
            for (SinhVien sinhVien : listsv) {
                osw.write(sinhVien.toString());
            }
            osw.flush();
            osw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeTotal(String filename, List<SinhVienTotal> listsv) {
        OutputStreamWriter osw;
        try {
            osw = new OutputStreamWriter(new FileOutputStream(new File(filename)), Charset.forName("UTF8"));
            for (SinhVienTotal sinhVien : listsv) {
                osw.write(sinhVien.toString());
            }
            osw.flush();
            osw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<SinhVien> readFile(String filename) {
        List<SinhVien> listsv = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line = br.readLine();
                
                while (line != null) {
                    SinhVien objsv = stringToObject(line);
                    listsv.add(objsv);
                    line = br.readLine();
                }
            }
        } catch (IOException e) {
        }
        return listsv;
    }
    
    public static SinhVien stringToObject(String str) {
        String[] splStrings = str.split("\\s+\\s+");
        SinhVien objsv = new SinhVien(splStrings[0], splStrings[1], Integer.parseInt(splStrings[2]), splStrings[3]);
        return objsv;
    } 
}
