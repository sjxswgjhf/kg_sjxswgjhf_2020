import java.util.*;

public class main {
    /*
        assumption: s1 & s2 have to be same length and s1 & s2 can not be empty
     */
    public static boolean oneToOne(String s1, String s2){
        if(s1 == null || s1.length() == 0){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(!map.containsKey(c1)){
                map.put(c1, c2);
            }else{
                char tmp = map.get(c1);
                if(tmp != c2){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        try{
            s1 = args[0];
            s2 = args[1];
        }catch (IndexOutOfBoundsException e){
            System.out.println("Please input two string arguments");
        }
        System.out.print(oneToOne(s1, s2));
    }
}
