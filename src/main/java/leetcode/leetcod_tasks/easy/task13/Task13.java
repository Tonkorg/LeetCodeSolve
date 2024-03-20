package leetcode.leetcod_tasks.easy.task13;

import java.util.HashMap;
import java.util.Map;

public class Task13 {

    public int romanToInt(String s) {

        Map <Character, Integer> map = new HashMap<>();
        {
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
        }

        int minus;
        int prev = 0;
        int res = 0;

        for (int i =s.length()-1; i >= 0;i--) {
            minus = map.get(s.charAt(i));
            if(minus<prev)
            {
                res -= minus;
            }
            else
            {
                res +=minus;
            }
            prev = minus;
        }
        return res;
    }
}
