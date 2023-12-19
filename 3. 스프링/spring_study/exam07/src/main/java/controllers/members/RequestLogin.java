package controllers.members;

import jakarta.validation.constraints.NotBlank;

public record RequestLogin(
        @NotBlank
        String userId,
        @NotBlank
        String userPw
) {}