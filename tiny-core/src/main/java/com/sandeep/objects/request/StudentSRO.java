package com.sandeep.objects.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentSRO {

    private String name;
    private String email;
    @JsonProperty(value = "reportCard")
    private ReportCardInfoSRO reportCardInfo;

    @JsonProperty(value = "class")
    private StudentClassSRO classOfStudent;
}
