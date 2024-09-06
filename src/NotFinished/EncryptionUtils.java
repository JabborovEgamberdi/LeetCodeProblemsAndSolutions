package NotFinished;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalTime;
import java.util.Base64;

public class EncryptionUtils {

    private static final String AES_ALGORITHM = "AES";
    private static final String secretKey = "6fks81mac40mf5zbtw52kcnv0qxa284b"; //SHOULD BE length lengths of 16, 24, or 32 bytes, respectively

    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        String encode = decode1("");
        System.out.println("encode = " + encode);
    }

    public static String encode(String input) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), AES_ALGORITHM);
        Cipher cipher;
        try {
            cipher = Cipher.getInstance(AES_ALGORITHM);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
        try {
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        byte[] encryptedBytes;
        try {
            encryptedBytes = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decode(String input) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), AES_ALGORITHM);
        Cipher cipher;
        try {
            cipher = Cipher.getInstance(AES_ALGORITHM);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        byte[] decodedBytes;
        try {
            decodedBytes = cipher.doFinal(Base64.getDecoder().decode(input));
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    public static String decode1(String input) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), AES_ALGORITHM);
        Cipher cipher;
        try {
            cipher = Cipher.getInstance(AES_ALGORITHM);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        byte[] decodedBytes;
        try {
            decodedBytes = cipher.doFinal(Base64.getDecoder().decode(input));
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

//    public static void main(String[] args) {
//        String decoded = decode1("EBM3w+lrvJ1kSAW4NdVybw==");
//        System.out.println("decoded = " + decoded);
//    }

}