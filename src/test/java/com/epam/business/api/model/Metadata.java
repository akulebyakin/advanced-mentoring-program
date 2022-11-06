package com.epam.business.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Metadata{
	@JsonProperty("last_login")
	private long lastLogin;
	private String attachmentContentType;
}