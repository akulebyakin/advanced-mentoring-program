package com.epam.business.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AssignedProjects{
	@JsonProperty("test_personal")
	private TestPersonal testPersonal;
	@JsonProperty("test_project")
	private TestProject testProject;
	@JsonProperty("default_personal")
	private DefaultPersonal defaultPersonal;
	@JsonProperty("superadmin_personal")
	private SuperadminPersonal superadminPersonal;
}