package ispalindrome;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("RaCeCaR"));


    }

    public static boolean isPalindrome (String word){
        int i;
        word = word.toLowerCase();
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}