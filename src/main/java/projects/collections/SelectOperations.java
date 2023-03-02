package projects.collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class SelectOperations {
    private static final Logger log = Logger.getLogger("InfoLogging");

    private SelectOperations()
    {

    }

    public static void select()
    {
        Scanner input=new Scanner(System.in);

        log.info("1.Array\n2.ArrayList\n3.HashMap\n4.Hashset\n5.LinedList");
        log.info("Enetr option");
        int opt=input.nextInt();
        switch(opt)
        {
            case 1:Array.runArray();break;
            case 2:ArrayListOperations.runArrayList();break;
            case 3:Hashmap.runHashmap();break;
            case 4:Hashset.runHashset();break;
            case 5:LinkedList.runLinkedList();break;
            default:log.info("invalid");
        }
    }
}
