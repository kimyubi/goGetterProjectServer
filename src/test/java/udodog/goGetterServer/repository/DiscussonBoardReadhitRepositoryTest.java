package udodog.goGetterServer.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import udodog.goGetterServer.model.entity.DiscussionBoard;
import udodog.goGetterServer.model.entity.DiscussionBoardReadhit;
import udodog.goGetterServer.model.entity.User;
import udodog.goGetterServer.model.enumclass.UserGrade;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DiscussonBoardReadhitRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DiscussonBoardRepository discussonBoardRepository;

    @Autowired
    private DiscussonBoardReadhitRepository discussonBoardReadhitRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void saveDiscussiontReadhit(){

        //given
        //given
        User user = User.builder()
                .email("hwoo00oo96@gmail.com")
                .password("1234")
                .name("변현우")
                .nickName("woo00oo")
                .phoneNumber("010-9245-7396")
                .grade(UserGrade.USER)
                .build();

        User saveUser = userRepository.save(user);

        DiscussionBoard discussionBoard = DiscussionBoard.builder()
                .user(saveUser)
                .title("토론 게시판 테스트입니다.")
                .content("토론 게시판 테스트 내용 입니다.")
                .build();

        DiscussionBoard saveDiscussion = discussonBoardRepository.save(discussionBoard);

        DiscussionBoardReadhit discussionBoardReadhit = DiscussionBoardReadhit.builder()
                .discussionBoard(saveDiscussion)
                .count(1)
                .build();

        //when
        DiscussionBoardReadhit saveDiscussionReadhit = discussonBoardReadhitRepository.save(discussionBoardReadhit);

        //then
        assertThat(discussionBoardReadhit).isEqualTo(saveDiscussionReadhit);
    }
}