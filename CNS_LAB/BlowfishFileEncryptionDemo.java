import java.io.*; 
import java.security.Key; 
import javax.crypto.Cipher; 
import javax.crypto.spec.SecretKeySpec;

public class BlowfishFileEncryptionDemo
{
 private static final String ALGORITHM = "Blowfish";
 private static String key = "knowledge factory";
 private static final String SAMPLE_FILE_PATH = "/home/srija/Sample.txt";
 private static final String ENCRYPTED_FILE_PATH = "/home/srija/blowencrypted.txt";
 private static final String DECRYPTED_FILE_PATH = "/home/srija/blowdecrypted.txt";
 public static void main(String[] args)
 {
  File sampleFile = new File(SAMPLE_FILE_PATH);
  File encryptedFile = new File(ENCRYPTED_FILE_PATH);
  File decryptedFile = new File(DECRYPTED_FILE_PATH);
  try
  {
   BlowfishFileEncryptionDemo.encrypt(sampleFile, encryptedFile);
   BlowfishFileEncryptionDemo.encrypt(encryptedFile, decryptedFile);
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
 }
 public static void encrypt(File sampleFile, File outputFile) throws Exception {
  doCrypto(Cipher.ENCRYPT_MODE, sampleFile, outputFile);
 }
 public static void decrypt(File sampleFile, File outputFile) throws Exception {
  doCrypto(Cipher.DECRYPT_MODE, sampleFile, outputFile);
 }
 private static void doCrypto(int cipherMode, File sampleFile, File outputFile) throws Exception {
  Key secretkey = new SecretKeySpec(key.getBytes(), ALGORITHM);
  Cipher cipher = Cipher.getInstance(ALGORITHM);
  cipher.init(cipherMode, secretkey);
  InputStream inputstream = new FileInputStream(sampleFile);
  byte[] inputBytes = new byte[(int)sampleFile.length()];
  inputstream.read(inputBytes);
  byte[] outputBytes = cipher.doFinal(inputBytes);
  OutputStream outputstream = new FileOutputStream(outputFile);
  outputstream.write(outputBytes);
  inputstream.close();
  outputstream.close();
 }
}

