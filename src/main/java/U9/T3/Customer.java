package U9.T3;

import java.util.Objects;

public class Customer {

  private Integer customerNumber;
  private String customerName;
  private String contactLastName;
  private String contactFirstName;
  private String phone;
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String postalCode;
  private String country;
  private Integer salesRepEmployeeNumber;
  private Double creditLimit;

  public Customer(
      Integer customerNumber,
      String customerName,
      String contactLastName,
      String contactFirstName,
      String phone,
      String addressLine1,
      String addressLine2,
      String city,
      String state,
      String postalCode,
      String country,
      Integer salesRepEmployeeNumber,
      Double creditLimit) {
    this.customerNumber = customerNumber;
    this.customerName = customerName;
    this.contactLastName = contactLastName;
    this.contactFirstName = contactFirstName;
    this.phone = phone;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
    this.country = country;
    this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    this.creditLimit = creditLimit;
  }

  @Override
  public String toString() {
    return "Customer{"
        + "customerNumber="
        + customerNumber
        + ", customerName='"
        + customerName
        + '\''
        + ", contactLastName='"
        + contactLastName
        + '\''
        + ", contactFirstName='"
        + contactFirstName
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", addressLine1='"
        + addressLine1
        + '\''
        + ", addressLine2='"
        + addressLine2
        + '\''
        + ", city='"
        + city
        + '\''
        + ", state='"
        + state
        + '\''
        + ", postalCode='"
        + postalCode
        + '\''
        + ", country='"
        + country
        + '\''
        + ", salesRepEmployeeNumber="
        + salesRepEmployeeNumber
        + ", creditLimit="
        + creditLimit
        + '}'
        + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer)) return false;
    Customer customer = (Customer) o;
    return Objects.equals(getCustomerNumber(), customer.getCustomerNumber())
        && Objects.equals(getCustomerName(), customer.getCustomerName())
        && Objects.equals(getContactLastName(), customer.getContactLastName())
        && Objects.equals(getContactFirstName(), customer.getContactFirstName())
        && Objects.equals(getPhone(), customer.getPhone())
        && Objects.equals(getAddressLine1(), customer.getAddressLine1())
        && Objects.equals(getAddressLine2(), customer.getAddressLine2())
        && Objects.equals(getCity(), customer.getCity())
        && Objects.equals(getState(), customer.getState())
        && Objects.equals(getPostalCode(), customer.getPostalCode())
        && Objects.equals(getCountry(), customer.getCountry())
        && Objects.equals(getSalesRepEmployeeNumber(), customer.getSalesRepEmployeeNumber())
        && Objects.equals(getCreditLimit(), customer.getCreditLimit());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getCustomerNumber(),
        getCustomerName(),
        getContactLastName(),
        getContactFirstName(),
        getPhone(),
        getAddressLine1(),
        getAddressLine2(),
        getCity(),
        getState(),
        getPostalCode(),
        getCountry(),
        getSalesRepEmployeeNumber(),
        getCreditLimit());
  }

  public Integer getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getSalesRepEmployeeNumber() {
    return salesRepEmployeeNumber;
  }

  public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
    this.salesRepEmployeeNumber = salesRepEmployeeNumber;
  }

  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }
}
