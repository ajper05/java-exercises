package org.launchcode.java.studios;


public class EvenArray {
    public static void main(String[] args) {
        int numList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : numList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}