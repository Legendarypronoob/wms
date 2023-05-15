public class product{
    public String productID;
    public String productName;
    public String productPrice;
    public String productQuantity;
    public String productManufacturer;
    public String manufacturingDate;
    public String expiryDate;

    public product(String productID, String productName, String productPrice, String manufacturingDate, String expiryDate){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
    }

    public product(String productID, String productName, String productPrice, String productQuantity, String manufacturingDate, String expiryDate){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
    }

    public product(String productID, String productName, String productPrice, String productQuantity, String productManufacturer, String manufacturingDate, String expiryDate){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productManufacturer = productManufacturer;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
    }


}