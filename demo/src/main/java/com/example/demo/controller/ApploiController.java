package com.example.demo.controller;

import com.example.demo.dto.Request;
import com.example.demo.dto.Response;
import com.example.demo.service.ApploiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApploiController {

    private ApploiService apploiService;

    public ApploiController(ApploiService apploiService) {
        this.apploiService = apploiService;
    }

    @PostMapping("/quickly/apply")
    public Response quicklyApply(@RequestBody Request request) {

        return this.apploiService.quicklyApply(request);
    }
}
