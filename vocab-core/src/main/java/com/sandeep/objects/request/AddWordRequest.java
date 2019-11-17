package com.sandeep.objects.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
public class AddWordRequest {

    @Size(min = 2,max = 200,message = "Word can't be less then 2")
    private String word;

    @Size(min = 1,max = 5)
    private Set<String> synonyms;

    @NotNull(message = "description can not empty!")
    private String description;

    @JsonProperty(value = "meaning_in_hindi")
    private String translationInHindi;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddWordRequest that = (AddWordRequest) o;
        return word.equals(that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
