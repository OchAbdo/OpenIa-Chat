package com.example.IaIntegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IaIntegration.Models.SearchRequest;
import com.example.IaIntegration.services.IaService;



@RestController
public class IaController {

    @Autowired
    private IaService iaService ;

    @PostMapping("/searchChatGPT")
    public ResponseEntity<String> searchChatGPT(@RequestBody SearchRequest searchRequest) {
        return new ResponseEntity<>(iaService.processSearch(searchRequest.getQuery()) , HttpStatus.OK);
    }



    
    
}
