package com.luxprojects.onlineBook.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.luxprojects.onlineBook.dto.ErrorsDTO;
import com.luxprojects.onlineBook.enums.StatusError;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
	
	private StatusError status;
	private List<ErrorsDTO> errors;
	private T results;

}
