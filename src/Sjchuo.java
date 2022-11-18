import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class Sjchuo {
    public static void main(String[] args) {
        Long time = System.currentTimeMillis();
        String tna = String.valueOf(time);
        System.out.println(tna);

        String data = "sasdsadasdasda";
        String key = "123213213";
        try {
            String a = HmacSHA256(data, key);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String HmacSHA256(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }

        return sb.toString().toUpperCase();
    }
}
