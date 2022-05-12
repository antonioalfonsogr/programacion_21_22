package U9.T3;

import java.util.Objects;

public class Order {

  private Integer orderNumber;
  private String orderDate;
  private String requiredDate;
  private String shippedDate;
  private String status;
  private String comments;
  private Integer customerNumber;

  public Order(
      Integer orderNumber,
      String orderDate,
      String requiredDate,
      String shippedDate,
      String status,
      String comments,
      Integer customerNumber) {
    this.orderNumber = orderNumber;
    this.orderDate = orderDate;
    this.requiredDate = requiredDate;
    this.shippedDate = shippedDate;
    this.status = status;
    this.comments = comments;
    this.customerNumber = customerNumber;
  }

  @Override
  public String toString() {
    return "Order{"
        + "orderNumber="
        + orderNumber
        + ", orderDate='"
        + orderDate
        + '\''
        + ", requiredDate='"
        + requiredDate
        + '\''
        + ", shippedDate='"
        + shippedDate
        + '\''
        + ", status='"
        + status
        + '\''
        + ", comments='"
        + comments
        + '\''
        + ", customerNumber="
        + customerNumber
        + '}'
        + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order)) return false;
    Order order = (Order) o;
    return Objects.equals(orderNumber, order.orderNumber)
        && Objects.equals(orderDate, order.orderDate)
        && Objects.equals(requiredDate, order.requiredDate)
        && Objects.equals(shippedDate, order.shippedDate)
        && Objects.equals(status, order.status)
        && Objects.equals(comments, order.comments)
        && Objects.equals(customerNumber, order.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber);
  }

  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public String getRequiredDate() {
    return requiredDate;
  }

  public void setRequiredDate(String requiredDate) {
    this.requiredDate = requiredDate;
  }

  public String getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Integer getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
  }
}
