/*
 * Books API
 * The Books API provides information about book reviews and The New York Times Best Sellers lists.  ## Best Sellers Lists Services ### List Names The lists/names service returns a list of all the NYT Best Sellers Lists.  Some lists are published weekly and others monthly.  The response includes when each list was first published and last published.  ``` /lists/names.json ```  ### List Data  The lists/{date}/{name} service returns the books on the best sellers list for the specified date and list name.  ``` /lists/2019-01-20/hardcover-fiction.json ```  Use \"current\" for {date} to get the latest list. ``` /lists/current/hardcover-fiction.json ```  ## Book Reviews Services  The book reviews service lets you get NYT book review by author, ISBN, or title.  ``` /reviews.json?author=Michelle+Obama ```  ``` /reviews.json?isbn=9781524763138 ```  ``` /reviews.json?title=Becoming ```  ## Example Calls  ``` https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=yourkey ```  ``` https://api.nytimes.com/svc/books/v3/reviews.json?author=Stephen+King&api-key=yourkey ``` 
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ListGetBestSellersResponseResultsInnerReviewsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListGetBestSellersResponseResultsInnerReviewsInner {
  public static final String SERIALIZED_NAME_BOOK_REVIEW_LINK = "book_review_link";
  @SerializedName(SERIALIZED_NAME_BOOK_REVIEW_LINK)
  private String bookReviewLink;

  public static final String SERIALIZED_NAME_FIRST_CHAPTER_LINK = "first_chapter_link";
  @SerializedName(SERIALIZED_NAME_FIRST_CHAPTER_LINK)
  private String firstChapterLink;

  public static final String SERIALIZED_NAME_SUNDAY_REVIEW_LINK = "sunday_review_link";
  @SerializedName(SERIALIZED_NAME_SUNDAY_REVIEW_LINK)
  private String sundayReviewLink;

  public static final String SERIALIZED_NAME_ARTICLE_CHAPTER_LINK = "article_chapter_link";
  @SerializedName(SERIALIZED_NAME_ARTICLE_CHAPTER_LINK)
  private String articleChapterLink;

  public ListGetBestSellersResponseResultsInnerReviewsInner() {
  }

  public ListGetBestSellersResponseResultsInnerReviewsInner bookReviewLink(String bookReviewLink) {
    
    
    
    
    this.bookReviewLink = bookReviewLink;
    return this;
  }

   /**
   * Get bookReviewLink
   * @return bookReviewLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBookReviewLink() {
    return bookReviewLink;
  }


  public void setBookReviewLink(String bookReviewLink) {
    
    
    
    this.bookReviewLink = bookReviewLink;
  }


  public ListGetBestSellersResponseResultsInnerReviewsInner firstChapterLink(String firstChapterLink) {
    
    
    
    
    this.firstChapterLink = firstChapterLink;
    return this;
  }

   /**
   * Get firstChapterLink
   * @return firstChapterLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstChapterLink() {
    return firstChapterLink;
  }


  public void setFirstChapterLink(String firstChapterLink) {
    
    
    
    this.firstChapterLink = firstChapterLink;
  }


  public ListGetBestSellersResponseResultsInnerReviewsInner sundayReviewLink(String sundayReviewLink) {
    
    
    
    
    this.sundayReviewLink = sundayReviewLink;
    return this;
  }

   /**
   * Get sundayReviewLink
   * @return sundayReviewLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSundayReviewLink() {
    return sundayReviewLink;
  }


  public void setSundayReviewLink(String sundayReviewLink) {
    
    
    
    this.sundayReviewLink = sundayReviewLink;
  }


  public ListGetBestSellersResponseResultsInnerReviewsInner articleChapterLink(String articleChapterLink) {
    
    
    
    
    this.articleChapterLink = articleChapterLink;
    return this;
  }

   /**
   * Get articleChapterLink
   * @return articleChapterLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArticleChapterLink() {
    return articleChapterLink;
  }


  public void setArticleChapterLink(String articleChapterLink) {
    
    
    
    this.articleChapterLink = articleChapterLink;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ListGetBestSellersResponseResultsInnerReviewsInner instance itself
   */
  public ListGetBestSellersResponseResultsInnerReviewsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGetBestSellersResponseResultsInnerReviewsInner listGetBestSellersResponseResultsInnerReviewsInner = (ListGetBestSellersResponseResultsInnerReviewsInner) o;
    return Objects.equals(this.bookReviewLink, listGetBestSellersResponseResultsInnerReviewsInner.bookReviewLink) &&
        Objects.equals(this.firstChapterLink, listGetBestSellersResponseResultsInnerReviewsInner.firstChapterLink) &&
        Objects.equals(this.sundayReviewLink, listGetBestSellersResponseResultsInnerReviewsInner.sundayReviewLink) &&
        Objects.equals(this.articleChapterLink, listGetBestSellersResponseResultsInnerReviewsInner.articleChapterLink)&&
        Objects.equals(this.additionalProperties, listGetBestSellersResponseResultsInnerReviewsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookReviewLink, firstChapterLink, sundayReviewLink, articleChapterLink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGetBestSellersResponseResultsInnerReviewsInner {\n");
    sb.append("    bookReviewLink: ").append(toIndentedString(bookReviewLink)).append("\n");
    sb.append("    firstChapterLink: ").append(toIndentedString(firstChapterLink)).append("\n");
    sb.append("    sundayReviewLink: ").append(toIndentedString(sundayReviewLink)).append("\n");
    sb.append("    articleChapterLink: ").append(toIndentedString(articleChapterLink)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("book_review_link");
    openapiFields.add("first_chapter_link");
    openapiFields.add("sunday_review_link");
    openapiFields.add("article_chapter_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListGetBestSellersResponseResultsInnerReviewsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListGetBestSellersResponseResultsInnerReviewsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListGetBestSellersResponseResultsInnerReviewsInner is not found in the empty JSON string", ListGetBestSellersResponseResultsInnerReviewsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("book_review_link") != null && !jsonObj.get("book_review_link").isJsonNull()) && !jsonObj.get("book_review_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `book_review_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("book_review_link").toString()));
      }
      if ((jsonObj.get("first_chapter_link") != null && !jsonObj.get("first_chapter_link").isJsonNull()) && !jsonObj.get("first_chapter_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_chapter_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_chapter_link").toString()));
      }
      if ((jsonObj.get("sunday_review_link") != null && !jsonObj.get("sunday_review_link").isJsonNull()) && !jsonObj.get("sunday_review_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sunday_review_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sunday_review_link").toString()));
      }
      if ((jsonObj.get("article_chapter_link") != null && !jsonObj.get("article_chapter_link").isJsonNull()) && !jsonObj.get("article_chapter_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `article_chapter_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("article_chapter_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListGetBestSellersResponseResultsInnerReviewsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListGetBestSellersResponseResultsInnerReviewsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListGetBestSellersResponseResultsInnerReviewsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListGetBestSellersResponseResultsInnerReviewsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListGetBestSellersResponseResultsInnerReviewsInner>() {
           @Override
           public void write(JsonWriter out, ListGetBestSellersResponseResultsInnerReviewsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ListGetBestSellersResponseResultsInnerReviewsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListGetBestSellersResponseResultsInnerReviewsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListGetBestSellersResponseResultsInnerReviewsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListGetBestSellersResponseResultsInnerReviewsInner
  * @throws IOException if the JSON string is invalid with respect to ListGetBestSellersResponseResultsInnerReviewsInner
  */
  public static ListGetBestSellersResponseResultsInnerReviewsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListGetBestSellersResponseResultsInnerReviewsInner.class);
  }

 /**
  * Convert an instance of ListGetBestSellersResponseResultsInnerReviewsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

