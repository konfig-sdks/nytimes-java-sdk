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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ListGetHistoryResponseResultsInnerRanksHistoryInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListGetHistoryResponseResultsInnerRanksHistoryInner {
  public static final String SERIALIZED_NAME_PRIMARY_ISBN10 = "primary_isbn10";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ISBN10)
  private String primaryIsbn10;

  public static final String SERIALIZED_NAME_PRIMARY_ISBN13 = "primary_isbn13";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ISBN13)
  private String primaryIsbn13;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_LIST_NAME = "list_name";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PUBLISHED_DATE = "published_date";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_DATE)
  private String publishedDate;

  public static final String SERIALIZED_NAME_BESTSELLERS_DATE = "bestsellers_date";
  @SerializedName(SERIALIZED_NAME_BESTSELLERS_DATE)
  private String bestsellersDate;

  public static final String SERIALIZED_NAME_WEEKS_ON_LIST = "weeks_on_list";
  @SerializedName(SERIALIZED_NAME_WEEKS_ON_LIST)
  private Integer weeksOnList;

  public static final String SERIALIZED_NAME_RANKS_LAST_WEEK = "ranks_last_week";
  @SerializedName(SERIALIZED_NAME_RANKS_LAST_WEEK)
  private Object ranksLastWeek = null;

  public static final String SERIALIZED_NAME_ASTERISK = "asterisk";
  @SerializedName(SERIALIZED_NAME_ASTERISK)
  private Integer asterisk;

  public static final String SERIALIZED_NAME_DAGGER = "dagger";
  @SerializedName(SERIALIZED_NAME_DAGGER)
  private Integer dagger;

  public ListGetHistoryResponseResultsInnerRanksHistoryInner() {
  }

  public ListGetHistoryResponseResultsInnerRanksHistoryInner primaryIsbn10(String primaryIsbn10) {
    
    
    
    
    this.primaryIsbn10 = primaryIsbn10;
    return this;
  }

   /**
   * Get primaryIsbn10
   * @return primaryIsbn10
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryIsbn10() {
    return primaryIsbn10;
  }


  public void setPrimaryIsbn10(String primaryIsbn10) {
    
    
    
    this.primaryIsbn10 = primaryIsbn10;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner primaryIsbn13(String primaryIsbn13) {
    
    
    
    
    this.primaryIsbn13 = primaryIsbn13;
    return this;
  }

   /**
   * Get primaryIsbn13
   * @return primaryIsbn13
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryIsbn13() {
    return primaryIsbn13;
  }


  public void setPrimaryIsbn13(String primaryIsbn13) {
    
    
    
    this.primaryIsbn13 = primaryIsbn13;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner rank(Integer rank) {
    
    
    
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    
    
    
    this.rank = rank;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner listName(String listName) {
    
    
    
    
    this.listName = listName;
    return this;
  }

   /**
   * Get listName
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListName() {
    return listName;
  }


  public void setListName(String listName) {
    
    
    
    this.listName = listName;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner publishedDate(String publishedDate) {
    
    
    
    
    this.publishedDate = publishedDate;
    return this;
  }

   /**
   * Get publishedDate
   * @return publishedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublishedDate() {
    return publishedDate;
  }


  public void setPublishedDate(String publishedDate) {
    
    
    
    this.publishedDate = publishedDate;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner bestsellersDate(String bestsellersDate) {
    
    
    
    
    this.bestsellersDate = bestsellersDate;
    return this;
  }

   /**
   * Get bestsellersDate
   * @return bestsellersDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBestsellersDate() {
    return bestsellersDate;
  }


  public void setBestsellersDate(String bestsellersDate) {
    
    
    
    this.bestsellersDate = bestsellersDate;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner weeksOnList(Integer weeksOnList) {
    
    
    
    
    this.weeksOnList = weeksOnList;
    return this;
  }

   /**
   * Get weeksOnList
   * @return weeksOnList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWeeksOnList() {
    return weeksOnList;
  }


  public void setWeeksOnList(Integer weeksOnList) {
    
    
    
    this.weeksOnList = weeksOnList;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner ranksLastWeek(Object ranksLastWeek) {
    
    
    
    
    this.ranksLastWeek = ranksLastWeek;
    return this;
  }

   /**
   * Get ranksLastWeek
   * @return ranksLastWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRanksLastWeek() {
    return ranksLastWeek;
  }


  public void setRanksLastWeek(Object ranksLastWeek) {
    
    
    
    this.ranksLastWeek = ranksLastWeek;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner asterisk(Integer asterisk) {
    
    
    
    
    this.asterisk = asterisk;
    return this;
  }

   /**
   * Get asterisk
   * @return asterisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAsterisk() {
    return asterisk;
  }


  public void setAsterisk(Integer asterisk) {
    
    
    
    this.asterisk = asterisk;
  }


  public ListGetHistoryResponseResultsInnerRanksHistoryInner dagger(Integer dagger) {
    
    
    
    
    this.dagger = dagger;
    return this;
  }

   /**
   * Get dagger
   * @return dagger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDagger() {
    return dagger;
  }


  public void setDagger(Integer dagger) {
    
    
    
    this.dagger = dagger;
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
   * @return the ListGetHistoryResponseResultsInnerRanksHistoryInner instance itself
   */
  public ListGetHistoryResponseResultsInnerRanksHistoryInner putAdditionalProperty(String key, Object value) {
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
    ListGetHistoryResponseResultsInnerRanksHistoryInner listGetHistoryResponseResultsInnerRanksHistoryInner = (ListGetHistoryResponseResultsInnerRanksHistoryInner) o;
    return Objects.equals(this.primaryIsbn10, listGetHistoryResponseResultsInnerRanksHistoryInner.primaryIsbn10) &&
        Objects.equals(this.primaryIsbn13, listGetHistoryResponseResultsInnerRanksHistoryInner.primaryIsbn13) &&
        Objects.equals(this.rank, listGetHistoryResponseResultsInnerRanksHistoryInner.rank) &&
        Objects.equals(this.listName, listGetHistoryResponseResultsInnerRanksHistoryInner.listName) &&
        Objects.equals(this.displayName, listGetHistoryResponseResultsInnerRanksHistoryInner.displayName) &&
        Objects.equals(this.publishedDate, listGetHistoryResponseResultsInnerRanksHistoryInner.publishedDate) &&
        Objects.equals(this.bestsellersDate, listGetHistoryResponseResultsInnerRanksHistoryInner.bestsellersDate) &&
        Objects.equals(this.weeksOnList, listGetHistoryResponseResultsInnerRanksHistoryInner.weeksOnList) &&
        Objects.equals(this.ranksLastWeek, listGetHistoryResponseResultsInnerRanksHistoryInner.ranksLastWeek) &&
        Objects.equals(this.asterisk, listGetHistoryResponseResultsInnerRanksHistoryInner.asterisk) &&
        Objects.equals(this.dagger, listGetHistoryResponseResultsInnerRanksHistoryInner.dagger)&&
        Objects.equals(this.additionalProperties, listGetHistoryResponseResultsInnerRanksHistoryInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryIsbn10, primaryIsbn13, rank, listName, displayName, publishedDate, bestsellersDate, weeksOnList, ranksLastWeek, asterisk, dagger, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGetHistoryResponseResultsInnerRanksHistoryInner {\n");
    sb.append("    primaryIsbn10: ").append(toIndentedString(primaryIsbn10)).append("\n");
    sb.append("    primaryIsbn13: ").append(toIndentedString(primaryIsbn13)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    bestsellersDate: ").append(toIndentedString(bestsellersDate)).append("\n");
    sb.append("    weeksOnList: ").append(toIndentedString(weeksOnList)).append("\n");
    sb.append("    ranksLastWeek: ").append(toIndentedString(ranksLastWeek)).append("\n");
    sb.append("    asterisk: ").append(toIndentedString(asterisk)).append("\n");
    sb.append("    dagger: ").append(toIndentedString(dagger)).append("\n");
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
    openapiFields.add("primary_isbn10");
    openapiFields.add("primary_isbn13");
    openapiFields.add("rank");
    openapiFields.add("list_name");
    openapiFields.add("display_name");
    openapiFields.add("published_date");
    openapiFields.add("bestsellers_date");
    openapiFields.add("weeks_on_list");
    openapiFields.add("ranks_last_week");
    openapiFields.add("asterisk");
    openapiFields.add("dagger");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListGetHistoryResponseResultsInnerRanksHistoryInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListGetHistoryResponseResultsInnerRanksHistoryInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListGetHistoryResponseResultsInnerRanksHistoryInner is not found in the empty JSON string", ListGetHistoryResponseResultsInnerRanksHistoryInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("primary_isbn10") != null && !jsonObj.get("primary_isbn10").isJsonNull()) && !jsonObj.get("primary_isbn10").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_isbn10` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_isbn10").toString()));
      }
      if ((jsonObj.get("primary_isbn13") != null && !jsonObj.get("primary_isbn13").isJsonNull()) && !jsonObj.get("primary_isbn13").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_isbn13` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_isbn13").toString()));
      }
      if ((jsonObj.get("list_name") != null && !jsonObj.get("list_name").isJsonNull()) && !jsonObj.get("list_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_name").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("published_date") != null && !jsonObj.get("published_date").isJsonNull()) && !jsonObj.get("published_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `published_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("published_date").toString()));
      }
      if ((jsonObj.get("bestsellers_date") != null && !jsonObj.get("bestsellers_date").isJsonNull()) && !jsonObj.get("bestsellers_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bestsellers_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bestsellers_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListGetHistoryResponseResultsInnerRanksHistoryInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListGetHistoryResponseResultsInnerRanksHistoryInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListGetHistoryResponseResultsInnerRanksHistoryInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListGetHistoryResponseResultsInnerRanksHistoryInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListGetHistoryResponseResultsInnerRanksHistoryInner>() {
           @Override
           public void write(JsonWriter out, ListGetHistoryResponseResultsInnerRanksHistoryInner value) throws IOException {
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
           public ListGetHistoryResponseResultsInnerRanksHistoryInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListGetHistoryResponseResultsInnerRanksHistoryInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListGetHistoryResponseResultsInnerRanksHistoryInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListGetHistoryResponseResultsInnerRanksHistoryInner
  * @throws IOException if the JSON string is invalid with respect to ListGetHistoryResponseResultsInnerRanksHistoryInner
  */
  public static ListGetHistoryResponseResultsInnerRanksHistoryInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListGetHistoryResponseResultsInnerRanksHistoryInner.class);
  }

 /**
  * Convert an instance of ListGetHistoryResponseResultsInnerRanksHistoryInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

