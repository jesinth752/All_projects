package projects.collections;

import java.util.Scanner;
import java.util.logging.Logger;

class ArrayFunctions {
    int size;
    int rec[];
    private static final Logger log = Logger.getLogger("InfoLogging");

    StringBuilder show= new StringBuilder("");
    void increase(){
        int[] temp = new int[size+1];
        for(int i=0; i<size; i++){
            temp[i] = rec[i];
        }
        rec = temp;
        size++;
    }
    class Arr {
        Arr(int val) {
            rec[size-1]=val;


        }


    }
    ArrayFunctions()
    {
        size=0;
    }
    void insert(int val)
    {
        increase();
        Arr a1=new Arr(val);
    }
    void display()
    {
        if(rec.length!=0) {
            for (int i = 0; i < rec.length; i++) {

                show.append(" " + rec[i] + " ");


            }
            String sp=show.toString();
            log.info(sp);
            show.delete(0, sp.length());
        }
        else
        {
            log.info("Array is Empty");
        }
    }
    void remove()
    {
        if(rec.length!=0) {
            int[] rem = new int[size - 1];
            for (int i = 0; i < size - 1; i++) {
                rem[i] = rec[i];
            }
            rec = rem;
            size--;
        }
        else
        {
            log.info("Array is Empty - Pop operation fails");
        }
    }
    void insertAtPos(int pos ,int val)
    {
        increase();
        for(int i= rec.length-1;i>=pos;i--)
        {
            rec[i]=rec[i-1];
        }
        rec[pos]=val;
    }
    void rotation(int k)
    {
        int dum,j;
        for(int i=0;i<k;i++)
        {
            dum=rec[0];
            for(j=0;j< rec.length-1;j++)
            {
                rec[j]=rec[j+1];
            }
            rec[j]=dum;
        }
    }

}
