import java.lang.String;
import java.util.Scanner;

class Exercise1{
    static public boolean vowelOrConsonent(final char testChar) {
        final String vowels = "aeiou";
        for (int i = 0; i < 5; i++) {
            if (testChar == vowels.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    static public void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        
        System.out.println(vowelOrConsonent(s.charAt(0)));
        
    }
}