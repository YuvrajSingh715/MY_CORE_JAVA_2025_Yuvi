package com.intuit.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostRequestDemo {

    public static void main(String[] args) throws Exception {

        // 1️⃣ Create HttpClient
        HttpClient client = HttpClient.newHttpClient();
        // Test Url
        // https://jsonplaceholder.typicode.com/posts
        //Test Payload
		/*
		 * { "title": "My Post", "body": "This is my first POST request", "userId": 101
		 * }
		 */

        // 2️⃣ JSON Body
        String jsonBody = "{ \"title\": \"My Post\", \"body\": \"This is my first POST request\", \"userId\": 101 }";

        // 3️⃣ Build POST Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        // 4️⃣ Send Request
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // 5️⃣ Print Response
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body:");
        System.out.println(response.body());
    }
}
