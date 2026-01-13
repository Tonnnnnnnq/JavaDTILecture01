package th.ac.sau;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //ประกาศตัวแปร
        String fullname;
        int age;
        double gpa;

        //สร้างตัวแทนของ Scanner เพื่อใช้ในการรับค่า
        Scanner wow = new Scanner(System.in);

        showSenpa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullname = wow.next(); // รับข้อความ
        System.out.println("ป้อนอายุ : ");
        age = wow.nextInt(); // รับเลขจำนวนเต็ม  int
        System.out.println("ป้อน GPA : ");
        gpa = wow.nextDouble(); // รับเลขทศนิยมแบบละเอียด
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
