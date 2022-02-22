
import java.util.Scanner;
import java.util.Random;

class mastermind{  
    public static void main(String args[]){ 
            System.out.println("each digit has range 0 to 6.");
     System.out.println("\nThe - sign represent the value at correct position. The + sign represent value is valid but at wrong positon"); 
    System.out.println("Enter your 4 digit guess:");
        int guesses = 0;
        Random random = new Random(); 
    int a = random.nextInt(6);
    int b = random.nextInt(6);
    int c = random.nextInt(6);
    int d = random.nextInt(6);

    
  //uncomment below 2 code lines for actual random code
    int code = Integer.parseInt(Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d));
    String codeStr = Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d);

//test code for checking hints logic
     // int code = 2331;
     // String codeStr = "2331";

while(guesses<7){ 
    
     System.out.println("\nEnter guess "+guesses+":");
    Scanner guessObj = new Scanner(System.in);

   
    int guess = guessObj.nextInt();

    String guessStr =  Integer.toString(guess);
    char[] ch = guessStr.toCharArray();
    char[] answCH =codeStr.toCharArray();

    for (int i = 0; i < ch.length; i++) {

        char csb = ch[i];

        char codeDigit = answCH[i];

        //i==codeStr.indexOf(String.valueOf(csb)))

        if(guessStr.contains(String.valueOf(codeDigit))){
                if(answCH[i]==ch[i]){
                    System.out.print('-');
                }else{
                    System.out.print("+");
                }


        }
        
        
           // if((codeStr.contains(String.valueOf(csb))) && (answCH[i]==ch[i])) {
           //  System.out.print("-");
           //  }
           //  else if(codeStr.contains(String.valueOf(csb))){
           //      System.out.print("+");
           //  }
       }
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
        System.out.println("\n Game over! The hidden code was:");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);


   
    }  
}