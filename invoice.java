package tugasinterface;

class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;

        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "\nNama Produk : " + productName + "\n" + "Jumlah : " + quantity + "\n" + "harga per item :" +
                pricePerItem;
    }
}
