package projects.main;
import projects.bank.*;
import projects.caluculator.*;
import projects.contacts.*;
import projects.filereader.*;
import projects.creditcard.*;
import projects.coordinates.*;
import projects.shapes.*;
import projects.collections.*;
import projects.singletondb.*;
import projects.studentgpa.*;
import projects.tictactoe.*;
import projects.studentrecord.*;
import java.util.Scanner;
import java.util.logging.Logger;
public class Allprojects {

    private static final Logger log = Logger.getLogger("InfoLogging");
    static  String str;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int opt;
        str="1.Simple bank\n2.Simple Caluculator \n3.Collections\n4.Contact using LinkedList\n5.Cooridantes cloning";
        str=str+"\n6.CreditCard\n7.File reader\n8.Shapes\n9.Singleton class\n10.Student Gpa Update\n11.Student test record\n12.TicTacToe";

        do{
            log.info(str);
            log.info("Enter Options:");
            opt=input.nextInt();
            if(opt!=13) {
                switch (opt) {
                    case 1:
                        Bank.runapp();
                        break;
                    case 2:
                        Calc.runapp();
                        break;
                    case 3:
                        SelectOperations.select();
                        break;

                    case 4:
                        Dairy.runapp();
                        break;
                    case 5:
                        try {
                            Coordinates.runapp();
                        } catch (Exception e) {
                            log.info("error");
                        }break;

                    case 6:
                        CreditCard.runapp();
                        break;
                    case 7:
                        try {
                            Filereader.runapp();
                        } catch (Exception e) {
                            log.info("error");
                        }break;

                    case 8:
                        Shapes.runapp();
                        break;
                    case 9:
                        Database.runDB();
                        break;
                    case 10:
                        Student.runRecord();
                        break;
                    case 11:
                        StudentTest.entry();
                        break;
                    case 12:
                        TicTacToe.runGame();

                        break;
                    default:

                }
            }
        }
        while (opt!=13);

    }
}
