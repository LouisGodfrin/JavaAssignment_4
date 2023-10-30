import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Integer> Numbers = new ArrayList<>();

        Numbers.add(5);
        Numbers.add(4);
        Numbers.add(8);
        Numbers.add(10);
        Numbers.add(3);
        Numbers.add(13);

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(4);
        List.add(8);
        List.add(11);
        List.add(3);
        List.add(17);

        System.out.println("Input 1 for using sort or 2 for stream:");

        Scanner scan = new Scanner(System.in);
        
        int input = scan.nextInt();
        
        while(input != 1 && input != 2)
        {
            System.out.println("Invalid Input! Please enter again.");
            input = scan.nextInt();
        }
        switch(input)
        {
            case 1:
            {
                Collections.sort(Numbers);
                Numbers.forEach(number -> 
                { 
                if(number %2 == 0)
                {
                    double squareRoot = Math.sqrt(number);
                    System.out.println("The square root of "+ number+ " is "+squareRoot);
                }
                }
                );
                break;
            }

            case 2:
            {
                List.stream()
               .filter(num -> num % 2 == 0)
               .map(Math::sqrt)
               .forEach(Root -> {
                   int originalNumber = List.get(List.indexOf((int) Math.pow(Root, 2)));
                   System.out.println("The Square Root of " + originalNumber + " is: " + Root);
               });
                break;
            }
            
            default:
            System.out.println("Error detected");
        }

        scan.close();
    }


}

