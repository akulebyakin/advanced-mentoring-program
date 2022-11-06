package com.epam.tests.ui;

import com.epam.business.ui.pages.DashboardPage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportPortalUiTest extends BaseUiTest {

    @Test
    public void testLogin() {
        String username = "test";
        String password = "test";

        DashboardPage dashboardPage = loginPage.login(username, password);

        assertThat(dashboardPage.waitUntilTitleVisible()).isTrue();
    }
}
