package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager{
    List<Student> lstStudent = new ArrayList<>();

    public Student findSingleStudent(Integer id) {
        Student responseStudent = new Student();
        for (Student s : this.lstStudent) {
            if(s.getId().equals(id)) {
                responseStudent = s;
            }
        }
        return responseStudent;
    }

    //    add studen in list Student
    public List<Student> addStudent(int n) {
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Sinh viên thứ "  + (i+1) + " : ");
            student.inputStudent();
            this.lstStudent.add(student);
        }
        return this.lstStudent;
    }

    public Student inputEditStudent() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên tên sinh viên : ");
        student.setName(scanner.nextLine());
        System.out.println("Mới bạn nhập tuổi sinh viên : ");
        student.setAge(inputNumber());
        System.out.println("Mới bạn nhập địa chỉ sinh viên  : ");
        student.setAddress(scanner.nextLine());
        System.out.println("Mới bạn nhập điển GPA  : ");
        student.setGpa(inputNumberFloat());
        System.out.println("***********************");
        return student;
    }

    public Student editStudent(Integer id) {
        Student student = findSingleStudent(id);
        if(student.getId() != null) {
            this.lstStudent.remove(student);
            Student newStudent = inputEditStudent();
            if(newStudent.getName() != null) {
                student.setName(newStudent.getName());
            }
            if(newStudent.getAddress() != null) {
                student.setAddress(newStudent.getAddress());
            }
            if(newStudent.getAge() != null) {
                student.setAge(newStudent.getAge());
            }
            if(newStudent.getGpa() != null) {
                student.setGpa(newStudent.getGpa());
            }
            this.lstStudent.add(student);
        }else {
            student = null;
        }
        return student;
    }

    public List<Student> deleteStudent(Integer id) {
        Student student = findSingleStudent(id);
        if(student.getId() != null) {
            this.lstStudent.remove(student);
        }else {
            student = null;
        }
        return this.lstStudent;
    }

    //    nhâp number
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try{
                n = scanner.nextInt();
                check = true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập số hãy nhập lại !");
                scanner.nextLine();
            }

        }
        return n;
    }

    public float inputNumberFloat() {
        Scanner scanner = new Scanner(System.in);
        float n = 0;
        boolean check = false;
        while (!check) {
            try{
                n = scanner.nextFloat();
                check = true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập số hãy nhập lại !");
                scanner.nextLine();
            }

        }
        return n;
    }

    //  output list student
    public void printListStudent() {
        for (Student s : this.lstStudent) {
            System.out.println(s.toString());
        }
    }


    public List<Student> getLstStudent() {
        return this.lstStudent;
    }

    public void setLstStudent(List<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }
}
