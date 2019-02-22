package com.micda.g2.searchengine.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true, includeFieldNames=true)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {
	private static final long serialVersionUID = 4584595397027699062L;
	
	@Getter
	@Setter
	private String level;
	@Getter
	@Setter
	private String diploma;

}
