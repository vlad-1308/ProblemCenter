package ru.unosoft.ProblemCenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class YandexAliceResponse {
    @NonNull
    YASkillResponse response;
    @NonNull
    String version = "1.0";
}
