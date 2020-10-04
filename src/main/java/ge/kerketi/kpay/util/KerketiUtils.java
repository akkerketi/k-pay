package ge.kerketi.kpay.util;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

public class KerketiUtils {

    public static char[] generateOtp(int len) {
        String numbers = "0123456789";
        Random random = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++) {
            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
        }
        return otp;
    }

    public static String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

}
