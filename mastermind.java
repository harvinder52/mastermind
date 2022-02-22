
import java.util.Scanner;
import java.util.Random;

class mastermind{  
    public static void main(String args[]){ 
        int guesses = 0;
        Random random = new Random(); 
    int a = random.nextInt(6);
    int b = random.nextInt(6);
    int c = random.nextInt(6);
    int d = random.nextInt(6);

    
    // System.out.print(a);
    // System.out.print(b);
    // System.out.print(c);
    // System.out.print(d);

    int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d));
    String answerStr = Integer.toString(a) + Integer.toString(b)+ Integer.toString(c)+ Integer.toString(d);
while(guesses<7){ 
    

    Scanner guessObj = new Scanner(System.in);
    System.out.println("\nThe - sign represent the value at correct position. The + sign represent value is valid but at wrong positon"); 
    System.out.println("Enter your 4 digit guess:");
    int guess = guessObj.nextInt();

    String guessStr =  Integer.toString(guess);
    char[] ch = guessStr.toCharArray();
    char[] answCH =answerStr.toCharArray();

    for (int i = 0; i < ch.length; i++) {

        char csb = ch[i];

        //i==answerStr.indexOf(String.valueOf(csb)))
        
        
           if((answerStr.contains(String.valueOf(csb))) && (answCH[i]==ch[i])) {
            System.out.print("-");
            }
            else if(answerStr.contains(String.valueOf(csb))){
                System.out.print("+");
            }
       }
           
        

    if(guess==answer){
       System.out.println("you win");
       System.out.println(guessStr.equals(answerStr));
       break;
   }
   guesses++;


        
        }
        System.out.println("game over! the correct answer was:");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);


   
    }  
}