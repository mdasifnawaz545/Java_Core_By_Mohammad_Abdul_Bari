public class arrayString {
    void array(int A[]){
        A[0]=25;
        
    }
    String findString(String str)
    {
        int index=str.indexOf("@");
        String name=str.substring(0, index);
        return name;
    }
    public static void main(String args[]){
        int A[]={1,2,3,4,5};
        arrayString ar=new arrayString();
        System.out.println(A[0]);
        ar.array(A);
        System.out.println(A[0]);
        String str="MOHAMMADASIFNAWAZ545@GAMIL.COM";
        System.out.println(str);
       str= ar.findString(str);
       System.out.println(str);

    }
}
