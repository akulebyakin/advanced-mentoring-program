package com.epam.business.api.client;

import com.epam.core.config.ProjectConfig;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Collections;
import java.util.List;

public class ReportPortalClient {

    private final ProjectConfig config = ProjectConfig.config;

    public RequestSpecification setup() {
        return RestAssured
                .given()
                .baseUri(config.baseUrl())
                .header("Authorization", "Bearer " + config.token())
                .contentType(ContentType.JSON)
                .filters(getFilters());
    }

    private List<Filter> getFilters() {
        boolean enableLogging = config.logging();

        return enableLogging
                ? List.of(new RequestLoggingFilter(), new ResponseLoggingFilter())
                : Collections.emptyList();
    }
}
