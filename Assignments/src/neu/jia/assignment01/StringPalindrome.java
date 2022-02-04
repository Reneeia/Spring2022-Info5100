package neu.jia.assignment01;

//Question 1: Write a program find if String is Palindrome?

public class StringPalindrome {

    public boolean checkPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - 1 -i]) {
                return false;
            }
        }
        return true;
    }
}
