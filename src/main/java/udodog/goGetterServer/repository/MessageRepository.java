package udodog.goGetterServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udodog.goGetterServer.model.entity.Message;
import udodog.goGetterServer.repository.querydsl.message.MessageNotificationExtension;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long>, MessageNotificationExtension {

}
