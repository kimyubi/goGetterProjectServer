package udodog.goGetterServer.repository.querydsl.message;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import udodog.goGetterServer.model.entity.Message;

import java.util.List;

public class MessageNotificationExtensionImpl  extends QuerydslRepositorySupport implements MessageNotificationExtension {

    public MessageNotificationExtensionImpl() {
        super(Message.class);
    }

    @Override
    public Long countUncheckedMessage(Long receiverId) {
//        QMessage message = QMessage.message;
//
//        Long uncheckedCnt = from(message)
//                .where(message.receiver.id.eq(receiverId))
//                .where(message.isChecked.isFalse()).fetchCount();

        return null;
    }

    @Override
    public List<Message> findByReceiverIdAndSenderId(Long userId1, Long userId2) {
        QMessage message = QMessage.message;
        JPQLQuery<Message> query = from(message)
                .orderBy(message.sendAt.desc())
                .where(message.receiver.id.eq(userId1))
                .where(message.sender.id.eq(userId2));


        return query.fetch();
    }
}
