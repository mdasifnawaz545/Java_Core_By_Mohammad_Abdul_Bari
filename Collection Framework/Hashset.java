import java.util.*;
public class Hashset {

    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>(10,0.5f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        for(Iterator<Integer> li=hs.iterator();li.hasNext();){
            System.out.println(li.next());
        }
    }
    
}
