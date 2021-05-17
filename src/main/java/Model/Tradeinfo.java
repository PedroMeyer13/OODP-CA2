package Model;

public class Tradeinfo {

    private String buyer;
    private String seller;
    private String product;
    private int quantity;
    private int cost;
    private int nativeStock;
    private int externalStock;
    private int allowance;
    private int cashBalance;

    public Tradeinfo(String buyer, String seller, String product, int quantity, int cost, int nativeStock, int externalStock, int allowance, int cashBalance){
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.nativeStock = nativeStock;
        this.externalStock = externalStock;
        this.allowance = allowance;
        this.cashBalance = cashBalance;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNativeStock() {
        return nativeStock;
    }

    public void setNativeStock(int nativeStock) {
        this.nativeStock = nativeStock;
    }

    public int getExternalStock() {
        return externalStock;
    }

    public void setExternalStock(int externalStock) {
        this.externalStock = externalStock;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(int cashBalance) {
        this.cashBalance = cashBalance;
    }

}
