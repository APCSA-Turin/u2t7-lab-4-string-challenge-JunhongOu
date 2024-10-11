package com.example.project;
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
     public boolean endsLy(String x){
         //implement code here
       
        int wordLength = x.length();
         if (x.length()< 2){
            return false;
            }
            String findLy = x.substring(wordLength - 2);
            if (findLy.equals("ly")){
                return true;
            }
             else{
                return false;
           }
    }



    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        String s3 = s1 + s2;
        int fullLength = s3.length();
        int half = fullLength/2;
        String letter = s3.substring(half - 1, half);
        if (letter.equals(s3.substring(half, half + 1))){
            return s3.substring(0, half) + s3.substring(half + 1, fullLength);
        }
        else{
            return s3;
        }
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abee") -> "abee"
    // deFront("xbring") -> "bring"
    public String deFont(String s1){

        //implement code here
        int firstIndex = s1.indexOf("a");
        int secondIndex = s1.indexOf("b");
        int length = s1.length();
        if (firstIndex == 0 && secondIndex != 1){
            return s1.substring(0,1) + s1.substring(2, length);
        }
        if (firstIndex != 0 && secondIndex == 1){
            return s1.substring(1,length);
        }
        if (firstIndex == 0 && secondIndex == 1){
            return s1;
        }
    
        return s1.substring(2,length);
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int totalLength= s1.length() - 1;
        int frontLetter = s1.indexOf("x");
        
         if(frontLetter == 0 && !s1.substring(totalLength).equals("x")){
            return s1.substring(1,totalLength + 1);
         }
        if (frontLetter != 0 && s1.substring(totalLength).equals("x")){
            return s1.substring(0,totalLength);
        }
        if (frontLetter == 0 && s1.substring(totalLength).equals("x")) {
            return s1.substring(1,totalLength);
        }
        else{
            return s1;
        }
            }
           


    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        int index = s1.length() - 1;
        int fLetter = s1.indexOf("f");
        int bLetter = s1.indexOf("b");
        
        if (fLetter == 0 && bLetter == index){
            return "FizzBuzz";
        }

        else if (fLetter == 0){
            return "Fizz";   
        }
       else if (bLetter == index){
            return "Buzz";
        }

        else{
        return s1;
    }
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){

        
        
        if (x % 3 == 0 && x % 5 == 0){
            return "FizzBuzz!";
        } 
        else if (x % 3 == 0 || x % 5 == 0){
            if (x % 3 == 0){
                return "Fizz!";
            }
            if (x % 5 == 0){
                return "Buzz!";
            }
         }

        return x + "!";
    }
}

