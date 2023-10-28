package creationalpatterns.builder;

import creationalpatterns.builder.HttpClient.HttpClientBuilder;

public class Test {

    public static void main(String[] args) {
        // Before builder pattern
        HttpClient httpClient1 = new HttpClient("GET", "https://localhost", "kani", null, null, null);

        // Using builder
        HttpClientBuilder builder = new HttpClientBuilder();
        HttpClient httpClient = builder.method("POST").url("testurl").body("{}").build();
    }
}
