<div align="left">

[![Visit The new york times](./header.png)](https://developer.nytimes.com)

# [The new york times](https://developer.nytimes.com)

The Books API provides information about book reviews and The New York Times Best Sellers lists.

## Best Sellers Lists Services
### List Names
The lists/names service returns a list of all the NYT Best Sellers Lists.  Some lists are published weekly and others monthly.  The response includes when each list was first published and last published.

```
/lists/names.json
```

### List Data

The lists/{date}/{name} service returns the books on the best sellers list for the specified date and list name.

```
/lists/2019-01-20/hardcover-fiction.json
```

Use "current" for {date} to get the latest list.
```
/lists/current/hardcover-fiction.json
```

## Book Reviews Services

The book reviews service lets you get NYT book review by author, ISBN, or title.

```
/reviews.json?author=Michelle+Obama
```

```
/reviews.json?isbn=9781524763138
```

```
/reviews.json?title=Becoming
```

## Example Calls

```
https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=yourkey
```

```
https://api.nytimes.com/svc/books/v3/reviews.json?author=Stephen+King&api-key=yourkey
```


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=The%20New%20York%20Times&serviceName=Books&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>nytimes-java-sdk</artifactId>
  <version>3.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:nytimes-java-sdk:3.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/nytimes-java-sdk-3.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.nytimes.com/svc/books/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ListApi* | [**getAllBestSellers**](docs/ListApi.md#getAllBestSellers) | **GET** /lists/full-overview.json | Best Sellers List Full Overview
*ListApi* | [**getBestSellers**](docs/ListApi.md#getBestSellers) | **GET** /lists.json | Best Sellers List
*ListApi* | [**getBestSellersOverview**](docs/ListApi.md#getBestSellersOverview) | **GET** /lists/overview.json | Best Sellers List Overview
*ListApi* | [**getByDate**](docs/ListApi.md#getByDate) | **GET** /lists/{date}/{list}.json | Best Sellers List by Date
*ListApi* | [**getHistory**](docs/ListApi.md#getHistory) | **GET** /lists/best-sellers/history.json | Best Sellers List History
*ListApi* | [**getNames**](docs/ListApi.md#getNames) | **GET** /lists/names.json | Best Sellers List Names
*ReviewApi* | [**getBookReviews**](docs/ReviewApi.md#getBookReviews) | **GET** /reviews.json | Reviews


## Documentation for Models

 - [ListGetBestSellersResponse](docs/ListGetBestSellersResponse.md)
 - [ListGetBestSellersResponseResultsInner](docs/ListGetBestSellersResponseResultsInner.md)
 - [ListGetBestSellersResponseResultsInnerBookDetailsInner](docs/ListGetBestSellersResponseResultsInnerBookDetailsInner.md)
 - [ListGetBestSellersResponseResultsInnerIsbnsInner](docs/ListGetBestSellersResponseResultsInnerIsbnsInner.md)
 - [ListGetBestSellersResponseResultsInnerReviewsInner](docs/ListGetBestSellersResponseResultsInnerReviewsInner.md)
 - [ListGetByDateResponse](docs/ListGetByDateResponse.md)
 - [ListGetByDateResponseResults](docs/ListGetByDateResponseResults.md)
 - [ListGetByDateResponseResultsBooksInner](docs/ListGetByDateResponseResultsBooksInner.md)
 - [ListGetHistoryResponse](docs/ListGetHistoryResponse.md)
 - [ListGetHistoryResponseResultsInner](docs/ListGetHistoryResponseResultsInner.md)
 - [ListGetHistoryResponseResultsInnerRanksHistoryInner](docs/ListGetHistoryResponseResultsInnerRanksHistoryInner.md)
 - [ListGetNamesResponse](docs/ListGetNamesResponse.md)
 - [ListGetNamesResponseResultsInner](docs/ListGetNamesResponseResultsInner.md)
 - [OverviewResponse](docs/OverviewResponse.md)
 - [OverviewResponseResults](docs/OverviewResponseResults.md)
 - [OverviewResponseResultsListsInner](docs/OverviewResponseResultsListsInner.md)
 - [OverviewResponseResultsListsInnerBooksInner](docs/OverviewResponseResultsListsInnerBooksInner.md)
 - [ReviewGetBookReviewsResponse](docs/ReviewGetBookReviewsResponse.md)
 - [ReviewGetBookReviewsResponseResultsInner](docs/ReviewGetBookReviewsResponseResultsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
