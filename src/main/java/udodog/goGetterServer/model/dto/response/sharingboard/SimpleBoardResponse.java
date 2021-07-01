package udodog.goGetterServer.model.dto.response.sharingboard;

import lombok.*;
import udodog.goGetterServer.model.entity.SharingBoard;
import udodog.goGetterServer.model.entity.SharingBoardReply;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class SimpleBoardResponse {

    private Long id;

    private WriterInfo writerInfo;

    private String title;

    private LocalDate createdAt;

    // 댓글 수
    private Integer replyCnt;

    // 좋아요 수
    private Integer likeCnt;


    public SimpleBoardResponse(SharingBoard sharingBoard, Integer replyCnt, Integer likeCnt, WriterInfo writerInfo) {
        this.writerInfo = writerInfo;
        this.id = sharingBoard.getId();
        this.title = sharingBoard.getTitle();
        this.createdAt = sharingBoard.getCreatedAt();

        this.replyCnt = replyCnt;
        this.likeCnt = likeCnt;
    }
}
