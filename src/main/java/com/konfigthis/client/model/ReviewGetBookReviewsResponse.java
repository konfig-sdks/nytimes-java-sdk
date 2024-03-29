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
import com.konfigthis.client.model.ReviewGetBookReviewsResponseResultsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ReviewGetBookReviewsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReviewGetBookReviewsResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT)
  private String copyright;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "num_results";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<ReviewGetBookReviewsResponseResultsInner> results = null;

  public ReviewGetBookReviewsResponse() {
  }

  public ReviewGetBookReviewsResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ReviewGetBookReviewsResponse copyright(String copyright) {
    
    
    
    
    this.copyright = copyright;
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCopyright() {
    return copyright;
  }


  public void setCopyright(String copyright) {
    
    
    
    this.copyright = copyright;
  }


  public ReviewGetBookReviewsResponse numResults(Integer numResults) {
    
    
    
    
    this.numResults = numResults;
    return this;
  }

   /**
   * Get numResults
   * @return numResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumResults() {
    return numResults;
  }


  public void setNumResults(Integer numResults) {
    
    
    
    this.numResults = numResults;
  }


  public ReviewGetBookReviewsResponse results(List<ReviewGetBookReviewsResponseResultsInner> results) {
    
    
    
    
    this.results = results;
    return this;
  }

  public ReviewGetBookReviewsResponse addResultsItem(ReviewGetBookReviewsResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReviewGetBookReviewsResponseResultsInner> getResults() {
    return results;
  }


  public void setResults(List<ReviewGetBookReviewsResponseResultsInner> results) {
    
    
    
    this.results = results;
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
   * @return the ReviewGetBookReviewsResponse instance itself
   */
  public ReviewGetBookReviewsResponse putAdditionalProperty(String key, Object value) {
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
    ReviewGetBookReviewsResponse reviewGetBookReviewsResponse = (ReviewGetBookReviewsResponse) o;
    return Objects.equals(this.status, reviewGetBookReviewsResponse.status) &&
        Objects.equals(this.copyright, reviewGetBookReviewsResponse.copyright) &&
        Objects.equals(this.numResults, reviewGetBookReviewsResponse.numResults) &&
        Objects.equals(this.results, reviewGetBookReviewsResponse.results)&&
        Objects.equals(this.additionalProperties, reviewGetBookReviewsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, copyright, numResults, results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewGetBookReviewsResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("copyright");
    openapiFields.add("num_results");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewGetBookReviewsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReviewGetBookReviewsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewGetBookReviewsResponse is not found in the empty JSON string", ReviewGetBookReviewsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("copyright") != null && !jsonObj.get("copyright").isJsonNull()) && !jsonObj.get("copyright").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `copyright` to be a primitive type in the JSON string but got `%s`", jsonObj.get("copyright").toString()));
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            ReviewGetBookReviewsResponseResultsInner.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewGetBookReviewsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewGetBookReviewsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewGetBookReviewsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewGetBookReviewsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewGetBookReviewsResponse>() {
           @Override
           public void write(JsonWriter out, ReviewGetBookReviewsResponse value) throws IOException {
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
           public ReviewGetBookReviewsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReviewGetBookReviewsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReviewGetBookReviewsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewGetBookReviewsResponse
  * @throws IOException if the JSON string is invalid with respect to ReviewGetBookReviewsResponse
  */
  public static ReviewGetBookReviewsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewGetBookReviewsResponse.class);
  }

 /**
  * Convert an instance of ReviewGetBookReviewsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

