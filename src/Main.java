import java.util.Scanner;

public class Main {
    static void checkCommand(bank mymoney, Scanner input) {
        String command = input.nextLine();

        switch (command) {
	case "opname":
            System.out.println("Hoeveel wil je opnemen?");
            float amount = input.nextFloat();
            mymoney.opname(amount);
		break;
    case "storting":
        System.out.println("Hoeveel wil je storten?");
        amount = input.nextFloat();
        mymoney.storting(amount);
        break;

    case "info":
        mymoney.laatGeldZien();
        break;
	default:
		break;
        }
    }

    public static void main(String[] args) {
        bank mymoney = new bank(0);

        Scanner input = new Scanner(System.in);
        checkCommand(mymoney, input);
        input.close();
    }
}
