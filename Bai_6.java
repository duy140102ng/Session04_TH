import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int number = sc.nextInt();
        int[] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập giá trị thứ [" +i+ "]: ");
            arrNumber[i] = sc.nextInt();
        }
        System.out.println("Nhập vào một giá trị: ");
        int findNumber = sc.nextInt();
        int sum =0;
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Chỉ số các phần tử " +arrNumber[i] + " là: " +i);
            if (arrNumber[i] == findNumber){
                sum += arrNumber[i];
            }
        }
        System.out.println("Tổng các phần tử có giá trị bằng " +findNumber+" là:" +sum);
    }
}
