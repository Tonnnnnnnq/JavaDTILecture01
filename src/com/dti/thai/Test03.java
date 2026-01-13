package com.dti.thai;

//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //ประกาศตัวแปร
        String fullname;
        int age;
        double gpa;

        //สร้างตัวแทนของคลาส Input... กับ Buffer... เพื่อไปใช้รับค่า
        //(Instance of Class คือ Object คือ ชื่อที่ Dev ตั้งขึ้นมาเอง)
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);


        showSenpa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullname = reader.readLine(); // ค่าที่ป้อนถือเป็น String ทั้งสิ้น
        System.out.println("ป้อนอายุ : ");
        age = Integer.parseInt(reader.readLine());
        System.out.println("ป้อน GPA : ");
        gpa = Double.parseDouble(reader.readLine());


        showSenpa();
        System.out.println("สวัสดี : " + fullname);
        System.out.println("คุณอายุ : " + age + "ปี");
        System.out.println("GPA : " + gpa);
        showSenpa();
    }

    public static void showSenpa() {
        System.out.println("-------------------------------------");

    }
}
