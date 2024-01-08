package BT_JAVABASIC_2;

public class Calculator {
    //Hàm tính tổng 2 số nguyên
    public static int tinhTong (int a, int b) {
        return a + b;
    }
    //Hàm tính tích 2 số thực
    public static double tinhTich (double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        // Gọi hàm tính tổng và in kết quả
        System.out.println("Tổng là: " + tinhTong(10,30));
        //Gọi hàm tinh tích và in kết quả
        System.out.println("Tích là: " +  tinhTich(5.5,9));
    }
}
