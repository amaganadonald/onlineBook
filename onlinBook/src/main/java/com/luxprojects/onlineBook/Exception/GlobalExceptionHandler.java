package com.luxprojects.onlineBook.Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.luxprojects.onlineBook.Dtos.ErrorsDTO;
import com.luxprojects.onlineBook.Entities.ApiResponse;
import com.luxprojects.onlineBook.Enums.StatusError;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public  ApiResponse<?> entitiesValidationFailed(MethodArgumentNotValidException exception) {
		ApiResponse<?> apiResponse =  new ApiResponse<>();
		List<ErrorsDTO> errors = new ArrayList<>();
		exception.getBindingResult().getFieldErrors().forEach(
				error-> {
					ErrorsDTO errorsDTO = new ErrorsDTO(error.getField(), error.getDefaultMessage());
					errors.add(errorsDTO);
				});
		apiResponse.setStatus(StatusError.FAILED);
		apiResponse.setErrors(errors);
		return apiResponse;
	}

	@ExceptionHandler(OnlineBookBusinessException.class)
	public ApiResponse<?> onlineBookBusinessException(OnlineBookBusinessException exception) {
		ApiResponse<?> serviceResponse = new ApiResponse<>();
		serviceResponse.setStatus(StatusError.FAILED);
		serviceResponse.setErrors(Collections.singletonList(new ErrorsDTO("", exception.getMessage())));
		return serviceResponse;
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ApiResponse<?> entityNotFoundException(EntityNotFoundException exception) {
		ApiResponse<?> serviceResponse = new ApiResponse<>();
		serviceResponse.setStatus(StatusError.FAILED);
		serviceResponse.setErrors(Collections.singletonList(new ErrorsDTO("", exception.getMessage())));
		return serviceResponse;
	}
}
