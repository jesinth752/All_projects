package projects.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayListOperations {
    private static final Logger log = Logger.getLogger("InfoLogging");

    private ArrayListOperations()
    {}
    public static void runArrayList() {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();

        int opt;
        int val;
        int pos;
        do {
            log.info("1.Insert\n2.Insert at Pos\n3.Remove at Pos\n4.Size\n5.Display\n6.clear\n7.Exit");
            log.info("Enter Option : ");
            opt=input.nextInt();
            if(opt!=7) {
                switch (opt) {
                    case 1:
                        log.info("Enter value : ");
                        val = input.nextInt();
                        list.add(val);
                        break;
                    case 2:
                        log.info("Enter Position : ");
                        pos = input.nextInt();
                        log.info("Enter value : ");
                        val = input.nextInt();
                        list.set(pos, val);
                        break;
                    case 3:
                        log.info("Enter Position : ");
                        pos = input.nextInt();
                        list.remove(pos);
                        break;

                    case 4:
                        String ds="Size:"+list.size();
                        log.info(ds);
                        break;
                    case 5:
                        String ss=list.toString();
                        log.info(ss);
                        break;
                    case 6:
                        log.info("Cleared");
                        list.clear();
                        break;
                    default:
                        log.info("Invalid choice");
                }
            }
        }while (opt!=7);
    }
}
