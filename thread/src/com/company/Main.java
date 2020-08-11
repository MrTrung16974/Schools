package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ThreadFilter threadFilterOne = new ThreadFilter();
        ThreadFilter threadFilterTwo = new ThreadFilter();
        threadFilterOne.start();
        threadFilterTwo.start();
        ManagerThread managerThread = new ManagerThread();
//        managerThread.readFile();
        System.out.println("end");

        TheadCreator theadCreatorOne = new TheadCreator();
        TheadCreator theadCreatorTwo = new TheadCreator();
        TheadCreator theadCreatorThree = new TheadCreator();
        TheadCreator theadCreatorFour = new TheadCreator();
        TheadCreator theadCreatorFive = new TheadCreator();
        TheadCreator theadReadSix = new TheadCreator();
        TheadCreator theadCreatorSeven = new TheadCreator();
        TheadCreator theadCreatorEight = new TheadCreator();
        TheadCreator theadCreatorNine = new TheadCreator();
        TheadCreator theadCreatorTen = new TheadCreator();
        theadCreatorOne.start();
        theadCreatorTwo.start();
        theadCreatorThree.start();
        theadCreatorFour.start();
        theadCreatorFive.start();
        theadReadSix.start();
        theadCreatorSeven.start();
        theadCreatorEight.start();
        theadCreatorNine.start();
        theadCreatorTen.start();


    }
}
