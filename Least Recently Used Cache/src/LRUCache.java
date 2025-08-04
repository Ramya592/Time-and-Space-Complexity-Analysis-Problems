import java.util.HashMap;
public class LRUCache {
    class Node{
        int key,value;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private final int capacity;
    private HashMap<Integer, Node> map;
    private Node head,tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }

    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void insertAtFront(Node node){
        node.next=head.next;
        node.prev=head;

        head.next.prev=node;
        head.next=node;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insertAtFront(node);

        return node.value;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            Node existing=map.get(key);
            existing.value=value;
            remove(existing);
            insertAtFront(existing);
        }
        else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            insertAtFront(newNode);
            map.put(key,newNode);
        }
    }
    public void printCache() {
        Node current = head.next;
        while (current != tail) {
            System.out.print(current.key + ":" + current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(3);
        cache.put(1,10);
        cache.put(2,20);
        cache.put(3,30);
        cache.printCache();

        cache.get(2);
        cache.printCache();

        cache.put(4,40);
        cache.printCache();

        System.out.println("Get key 3: "+cache.get(3));
        cache.printCache();
    }
}