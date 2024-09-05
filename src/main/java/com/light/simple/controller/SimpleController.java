package com.light.simple.controller;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.simple.model.SimpleResponse;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api/v1/")
@Slf4j
public class SimpleController {
	
	
    @GetMapping(value = "simple", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SimpleResponse> getSimpleResponse() {
    	log.info(" Calling simple GET Service from SimpleController ");
    	SimpleResponse sr = new SimpleResponse("Success",OffsetDateTime.ofInstant(Instant.now(),ZoneId.of("UTC")), 
    									"Simple Response Generated");
    	return new ResponseEntity<SimpleResponse>(sr,HttpStatus.ACCEPTED);
    }

}
