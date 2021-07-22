package udodog.goGetterServer.service.message;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageSenderService {

//    private final MessageRepository messageRepository;
//
//    private final UserRepository userRepository;
//
//    public DefaultRes messageSender(MessageSenderRequestDto request){
//
//        Long senderId = request.getSenderId();
//        Long receiverId = request.getReceiverId();
//
//        Optional<User> optionalSender = userRepository.findById(senderId);
//        Optional<User> optionalReceiver = userRepository.findById(receiverId);
//
//        return optionalSender.map(sender -> {
//            return optionalReceiver.map(receiver->{
//                messageRepository.save(new Message(sender, receiver, request.getContent()));
//                return DefaultRes.response(HttpStatus.OK.value(), "전송성공");
//            }).orElseGet(() -> DefaultRes.response(HttpStatus.UNPROCESSABLE_ENTITY.value(), "수신자정보없음"));
//        }).orElseGet(() -> DefaultRes.response(HttpStatus.UNPROCESSABLE_ENTITY.value(), "발신자정보없음"));
//
//
//    }
}
