import java.util.*;

public class SnoConeStore { 
   public static void main (String[] args) {
   
      int wait = 0;
      int totalServiced = 0;
      int maxLine = 0;
   
      //Create a linked queue
      LinkedQueue line = new LinkedQueue ();
      
      
      Random rdn = new Random();
      for (int i = 0; i < 60 ; i++)
      {
         int RanNumber = rdn.nextInt(4);
         if (RanNumber == 3)
         { 
            Customer c = new Customer();          
            line.enqueue(c);
            wait++;
            System.out.println("The number Customer is added in the queue line " + wait);
            
            if (!line.isEmpty())
            {
               line.getLast().setNext(c);
            
            }
            System.out.println("New Customer added !!!");
            System.out.println("Queue length is now " + line.getSize());
            System.out.println("----------------------------");            
         
         }
         
         if (!line.isEmpty())
         {
            Customer current = line.getFirst();
            current.decServiceTime();
            
            if (current.getServiceTime() == 0)
            {
               line.dequeue();
               totalServiced++;
               System.out.println("The customer removed complete !!!");
               System.out.println("Queue length is now " + line.getSize());
            }
         
         
         }
         
         if (line.getSize() > maxLine)
         {
            maxLine = line.getSize();
                     
         
         }
         
                    
      
      
      
      }
      System.out.println("Number of customer serviced " + totalServiced);
      System.out.println("Maximum queue length in last 60 minutes " + maxLine);
      
      
      
   }
}