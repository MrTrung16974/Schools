package com.company;

import java.util.List;

public class SortStudentByGPA {

    public List<Student> sortStudentByGPA(List<Student> lstStudent) {
        Integer length = lstStudent.size();
        for (int i = 0; i < length; i++){
            for (int j = i; j<length; j++) {
                if(lstStudent.get(i).getGpa() > lstStudent.get(j).getGpa()) {
                    Object temp = lstStudent.get(i);
                    lstStudent.set(i, lstStudent.get(j));
                    lstStudent.set(j, (Student) temp);
                }
            }
        }
        return lstStudent;
    }
}
