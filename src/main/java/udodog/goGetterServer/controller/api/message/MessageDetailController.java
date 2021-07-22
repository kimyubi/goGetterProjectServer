package udodog.goGetterServer.controller.api.message;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udodog.goGetterServer.model.dto.DefaultRes;
import udodog.goGetterServer.model.dto.response.MessageDetailResponse;
import udodog.goGetterServer.service.message.MessageDetailService;

import java.util.List;

@Api(tags = {"쪽지 상세 조회 API"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MessageDetailController {

    private final MessageDetailService messageDetailService;

    @ApiOperation(value = "쪽지 상세 조회 API",notes = "쪽지 상세 조회 API 입니다. (블랙회원 사용 o)")
    @ApiResponses(value ={
            @ApiResponse(code=200, message = "1. 조회 성공 2. 조회 실패"),
    })
    @GetMapping("/bkusers/messages/detail")
    public ResponseEntity<DefaultRes<List<MessageDetailResponse>>> messageDetail(@RequestParam Long userId1, @RequestParam Long userId2) {
        return new ResponseEntity<>(messageDetailService.messageDetail(userId1,userId2), HttpStatus.OK);
    }

}
