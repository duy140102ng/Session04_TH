import java.util.Scanner;

public class Demo_trenLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int number = sc.nextInt();
        int choice = 0;
        int sum;
        int[] arrNumbers = new int[number];
        do {
            System.out.println("**MENU**\n" +
                    "1. Nhập giá trị các phần tử mảng\n" +
                    "2. In giá trị các phần tử mảng\n" +
                    "3. In giá trị các phần tử có giá trị chẵn và tính tổng\n" +
                    "4. In giá trị các phần tử có chỉ số lẻ và tính tổng\n" +
                    "5. In giá trị các phần tử là số nguyên tố\n" +
                    "6. Sắp xếp mảng tăng dần\n" +
                    "7. Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng\n" +
                    "8. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrNumbers.length; i++) {
                        System.out.println("Nhập giá trị thứ [" + i + "] là: ");
                        arrNumbers[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Các giá trị trong mảng là: ");
                    for (int i = 0; i < arrNumbers.length; i++) {
                        System.out.printf("%d\t", arrNumbers[i]);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    sum = 0;
                    System.out.println("Các giá trị chẵn trong mảng là: ");
                    for (int i = 0; i < arrNumbers.length; i++) {
                        if (arrNumbers[i] % 2 == 0) {
                            System.out.printf("%d\t", arrNumbers[i]);
                            sum += arrNumbers[i];
                        }
                    }
                    System.out.println("\nTổng các số chẵn trong mảng là: " + sum);
                    break;
                case 4:
                    sum = 0;
                    System.out.println("Gía trị các phần tử có chỉ số lẻ là: ");
                    for (int i = 0; i < arrNumbers.length; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%d\t", arrNumbers[i]);
                            sum += arrNumbers[i];
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Tổng các phần tử có chỉ số lẻ là: " + sum);
                    break;
                case 5:
                    System.out.println("Các phần tử là so nguyên tố là: ");
                    for (int i = 0; i < arrNumbers.length; i++) {
                        boolean isPrime = true;
                        if (arrNumbers[i] >= 2) {
                            for (int j = 2; j <= Math.sqrt(arrNumbers[i]); j++) {
                                if (arrNumbers[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        } else {
                            isPrime = false;
                        }
                        if (isPrime){
                            System.out.printf("%d\t", arrNumbers[i]);
                        }
                    }

                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("Đx sắp xếp xong");
                    for (int i = 0; i < arrNumbers.length-1; i++) {
                        for (int j = i + 1; j < arrNumbers.length; j++) {
                            if (arrNumbers[i] > arrNumbers[j]) {
                                int temp = arrNumbers[i];
                                arrNumbers[i] = arrNumbers[j];
                                arrNumbers[j] = temp;
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Nhập vào 1 số: ");
                    int findNumber = sc.nextInt();
                    int cntNumber = 0;
                    for (int element: arrNumbers) {
                        if (element == findNumber){
                            cntNumber++;
                        }
                    }
                    System.out.printf("Có %d phần tử có giá trị bằng %d\n ", cntNumber, findNumber);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn từ 1-8");
            }
        } while (choice != 0);
    }
}
