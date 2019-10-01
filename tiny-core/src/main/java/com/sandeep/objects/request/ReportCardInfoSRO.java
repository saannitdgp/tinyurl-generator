package com.sandeep.objects.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class ReportCardInfoSRO {

    private String department;

    private Double percentage;
}
