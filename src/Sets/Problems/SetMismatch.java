/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.Problems;

import java.util.*;

/**
 *
 * @author chris
 */
public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                arr[0] = nums[i];
            }
            s.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(i + 1)) {
                arr[1] = i + 1;
            }
        }
        return arr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1, 2,3,4,5,6,6,8};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

}
