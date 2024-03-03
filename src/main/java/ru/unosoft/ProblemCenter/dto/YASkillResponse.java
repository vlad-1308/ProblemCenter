package ru.unosoft.ProblemCenter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class YASkillResponse {
    @NonNull
    private String text;
    @JsonProperty("end_session")
    private boolean endSession = false;
}
