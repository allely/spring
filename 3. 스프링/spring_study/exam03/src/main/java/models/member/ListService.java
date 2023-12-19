package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ListService {
    private MemberDao memberDao;
    private Optional<DateTimeFormatter> opt;

    public void setFormatter(Optional<DateTimeFormatter> opt) {
        this.opt = opt;
    }
    @Autowired
    public void setMemberDao(/*@Qualifier("memberDao")*/ MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void print() {
        List<Member> members = memberDao.getList();
        for(Member member : members) {
            DateTimeFormatter formatter = opt.orElse(null);
            if (formatter != null) {
                String regDtStr = formatter.format(member.getRegDt());
                member.setRegDtStr(regDtStr);
                System.out.println(member);
            }
        }
    }
}
