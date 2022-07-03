package com.learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Physical {

	@Id
	private int id;
	private int height;
	private int weight;
	
}
