package udodog.goGetterServer.model.dto.request.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import udodog.goGetterServer.model.entity.Event;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventCreateRequestDto {

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @FutureOrPresent
    private LocalDate startDate;

    @FutureOrPresent
    private LocalDate endDate;

    private String imgUrl;

    private Long couponBoxId;

    @Builder
    public Event toEntity(){

        return Event.builder()
                .title(title)
                .content(content)
                .startDate(startDate)
                .endDate(endDate)
                .imgUrl(imgUrl)
                .couponBoxId(couponBoxId)
                .build();

    }
}
