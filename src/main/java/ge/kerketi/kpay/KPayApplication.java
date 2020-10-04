package ge.kerketi.kpay;

import ge.kerketi.kpay.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class KPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KPayApplication.class, args);
    }

}
