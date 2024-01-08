package BT_JAVABASIC_5;

import java.util.ArrayList;
import java.util.List;

public class NhanVien {
    String name;
    int age;
    double salary;

    public NhanVien(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Khởi tạo ArrayList để lưu trữ thông tin nhân viên
        List<NhanVien> nvList = new ArrayList<NhanVien>();

        // Thêm thông tin cơ bản của các nhân viên
        nvList.add(new NhanVien("Đinh Thị C", 21, 10000000.0));
        nvList.add(new NhanVien("Nguyễn Văn A", 25, 4500000.0));
        nvList.add(new NhanVien("Hà Văn B", 35, 6000000.0));

        // In ra thông tin nhân viên sử dụng vòng lặp for
        System.out.println("Thông tin nhân viên:");
        for (NhanVien nv : nvList) {
            System.out.println("Tên: " + nv.name + ", Tuổi " + nv.age + ", Lương (VND) " + nv.salary);
        }
    }
}
