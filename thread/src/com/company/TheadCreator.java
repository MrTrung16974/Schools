package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TheadCreator extends Thread{
    public List<String> lstFullName = new ArrayList<>();

    @Override
    public synchronized void run() {
        List<String> lstNameHoNguyen = new ArrayList<>();
        List<String> lstNameHoLe = new ArrayList<>();
        List<String> lstNameHoTran = new ArrayList<>();
        List<String> lstNameHoDo = new ArrayList<>();
        List<String> lstNameHoNgo = new ArrayList<>();

        ManagerThread managerThread = new ManagerThread();
        lstFullName = managerThread.readFile();
        for (String s: lstFullName) {
            int length = s.length();
            String temp = "";
            String ho = "";
            int indexStartTemp = s.indexOf(' ');
            temp = s.substring(indexStartTemp , -1);

            int indexStart = temp.indexOf(' ');
            ho = temp.substring(0 , indexStart);

            switch (ho) {
                case "Nguyễn":
                    lstNameHoNguyen.add(s);
                    break;
                case "Lê":
                    lstNameHoLe.add(s);
                    break;
                case "Trần":
                    lstNameHoTran.add(s);
                    break;
                case "Đỗ":
                    lstNameHoDo.add(s);
                    break;
                case "Ngô":
                    lstNameHoNgo.add(s);
                    break;
            }
        }
        try {
            managerThread.inputFileHo(lstNameHoLe, "E:\\LUCAS\\Schools\\OutPutFile\\ds_ho_le.txt");
            managerThread.inputFileHo(lstNameHoNguyen, "E:\\LUCAS\\Schools\\OutPutFile\\ds_ho_ngo.txt");
            managerThread.inputFileHo(lstNameHoTran, "E:\\LUCAS\\Schools\\OutPutFile\\ds_ho_tran.txt");
            managerThread.inputFileHo(lstNameHoDo, "E:\\LUCAS\\Schools\\OutPutFile\\ds_ho_do.txt");
            managerThread.inputFileHo(lstNameHoNguyen, "E:\\LUCAS\\Schools\\OutPutFile\\ds_ho_nguyen.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
