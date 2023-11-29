import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int number = sc.nextInt();
        int[] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập giá trị thứ [" + i + "]: ");
            arrNumber[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi nhập: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("%d\t", arrNumber[i]);
        }
        System.out.println("\nNhập giá trị cập nhật: ");
        int updateValue = sc.nextInt();
        System.out.println("Nhập chỉ số cần cập nhật: ");
        int updateIndex = sc.nextInt();
        for (int i = 0; i < arrNumber.length; i++) {
            if ( i == updateIndex){
                arrNumber[i] = updateValue;
            }
        }
        System.out.println("Mảng sau khi update: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("%d\t", arrNumber[i]);
        }
    }
}
