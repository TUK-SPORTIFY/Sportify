package com.tuk.sportify.global.config;


import io.swagger.v3.oas.models.examples.Example;
import lombok.Builder;

@Builder
public record ExampleHolder(Example holder,int code,String name) {}
