package strategy.cash;

public class CashDemo {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("打 8 折");
        double money = 300.0d;
        double totalPrices = cashContext.GetResult(money);
        System.out.println(totalPrices);
    }
}
