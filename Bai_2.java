import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();
        float[] arrNumber = new float[n];
        float tbc = 0;
        float sum = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập phần tử thứ [" +i+ "] là: ");
            arrNumber[i] = sc.nextFloat();
            sum += arrNumber[i];
            tbc = sum / n;
        }
        System.out.println("Gía trị trung binh cộng của các phần tử trong mảng là: " +tbc);
    }
}
