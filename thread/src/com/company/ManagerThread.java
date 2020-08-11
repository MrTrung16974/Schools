package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ManagerThread {
    public static final SimpleDateFormat DATE_FORMAT_HMS = new SimpleDateFormat("yyyyMMddHHmmssFF");
    private static String nameFile = DATE_FORMAT_HMS.format(new Date());
    private static String FILE_URL = "E:\\LUCAS\\Schools\\OutPutFile\\"+ nameFile +".txt";
    private static String ho = DATE_FORMAT_HMS.format(new Date());
    private static String FILE_URL_Ho = "";

    public List<String> readFile() {
        List<String> lstFileName = new ArrayList<>();
        File file = null;
        boolean isCreat = false;
        try {
            file = new File(FILE_URL);
            isCreat = file.createNewFile();
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lstFileName.add(line);
            }
            System.out.println(lstFileName);
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        return lstFileName;
    }

    public void inputFileFullName(List<String> fullName) throws IOException {
        FileWriter file = null;
        try{
            file = new FileWriter(FILE_URL);
            int size = fullName.size();
            for (int i=0;i<size;i++) {
                String str = fullName.get(i).toString();
                file.write(str);
                file.write("\n");
            }
            System.out.print("Da ghi thanh cong!");

        }
        catch (Exception e){
            System.out.print(e);// In lỗi ra màn hình
        }
        finally {
            file.close();//Nếu chương trình lỗi thì đóng file lại
        }
    }

    public void inputFileHo(List<String> fullHo, String fileUrl) throws IOException {
        FileWriter file = null;
        try{
            file = new FileWriter(fileUrl);
            int size = fullHo.size();
            for (int i=0;i<size;i++) {
                String str = fullHo.get(i).toString();
                file.write(str);
                file.write("\n");
            }
            System.out.print("Da ghi thanh cong!");

        }
        catch (Exception e){
            System.out.print(e);// In lỗi ra màn hình
        }
        finally {
            file.close();//Nếu chương trình lỗi thì đóng file lại
        }
    }

}
