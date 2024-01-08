package BT_JAVABASIC_4;

public class Loop_Array {
    public static void main(String[] args) {
        // Tạo mảng arr1 lưu số từ 0 đến 50
        int arr[] = new int[50];

        // Dùng mảng arr để lưu trữ số chẵn
        System.out.println("Các số chẵn từ 0 đến 50 là: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
