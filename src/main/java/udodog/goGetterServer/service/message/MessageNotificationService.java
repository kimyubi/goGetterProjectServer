package udodog.goGetterServer.service.message;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import udodog.goGetterServer.repository.MessageRepository;


@Service
@RequiredArgsConstructor
public class MessageNotificationService {

    private final MessageRepository messageRepository;

//    public DefaultRes<MessageNotificationResponse> messageNotification(MessageNotificationRequest request) {
//        Long receiverId = request.getReceiverId();
//        Long uncheckedMessageCnt = messageRepository.countUncheckedMessage(receiverId);
//
//        return DefaultRes.response(HttpStatus.OK.value(),"조회 성공", new MessageNotificationResponse(uncheckedMessageCnt));
//    }
}
