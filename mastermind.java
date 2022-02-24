
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;

class mastermind{  
    public static void main(String args[]){ 
            System.out.println("\nGuess the 4 digit code");

            System.out.println("\nEach digit of code has range 0 to 6.");
     System.out.println("\nThe - sign represent the value at correct position. The + sign represent value is valid but at wrong positon"); 
    System.out.println("Enter your 4 digit guess:");
        int guesses = 0;
        Set<Character> hash_Set = new HashSet<Character>();
        Random random = new Random(); 
    int a = random.nextInt(6);
    int b = random.nextInt(6);
    int c = random.nextInt(6);
    int d = random.nextInt(6);

    
  //uncomment below 2 code lines for actual random code
    int code = Integer.parseInt(Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d));
    String codeStr = Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d);

//test code for checking hints logic
     // int code = 1234;
     // String codeStr = "1234";

    

    

while(guesses<7){ 
     ArrayList<Character> list = new ArrayList<>();
     System.out.println("Enter guess "+guesses);
    Scanner guessObj = new Scanner(System.in);

   
    int guess = guessObj.nextInt();

    

    String guessStr =  Integer.toString(guess);
    char[] ch = guessStr.toCharArray(); //guess
    char[] answCH =codeStr.toCharArray(); //code
   for (int i = 0; i < ch.length; i++) {

        list.add(answCH[i]); //1122
        hash_Set.add(ch[i]);// (1,2)
        //2211
        //++++
    }

    for (int i = 0; i < ch.length; i++) {

     if(answCH[i]==ch[i]){
                 System.out.print('-');
                 list.set(i, 'x');
                  // System.out.println(list);
                  //  System.out.println("++++++");
                  //  System.out.println(answCH[i]);
                  //  System.out.println(ch[i]);
                  //                     System.out.println("++++++");

             }
    }

   
    for (int i = 0; i < ch.length; i++) {

       if(list.contains(ch[i]) && (answCH[i]!=ch[i])){    //1232
                System.out.print("+");
                 list.set(list.indexOf(ch[i]), 'x');
                  // System.out.println(list);
                  // System.out.println(answCH[i]);
                  //  System.out.println(ch[i]);


       }

    }
    // System.out.println(list);


    //  for (int i = 0; i < ch.length; i++) {
    //     if(hash_Set.contains(ch[i])){
    //          if(answCH[i]==ch[i]){
    //              System.out.print('-');
    //          }else{
    //             hash_Set.remove(ch[i])
    //          }

    //     }else{
    //         System.out.print("+");
    //     }
    // }

    // for (int i = 0; i < ch.length; i++) {

    //     char csb = ch[i];

    //     char codeDigit = answCH[i];

    //     //i==codeStr.indexOf(String.valueOf(csb)))

    //     // if(guessStr.contains(String.valueOf(codeDigit))){
    //     //         if(answCH[i]==ch[i]){
    //     //             System.out.print('-');
    //     //         }else{
    //     //             System.out.print("+");
    //     //         }


    //     // }
        
        
    //        if((codeStr.contains(String.valueOf(csb))) && (answCH[i]==ch[i])) {
    //         System.out.print("-");
    //             list.set(i, 9);
    //             System.out.println(list);
    //         }
    //         else if(codeStr.contains(String.valueOf(csb))){
    //             System.out.print("+");
    //         }
    //    }
           //2331
           
           //1231 ++-- y
           //3221 -++ 

           // 

    if(guess==code){
       System.out.println("you win");
       System.out.println(guessStr.equals(codeStr));
       
       break;

   }
   guesses++;


        
        }
        System.out.println("\n Game over! the hidden code was:");
        // System.out.println(hash_Set);
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);


   
    }  
}