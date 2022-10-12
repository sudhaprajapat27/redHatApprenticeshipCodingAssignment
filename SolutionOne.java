import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(areAnagram(str1, str2));
        sc.close();
    }

    static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(hmap.containsKey(str1.charAt(i))){
                hmap.put(str1.charAt(i),hmap.get(str1.charAt(i))+1);
            } else hmap.put(str1.charAt(i),1);
        }
        for(int i=0;i<str2.length();i++){
            if(hmap.containsKey(str2.charAt(i))) hmap.put(str2.charAt(i),hmap.get(str2.charAt(i))-1);
        }
        Set<Character> keys= hmap.keySet();
        for (Character j : keys) {
            if(hmap.get(j)!=0) return false;
        }
        return true;
    }
}

