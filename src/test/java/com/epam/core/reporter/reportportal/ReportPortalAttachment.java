package com.epam.core.reporter.reportportal;

import com.epam.reportportal.message.ReportPortalMessage;
import com.epam.reportportal.service.ReportPortal;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Date;

@Log4j2
public class ReportPortalAttachment extends AbstractAttachment implements ReportAttachment {

    public ReportPortalAttachment(WebDriver driver) {
        super(driver);
    }

    @Override
    public void attachScreenshot() {
        try {
            ReportPortalMessage message = new ReportPortalMessage(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
                    "Browser screenshot");
            ReportPortal.emitLog(message, "info", new Date());
        } catch (Exception e) {
            log.error("Error when trying to attach screenshot to the ReportPortal");
        }
    }
}
