package entities;

public class CurrencyCoverter {
    // definição de variavéis
    public static double dollarPrice;
    public static double dollarBuy; 

    public static final float percentIOF = 6;

    public static double finalResult() {
      double calc1 = dollarBuy*dollarPrice;
      double calc2 = calc1*percentIOF/100;
      return calc1 + calc2;
    }
}
