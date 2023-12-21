package controllers.members;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin {
    @NotBlank
    @Size(min=6)    // 최소 6자리.
    private String userId;
    @NotBlank
    @Size(min=8)
    private String userPw;
    @NotBlank
    private String confirmPw;
    @NotBlank
    private String userNm;

    @Email
    private String email;

    @AssertTrue // 참값일 때만 통과
    private boolean agree;
}
