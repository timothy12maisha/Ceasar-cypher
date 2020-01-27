public class Decode {
    public String decrypting(String userInput , int Key) {
        String letterDatabase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String decryptedString ="";
        for (int i = 0;
             i< userInput.length(); i++ ){
            int indexOfUserInput =letterDatabase.indexOf(userInput.charAt(i));
            int cipherEquation = (indexOfUserInput -Key ) % 26;
            char replaceLetterDatabase = letterDatabase.charAt(cipherEquation);
            decryptedString += replaceLetterDatabase;
        }
        return decryptedString;
    }
}
