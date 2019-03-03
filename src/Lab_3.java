import java.util.Arrays;
import java.util.Collections;
import java.lang.Character;

public class Lab_3 {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Hello it is lucky. I am leader. It is successful! Some words without el");
        char your_char = 'h';
        System.out.println("Text: \n" + text);

        String[] arr_words = text.toString().split("[,;:.!?\\s]+");
        //StringBuffer[] buff_words = arr_words.toString();

        String[] string_with_count = new String[arr_words.length];
        int word_num = 0;

        for (String word : arr_words) {
            int count = 0;
            //int count = StringUtils.countMatches("a.b.c.d", ".");

            char your_char_1 = Character.toLowerCase(your_char);
            char[] arr_chars = word.toCharArray();
            for (char chars : arr_chars) {
                char chars_1 = Character.toLowerCase(chars);
                if (chars_1 == your_char_1) {
                    count++;
                }
            }
            string_with_count[word_num] = (count + " : " + word);
            word_num++;
        }

        System.out.println("Sorted by " + your_char + ":");
        Arrays.sort(string_with_count, Collections.reverseOrder());
        for (String word : string_with_count) {
            System.out.println(word.substring(4));
        }

    }
}
