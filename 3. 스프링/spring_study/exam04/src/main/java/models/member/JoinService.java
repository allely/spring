package models.member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor    // 4번째 방법. 상수(final) 또는 @NonNull 멤버를 생성자의 매개변수로 넣고 자동생성.
public class JoinService {  // 빈의 이름 joinService
    //@Autowired
    private final MemberDao memberDao;
    //@Autowired
    @NonNull
    private JoinValidator validator;



    public void join(Member member) {
        // 데이터 검증
        validator.validate(member);

        // 데이터 추가
        memberDao.register(member);
    }
}