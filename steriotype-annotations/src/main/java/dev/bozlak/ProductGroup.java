package dev.bozlak;

public class ProductGroup {

    private int productGroupId;
    private int productGroupNumber;

    public ProductGroup() {
    }

    public ProductGroup(int productGroupId, int productGroupNumber) {
        this.productGroupId = productGroupId;
        this.productGroupNumber = productGroupNumber;
    }

    public int getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(int productGroupId) {
        this.productGroupId = productGroupId;
    }

    public int getProductGroupNumber() {
        return productGroupNumber;
    }

    public void setProductGroupNumber(int productGroupNumber) {
        this.productGroupNumber = productGroupNumber;
    }
}
