package BT_JAVABASIC_3;

public class OnTapToanTu {
    public static int number = 100; //tạo biến static number = 100

    //Kiểm tra điều kiện <,>,=
    public void kiemTra(int n) {
        if (n == number) {
            System.out.println("Giá trị truyền vào bằng " + number);
        } else if (n < number) {
            System.out.println("Giá trị truyền vào nhỏ hơn " + number);
        } else {
            System.out.println("Gía trị truyền vào lớn hơn " + number);
        }
    }

    public static void main(String[] args) {
        //gọi hàm kiểm tra điều kiện >,<,= number
        OnTapToanTu ottt = new OnTapToanTu();
        ottt.kiemTra(100);

        // Tạo 3 biến bất kỳ
        int a = 10;
        int b= 20;
        double c = 10.9;
        //Thực hiện các loại toán tử trên các biến a,b,c: &&, ||, >, <, ==
        System.out.println("Kết quả");
        System.out.println("a nhỏ hơn b: " +  (a < b));
        System.out.println("a lớn hơn c: " + (a > c));
        System.out.println("b bằng c: " + (b == c));
        System.out.println("c nhỏ hơn b và lớn hơn a: " + ((c < b) && (c > a)));
        System.out.println("c khác b hoặc c bằng a: " + (c != b || (c == a)));
    }
}
