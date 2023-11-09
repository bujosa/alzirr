package com.alzirr.alzirr.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alzirr.alzirr.data.request.HelloRequest;
import com.alzirr.alzirr.data.response.WebResponse;

import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class AlzirrController {

    private static final Logger logger = LoggerFactory.getLogger(AlzirrController.class);
    
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/")
    @Operation(
        description = "This is a hello world Endpoint with your name",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = {
                    @io.swagger.v3.oas.annotations.media.Content(
                        mediaType = "application/json",
                        examples = {
                            @io.swagger.v3.oas.annotations.media.ExampleObject(
                                name = "Success",
                                value = "{\"code\": 200, \"status\": \"OK\", \"message\": \"Hello Your_Name\"}"
                            )
                        }
                    )
                }
            )
        }
    )
    public ResponseEntity<?> helloWithYourName(@RequestBody HelloRequest request){
        logger.info("Hello {}", request);
        return new ResponseEntity<>(
            new WebResponse(
                HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase(),
                "Hello " + request.getName()
            ), HttpStatus.OK
        );
    }

}
