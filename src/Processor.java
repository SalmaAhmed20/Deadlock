import java.util.*;

import static java.lang.System.exit;

public class Processor {
    public static void main( String[] args ) {
        //test Program
        int nR=3 , nP=5;
        int available [] = {3,3,2};
        int Max [][] ={{7,5,3}, {3,2,2}, {9,0,2}, {2,2,2}, {4,3,3}};
        int Alloc [][]={{0,1,0},{2,0,0},{3,0,2},{2,1,1},{0,0,2}};
        Bank Banker = new Bank(nR,nP,Alloc,Max);
        Banker.setAvailable(available);
        Banker.Algorithm();
        //****
        //** request algorithm
        int option ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1- process request resources");
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
