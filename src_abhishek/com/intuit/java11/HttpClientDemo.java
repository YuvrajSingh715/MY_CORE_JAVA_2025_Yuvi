package com.intuit.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

	public static void main(String[] args) throws Exception {

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://jsonplaceholder.typicode.com/posts/1"))
				.GET().build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("Status Code :" + response.statusCode());
		System.out.println("Response Body: ");
		System.out.println(response.body());

	}

}
