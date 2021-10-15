package com.jcpdev.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PetProfile {
	private int idx; 			// 회원번호	
	private String pet;			// 견종		
	private String p_name;		// 이름	
	private String p_gender;	// 성별
	private double p_weight;	// 몸무게
	private String p_birth; 	// 생년월일
	private String p_neu; 		// 중성화여부
}
