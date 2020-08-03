package com.company;

import java.util.Comparator;
import java.util.List;

public class SortStudentByName {

    public List<Student> sortStudentByName(List<Student> lstStudent) {
        lstStudent.sort(Comparator.comparing(e -> e.getName()));
        return lstStudent;
    }

}
