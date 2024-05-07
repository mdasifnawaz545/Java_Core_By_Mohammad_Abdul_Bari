package Revision;

class Sum {
    int sum = 0;
 
    void summation(int val) {
        sum = sum + val;
        val--;
        if(val>0)
        summation(val);
    }
}

interface ini{
    int sum=10;
    void disp();
}

class news implements ini{
    public void disp(){
        System.out.println(sum);
    }
}


public class Recurssion {
    public static void main(String args[]) {
        Sum s = new Sum();
        s.summation(5);
        System.out.println(s.sum);
        System.out.println(news.sum);
    }
}
