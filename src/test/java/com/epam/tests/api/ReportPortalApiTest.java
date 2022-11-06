package com.epam.tests.api;

import com.epam.business.api.model.User;
import com.epam.business.api.service.ReportPortalService;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportPortalApiTest {

    private final ReportPortalService service = new ReportPortalService();

    @Test
    public void testGetAllUsers() {
        List<User> users = service.getAllUsers();
        assertThat(users).isNotEmpty();
    }
}
