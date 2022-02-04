package neu.jia.assignment01;

import java.util.HashSet;
import java.util.Set;

//Question 3. Write a program to check if string contains duplicates
public class ContainDuplicates {

    public boolean containsDuplicates(String s){

        //hashset to store the keys(char in string), hashset could not contain duplicates
        Set<Character> set = new HashSet<>();
        for(Character ch : s.toCharArray()){
            if(set.contains(ch)){
                return true;
            }else{
                set.add(ch);
            }
        }
        return false;
    }
}