package models.member;

import controllers.members.RequestJoin;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final MemberDao memberDao;

    public void join(RequestJoin form) {    // 데이터을 입력받아 영구 저장한다.

        // BCrypt 이용한 암호화. 매번 다른 해시값으로 보안 안전.
        String hash = BCrypt.hashpw(form.getUserPw(), BCrypt.gensalt(12));

        Member member = Member.builder()
                .userId(form.getUserId())
                .userPw(hash)
                .userNm(form.getUserNm())
                .email(form.getEmail())
                .build();
        memberDao.register(member);
    }
}
