import java.util.Scanner;

public class Demo_manghaichieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột: ");
        int row = sc.nextInt();
        System.out.println("Nhập số dòng: ");
        int col = sc.nextInt();
        int[][] arrNumber = new int[row][col];
        int choice = 0;
        int sum;
        do {
            System.out.println("**MENU**\n" +
                    "1. Nhập giá trị các phần tử mảng\n" +
                    "2. In giá trị các phần tử mảng theo ma trận\n" +
                    "3. In giá trị các phần tử trên đường biên và tính tổng\n" +
                    "4. In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng\n" +
                    "5. Tìm giá trị lớn nhất và nhỏ nhất trong mảng\n" +
                    "6. Sắp xếp mảng giảm dần theo cột\n" +
                    "7. Thống kê các phần tử có giá trị lẻ chia hết cho 3\n" +
                    "8. Thoát");
            System.out.println("Nhập lựa chon của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Nhập các giá trị mảng: ", j);
                            arrNumber[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mảng là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%d\t\t", arrNumber[i][j]);
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Các phần tử trên đường biên là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.printf("%d\t\t", arrNumber[i][j]);
                            }
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    sum = 0;
                    if (row == col){
                        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j) {
                                    System.out.printf("%d\t", arrNumber[i][j]);
                                    sum += arrNumber[i][j];
                                }
                            }
                        }
                        System.out.println("\nTổng các phần tử nằm trên đường chéo chính là: " + sum);
                        System.out.println("Các phần tử nằm trên đường chéo phụ là: ");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i + j == row - 1) {
                                    System.out.printf("%d\t", arrNumber[i][j]);
                                    sum += arrNumber[i][j];
                                }
                            }
                        }
                        System.out.println("\nTổng các phần tử nằm trên đường chéo phụ là: " + sum);
                    }else {
                        System.out.println("Không có đường chéo chính và phụ");
                    }
                    break;
                case 5:
                    int max =arrNumber[0][0];
                    System.out.println("Gía trị lớn nhất trong mảng là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (max < arrNumber[i][j]){
                                max = arrNumber[i][j];
                                System.out.printf("%d\t", arrNumber[i][j]);
                            }
                        }
                    }
                    int min =arrNumber[0][0];
                    System.out.println("\nGía trị nhỏ nhất trong mảng là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (min > arrNumber[i][j]){
                                min = arrNumber[i][j];
                                System.out.printf("%d\t", arrNumber[i][j]);
                            }
                        }
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Mời bạn chọn từ 1-8");
            }
        } while (choice != 8);
    }
}
