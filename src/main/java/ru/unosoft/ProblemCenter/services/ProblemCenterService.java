package ru.unosoft.ProblemCenter.services;

import ru.unosoft.ProblemCenter.dto.YandexAliceRequest;
import ru.unosoft.ProblemCenter.dto.YandexAliceResponse;

public interface ProblemCenterService {
    YandexAliceResponse talkYandexAlice(YandexAliceRequest request);
}
