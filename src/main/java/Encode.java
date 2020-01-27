public class Encode {
    public String encrypting(String userInput , int Key) {
        String letterDatabase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encryptedString ="";
        for (int i = 0; i< userInput.length(); i++ ){
            int indexOfUserInput =letterDatabase.indexOf(userInput.charAt(i));
            int cipherEquation = (Key + indexOfUserInput) % 26;
            char replaceLetterDatabase = letterDatabase.charAt(cipherEquation);
            encryptedString += replaceLetterDatabase;
        }
        return encryptedString;

    }
}
