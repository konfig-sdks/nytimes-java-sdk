# ReviewApi

All URIs are relative to *https://api.nytimes.com/svc/books/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBookReviews**](ReviewApi.md#getBookReviews) | **GET** /reviews.json | Reviews |


<a name="getBookReviews"></a>
# **getBookReviews**
> ReviewGetBookReviewsResponse getBookReviews().isbn(isbn).title(title).author(author).execute();

Reviews

Get book reviews.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReviewApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    Integer isbn = 56; // Searching by ISBN is the recommended method. You can enter 10- or 13-digit ISBNs.
    String title = "title_example"; // You’ll need to enter the full title of the book. Spaces in the title will be converted into the characters %20.
    String author = "author_example"; // You’ll need to enter the author’s first and last name, separated by a space. This space will be converted into the characters %20.
    try {
      ReviewGetBookReviewsResponse result = client
              .review
              .getBookReviews()
              .isbn(isbn)
              .title(title)
              .author(author)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getBookReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReviewGetBookReviewsResponse> response = client
              .review
              .getBookReviews()
              .isbn(isbn)
              .title(title)
              .author(author)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getBookReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isbn** | **Integer**| Searching by ISBN is the recommended method. You can enter 10- or 13-digit ISBNs. | [optional] |
| **title** | **String**| You’ll need to enter the full title of the book. Spaces in the title will be converted into the characters %20. | [optional] |
| **author** | **String**| You’ll need to enter the author’s first and last name, separated by a space. This space will be converted into the characters %20. | [optional] |

### Return type

[**ReviewGetBookReviewsResponse**](ReviewGetBookReviewsResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book reviews. |  -  |

