package neu.jia.assignment01;

import java.util.HashSet;
import java.util.Set;

//Question2: Write a program to check if a string has all unique characters.
public class UniqueCharacters {

    public boolean allUniqueCharacters(String s){

        //hashset to store the keys(char in string), hashset could not contain duplicates
        Set<Character> set = new HashSet<>();
        for(Character ch : s.toCharArray()){
            if(set.contains(ch)){
                return false;
            }else{
                set.add(ch);
            }
        }
        return true;
    }
}
