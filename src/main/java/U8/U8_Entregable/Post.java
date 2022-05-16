package U8.U8_Entregable;

public class Post {

  // atributos
  private String title;
  private String link;
  private String description;
  private String pubDate;
  private String guid;
  private Boolean isPermaLink;

  // constructor vacio

  public Post() {}

  // constructor

  public Post(
      String title,
      String link,
      String description,
      String pubdate,
      String guid,
      Boolean isPermaLink) {
    this.title = title;
    this.link = link;
    this.description = description;
    this.pubDate = pubdate;
    this.guid = guid;
    this.isPermaLink = isPermaLink;
  }

  // toString

  @Override
  public String toString() {
    return "Post{"
        + "title='"
        + title
        + '\''
        + ", link='"
        + link
        + '\''
        + ", description='"
        + description
        + '\''
        + ", pubDate='"
        + pubDate
        + '\''
        + ", guid='"
        + guid
        + '\''
        + ", isPermaLink="
        + isPermaLink
        + '}'
        + "\n";
  }

  // getter & setter

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Boolean getPermaLink() {
    return isPermaLink;
  }

  public void setPermaLink(Boolean permaLink) {
    isPermaLink = permaLink;
  }
}
