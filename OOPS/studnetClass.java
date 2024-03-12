public class studnetClass {
    static class student{
        String name;
        int roll;
        String branch;
        String section;
        int m1=92;
        int m2=90;
        int m3=80;
        float total(){
            float sum=0;
            sum=sum+m1+m2+m3;
            return sum;
        } 
        float average(){
            float avg=total()/3;
            return avg;
        }
        String grade(){
            if(average()>=90) return "O";
            else if(average()>=80 && average()<90) return "E";
            else if(average()>=70 && average()<80) return "A";
            else if(average()>=60 && average()<70) return "B";
            else if(average()>=50 && average()<60) return "C";
            else if(average()>=40 && average()<50) return "D";
            else  return "F";
        }
    }
    public static void main(String args[])
    {
        student s=new student();
        s.name="MOHAMMAD ASIF NAWAZ";
        s.roll=22052736;
        s.branch="CSE";
        s.section="CSE 05";
        System.out.println("Total Marks = "+s.total());
        System.out.println("Average = "+s.average());
        System.out.println("Grade = "+s.grade());
        
    }
    
}
