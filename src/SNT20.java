import java.util.Scanner;

public class SNT20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần tìm");
        int number = scanner.nextInt();
        int n=2;
        int count = 0;
        while (count < number){
            if (isPrime(n)){
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }else {
            for (int i=2;i<n;i++){
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
