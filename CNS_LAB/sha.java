import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class sha{
 public static String encryptThisString(String input)
 {
  try {
   MessageDigest md = MessageDigest.getInstance("SHA-1");
   byte[] messageDigest = md.digest(input.getBytes());
   BigInteger no = new BigInteger(1, messageDigest);
   String hashtext = no.toString(16);
   while (hashtext.length() < 32) {
    hashtext = "0" + hashtext;
   }
   return hashtext;
  }
  catch (NoSuchAlgorithmException e) {
   throw new RuntimeException(e);
  }
 }
 public static void main(String args[]) throws NoSuchAlgorithmException
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first string: ");
  String s1 = sc.nextLine();
  System.out.println("Enter the second string: ");
  String s2 = sc.nextLine();
  System.out.println("\n" + s1 + " : " + encryptThisString(s1));
  System.out.println("\n" + s2 + " : " + encryptThisString(s2));
 }
}

