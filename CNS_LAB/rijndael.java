import java.util.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;


public class rijndael
{
 public static String asHex(byte buf[])
 {
  StringBuffer strbuf = new StringBuffer(buf.length * 2);
  int i;
  for(i = 0; i < buf.length; i++)
  {
   if(((int)buf[i] & 0xff) < 0x10)
   {
    strbuf.append("0");
   }
   strbuf.append(Long.toString((int)buf[i]&0xff, 16));
  }
  return strbuf.toString();
 }
 
 public static void main(String[] args) throws Exception
 {
  String message;
  Scanner sc = new Scanner(System.in);
  message = sc.nextLine();
  KeyGenerator kgen = KeyGenerator.getInstance("AES");
  kgen.init(128);
  SecretKey skey = kgen.generateKey();
  byte[] raw = skey.getEncoded();
  SecretKeySpec skeyspec = new SecretKeySpec(raw,"AES");
  Cipher cipher = Cipher.getInstance("AES");
  cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
  byte[] encrypted = cipher.doFinal((args.length==0?message:args[0]).getBytes());
  System.out.println("Encrypted String: " + asHex(encrypted));
  cipher.init(Cipher.DECRYPT_MODE,skeyspec);
  byte[] original = cipher.doFinal(encrypted);
  String originalString = new String(original);
  System.out.println("Original String in Hexadecimal: " + asHex(original));
  System.out.println("Original String: " + originalString);
 }
}
