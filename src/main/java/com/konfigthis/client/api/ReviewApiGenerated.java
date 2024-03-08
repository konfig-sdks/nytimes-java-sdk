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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ReviewGetBookReviewsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReviewApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReviewApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ReviewApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKey() == null) {
            throw new IllegalArgumentException("\"api-key\" is required but no API key was provided. Please set \"api-key\" with ApiClient#setApiKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getBookReviewsCall(Integer isbn, String title, String author, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reviews.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (isbn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isbn", isbn));
        }

        if (title != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("title", title));
        }

        if (author != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("author", author));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBookReviewsValidateBeforeCall(Integer isbn, String title, String author, final ApiCallback _callback) throws ApiException {
        return getBookReviewsCall(isbn, title, author, _callback);

    }


    private ApiResponse<ReviewGetBookReviewsResponse> getBookReviewsWithHttpInfo(Integer isbn, String title, String author) throws ApiException {
        okhttp3.Call localVarCall = getBookReviewsValidateBeforeCall(isbn, title, author, null);
        Type localVarReturnType = new TypeToken<ReviewGetBookReviewsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBookReviewsAsync(Integer isbn, String title, String author, final ApiCallback<ReviewGetBookReviewsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBookReviewsValidateBeforeCall(isbn, title, author, _callback);
        Type localVarReturnType = new TypeToken<ReviewGetBookReviewsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetBookReviewsRequestBuilder {
        private Integer isbn;
        private String title;
        private String author;

        private GetBookReviewsRequestBuilder() {
        }

        /**
         * Set isbn
         * @param isbn Searching by ISBN is the recommended method. You can enter 10- or 13-digit ISBNs. (optional)
         * @return GetBookReviewsRequestBuilder
         */
        public GetBookReviewsRequestBuilder isbn(Integer isbn) {
            this.isbn = isbn;
            return this;
        }
        
        /**
         * Set title
         * @param title You’ll need to enter the full title of the book. Spaces in the title will be converted into the characters %20. (optional)
         * @return GetBookReviewsRequestBuilder
         */
        public GetBookReviewsRequestBuilder title(String title) {
            this.title = title;
            return this;
        }
        
        /**
         * Set author
         * @param author You’ll need to enter the author’s first and last name, separated by a space. This space will be converted into the characters %20. (optional)
         * @return GetBookReviewsRequestBuilder
         */
        public GetBookReviewsRequestBuilder author(String author) {
            this.author = author;
            return this;
        }
        
        /**
         * Build call for getBookReviews
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Book reviews. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBookReviewsCall(isbn, title, author, _callback);
        }


        /**
         * Execute getBookReviews request
         * @return ReviewGetBookReviewsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Book reviews. </td><td>  -  </td></tr>
         </table>
         */
        public ReviewGetBookReviewsResponse execute() throws ApiException {
            ApiResponse<ReviewGetBookReviewsResponse> localVarResp = getBookReviewsWithHttpInfo(isbn, title, author);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getBookReviews request with HTTP info returned
         * @return ApiResponse&lt;ReviewGetBookReviewsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Book reviews. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ReviewGetBookReviewsResponse> executeWithHttpInfo() throws ApiException {
            return getBookReviewsWithHttpInfo(isbn, title, author);
        }

        /**
         * Execute getBookReviews request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Book reviews. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ReviewGetBookReviewsResponse> _callback) throws ApiException {
            return getBookReviewsAsync(isbn, title, author, _callback);
        }
    }

    /**
     * Reviews
     * Get book reviews.
     * @return GetBookReviewsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Book reviews. </td><td>  -  </td></tr>
     </table>
     */
    public GetBookReviewsRequestBuilder getBookReviews() throws IllegalArgumentException {
        return new GetBookReviewsRequestBuilder();
    }
}