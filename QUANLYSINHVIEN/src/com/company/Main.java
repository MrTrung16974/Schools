package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        SortStudentByGPA sortByGPA = new SortStudentByGPA();
        SortStudentByName sortByName = new SortStudentByName();
        StudentManager manager = new StudentManager();

        int i = 0, Choice = 0;
        while (i == 0) {
            System.out.println("*********MENU************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Xắp xếp sinh viên theo điểm GPA");
            System.out.println("5. Xắp xếp sinh viên theo tên");
            System.out.println("6. Xem danh sách sinh viên");
            System.out.println("7. Thoát");
            System.out.println("\n***************************");
            System.out.print("Hãy nhập vào điều mong ước của bạn Chúng tôi sẽ thực hiện mong ước đó bởi một bà tiên củ chuối or chuối cả nải nào đó :  ");
            Choice = manager.inputNumber();
            switch(Choice) {
                case 1:
                    System.out.println("Nhập số sinh viên bạn muốn thêm vào : ");
                    int n = manager.inputNumber();
                    System.out.println("Sinh viên Được thêm vào : \n" + manager.addStudent(n));
                    break;
                case 2:
                    if(manager.getLstStudent().isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới sửa được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = manager.inputNumber();
                        System.out.println("Sinh viên được thêm vào : \n" + manager.addStudent(n));
                    }else {
                        System.out.println("Hãy nhập vào id sinh viên mà bạn muốn sửa : ");
                        int id = manager.inputNumber();
                        System.out.println("Sinh viên được sửa là : \n" + manager.editStudent(id));
                    }
                    break;
                case 3:
                    if(manager.getLstStudent().isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xóa được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = manager.inputNumber();
                        System.out.println("Sinh viên  Được thêm vào : \n" + manager.addStudent(n));
                    }else {
                        System.out.println("Hãy nhập vào id sách mà bạn muốn xóa : ");
                        int id = manager.inputNumber();
                        System.out.println("Danh sách sau khi xóa sinh viên mà bạn là : \n" + manager.deleteStudent(id));
                    }
                    break;
                case 4:
                    if(manager.getLstStudent().isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xắp xếp được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = manager.inputNumber();
                        System.out.println("Sinh viên  Được thêm vào : \n" + manager.addStudent(n));
                    }else {
                        System.out.println("Danh sách sách đã được xắp xếp theo điểm GPA là : \n" + sortByGPA.sortStudentByGPA(manager.getLstStudent()));
                    }
                    break;
                case 5:
                    if(manager.getLstStudent().isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xắp xếp được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = manager.inputNumber();
                        System.out.println("Sinh viên  Được thêm vào : \n" + manager.addStudent(n));
                    }else {
                        System.out.println("Danh sách sách đã được xắp xếp theo tên là : \n" + sortByName.sortStudentByName(manager.getLstStudent()));
                    }
                    break;
                case 6:
                    if(manager.getLstStudent().isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xem đươc được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = manager.inputNumber();
                        System.out.println("Sinh viên  Được thêm vào : \n" + manager.addStudent(n));
                    }else {
                        System.out.println("Danh sách sinh viên là : \n" );
                        manager.printListStudent();
                    }
                    break;
                case 7:
                    i = 1;
                    System.out.println("Bạn đã thoát ra ngoài menu");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn là sai lầm rồi điều ước chỉ có 1 thôi! EndGame");
                    break;
            }
        }
    }
}
