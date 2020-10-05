package ge.kerketi.kpay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private final Auth auth = new Auth();

    @Value("${jwtSecret}")
    private String jwtSecret;

    @PostConstruct
    public void init() {
        this.auth.setTokenSecret(jwtSecret);
    }

    public static class Auth {
        private String tokenSecret;

        public String getTokenSecret() {
            return tokenSecret;
        }

        public void setTokenSecret(String tokenSecret) {
            this.tokenSecret = tokenSecret;
        }

    }

    public Auth getAuth() {
        return auth;
    }

}
