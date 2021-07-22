package udodog.goGetterServer.model.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import udodog.goGetterServer.model.entity.Message;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class MessageDetailResponse {

    private Long messageId;

    private Long senderId;

    private Long receiverId;

    private String content;

    private LocalDateTime sendAt;

    private Boolean isChecked;

    private Boolean isDeleted;


    public MessageDetailResponse(Message message) {
        this.messageId = message.getId();
        this.senderId = message.getSender().getId();
        this.receiverId = message.getReceiver().getId();
        this.content = message.getContent();
        this.sendAt = message.getSendAt();
        this.isChecked = message.getIsChecked();
        this.isDeleted = message.getIsDeleted();
    }
}
