package com.amit.testme;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
public class VowelCheckerRegularExpression {
   public static void main(String[] args) {
      // source string
      String str = "panchabhai";
      // compile regular expression
      Pattern compile = Pattern.compile("[aeiou]");
      // match for regular expression in string
      Matcher matcher = compile.matcher(str);
      // hold the result
      System.out.print("Vowels in the string are: ");
      // loop till the regular expression matches in the string
      while(matcher.find()) {
         // get the matched string
         String vowel = matcher.group();
         System.out.print(vowel +" ");
      }
      //System.out.println(count);
   }
}