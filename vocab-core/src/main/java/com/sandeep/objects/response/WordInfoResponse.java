package com.sandeep.objects.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordInfoResponse {

	private String word;

	private List<String> synonyms;

	private String description;

	@JsonProperty(value = "hindi_meaning")
	private String translationInHindi;

	public void setSynonyms(String str) {

		synonyms = Arrays.asList(str.split("-"));
	}
}
