import java.util.*;
import java.util.Scanner;
public class App {
    public static void main(String args[]) {
     Scanner scl = new Scanner(System.in);
       boolean programRunning = true;
       while(programRunning) {
             System.out.println("Welcome to Caeser Cipher\n" +
                     "------------------------------------------------\n" +
                     "Choose:\n 1 for Encryption\n 2 for Decryption\n # to Exit");

                 String select = scl.nextLine();
             if (select.equals("1")) {
                 System.out.println("-----------------------------------------------");
                 System.out.println("Input the plaintext message : ");
                 String mText = scl.nextLine();
                 System.out.println("Enter the value by which each character in the plaintext message gets Encrypted : ");
                 int mNumbers = scl.nextInt();
                 System.out.println("-----------------------------------------------");
                 Cipher theTest = new Cipher(mText,mNumbers);
                 System.out.println("Your encrypted text is:" + theTest.EncryptedText());
                 System.out.println("-----------------------------------------------");
              } else if (select.equals("2")) {
                 System.out.println("-----------------------------------------------");
                 System.out.println("Input the cipher text message tobe decrypted: ");
                 String mText = scl.nextLine();
                 System.out.println("Enter the decryption Number:");
                 int mNumbers = scl.nextInt();
                 System.out.println("-----------------------------------------------");
                 Decipher theMessage = new Decipher (mText,mNumbers);
                 System.out.println("Your decrypted message is: " + theMessage.DecryptedText());
                 System.out.println("-----------------------------------------------");
              } else if (select.equals("#")) {
                 programRunning = false;
                 System.exit(0);
              } else {
                 System.out.println("Invalid input!!!!");
              }
              }
          }
        }