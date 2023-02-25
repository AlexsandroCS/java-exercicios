package until;

public class Converssion {
    public static final double Porcentagem = 6;

    public static double returnValue(double dollarValue,double dollarBought){
        double multiplication = dollarValue * dollarBought;
        double calculaPercent = multiplication * Porcentagem / 100;
        return calculaPercent + multiplication;
    }
}