import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0 ; i< number.length ; i++ ){
            System.out.println("Nhập giá trị thứ [" +i+ "] : ");
            number[i] = sc.nextInt();
        }
        System.out.println("Các giá trị của phần tử trong mảng là: ");
        for ( int i = 0; i < number.length ; i++){
            System.out.printf("%d\t", number[i]);
        }
    }
}
