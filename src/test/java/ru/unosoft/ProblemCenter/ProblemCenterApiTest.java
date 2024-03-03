package ru.unosoft.ProblemCenter;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import lombok.SneakyThrows;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class ProblemCenterApiTest {
    @Autowired
    private MockMvc mockMvc;
    private final String requestFromAlice = "{"
                                            + "  \"meta\": {"
                                            + "},"
                                            + "  \"request\": {"
                                            + "    \"command\": \"Алиса запусти навык корвус\","
                                            + "    \"original_utterance\": \"Алиса запусти навык корвус\","
                                            + "    \"type\": \"SimpleUtterance\","
                                            + "    \"payload\": {},"
                                            + "    \"nlu\": {"
                                            + "      \"tokens\": ["
                                            + "        \"алиса\","
                                            + "        \"запусти\","
                                            + "        \"навык\","
                                            + "        \"корвус\""
                                            + "      ]"
                                            + "    }"
                                            + "  },"
                                            + "  \"session\": {"
                                            + "    \"message_id\": 0,"
                                            + "    \"session_id\": \"2eac4854-fce721f3-b845abba-20d60\","
                                            + "    \"user\": {"
                                            + "      \"user_id\": \"47C73714B580EE\","
                                            + "      \"access_token\": \"AgAAAAAB4vpbAAApoR1oaCd5yR6eiXSHqOGT8dT\""
                                            + "    },"
                                            + "    \"application\": {"
                                            + "      \"application_id\": \"47C73714B580ED\""
                                            + "    },"
                                            + "    \"new\": true"
                                            + "  },"
                                            + "  \"version\": \"1.0\""
                                            + "}";

    @Test
    @SneakyThrows
    public void should_accept_request_from_yandex_alice_and_return_valid_response() {
        mockMvc.perform(
                post("/api/v1/problem-center/yandex-alice-skill/")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .content(requestFromAlice)
            )
            .andExpect(status().isOk())
            .andExpect(content().json("{" //проверка содержимого ответа
                                      + "  \"response\": {"
                                      + "    \"text\": \"Привет! "
                                      + "Я помогу вам узнать о доступности связи в Ленинградской области.\","
                                      + "    \"end_session\": false"
                                      + "  },"
                                      + "  \"version\": \"1.0\""
                                      + "}"
            ));
    }
}
