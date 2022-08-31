package com.example.demo.service;

import com.example.demo.dto.Request;
import com.example.demo.dto.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ApploiService {

    @Value("${apploi.x_api_key}")
    private String xAPIKey;

    @Value("${apploi.url}")
    private String url;

    private RestTemplate restTemplate;

    public ApploiService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public Response quicklyApply(Request request) {
        try {
            URI uri = new URI(url);
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-api-key",xAPIKey);
            HttpEntity<Request> entity = new HttpEntity<>(request, headers);

            ResponseEntity<Response> result = restTemplate.postForEntity(uri, entity, Response.class);
            return result.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
