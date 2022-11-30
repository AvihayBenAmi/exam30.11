import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String id;
        System.out.println("Enter your ID Number");
        id=scanner.nextLine();
        System.out.println(checkId(id));
    }
    public static boolean  checkId(String id){
        boolean answer=false;
        int digitCounter=0;
        int[] numId= new int[9];
        int[] wight={1,2,1,2,1,2,1,2};
        int sum=0;
        int tempSum=0;
        int lastDigit=0;
        if(id.length()!=9){
            answer=false;}
            else{
                for(int i=0;i<id.length();i++){
                    if((Character.isDigit(id.charAt(i)))==true){
                        digitCounter++;
                        numId[i]=Character.getNumericValue(id.charAt(i));
                    }
                }
                lastDigit=numId[8];
                if(digitCounter==9){
                    for(int j=0; j<numId.length-1;j++){
                        tempSum=numId[j]*wight[j];
                        if(tempSum>=10){
                            tempSum=tempSum%10+tempSum/10;
                        }
                        sum=sum+tempSum;
                        tempSum=0;
                    }
                    if(lastDigit==10-(sum%10)){
                        answer=true;
                    }
                }
            }
            return answer;
        }
    }
