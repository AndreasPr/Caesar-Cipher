/**
 * Created on 08/Jan/2021 to Caesar-Cipher-Encryptor
 */
public class caesarCipher {

    private static StringBuffer encrypt(String text, int shift){

        StringBuffer result = new StringBuffer();

        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                int originalAlphabetPosition = text.charAt(i) - 'A';
                int newAlphabetPosition = (originalAlphabetPosition + shift)%26;
                char newCharacter = (char)('A' + newAlphabetPosition);
                result.append(newCharacter);
            }
            else{
//                char ch = (char)(((int)text.charAt(i) + shift - 97)%26 + 97);
                int originalAlphabetPosition = text.charAt(i) - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + shift)%26;
                char newCharacter = (char)('a' + newAlphabetPosition);
                result.append(newCharacter);
            }
    }
        return result;
    }

    public static void main(String args[]){
        String text = "arvvdvr";
        int shift = 4;
        System.out.println("The original text: " + text);
        System.out.println("The shift is: " + shift);
        System.out.println("The encrypted text is: " + encrypt(text, shift));
    }


}
