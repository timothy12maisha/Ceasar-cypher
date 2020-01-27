import java.util.Scanner;

public class Cipher {
    public static void main(String[] args){
        Scanner captureUserInput = new Scanner(System.in);
        System.out.println("Welcome to  Ceaser Cipher!");
        System.out.println("..........................");
        System.out.println("type '1' to encrypt\n");
        System.out.println("type '2' to decrypt\n");
        int choiceInput = captureUserInput.nextInt();

        Encode encoder = new Encode();
        Decode decoder = new Decode();
        if( choiceInput == 1){
            System.out.println( "Enter the word to encrypt now!");
            String inputToEncode = captureUserInput.next();
            System.out.println("Enter key to encrypt!");
            int inputKey = captureUserInput.nextInt();
            System.out.println("The encrypted word is " + encoder.encrypting(inputToEncode, inputKey));
        }
        else if (choiceInput == 2){
            System.out.println( "Enter the word to decrypt now");
            String inputToDecode = captureUserInput.next();
            System.out.println("Enter key to decrypt");
            int inputKey = captureUserInput.nextInt();
            System.out.println("The decrypted word is " + decoder.decrypting(inputToDecode, inputKey));
        }

}
}

