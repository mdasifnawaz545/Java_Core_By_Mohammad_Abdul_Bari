import java.util.Scanner;

public class typeofweb {
public static void main(String args[])
{
    Scanner scn=new Scanner(System.in);
    System.out.printf("Enter the website : ");
    String url=scn.nextLine();
    String first=url.substring(0,url.indexOf(":"));
    String last=url.substring(url.lastIndexOf(("."))+1);
    switch(first){
        case "https":switch(last){
            case "com":System.out.println("Commercial");
            break;
            case "gov":System.out.println("Government");
            break;
            case "in":System.out.println("International");
            break;
            case "org":System.out.println("Organisational");
            break;
            default:System.out.println("Wrong Website");
        }
        break;
        default:System.out.println("Wrong protocol");
    }
    
}
}
