import java.util.*;
public class Main {
    static int size;
    static int[] array;
    static int[] randomIndices;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        size=scan.nextInt();
        array=new int[size];
        randomIndices=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
            randomIndices[i]=i;
        }

        shuffle(randomIndices);

            long startSequential=System.nanoTime();
            long sumSeq=SequentialAccess();
            long endSequential=System.nanoTime();

            long startRandom=System.nanoTime();
            long sumRand=RandomAccess();
            long endRandom=System.nanoTime();

            System.out.println("Time taken: "+(endSequential-startSequential)+" with the sum as "+sumSeq);
            System.out.print("Time Taken: "+(endRandom-startRandom)+" with the sum as "+sumRand);
    }
    public static long SequentialAccess(){
        long sum=0;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static long RandomAccess(){
        long sum=0;
        for(int i=0;i<size;i++){
            sum+=array[randomIndices[i]];
        }
        return sum;
    }
    public static void shuffle(int[] arr){
        Random rand=new Random();
        for(int i= arr.length-1;i>0;i--){
            int j=rand.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}