package com.sandeep.objects.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sandeep.objects.constants.VocabConstants;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class AddUserRequest {

	@JsonProperty(value = "user_name")
	@NotEmpty
	@Size(min = 3,max = 20)
	private String userName;

	@Email(regexp = VocabConstants.EMAIL_REGEX)
	private String userEmail;

}
