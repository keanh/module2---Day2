import java.util.Scanner;

public class tienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay");
        float money = scanner.nextFloat();
        System.out.println("Nhập tỉ lệ lãi suất theo tháng");
        float rate = scanner.nextFloat();
        System.out.println("Nhập số tháng ");
        int month = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total = money * (rate / 100) / 12 * month;
        }

        System.out.println("Số tiền lãi là: " + total);
    }
}
