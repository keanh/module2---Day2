import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int height,width;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Nhập chiều dài");
                    height = input.nextInt();
                    System.out.println("Nhập chiều rộng");
                    width = input.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int size,choice1=-1;
                    Scanner pick = new Scanner(System.in);
                    while(choice1 != 0) {
                        System.out.println("1.botton-left");
                        System.out.println("2.top-left");
                        System.out.println("3.top-right");
                        System.out.println("4.botton-right");
                        choice1 = pick.nextInt();

                        Scanner input1 = new Scanner(System.in);
                        System.out.println("Nhập kích thước của tam giác");
                        size = input1.nextInt();

                        switch (choice1) {
                            case 1:
                                for (int i = 1; i <= size; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 2:
                                for (int i=1;i <= size;i++){
                                    for (int j = i;j<= size;j++){
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 3:
                                for (int i=1;i<= size;i++){
                                    for (int j=1;j<i;j++){
                                        System.out.print("  ");
                                    }
                                    for (int k=size;k>=i;k--){
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 4:
                                for (int i=1;i<=size;i++){
                                    for (int j = size-1;j>=i;j--){
                                        System.out.print("  ");
                                    }
                                    for (int k=1;k<=i;k++){
                                        System.out.print("* ");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            }
                        }
                case 3:
                    Scanner input2= new Scanner(System.in);
                    System.out.println("Nhập kích thước của tam giác");
                    int size1= input2.nextInt();

                    for (int i=1;i<=size1;i++){
                        for (int j=1;j<=size1-i;j++){
                            System.out.print("  ");
                        }
                        for (int k=1;k<=2*i-1;k++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}
