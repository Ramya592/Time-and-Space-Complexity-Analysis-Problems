import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<n;i*=2)//Time complexity O(log n)
        {
            for(int j=0;j<n;j+=i)//Time complexity O(n/i)
            {
                System.out.print("i="+i+",j="+j+"\n");
            }
        }
        //overall time complexity O(n)
    }
}