package udodog.goGetterServer.controller.api.message;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udodog.goGetterServer.service.message.MessageSenderService;

@Api(tags = {"쪽지 발송 API"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MessageSenderController {

    private final MessageSenderService messageSenderService;

//    @ApiOperation(value = "쪽지 발송 API",notes = "사용자가 쪽지를 전송할때 사용하는 API 입니다. (블랙회원 사용 x)")
//    @ApiResponses(value ={
//            @ApiResponse(code=200, message = "1. 등록성공"),
//            @ApiResponse(code=422, message = "1. 발신자정보없음 \n 2. 수신자정보없음")
//    })
//    @PostMapping("/users/messages")
//    public ResponseEntity<DefaultRes> messageSender(
//            @Valid @RequestBody MessageSenderRequestDto request
//            ){
//
//        DefaultRes result = messageSenderService.messageSender(request);
//
//        if(result.getStatusCode() == HttpStatus.OK.value()){
//            return new ResponseEntity<>(result, HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(result, HttpStatus.UNPROCESSABLE_ENTITY);
//        }
//    }
}
