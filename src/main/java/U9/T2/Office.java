package U9.T2;

import java.util.Objects;

public class Office {

  private String officeCode;
  private String city;
  private String phone;
  private String addressLine1;
  private String addressLine2;
  private String state;
  private String country;
  private String postalCode;
  private String territory;

  public Office(
      String officeCode,
      String city,
      String phone,
      String addressLine1,
      String addressLine2,
      String state,
      String country,
      String postalCode,
      String territory) {
    this.officeCode = officeCode;
    this.city = city;
    this.phone = phone;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.state = state;
    this.country = country;
    this.postalCode = postalCode;
    this.territory = territory;
  }

  @Override
  public String toString() {
    return "Office{"
        + "officeCode='"
        + officeCode
        + '\''
        + ", city='"
        + city
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
        + ", state='"
        + state
        + '\''
        + ", country='"
        + country
        + '\''
        + ", postalCode='"
        + postalCode
        + '\''
        + ", territory='"
        + territory
        + '\''
        + '}'
        + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Office)) return false;
    Office office = (Office) o;
    return Objects.equals(officeCode, office.officeCode)
        && Objects.equals(city, office.city)
        && Objects.equals(phone, office.phone)
        && Objects.equals(addressLine1, office.addressLine1)
        && Objects.equals(addressLine2, office.addressLine2)
        && Objects.equals(state, office.state)
        && Objects.equals(country, office.country)
        && Objects.equals(postalCode, office.postalCode)
        && Objects.equals(territory, office.territory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
  }

  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getTerritory() {
    return territory;
  }

  public void setTerritory(String territory) {
    this.territory = territory;
  }
}
