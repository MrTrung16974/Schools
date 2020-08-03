package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Float gpa;

    public Student() {

    }

    public Student(Integer id, String name, Integer age, String address, Float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public void inputStudent() {
        List<Student> students = new ArrayList<>();
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID sinh viên : ");
        id = manager.inputNumber();
        System.out.println("Mời bạn nhập tên tên sinh viên : ");
        name = scanner.nextLine();
        System.out.println("Mới bạn nhập tuổi sinh viên : ");
        age = manager.inputNumber();
        System.out.println("Mới bạn nhập địa chỉ sinh viên  : ");
        address = scanner.nextLine();
        System.out.println("Mới bạn nhập điển GPA  : ");
        gpa = manager.inputNumberFloat();
        System.out.println("***********************");
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
