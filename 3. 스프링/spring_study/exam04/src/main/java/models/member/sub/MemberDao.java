package models.member.sub;

import org.springframework.stereotype.Repository;

@Repository("memberDao2")
public class MemberDao {    /* 기본 빈의 이름 : memberDao
                            -> 동일 이름의 빈과 충돌 가능성
                            -> 이름 변경
                            */
}
