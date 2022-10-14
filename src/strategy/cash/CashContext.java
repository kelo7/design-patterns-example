package strategy.cash;

public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type) {
            case "正常收费" -> {
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
            }
            case "满 300 返 100" -> {
                CashReturn cashReturn = new CashReturn("300", "100");
                cashSuper = cashReturn;
            }
            case "打 8 折" -> {
                CashRebate cashRebate = new CashRebate("0.8");
                cashSuper = cashRebate;
            }
        }
    }

    public double GetResult(double money){
        return cashSuper.acceptCash(money);
    }
}
