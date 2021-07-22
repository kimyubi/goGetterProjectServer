package udodog.goGetterServer.controller.api.message;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"쪽지함 전체조회 API"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MessageFindAllController {

//    private final MessageFindAllService messageFindAllService;
//
//    @ApiOperation(value = "쪽지함 전체조회 API",notes = "사용자가 쪽지함 전체조회시 사용되는 API 입니다.")
//    @ApiResponses(value ={
//            @ApiResponse(code=200, message = "1. 조회성공 \n 2. 사용자없음"),
//    })
//    @GetMapping("/bkusers/messages/{userId}")
//    public ResponseEntity<DefaultRes> messageFindAll(
//            @PathVariable("userId") Long userId
//    ){
//        return null;
//    }
}
