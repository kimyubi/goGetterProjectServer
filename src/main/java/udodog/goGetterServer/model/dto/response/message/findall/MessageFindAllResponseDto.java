package udodog.goGetterServer.model.dto.response.message.findall;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MessageFindAllResponseDto {

    private Long theOtherUserId;

    private String nickName;

    private String content;

    private LocalDateTime sendAt;

    private Integer uncheckedMessageCnt;

    public MessageFindAllResponseDto(Long theOtherUserId, String nickName, String content, LocalDateTime sendAt) {
        this.theOtherUserId = theOtherUserId;
        this.nickName = nickName;
        this.content = content;
        this.sendAt = sendAt;
    }
}
