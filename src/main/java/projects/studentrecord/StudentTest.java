package projects.studentrecord;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Logger;

public class StudentTest extends Thread {
    public static final Logger log=Logger.getLogger("InfoLogging");

    private StudentTest()
    {

    }
    public static void entry() {
        String n;
        int age;
        int k=0;
        double gradepoint;
        String rec;

        int records;

        Scanner input=new Scanner(System.in);

        ArrayList<StudentDetails> x = new ArrayList<StudentDetails>();
        log.info("ENTER NO OF RECORDS ");
        records=input.nextInt();
        try {
            for(int i=0;i<=5;i++) {
                Thread.sleep(1200);
                String calc="Creating database..."+k+"%";
                log.info(calc);
                k=k+20;
            }
        }
        catch (InterruptedException   e){
            log.info("Failed Try Again");
            Thread.currentThread().interrupt();
        }


        rec=records+" records created";
        log.info(rec);
        for(int i=1;i<=records;i++) {
            log.info("Enter Student Name :");
            n = input.next();
            log.info("Enter Age : ");
            age = input.nextInt();
            log.info("Enter GPA : ");
            gradepoint = input.nextDouble();

            StudentDetails sd=new StudentDetails(n,age,gradepoint);
            x.add(sd);


        }
        log.info("Uploading Student Details..");
        try {


            for (StudentDetails st : x) {
                Thread.sleep(1010);
                String p1=st.getName() + " " + st.getAge() + " " + st.getGpa();
                log.info(p1);

            }
        }
        catch (InterruptedException  e)
        {
            log.info("Failed !");
            Thread.currentThread().interrupt();
        }

        Collections.sort(x, new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                return Double.compare(o2.getGpa(),o1.getGpa());
            }
        });
        log.info("Sorting Student Details..");
        try {


            for (StudentDetails st : x) {
                Thread.sleep(1010);
                String p2=st.getName() + " " + st.getAge() + " " + st.getGpa();
                log.info(p2);

            }
        }
        catch (InterruptedException e)
        {
            log.warning("InterruptedException: ");
            log.info("Failed !!");
            Thread.currentThread().interrupt();
        }


    }
}