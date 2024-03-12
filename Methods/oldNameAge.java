public class oldNameAge {
    boolean validate(String name){
        return name.matches("[a-zA-Z//s]+");
    }
    boolean validate(int age){
        if(age>=3 && age<=18) return true;
        else return false;
    }
    public static void main(String args[])
    {
        oldNameAge nm=new oldNameAge();
        String naam="MDASIFNAWAZ";
        int age=18;
        boolean name=nm.validate(naam);
        boolean ag=nm.validate(age);
        if(name)System.out.println("It is a name");
        else System.out.println("It is not a name");
        if(ag)System.out.println("It is a number");
        else System.out.println("It is not a number");

    }
}
