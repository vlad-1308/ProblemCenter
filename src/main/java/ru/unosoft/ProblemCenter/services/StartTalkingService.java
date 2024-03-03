package ru.unosoft.ProblemCenter.services;

import org.springframework.stereotype.Service;
import ru.unosoft.ProblemCenter.dto.YASkillResponse;
import ru.unosoft.ProblemCenter.dto.YandexAliceRequest;
import ru.unosoft.ProblemCenter.dto.YandexAliceResponse;

@Service
public class StartTalkingService implements ProblemCenterService {
    @Override
    public YandexAliceResponse talkYandexAlice(YandexAliceRequest request) {
        return new YandexAliceResponse(
            new YASkillResponse("Hi i can help you")
        );
    }
}
