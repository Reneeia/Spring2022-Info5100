package neu.jia.assignment01;
import java.util.HashMap;

//Question 7: Given two strings ransomNote and magazine,
// return true if ransomNote can be constructed from magazine and false otherwise.
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for(char c : magazine.toCharArray()){
            if(characterCount.containsKey(c)){
                characterCount.put(c,characterCount.get(c) + 1);
            }else{
                characterCount.put(c,1);
            }
        }

        for(char c : ransomNote.toCharArray()){
            if(!characterCount.containsKey(c) || characterCount.get(c) <= 0){
                return false;
            }
            characterCount.put(c,characterCount.get(c) - 1);
        }
        return true;
    }
}
