package src.week1.day1;

import java.util.Arrays;

public class MedianArray {

    //{10,20,30,40,50}
    //{10,20,30,40,50,60}
    public static void main(String[] args) {
        int [] array = {12,4,5,9,8,6};

        //{4,5,6,8,9,12};
        double median = findMedian(array);
        System.out.println("Median "+median);
    }


    public static double findMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;

        if (n%2 == 1) {
            return array[n/2];
        } else {
            return (array[n-1]/2.0 + array[n/2])/2.0;
        }
    }
}
