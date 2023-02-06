import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marcPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;

        boolean isCanBuy = false;


        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить твикс!");
            isCanBuy = true;
        }
        if (moneyAmount >= marcPrice) {
            System.out.println("Вы можете купить марс!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить сникерс!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить бонакву!");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас недостаточно средств! ");
        }
    }
}