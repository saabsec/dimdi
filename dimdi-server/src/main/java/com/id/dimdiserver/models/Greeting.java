package com.id.dimdiserver.models;

/**
 * The Class Greeting.
 */
public class Greeting {
  
  /** The id. */
  private long id;
  
  /** The content. */
  private String content;
  
  /**
   * Instantiates a new greeting.
   *
   * @param id the id
   * @param content the content
   */
  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
  
  /**
   * Gets the id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }
  
  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(long id) {
    this.id = id;
  }
  
  /**
   * Gets the content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }
  
  /**
   * Sets the content.
   *
   * @param content the new content
   */
  public void setContent(String content) {
    this.content = content;
  }
  
}
