package udodog.goGetterServer.service.message;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import udodog.goGetterServer.model.dto.DefaultRes;
import udodog.goGetterServer.model.dto.response.MessageDetailResponse;
import udodog.goGetterServer.model.dto.response.message.MessageNotificationResponse;
import udodog.goGetterServer.model.entity.Message;
import udodog.goGetterServer.repository.MessageRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageDetailService {

    private final MessageRepository messageRepository;

    public DefaultRes<List<MessageDetailResponse>> messageDetail(Long userId1, Long userId2) {
        List<MessageDetailResponse> messageDetailResponseList = new LinkedList<>();

        List<Message> r1s2 = messageRepository.findByReceiverIdAndSenderId(userId1,userId2);
        List<Message> r2s1 = messageRepository.findByReceiverIdAndSenderId(userId2,userId1);

        for(Message message : r1s2){
            MessageDetailResponse messageDetailResponse = new MessageDetailResponse(message);
            messageDetailResponseList.add(messageDetailResponse);
        }

        for(Message message : r2s1){
            MessageDetailResponse messageDetailResponse = new MessageDetailResponse(message);
            messageDetailResponseList.add(messageDetailResponse);
        }

        
        return DefaultRes.response(HttpStatus.OK.value(),"조회 성공", messageDetailResponseList);
    }
}
