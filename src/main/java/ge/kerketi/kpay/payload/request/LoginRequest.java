package ge.kerketi.kpay.payload.request;

import ge.kerketi.kpay.payload.common.I18nRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class LoginRequest extends I18nRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
