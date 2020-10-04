package ge.kerketi.kpay.payload.responce;

import lombok.Data;

@Data
public class AuthResponse {
    private String accessToken;

    public AuthResponse(String accessToken) {
        this.accessToken = "Bearer " + accessToken;
    }
}
