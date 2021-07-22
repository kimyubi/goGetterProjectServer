package udodog.goGetterServer.service.message;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import udodog.goGetterServer.repository.MessageRepository;
import udodog.goGetterServer.repository.UserRepository;

@RunWith(SpringRunner.class)
public class MessageSenderServiceTest {

    @InjectMocks
    MessageSenderService messageSenderService;

    @Mock
    MessageRepository messageRepository;

    @Mock
    UserRepository userRepository;

//    @Test
//    public void 쪽지_전송_성공(){
//        //given
//        User user1 = new User();
//        User user2 = new User();
//
//        given(userRepository.findById(1L)).willReturn(Optional.of(user1));
//        given(userRepository.findById(2L)).willReturn(Optional.of(user2));
//
//        //when
//        DefaultRes defaultRes = messageSenderService.messageSender(new MessageSenderRequestDto(1L, 2L, "안녕하세요"));
//
//        //then
//        assertThat(defaultRes.getMessage()).isEqualTo("전송성공");
//        assertThat(defaultRes.getStatusCode()).isEqualTo(200);
//    }
//
//    @Test
//    public void 쪽지_전송_실패_발신자없음(){
//        //given
//        User user1 = new User();
//        User user2 = new User();
//
//        given(userRepository.findById(1L)).willReturn(Optional.of(user1));
//        given(userRepository.findById(2L)).willReturn(Optional.of(user2));
//
//        //when
//        DefaultRes defaultRes = messageSenderService.messageSender(new MessageSenderRequestDto(3L, 2L, "안녕하세요"));
//
//        //then
//        assertThat(defaultRes.getMessage()).isEqualTo("발신자정보없음");
//        assertThat(defaultRes.getStatusCode()).isEqualTo(422);
//    }
//
//    @Test
//    public void 쪽지_전송_실패_수신자없음(){
//        //given
//        User user1 = new User();
//        User user2 = new User();
//
//        given(userRepository.findById(1L)).willReturn(Optional.of(user1));
//        given(userRepository.findById(2L)).willReturn(Optional.of(user2));
//
//        //when
//        DefaultRes defaultRes = messageSenderService.messageSender(new MessageSenderRequestDto(1L, 3L, "안녕하세요"));
//
//        //then
//        assertThat(defaultRes.getMessage()).isEqualTo("수신자정보없음");
//        assertThat(defaultRes.getStatusCode()).isEqualTo(422);
//    }



}