package com.light.simple.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SimpleResponse {

 private String responseType;
 private OffsetDateTime responseTime;
 private String responseText;

}
