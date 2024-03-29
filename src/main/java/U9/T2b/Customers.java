package U9.T2b;

public class Customers {

  private Integer customerNumber;
  private String customerName;
  private String contactLastName;
  private String contactFirstName;
  private String phone;
  private String addressLine1;
  private String postalCode;
  private String city;
  private String state;
  private String addressLine2;
  private String country;
  private Integer salesRepEmployeeNumber;
  private String creditLimit;

  public Customers(
      Integer customerNumber,
      String customerName,
      String contactLastName,
      String contactFirstName,
      String phone,
      String addressLine1,
      String postalCode,
      String city,
      String state,
      String addressLine2,
      String country,
      Integer salesRepEmployeeNumber,
      String creditLimit) {
    this.customerNumber = customerNumber;
    this.customerName = customerName;
    this.contactLastName = contactLastName;
    this.contactFirstName = contactFirstName;
    this.phone = phone;
    this.addressLine1 = addressLine1;
    this.postalCode = postalCode;
    this.city = city;
    this.state = state;
    this.addressLine2 = addressLine2;
    this.country = country;
    this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    this.creditLimit = creditLimit;
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

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
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

  public String getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(String creditLimit) {
    this.creditLimit = creditLimit;
  }

  @Override
  public String toString() {
    return "Customers -> {"
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
        + ", postalCode='"
        + postalCode
        + '\''
        + ", city='"
        + city
        + '\''
        + ", state='"
        + state
        + '\''
        + ", addressLine2='"
        + addressLine2
        + '\''
        + ", country='"
        + country
        + '\''
        + ", salesRepEmployeeNumber="
        + salesRepEmployeeNumber
        + ", creditLimit='"
        + creditLimit
        + '\''
        + '}'
        + "\n";
  }
}
