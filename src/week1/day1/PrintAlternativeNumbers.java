package src.week1.day1;

import java.util.stream.IntStream;

public class PrintAlternativeNumbers {
    public static void main(String[] args) {
        int[] array = {11,12,13,14,15,16,17,18,19,20};
        IntStream.range(0, array.length)
                .filter(i -> i%2==0)
                .map(i->array[i])
                .forEach(System.out::println);
    }
}

//IntStream:-
// 1. Part of Java 8 Streams
// 2. It is Tool to work with sequence of elements(like numbers in our case)
// 3. This is a way to handle numbers as a stream, making it easier to process them

//range(0, array.length):-
// 1. This generates a stream of numbers from 0 to the length of the array(which is 10).
// 2. So it generates numbers from 0 to 9.
// 3. Since array index starts at 0

//filer(i -> i%2 ==0):-
// 1. This filters out the numbers where the index i is even.
// 2. We got numbers from range function
// 3. The % Operator gives the remainder when divided by 2.
// 4. if remainder is 0, the number us even.
// 5. So, we are selecting every second number from the array(0,2,4,6,8);

//map(i -> array[i]):-
// This maps the filtered indexes to the actual values in the arrays.
// So, for each even index(0,2,4,6,8), it will pick the corresponding values from the array


// Output:
//11
//13
//15
//17
//19