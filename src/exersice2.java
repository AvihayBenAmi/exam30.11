import java.util.Random;
import java.util.Scanner;
public class exersice2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] words={"HELLO","NAVON","DAVID","CHILD","PHONE","TABLE"};
        Random random = new Random();
        int rnd=random.nextInt(0,5);
        int counter=0;
        String RandomWord=words[rnd];
        System.out.println(RandomWord);
        while(counter<=6){
            System.out.println("Enter your Guess Word");
            String guessWord=scanner.nextLine();
            for(int i=0;i<guessWord.length();i++){
                if(RandomWord.charAt(i)==guessWord.charAt(i)){
                    System.out.print("V");}
                else if (RandomWord.contains(String.valueOf(guessWord.charAt(i)))) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }

                }
            counter++;
            }
        }
    }
////