package streams.activity9;

import java.time.LocalDate;

class Transaction {
    private String buyerName;
    private double productPrice;
    private LocalDate purchaseDate;

    public Transaction(String buyerName, double productPrice, LocalDate purchaseDate) {
        this.buyerName = buyerName;
        this.productPrice = productPrice;
        this.purchaseDate = purchaseDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}

