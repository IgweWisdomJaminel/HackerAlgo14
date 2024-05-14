import java.util.Scanner;

public class Difference {
    int input;

    int N;

    int[]arrayDiffrence= new int[N];
    int maximumDifference;

    public void computerDifference(){

        int highestNumber=0;
        int lowesNumber=0;
        int firstElement=arrayDiffrence[0];
        int firstElement2=arrayDiffrence[0];
        int count=0;
        for(int i:arrayDiffrence){
            if(firstElement2<=i){
                firstElement2=i;
               highestNumber=firstElement2;
            }
            if(firstElement>=i){
               firstElement=i;
               lowesNumber=firstElement;
            }



        }
        if(highestNumber==lowesNumber){
            maximumDifference=0;
        }
        System.out.println(highestNumber);
        System.out.println(lowesNumber);
        maximumDifference= highestNumber-lowesNumber;
        System.out.println(maximumDifference);











    }
    public Difference(int[]arrayDiffrence){

        this.arrayDiffrence=arrayDiffrence;

    }
    public static void evenNumbers(int n){

        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("this number is odd");
        }



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[]array= new int[N];
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        Difference difference = new Difference(array);
        difference.computerDifference();
        int checkEvenOdd=sc.nextInt();
        evenNumbers(checkEvenOdd);
    }
}
