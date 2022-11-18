package rsa;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author rwg
 * @date 2021/10/19 11:42
 */
public class RSATEST {

    /**
     * @author rwg
     * @date 2021/10/15 15:46
     */
        public static String data = "hello world";

        public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub

// 公钥加密

            byte[] encryptedBytes = encrypt(data.getBytes());

            System.out.println("利用公钥加密后：" + new String(encryptedBytes));

// 私钥解密

            byte[] decryptedBytes = decrypt(encryptedBytes);

            System.out.println("利用私钥解密后：" + new String(decryptedBytes));

        }


// 公钥加密

        public static byte[] encrypt(byte[] content) throws Exception {
            String publicString = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCw2/w7RlX1pyjcIkm+oB4qLIJN\n" +
                    "7G5vJJ01hsvVV0702IqbdzcuAMnv73PIkpwwv2+kM1Hobdu/CDlhywCuel0nFtSh\n" +
                    "v1Xf39Wt43Sex31WAfDA7Po1dHNoJ9cUZiBwe8ANPsXgdECUW8YhgcyRRadbTstm\n" +
                    "Lnri0jW3lMV2bjUOqQIDAQAB";
            SecretKeySpec skeySpec = new SecretKeySpec(publicString.getBytes("UTF-8"), "RSA");
            Cipher cipher = Cipher.getInstance("RSA");// java默认"RSA"="RSA/ECB/PKCS1Padding"
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            return cipher.doFinal(content);

        }

// 私钥解密

        public static byte[] decrypt(byte[] content) throws Exception {
            Cipher cipher = Cipher.getInstance("RSA");
            String privateString = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBALDb/DtGVfWnKNwi\n" +
                    "Sb6gHiosgk3sbm8knTWGy9VXTvTYipt3Ny4Aye/vc8iSnDC/b6QzUeht278IOWHL\n" +
                    "AK56XScW1KG/Vd/f1a3jdJ7HfVYB8MDs+jV0c2gn1xRmIHB7wA0+xeB0QJRbxiGB\n" +
                    "zJFFp1tOy2YueuLSNbeUxXZuNQ6pAgMBAAECgYBcSY6nB57XXvDNXf8JP9g9vZgJ\n" +
                    "PXSq/noickJvAu4qicxaL61VjgfR8iuC4C4sqdiB4F2/YYQnfQ0kYJ/sa+GrI8Dj\n" +
                    "drAza7GUNjLAqoRbDX8KHAlFoNFaioO/TTl2pLpC0m9OULUaxH/oWnid4huhYdgi\n" +
                    "i8Buc50ddCkQCYwwOQJBAN+myQU+FX7ssktRcYfKGqzfkdVtBJoQQXRhb956Dai2\n" +
                    "lnKyQQbHDMD0eWrfcgfB+MOpM3pszdBl/v3P7M90Cw8CQQDKcJxozKl8lc0UPruq\n" +
                    "HGF7K1PPMr/r3eiOA2kV0JtmlzQyuKJv1GGrat60CAX+goBH9Z/kb57pFN323RKL\n" +
                    "0CrHAkBNgOfSmEQsuuvCbBPSwbfixossEd5xYUa9hPKWf2dyWuviDWG5bos95rqY\n" +
                    "zZwfkhmZ/G2pdEESgfYOkNp4vbcDAkB1oUOxPaMKKn1U0zL2oLEgAcgcMHAGnRYh\n" +
                    "Vuf77hAuZ5PEGTcB5hWuplWrpLHe9nOV3KrA8P8UjrR/WmwJY7dHAkA3ib4aHxNt\n" +
                    "jno9S6HqEOUhDad3zDA2Ic5uQat0MfxRTf7BRrd6CyjKmxUoXXddSNzr8YH86EGv\n" +
                    "JZMbHstCOS2N";
            SecretKeySpec skeySpec = new SecretKeySpec(privateString.getBytes("UTF-8"), "RSA");

            cipher.init(Cipher.DECRYPT_MODE, skeySpec);

            return cipher.doFinal(content);

        }
}
