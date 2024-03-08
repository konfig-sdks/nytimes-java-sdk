package com.konfigthis.client;

import com.konfigthis.client.api.ListApi;
import com.konfigthis.client.api.ReviewApi;

public class Nyt {
    private ApiClient apiClient;
    public final ListApi list;
    public final ReviewApi review;

    public Nyt() {
        this(null);
    }

    public Nyt(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.list = new ListApi(this.apiClient);
        this.review = new ReviewApi(this.apiClient);
    }

}
