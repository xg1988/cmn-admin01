package com.chosu.cmn.admin.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EncryptConfigTest {

    public static void main(String[] args) {

    }

    @Test
    public void test(String plainText){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("qlalfqjsgh");
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);

        //String plainText = "bb5fc12e7ab829"; // 암호화 할 내용
        String encryptedText = encryptor.encrypt(plainText); // 암호화
        String decryptedText = encryptor.decrypt(encryptedText); // 복호화
        System.out.println("Enc:"+encryptedText+", Dec:"+decryptedText);
    }
}
