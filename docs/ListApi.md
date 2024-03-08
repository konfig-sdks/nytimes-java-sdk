# ListApi

All URIs are relative to *https://api.nytimes.com/svc/books/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllBestSellers**](ListApi.md#getAllBestSellers) | **GET** /lists/full-overview.json | Best Sellers List Full Overview |
| [**getBestSellers**](ListApi.md#getBestSellers) | **GET** /lists.json | Best Sellers List |
| [**getBestSellersOverview**](ListApi.md#getBestSellersOverview) | **GET** /lists/overview.json | Best Sellers List Overview |
| [**getByDate**](ListApi.md#getByDate) | **GET** /lists/{date}/{list}.json | Best Sellers List by Date |
| [**getHistory**](ListApi.md#getHistory) | **GET** /lists/best-sellers/history.json | Best Sellers List History |
| [**getNames**](ListApi.md#getNames) | **GET** /lists/names.json | Best Sellers List Names |


<a name="getAllBestSellers"></a>
# **getAllBestSellers**
> OverviewResponse getAllBestSellers().publishedDate(publishedDate).execute();

Best Sellers List Full Overview

Get all books for all the Best Sellers lists for specified date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    String publishedDate = "publishedDate_example"; // YYYY-MM-DD  The best-seller list publication date. You do not have to specify the exact date the list was published. The service will search forward (into the future) for the closest publication date to the date you specify. For example, a request for lists/overview/2013-05-22 will retrieve the list that was published on 05-26.  If you do not include a published date, the current week's best sellers lists will be returned.
    try {
      OverviewResponse result = client
              .list
              .getAllBestSellers()
              .publishedDate(publishedDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getAllBestSellers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OverviewResponse> response = client
              .list
              .getAllBestSellers()
              .publishedDate(publishedDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getAllBestSellers");
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
| **publishedDate** | **String**| YYYY-MM-DD  The best-seller list publication date. You do not have to specify the exact date the list was published. The service will search forward (into the future) for the closest publication date to the date you specify. For example, a request for lists/overview/2013-05-22 will retrieve the list that was published on 05-26.  If you do not include a published date, the current week&#39;s best sellers lists will be returned. | [optional] |

### Return type

[**OverviewResponse**](OverviewResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Full overview of Best Sellers lists. |  -  |

<a name="getBestSellers"></a>
# **getBestSellers**
> ListGetBestSellersResponse getBestSellers(list).bestsellersDate(bestsellersDate).publishedDate(publishedDate).offset(offset).execute();

Best Sellers List

Get Best Sellers list.  If no date is provided returns the latest list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    String list = "hardcover-fiction"; // The name of the Times best sellers list (hardcover-fiction, paperback-nonfiction, ...). The /lists/names service returns all the list names. The encoded list names are lower case with hyphens instead of spaces (e.g. e-book-fiction, instead of E-Book Fiction).
    String bestsellersDate = "bestsellersDate_example"; // YYYY-MM-DD  The week-ending date for the sales reflected on list-name. Times best sellers lists are compiled using available book sale data. The bestsellers-date may be significantly earlier than published-date. For additional information, see the explanation at the bottom of any best-seller list page on NYTimes.com (example: Hardcover Fiction, published Dec. 5 but reflecting sales to Nov. 29).
    String publishedDate = "publishedDate_example"; // YYYY-MM-DD  The date the best sellers list was published on NYTimes.com (different than bestsellers-date).  Use \"current\" for latest list.
    Integer offset = 56; // Sets the starting point of the result set (0, 20, ...).  Used to paginate thru books if list has more than 20. Defaults to 0.  The num_results field indicates how many books are in the list.
    try {
      ListGetBestSellersResponse result = client
              .list
              .getBestSellers(list)
              .bestsellersDate(bestsellersDate)
              .publishedDate(publishedDate)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getLastModified());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBestSellers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListGetBestSellersResponse> response = client
              .list
              .getBestSellers(list)
              .bestsellersDate(bestsellersDate)
              .publishedDate(publishedDate)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBestSellers");
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
| **list** | **String**| The name of the Times best sellers list (hardcover-fiction, paperback-nonfiction, ...). The /lists/names service returns all the list names. The encoded list names are lower case with hyphens instead of spaces (e.g. e-book-fiction, instead of E-Book Fiction). | [default to hardcover-fiction] |
| **bestsellersDate** | **String**| YYYY-MM-DD  The week-ending date for the sales reflected on list-name. Times best sellers lists are compiled using available book sale data. The bestsellers-date may be significantly earlier than published-date. For additional information, see the explanation at the bottom of any best-seller list page on NYTimes.com (example: Hardcover Fiction, published Dec. 5 but reflecting sales to Nov. 29). | [optional] |
| **publishedDate** | **String**| YYYY-MM-DD  The date the best sellers list was published on NYTimes.com (different than bestsellers-date).  Use \&quot;current\&quot; for latest list. | [optional] |
| **offset** | **Integer**| Sets the starting point of the result set (0, 20, ...).  Used to paginate thru books if list has more than 20. Defaults to 0.  The num_results field indicates how many books are in the list. | [optional] |

### Return type

[**ListGetBestSellersResponse**](ListGetBestSellersResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Best Sellers list books |  -  |

<a name="getBestSellersOverview"></a>
# **getBestSellersOverview**
> OverviewResponse getBestSellersOverview().publishedDate(publishedDate).execute();

Best Sellers List Overview

Get top 5 books for all the Best Sellers lists for specified date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    String publishedDate = "publishedDate_example"; // YYYY-MM-DD  The best-seller list publication date. You do not have to specify the exact date the list was published. The service will search forward (into the future) for the closest publication date to the date you specify. For example, a request for lists/overview/2013-05-22 will retrieve the list that was published on 05-26.  If you do not include a published date, the current week's best sellers lists will be returned.
    try {
      OverviewResponse result = client
              .list
              .getBestSellersOverview()
              .publishedDate(publishedDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBestSellersOverview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OverviewResponse> response = client
              .list
              .getBestSellersOverview()
              .publishedDate(publishedDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBestSellersOverview");
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
| **publishedDate** | **String**| YYYY-MM-DD  The best-seller list publication date. You do not have to specify the exact date the list was published. The service will search forward (into the future) for the closest publication date to the date you specify. For example, a request for lists/overview/2013-05-22 will retrieve the list that was published on 05-26.  If you do not include a published date, the current week&#39;s best sellers lists will be returned. | [optional] |

### Return type

[**OverviewResponse**](OverviewResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Overview of Best Sellers lists. |  -  |

<a name="getByDate"></a>
# **getByDate**
> ListGetByDateResponse getByDate(date, list).offset(offset).execute();

Best Sellers List by Date

Get Best Sellers list by date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    String date = "date_example"; // YYYY-MM-DD or \"current\"  The date the best sellers list was published on NYTimes.com.  Use \"current\" to get latest list.
    String list = "list_example"; // Name of the Best Sellers List (e.g. hardcover-fiction). You can get the full list of names from the /lists/names.json service.
    Integer offset = 56; // Sets the starting point of the result set (0, 20, ...).  Used to paginate thru books if list has more than 20. Defaults to 0.  The num_results field indicates how many books are in the list.
    try {
      ListGetByDateResponse result = client
              .list
              .getByDate(date, list)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getLastModified());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListGetByDateResponse> response = client
              .list
              .getByDate(date, list)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByDate");
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
| **date** | **String**| YYYY-MM-DD or \&quot;current\&quot;  The date the best sellers list was published on NYTimes.com.  Use \&quot;current\&quot; to get latest list. | |
| **list** | **String**| Name of the Best Sellers List (e.g. hardcover-fiction). You can get the full list of names from the /lists/names.json service. | |
| **offset** | **Integer**| Sets the starting point of the result set (0, 20, ...).  Used to paginate thru books if list has more than 20. Defaults to 0.  The num_results field indicates how many books are in the list. | [optional] |

### Return type

[**ListGetByDateResponse**](ListGetByDateResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Best Sellers list books. |  -  |

<a name="getHistory"></a>
# **getHistory**
> ListGetHistoryResponse getHistory().ageGroup(ageGroup).author(author).contributor(contributor).isbn(isbn).offset(offset).price(price).publisher(publisher).title(title).execute();

Best Sellers List History

Get Best Sellers list history.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    String ageGroup = "ageGroup_example"; // The target age group for the best seller.
    String author = "author_example"; // The author of the best seller. The author field does not include additional contributors (see Data Structure for more details about the author and contributor fields).  When searching the author field, you can specify any combination of first, middle and last names.  When sort-by is set to author, the results will be sorted by author's first name.
    String contributor = "contributor_example"; // The author of the best seller, as well as other contributors such as the illustrator (to search or sort by author name only, use author instead).  When searching, you can specify any combination of first, middle and last names of any of the contributors.  When sort-by is set to contributor, the results will be sorted by the first name of the first contributor listed.
    String isbn = "isbn_example"; // International Standard Book Number, 10 or 13 digits  A best seller may have both 10-digit and 13-digit ISBNs, and may have multiple ISBNs of each type. To search on multiple ISBNs, separate the ISBNs with semicolons (example: 9780446579933;0061374229).
    Integer offset = 56; // Sets the starting point of the result set (0, 20, ...).  Used to paginate thru results if there are more than 20. Defaults to 0. The num_results field indicates how many results there are total.
    String price = "price_example"; // The publisher's list price of the best seller, including decimal point.
    String publisher = "publisher_example"; // The standardized name of the publisher
    String title = "title_example"; // The title of the best seller  When searching, you can specify a portion of a title or a full title.
    try {
      ListGetHistoryResponse result = client
              .list
              .getHistory()
              .ageGroup(ageGroup)
              .author(author)
              .contributor(contributor)
              .isbn(isbn)
              .offset(offset)
              .price(price)
              .publisher(publisher)
              .title(title)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListGetHistoryResponse> response = client
              .list
              .getHistory()
              .ageGroup(ageGroup)
              .author(author)
              .contributor(contributor)
              .isbn(isbn)
              .offset(offset)
              .price(price)
              .publisher(publisher)
              .title(title)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getHistory");
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
| **ageGroup** | **String**| The target age group for the best seller. | [optional] |
| **author** | **String**| The author of the best seller. The author field does not include additional contributors (see Data Structure for more details about the author and contributor fields).  When searching the author field, you can specify any combination of first, middle and last names.  When sort-by is set to author, the results will be sorted by author&#39;s first name. | [optional] |
| **contributor** | **String**| The author of the best seller, as well as other contributors such as the illustrator (to search or sort by author name only, use author instead).  When searching, you can specify any combination of first, middle and last names of any of the contributors.  When sort-by is set to contributor, the results will be sorted by the first name of the first contributor listed. | [optional] |
| **isbn** | **String**| International Standard Book Number, 10 or 13 digits  A best seller may have both 10-digit and 13-digit ISBNs, and may have multiple ISBNs of each type. To search on multiple ISBNs, separate the ISBNs with semicolons (example: 9780446579933;0061374229). | [optional] |
| **offset** | **Integer**| Sets the starting point of the result set (0, 20, ...).  Used to paginate thru results if there are more than 20. Defaults to 0. The num_results field indicates how many results there are total. | [optional] |
| **price** | **String**| The publisher&#39;s list price of the best seller, including decimal point. | [optional] |
| **publisher** | **String**| The standardized name of the publisher | [optional] |
| **title** | **String**| The title of the best seller  When searching, you can specify a portion of a title or a full title. | [optional] |

### Return type

[**ListGetHistoryResponse**](ListGetHistoryResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Best Sellers list history |  -  |

<a name="getNames"></a>
# **getNames**
> ListGetNamesResponse getNames().execute();

Best Sellers List Names

Get Best Sellers list names.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Nyt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nytimes.com/svc/books/v3";
    
    configuration.apiKey  = "YOUR API KEY";
    Nyt client = new Nyt(configuration);
    try {
      ListGetNamesResponse result = client
              .list
              .getNames()
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCopyright());
      System.out.println(result.getNumResults());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListGetNamesResponse> response = client
              .list
              .getNames()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getNames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListGetNamesResponse**](ListGetNamesResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Best Sellers list names. |  -  |

