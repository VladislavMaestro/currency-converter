package by.vsu;


import by.vsu.parser.CurrencyParser;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        while(true) {
            String request = new Scanner(System.in).nextLine();

            CurrencyParser currencyParser = new CurrencyParser();

            try {
                System.out.println(currencyParser.calculateTheAmountCurrency(request));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
