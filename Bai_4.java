import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int number = sc.nextInt();
        int[] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập giá trị thứ [" +i+ "]: ");
            arrNumber[i] = sc.nextInt();
        }
        System.out.println("\nGía trị lớn nhất trong mảng là: ");
        for (int i = 0; i < arrNumber.length; i++) {
            int max = arrNumber[0];
            if (max < arrNumber[i]){
                max = arrNumber[i];
                System.out.printf("%d\t", max);
            }
        }
        System.out.println("\nGía trị nhỏ nhất trong mảng là: ");
        for (int i = 0; i < arrNumber.length; i++) {
            int min = arrNumber[0];
            if (min >arrNumber[i]){
                min = arrNumber[i];
                System.out.printf("%d\t", min);
            }
        }
    }
}
