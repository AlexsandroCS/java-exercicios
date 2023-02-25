package entity;

public class BancoAccout {
    private int codeAccount;
    private String holderAccount;
    private double valueAccount;

    public BancoAccout(int code, String holder, double value){
        this.codeAccount = code;
        this.holderAccount = holder;
        Deposit(value);
    }
    public BancoAccout(int code, String holder){
        this.codeAccount = code;
        this.holderAccount = holder;
    }

    public void setTitularConta(String holderAccount) {
        this.holderAccount = holderAccount;
    }
    public int getCodigoConta() {
        return codeAccount;
    }
    public String getTitularConta() {
        return holderAccount;
    }
    public double getValorConta() {
        return valueAccount;
    }

    public void Deposit(double valueDeposit){
        this.valueAccount += valueDeposit;
    }
    public void Withdraw(double valueWithdraw){
        double rate = 5.00;
        this.valueAccount -= (valueWithdraw + rate);
    }

    public String toString(){
        return "Account information | Code account: " + codeAccount + " | Holder account: " + holderAccount + " | Value account R$ " + String.format("%.2f",valueAccount);
    }
}