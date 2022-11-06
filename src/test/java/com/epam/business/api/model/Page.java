package com.epam.business.api.model;

import lombok.Data;

@Data
public class Page{
	private int number;
	private int size;
	private int totalPages;
	private int totalElements;
}