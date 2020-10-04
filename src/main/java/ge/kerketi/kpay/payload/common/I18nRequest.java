package ge.kerketi.kpay.payload.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class I18nRequest {
    @NotNull
    @ApiModelProperty(name = "language", value = "KA, EN", required = true)
    private Language language;
}
