package udodog.goGetterServer.controller.api.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import udodog.goGetterServer.config.WebMvcConfig;
import udodog.goGetterServer.service.message.MessageSenderService;


@RunWith(SpringRunner.class)
@WebMvcTest(MessageSenderController.class)
@Slf4j
public class MessageSenderControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    MessageSenderService messageSenderService;

    @MockBean
    WebMvcConfig webMvcConfig;

//    @Test
//    public void 쪽지_전송_성공() throws Exception {
//
//
//        DefaultRes result = new DefaultRes(HttpStatus.OK.value(), "전송성공", null, null);
//        given(messageSenderService.messageSender(any())).willReturn(result);
//
//
//        mvc.perform(post("/api/users/messages")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "  \"content\": \"안녕하세요\",\n" +
//                        "  \"receiver_id\": 1,\n" +
//                        "  \"sender_id\": 2\n" +
//                        "}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.message", equalTo(result.getMessage())));
//
//    }
//
//    @Test
//    public void 쪽지_전송_실패() throws Exception {
//
//
//        DefaultRes result = new DefaultRes(HttpStatus.UNPROCESSABLE_ENTITY.value(), "수신자정보없음", null, null);
//        given(messageSenderService.messageSender(any())).willReturn(result);
//
//
//        mvc.perform(post("/api/users/messages")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "  \"content\": \"안녕하세요\",\n" +
//                        "  \"receiver_id\": 1,\n" +
//                        "  \"sender_id\": 2\n" +
//                        "}"))
//                .andExpect(status().is4xxClientError())
//                .andExpect(jsonPath("$.message", equalTo(result.getMessage())));
//
//    }

}