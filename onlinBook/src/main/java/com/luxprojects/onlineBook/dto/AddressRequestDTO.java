package com.luxprojects.onlineBook.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class AddressRequestDTO {
	@Column(name = "name")
	@NotEmpty(message = "Address name must not be empty")
	@Size(min = 3, message = "Address name must contains at least 3 words")
	private String addressName;
	@Column(name = "city")
	private String addressCity;
	@Column(name = "number")
	@NotNull(message = "Address number must no be not null")
	private int adressNumber;

}
