import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int number = sc.nextInt();
        int[] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập giá trị thứ [" +i+ "]: ");
            arrNumber[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi nhập: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("%d\t", arrNumber[i]);
        }
        System.out.println("\nNhập chỉ số cần xóa: ");
        int deleteIndex = sc.nextInt();
        int[] newArrNumber = new int[number-1];
        for (int i = 0, j=0; i < arrNumber.length; i++) {
            if ( i != deleteIndex){
                newArrNumber[j] = arrNumber[i];
                j++;
            }
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < newArrNumber.length; i++) {
            System.out.printf("%d\t", newArrNumber[i]);
        }
    }
}
