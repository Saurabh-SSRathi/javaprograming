package src.week1.day1;

import java.util.Arrays;

public class CountWordsJava8 {
    public static void main(String[] args) {

        String str = "I am learning Java";

        long count = Arrays.stream(str.split("\\s+")).count();

        System.out.println(count);
    }
}

/*Arrays.stream: This converts an arrays into a stream(a sequence of elements you can process).
str.split("\\s+"): this splits the string str into an array of words.
split(): it breaks the string into parts, using the given patter(call regular expression or regex)
 \\s+: This regular expression means "split by one or more spaces." It makes sure we split the string at any space b/w words.
count():(terminal operation) This method counts how many elements(in this case, words) are in the stream.
why Arrays : we are using Arrays.stream because Arrays is a utility class in Java that makes it easy to work with arrays. It provides methods like stream(), which quickly converts an array into a stream so that you can process it easily.
*/

//Using array handling
/*public class CountWordsJava8 {
    public static void main(String[] args) {
        String str = "I am learning Java";
        String [] words = str.split("\\s+");
        int count = words.length;
        System.out.println(count);
    }
}*/


//Using for loop
/*public class CountWordsJava8 {
    public static void main(String[] args) {
        String str = "I am learning Java";
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            count++;
        }
        System.out.println(count);
    }
}*/

/*
* Using Arrays.stream(): This is modern and concise. It uses Java 8's functional programming features like streams to make the code shorter and easier to understand.
*
* Without Arrays.stream(): This is the traditional way. it's simpler but requires more lines of code.
*
*
* */


