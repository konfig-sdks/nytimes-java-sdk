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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ListGetByDateResponseResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ListGetByDateResponse
 */
public class ListGetByDateResponseTest {
    private final ListGetByDateResponse model = new ListGetByDateResponse();

    /**
     * Model tests for ListGetByDateResponse
     */
    @Test
    public void testListGetByDateResponse() {
        // TODO: test ListGetByDateResponse
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'copyright'
     */
    @Test
    public void copyrightTest() {
        // TODO: test copyright
    }

    /**
     * Test the property 'numResults'
     */
    @Test
    public void numResultsTest() {
        // TODO: test numResults
    }

    /**
     * Test the property 'lastModified'
     */
    @Test
    public void lastModifiedTest() {
        // TODO: test lastModified
    }

    /**
     * Test the property 'results'
     */
    @Test
    public void resultsTest() {
        // TODO: test results
    }

}
