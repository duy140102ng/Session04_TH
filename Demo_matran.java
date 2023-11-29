import java.util.Scanner;

public class Demo_matran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khai báo mảng 2 chiều số nguyên gồm 3 dòng và 4 cột
        int [][] number = new int[3][4];
        //Nhập giá trị các phần tử của mảng 2 chiều
        //duyệt theo chỉ số dòng
        for (int i = 0; i < 3; i++) {
            // duyệt theo chỉ số cột
            for (int j = 0; j < 4; j++) {
                System.out.printf("Number [%d][%d] = ", i, j);
                number[i][j] = sc.nextInt();
            }
        }
        //in mảng 2 chiều theo ma trận
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", number[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
