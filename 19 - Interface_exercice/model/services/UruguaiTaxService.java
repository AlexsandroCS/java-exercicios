package model.services;

public class UruguaiTaxService implements TaxService{
    public double tax(double amount){
        if (amount <= 80.0){
            return amount * 0.3;
        }
        else{
            return amount * 0.19;
        }
    }
}
