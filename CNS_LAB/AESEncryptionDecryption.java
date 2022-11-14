import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;

public class AESEncryptionDecryption {
 public static void main(String[] args) {
  try{
    Cipher cipher = Cipher.getInstance("AES");
    KeyGenerator kg = KeyGenerator.getInstance("AES");
    Key key = kg.generateKey();

    cipher.init(Cipher.ENCRYPT_MODE, key);
    CipherInputStream cipt=new CipherInputStream(new FileInputStream(new File("/home/cse/PlainTextInput.txt")), cipher);
    FileOutputStream fip=new FileOutputStream(new File("/home/cse/EncryptedText.txt"));

    int i;
    while((i=cipt.read())!=-1)
    {
     fip.write(i);
    }
    cipher.init(Cipher.DECRYPT_MODE, key);
    CipherInputStream ciptt=new CipherInputStream(new FileInputStream(new File("/home/cse/EncryptedText.txt")), cipher);
    FileOutputStream fop=new FileOutputStream(new File("/home/cse/DecryptedText.txt"));

    int j;
    while((j=ciptt.read())!=-1)
    {
      fop.write(j);
    }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
  System.out.println("Encryption and Decryption of plain text file performed successfully."); 
 }
}
