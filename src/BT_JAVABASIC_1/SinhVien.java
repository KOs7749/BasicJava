package BT_JAVABASIC_1;

public class SinhVien {
    public static String nganh = "Công nghệ thông tin"; // Biến static

    public String tenSinhVien; // Biến instance

    public int getTuoi() {
        int tuoi = 21; // Biến local
        return tuoi;
    }

    public static void main(String[] args) {
        // Tạo một đối tượng SinhVien
        SinhVien sv = new SinhVien();
        sv.tenSinhVien = "Đinh Thị Thế"; // Gán giá trị cho biến instance

        System.out.println("Tên sinh viên: " + sv.tenSinhVien); // In giá trị của biến instance
        System.out.println("Ngành của sinh viên là: " + nganh);  // In biến static

        // Gọi phương thức để lấy giá trị của biến local và in ra từ main
        int tuoiSinhVien = sv.getTuoi();
        System.out.println("Tuổi của sinh viên là: " + tuoiSinhVien);

        System.out.println("Số lượng sinh viên là: " + ThongTin.soLuongSinhVien); // In biến static từ class Thông tin
    }
}
