package Model;

public class Tradeinfo {

    private String company;
    private String transactionType;
    private String client;
    private String product;
    private int total;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    //Buyer , seller, product , total
    public Tradeinfo(String company, String transactionType, String client, String product, int total){
        this.company = company;
        this.transactionType = transactionType;
        this.client = client;
        this.product = product;
        this.total = total;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
