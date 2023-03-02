package projects.collections;

import java.util.Scanner;
import java.util.logging.Logger;

public class LinkedList {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void runLinkedList() {
        LinkedListFunctions list1=new LinkedListFunctions();
        Scanner sc=new Scanner(System.in);
        int opt;
        int val;
        int pos;
        do{
            log.info("\n1.insert\n2.insert begining \n3.insert at index \n4.display\n5.Maximum in LL\n6.Minimun in LL \n7.Finding Position of the value\n8.Delete At Position\n9.Pop\n10.Exit");
            log.info("enter option:");
            opt=sc.nextInt();
            if(opt!=10) {
                switch (opt) {
                    case 1:
                        log.info("Enter value to insert");
                        val = sc.nextInt();
                        list1.insertElement(val);
                        break;
                    case 2:
                        log.info("Enter value to insert");
                        val = sc.nextInt();
                        list1.insertElementBegining(val);
                        break;
                    case 3:
                        log.info("enter index :");
                        pos = sc.nextInt();
                        log.info("enter value:");
                        val = sc.nextInt();
                        list1.insertElementIndex(pos, val);break;
                    case 4:
                        list1.display();
                        break;
                    case 5:
                        String max="Maximum element in list:" + list1.maximum();
                        log.info(max);
                        break;
                    case 6:
                        String min="Minimum element in list:" + list1.minimum();
                        log.info(min);
                        break;
                    case 7:
                        log.info("Enter the value:");
                        val = sc.nextInt();
                        list1.valueFind(val);
                        break;
                    case 8:
                        log.info("Enter position to Delete");
                        pos = sc.nextInt();
                        list1.deleteAtPos(pos);
                        break;
                    case 9:
                        list1.remove();
                        break;
                    default:
                        log.info("Invalid option");


                }
            }
        }while (opt!=10);



    }
}
