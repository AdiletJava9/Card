import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wallet wallet = new Wallet();
        wallet.WalletMoney = 10000;
        wallet.card = 10000;
        System.out.println("НАЛИЧКА:" + wallet.payInCash(0));
        System.out.println("КАРТА:" + wallet.payWithCArd(0));
        System.out.println("Если хотие снять денги Введите пароль");
        long s = scanner.nextLong();
        if (s == 112) {
            System.out.println("Сколько хотите снять?");
            long v = scanner.nextLong();
            System.out.println("На карте осталось:" + wallet.cashOut(v));
            System.out.print("На руках:");
            System.out.print(v + wallet.WalletMoney);
        }
    }

}