public class Application {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        System.out.println("-------------------------------------------");
        System.out.println("|\tMonth \t|\t Saver1 \t|\t Saver2   |");
        System.out.println("-------------------------------------------");

        for(int i = 1; i <= 12; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("|\t  " + i + " \t|\t");
            saver1.showBalance();
            System.out.print("\t|\t");
            saver2.showBalance();
            System.out.println("  |");
        }
        System.out.println("-------------------------------------------");
        System.out.println("\nModifying Annual Interest Rate to %5.0\n") ;
        SavingsAccount.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("-------------------------------------------");
        System.out.print("|\t 13\t\t|\t");
        saver1.showBalance();
        System.out.print("\t|\t");
        saver2.showBalance();
        System.out.println("  |");
        System.out.println("-------------------------------------------");
    }
}