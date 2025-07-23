package utils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String [] args) {
        String text = "";
        String regExp = "";
        Pattern pattern = Pattern.compile (regExp);
        Matcher matcher = pattern.matcher (text);
        System.out.println (matcher.matches ());// если все соотв рег выраж вернет true
        System.out.println (isPhoneNumber ("+972 55 333 44 55"));
        System.out.println(quantityWords("To  be, or no.  to be! "));
        System.out.println(quantityWords(null));
        System.out.println(quantityWords("   "));
        System.out.println(quantityWords(""));
        System.out.println("=================");
        System.out.println(convert2ToDecimal("00"));
        System.out.println(convert2ToDecimal("01"));
        System.out.println(convert2ToDecimal("10"));
        System.out.println(convert2ToDecimal("11"));
        System.out.println(convert2ToDecimal("110010110"));
        System.out.println(convert16toDec("123A1BD"));
        System.out.println(isNotRepeatedWordInText("To  be, or no. . to be!"));
        System.out.println (reverseWord ("To  be, or no. . to be!"));
        System.out.println(reverseWord("Ivan"));
        System.out.println(isPalindrome("Ivan"));
        System.out.println(isPalindrome("aBcCba"));
        System.out.println("==========================");
        System.out.println(isPalindromeSentence("To  be, or no. . to be!"));
        System.out.println(isPalindromeSentence("Cigar? Toss it in a can. It is so tragic."));
        List<Integer> listInt = List.of(1,2,3,4,51,1,3,5);
        System.out.println(removeDuplicates(listInt));


    }
     public static boolean isPhoneNumber(String phone) {//+972 55 333 44 55
         String regExp = "^\\+972\\s5[0-9]{1}\\s\\d{3}\\s\\d{2}\\s\\d{2}$";
         Pattern pattern = Pattern.compile (regExp);
         Matcher matcher = pattern.matcher (phone);
         return matcher.matches ();
         //[0-9] = \d     \D
         //[A-Za-z0-9_] = \w      \W = [^A-Za-z0-9_]
     }
    static int quantityWords(String text){//  To  be, or no. . to be!
        if(text == null)
            return -1;
        if(text.isBlank())
            return 0;
        String[] array = text.trim().split("\\W+");
        //String[] array = text.trim().split("\\s+");
        //System.out.println(array);   [.,!]
        System.out.println(Arrays.toString(array));
        return array.length;
    }
      static int convert2ToDecimal(String str){
        int dec = Integer.parseInt (str,2);
        return dec;

      }
    static int convert16toDec(String str){
        int dec = Integer.parseInt(str, 16);
        return dec;
    }

    static Boolean isNotRepeatedWordInText( String text){
        if(text == null)
            return null;
        if(text.isBlank())
            return null;
        String[] array = text.trim().toLowerCase ().split("\\W+");
        Set<String> set = new HashSet<> (Arrays.asList(array));
        System.out.println(set);
        return set.size() == array.length;


    }
    static String reverseWord(String word){
        if(word == null)
            return null;
        if(word.isBlank())
            return null;
        return new StringBuilder (word).reverse ().toString ();
    }
    static Boolean isPalindrome(String word) {
        if (word == null)
            return null;
        if (word.isBlank ())
            return null;
        word = word.trim().toLowerCase();// новый обьект
        return word.equals (new StringBuilder (word).reverse ().toString ());


    }
    static Boolean isPalindromeSentence(String text) {
        if (text == null)
            return null;
        if (text.isBlank ())
            return null;
        text = text.trim().toLowerCase().replaceAll ("\\W+", "");// заменить все - метод исп регулярное выражение
        return text.equals (new StringBuilder (text).reverse ().toString ());


    }
    static <T> List<T> removeDuplicates(List<T> list){
        return new ArrayList<> (new HashSet<> (list));
    }

}

        //Метод compile() в классе Pattern из пакета java.util.regex используется для компиляции регулярного
        // выражения в объект Pattern, который затем можно использовать
        // для поиска или проверки соответствия в строках.Метод compile() принимает строку с регулярным выражением
        // и возвращает объект Pattern. Этотобъект потом можно использовать для создания Matcher,
        // с помощью которого можно искать совпадения в строках.



