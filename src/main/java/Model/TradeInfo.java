package Model;

// this class is made to provide a format for the information given for a transactions
public class TradeInfo {

    // parameters needed in a transaction
    private String company;
    private String transactionType;
    private String client;
    private String product;
    private int total;

    // constructor of my Trade
    private TradeInfo(TradeInfoBuilder builder){
        this.company = builder.company;
        this.transactionType = builder.transactionType;
        this.client = builder.client;
        this.product = builder.product;
        this.total = builder.total;
    }

    // Setters and Getters for the variables
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

    public static class TradeInfoBuilder{

        private String company;
        private String transactionType;
        private String client;
        private String product;
        private int total;

        public TradeInfoBuilder(String company, String transactionType, String client){
            this.company = company;
            this.transactionType = transactionType;
            this.client = client;
            this.product = null;
            this.total = 0;
        }

        public String getProduct() {
            return product;
        }

        public TradeInfoBuilder setProduct(String product) {
            this.product = product;
            return this;
        }

        public int getTotal() {
            return total;
        }

        public TradeInfoBuilder setTotal(int total) {
            this.total = total;
            return this;
        }
        public TradeInfo build(){
            return new TradeInfo(this);
        }
    }

    @Override
    public String toString() {
        return "Depot: "+ getCompany() +", Transaction Type: " +getTransactionType() +", Client: "+ getClient()+", Product: " +getProduct()+ ", Total: " +getTotal()+ "\n";
    }



}
