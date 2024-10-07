package application;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyCoverter;

public class main {
    public static void main(String[] args) {
    
        // Sistema de Conversão de Dollar para Real
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nWhat is the dollar price?\n");
        double dollarPrice = sc.nextDouble();

        System.out.printf("\nHow many dollars will be bought?\n");
        double dollarBuy = sc.nextDouble();

        System.out.printf("\nAmount to be paid in reais: R$ %.2f\n", CurrencyCoverter.finalResult(dollarPrice, dollarBuy));
    }
}
