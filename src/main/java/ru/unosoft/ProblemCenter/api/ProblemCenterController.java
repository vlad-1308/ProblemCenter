package ru.unosoft.ProblemCenter.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.unosoft.ProblemCenter.dto.YASkillResponse;
import ru.unosoft.ProblemCenter.dto.YandexAliceRequest;
import ru.unosoft.ProblemCenter.dto.YandexAliceResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/problem-center")
public class ProblemCenterController {

    @PostMapping("/yandex-alice-skill/")
    public @ResponseBody YandexAliceResponse yandexAliceSkill(@RequestBody YandexAliceRequest request) {
        log.info(request.toString());
        return new YandexAliceResponse(
                new YASkillResponse("Я помогу вам узнать о доступности связи в Ленинградской области."
                )
        );
    }
}
