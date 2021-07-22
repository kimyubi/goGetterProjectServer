package udodog.goGetterServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udodog.goGetterServer.model.entity.MessageRoomJoin;

public interface MessageRoomJoinRepository extends JpaRepository<MessageRoomJoin, Long> {
}
