package logical_questions;

public class MissingLetters {
    public static void main(String[] args) {

        String str = "abcdfghwpzm";

        for(char c = 'a'; c <= 'z'; c++){
            if(!str.contains(String.valueOf(c))){
                System.out.print(c + " ");
            }
        }
    }
}