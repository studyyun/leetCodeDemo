package Twenty;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {

    public boolean isValid(String s) {

        Queue<Character> queue = new LinkedBlockingQueue<>();
        Deque<Character> deque = new LinkedList<>();
        List<Character> list = new ArrayList<>();

        Map<Character,Character> map = new HashMap<>(5);
        /*map.put('(',')');
        map.put('{','}');
        map.put('[',']');*/
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        /*for (int i = 0; i < s.length(); i++) {

            if (list.size() == 0){

                if (!map.containsKey(s.charAt(i))){
                    return false;
                }


            }else {

                if (!map.containsKey(s.charAt(i))){

                    if (map.get(list.get(list.size()-1)).equals(s.charAt(i))){
                        list.remove(list.size()-1);
                        continue;
                    }else {
                        return false;
                    }

                }


            }

            list.add(s.charAt(i));

        }

        return list.size() == 0;*/

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)){
                deque.push(c);
                continue;
            }

            if (!map.get(c).equals(deque.poll())){
                return false;
            }
        }

        /*for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                deque.push(s.charAt(i));
                continue;
            }

            if (!map.get(s.charAt(i)).equals(deque.poll())){
                return false;
            }
        }*/
        return deque.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
        System.out.println(new Solution().isValid("()[]{}"));
        System.out.println(new Solution().isValid("(]"));
        System.out.println(new Solution().isValid("([)]"));
        System.out.println(new Solution().isValid("{[]}"));
    }

}
