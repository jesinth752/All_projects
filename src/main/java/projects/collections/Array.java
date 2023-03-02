package projects.collections;

import java.util.Scanner;
import java.util.logging.Logger;

public class Array {
    private static final Logger log = Logger.getLogger("InfoLogging");

    private Array()
    {}
    public static void runArray() {
        Scanner input=new Scanner(System.in);
        int opt;
        int value;
        int pos;
        int k;
         ArrayFunctions c=new ArrayFunctions();

        do {
            log.info("\n1.Insert\n2.Display\n3.Pop\n4.Insert At Position\n5.Rotate the Array\n6.Exit");
            log.info("Enter option:");
            opt=input.nextInt();
            if(opt!=6) {
                switch (opt) {


                    case 1:
                        log.info("Enter value to Insert:");
                        value = input.nextInt();
                        c.insert(value);
                        break;

                    case 2:
                        c.display();
                        break;
                    case 3:
                        c.remove();
                        break;
                    case 4:
                        log.info("Enter Position:");
                        pos = input.nextInt();
                        log.info("Enter value to Insert:");
                        value = input.nextInt();
                        c.insertAtPos(pos, value);
                        break;
                    case 5:
                        log.info("Enter Number of Times:");
                        k = input.nextInt();
                        c.rotation(k);
                        break;
                    default:
                        log.info("invalid choice");
                }
            }
        }while (opt!=6);
    }

}