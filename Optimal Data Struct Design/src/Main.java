import java.util.*;
public class Main {
    private PriorityQueue<Integer> lowers=new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> highers=new PriorityQueue<>();
    public void insert(int num){
        if(lowers.isEmpty()||num<lowers.peek()){
            lowers.add(num);
        }
        else{
            highers.add(num);
        }
        if(lowers.size()> highers.size()+1){
            highers.add(lowers.poll());
        }else if(highers.size()> lowers.size()){
            lowers.add(highers.poll());
        }
//        System.out.print(lowers+" "+"\n");
//        System.out.print(highers+" ");
    }
    public double getMedian(){
        if(lowers.size()==highers.size()){
            return lowers.peek()+highers.peek()/2.0;
        }
        else{
            return lowers.peek();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Main m=new Main();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        for(int nums:arr) {
            m.insert(nums);
            System.out.println(m.getMedian());
        }
    }
}