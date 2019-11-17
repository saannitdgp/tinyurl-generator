package com.sandeep.config;

import com.sandeep.exception.InvaildDataException;
import com.sandeep.exception.NoDataFoundException;
import com.sandeep.objects.response.BaseResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(InvaildDataException.class)
	public BaseResponse<String> handleInvalidDataException(final InvaildDataException e) {
		return generateResponse(e.getCode(), e.getMessage(),null);
	}


	@ExceptionHandler(NoDataFoundException.class)
	public BaseResponse<String> handleNoDataFoundException(final NoDataFoundException e) {
		return generateResponse(e.getCode(), e.getMessage(), null);
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public BaseResponse<String> handleGenericException(final Exception e) {
		return generateResponse("401","INTERNAL SERVER ERROR", e.getMessage());
	}

	private BaseResponse<String> generateResponse(String code, String message, String data) {

		return new BaseResponse<String>(data, message, code);
	}

}
