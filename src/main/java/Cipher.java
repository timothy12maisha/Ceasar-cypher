import java.util.Scanner;

public class Cipher {
    public static void main(String[] args){
        Scanner captureUserInput = new Scanner(System.in);
        System.out.println("Welcome to  Ceaser Cipher type sentence below ");

        Encode encoder = new Encode();
        Decode decoder = new Decode();

            System.out.println( "Enter the word to encrypt now!!!");
            String inputToEncode = captureUserInput.next();
            System.out.println("Enter key to encrypt!");
            int inputKey = captureUserInput.nextInt();
            System.out.println("The encrypted word is " + encoder.encrypting(inputToEncode, inputKey));
            System.out.println( "Enter the word to decrypt now");
            String inputToDecode = captureUserInput.next();
            System.out.println("Enter key to decrypt");
            int inputKey1 = captureUserInput.nextInt();
            System.out.println("The decrypted word is " + decoder.decrypting(inputToDecode, inputKey1));

}
}

