import java.util.Arrays;
import java.util.Collections;

public class Lab_3 {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Hello it is lucky. I am leader. It is successful! Some words without el");
        char your_char = 's';
        System.out.println("Text: \n" + text);

        String[] arr_words = text.toString().split("[,;:.!?\\s]+");
        //StringBuffer[] buff_words = arr_words.toString();

        String[] string_with_count = new String[arr_words.length];
        int word_num = 0;

        for (String word : arr_words) {
            int count = 0;
            //int count = StringUtils.countMatches("a.b.c.d", ".");

            char[] arr_chars = word.toCharArray();
            for (char chars : arr_chars) {
                if (chars == your_char) {
                    count++;
                }
            }
            string_with_count[word_num] = (count + " : " + word);
            word_num++;
        }

        System.out.println("Sorted by " + your_char + ":");
        Arrays.sort(string_with_count, Collections.reverseOrder());
        for (String word : string_with_count) {
            System.out.println(word);
        }

    }
}
