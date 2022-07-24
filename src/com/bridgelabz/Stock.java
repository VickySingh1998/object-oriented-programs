package com.bridgelabz;

public class Stock {
    private String shareName;
    private int numberOfShares;
    private int sharePrice;
    private int numberOfStocks;

    public Stock() {
        this.shareName = shareName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.numberOfStocks = numberOfStocks;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "Share Name='" + shareName + '\'' +
                ", Number Of Shares=" + numberOfShares +
                ", Share Price=" + sharePrice +
                ", Number Of Stocks=" + numberOfStocks +
                '}';
    }
}