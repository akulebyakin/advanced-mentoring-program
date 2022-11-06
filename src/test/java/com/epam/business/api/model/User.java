package com.epam.business.api.model;

import lombok.Data;

@Data
public class User {
	private boolean photoLoaded;
	private Metadata metadata;
	private AssignedProjects assignedProjects;
	private String accountType;
	private String fullName;
	private int id;
	private String userRole;
	private String userId;
	private String email;
	private String photoId;
}