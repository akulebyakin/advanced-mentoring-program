package com.epam.business.api.service;

import com.epam.business.api.client.ReportPortalClient;
import com.epam.business.api.model.User;
import com.epam.business.api.model.UserResponse;

import java.util.List;

import static com.epam.business.api.ReportPortalEndpoints.USER_ALL;

public class ReportPortalService {

    ReportPortalClient client = new ReportPortalClient();

    public List<User> getAllUsers() {
        return client.setup()
                .get(USER_ALL)
                .then()
                .statusCode(200)
                .extract().as(UserResponse.class)
                .getContent();
    }
}
