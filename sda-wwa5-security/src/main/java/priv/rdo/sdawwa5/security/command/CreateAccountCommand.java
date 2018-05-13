package priv.rdo.sdawwa5.security.command;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateAccountCommand {
    @NotBlank
    @Length(min = 6, max = 20)
    private String username;

    @NotBlank
    @Length(min = 6, max = 20)
    private String password;

}
