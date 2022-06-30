package com.learn.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Physical {

	private int height;
	private int weight;
	
}
