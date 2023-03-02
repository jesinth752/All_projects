package projects.collections;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashmap {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void runHashmap() {
        Scanner input=new Scanner(System.in);
        HashMap<Integer,String> StudentDatabase= new HashMap<Integer,String>();
        int n;

        String name;
        int id;
        log.info("Enter no of Records");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            log.info("Enter ID:");
            id=input.nextInt();

            log.info("Enter Name");
            name= input.next();
            StudentDatabase.put(id,name);
        }
        String ret="HashMap:"+StudentDatabase;
        log.info(ret);
        log.info("Enter key to delete");
        int k=input.nextInt();
        StudentDatabase.remove(k);
        String ar="After removing"+StudentDatabase;
        log.info(ar);
        String sz="Size:"+StudentDatabase.size();
        log.info(sz);
        log.info("Printing all keys in Hashmap");
        for (Integer x : StudentDatabase.keySet()) {
            String tyc=String.valueOf(x);
            log.info(tyc);
        }

        log.info("Printing all vaules in Hashmap");
        for (String y: StudentDatabase.values()) {
            log.info(y);
        }
        log.info("Printing all keys with vaules");
        for (Map.Entry<Integer, String> z : StudentDatabase.entrySet()) {
            log.info("key: " + z + " value: " + StudentDatabase.get(z));
        }
        StudentDatabase.clear();
        String clr="After clearing "+StudentDatabase;
        log.info(clr);

    }
}