package udodog.goGetterServer.repository.querydsl.message;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MessageQueryRepository {

    private final JPAQueryFactory queryFactory;


}
