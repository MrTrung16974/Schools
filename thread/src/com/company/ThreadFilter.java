package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadFilter extends java.lang.Thread {
    public List<String> lstFullName = new ArrayList<>();
    @Override
    public synchronized void run() {
        ManagerThread managerThread = new ManagerThread();
        List<String> lstHo = new ArrayList<>();
        List<String> lstHoDem = new ArrayList<>();
        List<String> lstTen = new ArrayList<>();
        lstHo.add("Nguyễn");
        lstHo.add("Lê");
        lstHo.add("Trần");
        lstHo.add("Đỗ");
        lstHo.add("Ngô");

        lstHoDem.add("Văn");
        lstHoDem.add("Thi");
        lstHoDem.add("Thi Thu");
        lstHoDem.add("Tiến");
        lstHoDem.add("Thanh");

        lstTen.add("Hải");
        lstTen.add("Nam");
        lstTen.add("Hoa");
        lstTen.add("Điệp");
        lstTen.add("Phong");
        Random rd = new Random();
        for (int i = 0; i < 100000; i++) {
            lstFullName.add( String.format("%07d", i) + " "  +lstHo.get(rd.nextInt(5)) + " "
                    + lstHoDem.get(rd.nextInt(5)) + " "
                    + lstTen.get(rd.nextInt(5)));

        }
        try {
            managerThread.inputFileFullName(lstFullName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public List<String> getLstFullName() {
        return lstFullName;
    }

    public void setLstFullName(List<String> lstFullName) {
        this.lstFullName = lstFullName;
    }
}
