import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<n;i++){
            int key=scan.nextInt();
            int value=scan.nextInt();
            hm.put(key,value);
            tm.put(key,value);
        }
        int searchKey= scan.nextInt();
        long HashStart=System.nanoTime();
        boolean foundInHash=hm.containsKey()
    }
}