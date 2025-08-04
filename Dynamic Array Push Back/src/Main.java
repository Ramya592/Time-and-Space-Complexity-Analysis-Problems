import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int capacity=1;
        int size=0;
        int[] arr=new int[1];
        for(int i=1;i<n;i++){
            int value=scan.nextInt();
            if(size==capacity){
                capacity=capacity*2;
                int[] newArr=new int[capacity];
                for(int j=0;j<size;j++){
                    newArr[j]=arr[j];
                }
                arr=newArr;
            }
            arr[size]=value;
            size++;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}