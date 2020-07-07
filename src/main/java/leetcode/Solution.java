package leetcode;

import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class Solution {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            char jewel = J.charAt(i);
            count = count + (int) S.chars().filter(ch -> ch == jewel).count();
        }
        return count;
    }

    public int[] anagramMappings(int[] A, int[] B) {
       Map<Integer, Integer> mapLocations = new HashMap<>();
        for(int i = 0; i < B.length; i++) {
            mapLocations.put(B[i], i);
        }
        int[] result = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            result[i] = mapLocations.get(A[i]);
        }
        return result;
    }
}