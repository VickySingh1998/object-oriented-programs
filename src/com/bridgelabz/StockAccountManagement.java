package com.bridgelabz;

import java.util.*;

public class StockAccountManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Stock stock = new Stock();


    private static Stock stockDetails() {
        System.out.println("Enter the Name of Stocks : ");
        stock.setShareName(scanner.next());
        System.out.println("Enter the Number of Share : ");
        stock.setNumberOfShares(scanner.nextInt());
        System.out.println("Enter the Share Price : ");
        stock.setSharePrice(scanner.nextInt());
        return stock;
    }


    public static void main(String[] args) {
        System.out.println("Enter the Number of Stocks : ");
        stock.setNumberOfStocks(scanner.nextInt());
        int value = 0;
        int totalValue = 0;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(stockDetails());
            value = stock.getNumberOfShares() * stock.getSharePrice();
            System.out.println("Investing Value of " + stock.getShareName() + " is " + value);
            totalValue += value;
        }
        System.out.println("Total Investing value of all the Stock is : " + totalValue);
    }
}
