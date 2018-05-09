public class LR4_c3_chars {

    public static void main(String[] args) {
        System.out.println(charCount("fiZzbuzz", 'z'));
    }

        public static int charCount(String str, char c) {
            // your code here
            int str_count = str.length();
            int c_count = 0;
            String char_to_str = String.valueOf(c);
            for (int i=0; str_count>i; i++) {
                String str_char = String.valueOf(str.charAt(i));
                if (str_char.equalsIgnoreCase(char_to_str)==true) c_count++;
            }
            return c_count;
        }
    }



/*
The goal of this kata is to write a function that takes two inputs: a string and a character. The function will count the number of times that character appears in the string. The count is case insensitive.

For example:

countChar("fizzbuzz","z") => 4
countChar("Fancy fifth fly aloof","f") => 5
The character can be any alphanumeric character.
 */