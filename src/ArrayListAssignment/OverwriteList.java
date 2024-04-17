package ArrayListAssignment;


import java.util.ArrayList;

class circularList{
    public ArrayList<String> circular;
    public int capacity;
    public int size;
    public int head;
    public circularList(int capacity){
        this.capacity=capacity;
        this.head=0;
        this.size=0;
        this.circular=new ArrayList<>(capacity);
        for(int i=0;i<capacity;i++){
            circular.add(null);
        }
    }
    public void add(String msg){
        if(size<capacity){
            circular.set((head+size)%capacity, msg);
            size++;
        }else{
            circular.set(head, msg);
            head=(head+1)%capacity;
        }
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(circular.get((head + i) % capacity));
        }
    }
}

public class OverwriteList {
    public static void main(String[] args) {
        circularList c=new circularList(5);
        c.add("balaji");
        c.add("anand");
        c.add("yogibabu");
        c.add("vijay");
        c.add("mani");
        c.add("muthu");
        c.add("singam");
        c.display();

    }
}
