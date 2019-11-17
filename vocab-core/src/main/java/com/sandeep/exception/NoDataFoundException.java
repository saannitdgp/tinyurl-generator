package com.sandeep.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoDataFoundException extends RuntimeException{

	private String code;
	/**
	 * @param message
	 * @param code
	 */
	public NoDataFoundException(String message , String code) {
		super(message);
		this.code = code;
	}
}
