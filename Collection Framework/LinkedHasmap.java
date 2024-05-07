import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasmap {
    public static void main(String args[])
    {
        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>(10,0.5f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        lhm.put(1,10);
        lhm.put(2,20);
        lhm.put(3,30);
        lhm.put(4,40);
        lhm.put(5,50);
        lhm.get(1);
        lhm.get(3);
        lhm.put(6,60);
        lhm.put(7,70);

        System.out.println(lhm);


    }
    
}
