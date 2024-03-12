class lowBalance extends Exception{
    public String toString(){
        return "Low Balance";
    }
}

public class exceptionMidsem{
        void meth1() throws lowBalance{
            throw new lowBalance();
        }
        void meth2() throws  lowBalance{
            meth1();
        }

        void meth3() throws  lowBalance{
            meth2();
        }

    public static void main(String args[]){
        exceptionMidsem ex=new exceptionMidsem();
        try {
            ex.meth3();
        }catch(lowBalance l){
            System.out.println(l);
        }

    }



}
