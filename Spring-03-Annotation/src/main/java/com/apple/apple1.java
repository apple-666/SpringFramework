package com.apple;

import java.util.Arrays;

/**
 * @Author Double_apple
 * @Date 2022/1/19 18:52
 * @Version 1.0
 */
public class apple1 {
    public static void main(String[] args) {
//        System.out.println("apple come on!");
        int[] arr = new int[]{1, 200, 10, 120, 30};
        int len = arr.length;
        int[] ans = new int[len];
        int l = 0, r = (len & 1) == 1 ? len - 2 : len - 1;
        int idx = 0;
        while (l < len && r >= 0) {
            if (arr[l] <= arr[r]) {
                ans[idx++] = arr[l];
                l += 2;
            } else {
                ans[idx++] = arr[r];
                r -= 2;
            }
        }
        while (l < len) {
            ans[idx++] = arr[l];
            l += 2;
        }
        while (r >= 0) {
            ans[idx++] = arr[r];
            r -= 2;
        }
        System.out.println(Arrays.toString(ans));
    }
}
