package Bank_Interest;

import java.util.Scanner;

public class Bank_Interest {
    public Bank_Interest() {
    }
    public static void main(String[] args) {
        double sum = 0.0D;
        Scanner scanner = new Scanner(System.in);
        System.out.println("���������");
        double money = scanner.nextDouble();
        System.out.println("���������ڣ��꣩��");
        double years = scanner.nextDouble();
        System.out.println("�����������ʣ�");
        double rate = scanner.nextDouble();
        sum = money * Math.pow(rate + 1.0D, years);
        System.out.printf("���ڴ�Ϣ = %.2f\n", sum);
    }
}
