package com.gulukal.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Person { // bu class i sil bir ise yaramiyor

	private long id;

	private String name;

	private String lastName;

}