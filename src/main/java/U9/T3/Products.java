package U9.T3;

import java.util.Objects;

public class Products {

  private String productCode;
  private String productName;
  private String productLine;
  private String productScale;
  private String productVendor;
  private String productDescription;
  private Integer quantityInStock;
  private Double buyPrice;
  private Double MSRP;

  public Products(
      String productCode,
      String productName,
      String productLine,
      String productScale,
      String productVendor,
      String productDescription,
      Integer quantityInStock,
      Double buyPrice,
      Double MSRP) {
    this.productCode = productCode;
    this.productName = productName;
    this.productLine = productLine;
    this.productScale = productScale;
    this.productVendor = productVendor;
    this.productDescription = productDescription;
    this.quantityInStock = quantityInStock;
    this.buyPrice = buyPrice;
    this.MSRP = MSRP;
  }

  @Override
  public String toString() {
    return "Products{"
        + "productCode='"
        + productCode
        + '\''
        + ", productName='"
        + productName
        + '\''
        + ", productLine='"
        + productLine
        + '\''
        + ", productScale='"
        + productScale
        + '\''
        + ", productVendor='"
        + productVendor
        + '\''
        + ", productDescription='"
        + productDescription
        + '\''
        + ", quantityInStock="
        + quantityInStock
        + ", buyPrice="
        + buyPrice
        + ", MSRP="
        + MSRP
        + '}'
        + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Products)) return false;
    Products products = (Products) o;
    return Objects.equals(productCode, products.productCode)
        && Objects.equals(productName, products.productName)
        && Objects.equals(productLine, products.productLine)
        && Objects.equals(productScale, products.productScale)
        && Objects.equals(productVendor, products.productVendor)
        && Objects.equals(productDescription, products.productDescription)
        && Objects.equals(quantityInStock, products.quantityInStock)
        && Objects.equals(buyPrice, products.buyPrice)
        && Objects.equals(MSRP, products.MSRP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        productCode,
        productName,
        productLine,
        productScale,
        productVendor,
        productDescription,
        quantityInStock,
        buyPrice,
        MSRP);
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductLine() {
    return productLine;
  }

  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }

  public String getProductScale() {
    return productScale;
  }

  public void setProductScale(String productScale) {
    this.productScale = productScale;
  }

  public String getProductVendor() {
    return productVendor;
  }

  public void setProductVendor(String productVendor) {
    this.productVendor = productVendor;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Integer getQuantityInStock() {
    return quantityInStock;
  }

  public void setQuantityInStock(Integer quantityInStock) {
    this.quantityInStock = quantityInStock;
  }

  public Double getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(Double buyPrice) {
    this.buyPrice = buyPrice;
  }

  public Double getMSRP() {
    return MSRP;
  }

  public void setMSRP(Double MSRP) {
    this.MSRP = MSRP;
  }
}
