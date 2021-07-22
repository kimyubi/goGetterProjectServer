package udodog.goGetterServer.repository.querydsl.message;

import udodog.goGetterServer.model.entity.Message;

import java.util.List;

public interface MessageNotificationExtension {

    Long countUncheckedMessage(Long receiverId);

    List<Message> findByReceiverIdAndSenderId(Long userId1, Long userId2);
}
