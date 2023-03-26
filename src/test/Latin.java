/*
 Sample Question
Write an application that encodes English-language phrases into pig Latin. Pig Latin is a form
of coded language. There are many different ways to form pig Latin phrases. For simplicity,
use the following algorithm: To form a pig Latin phrase from an English-language phrase,
tokenize the phrase into words with String method split. To translate each English word into
a pig Latin word, place the first letter of the English word at the end of the word and add the
letters “ay.” Thus, the word “jump” becomes “umpjay,” the word “the” becomes “hetay,” and
the word “computer” becomes “omputercay.” Blanks between words remain as blanks.
Assume the following: The English phrase consists of words separated by blanks, there are no
punctuation marks and all words have two or more letters. Method printLatinWord should
display each word. Each token is passed to method printLatinWord to print the pig Latin word.
Enable the user to input the sentence. Keep a running display of all the converted sentences
in a text area
 */

package src.test;
import java.util.Scanner;
public class Latin {
    String sentence;
     public Latin(String sentence){
        this.sentence = sentence;
    }
    public void pigLatin(){
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.substring(1));
            System.out.print(word.charAt(0));
            System.out.print("ay ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        Latin l = new Latin(sentence);
        l.pigLatin();
    }
}