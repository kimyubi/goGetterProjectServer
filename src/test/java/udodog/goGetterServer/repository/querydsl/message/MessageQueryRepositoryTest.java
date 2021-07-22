package udodog.goGetterServer.repository.querydsl.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import udodog.goGetterServer.config.JpaAuditingConfig;
import udodog.goGetterServer.config.TestConfig;


@RunWith(SpringRunner.class)
@DataJpaTest(includeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        classes = JpaAuditingConfig.class
))
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(TestConfig.class)
@Slf4j
public class MessageQueryRepositoryTest {

    @Autowired
    private MessageQueryRepository messageQueryRepository;

//    @Test
//    public void 상대방_ID_조회(){
//        Long userId = 192L;
//        List<MessageFindAllResponseDto> result = messageQueryRepository.theOtherReceiveUserFind(userId);
//
//        result.forEach(message -> log.info("userId = {}", message.getContent()));
//    }

}