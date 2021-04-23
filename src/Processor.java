import java.util.Scanner;

import static java.lang.System.exit;

public class Processor {
    public static void main( String[] args ) {
        //test case
        //****
        //** request algorithm
        int option ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1- process request resources");
            System.out.println("2- process release resources");
            System.out.println("3- Quit");
            option = sc.nextInt();
            switch (option)
            {
                case 1://
                {
                    break;
                }
                case 2://
                {
                    break;
                }
                case 3:
                    exit(0);
                default:
                    System.out.println("Not valid");
            }
        }while (true);

    }
}
