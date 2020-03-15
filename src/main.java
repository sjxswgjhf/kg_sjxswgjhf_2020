import java.util.*;

public class main {

    public static boolean oneToOne(String s1, String s2){
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
