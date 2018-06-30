public class LinkedQueue {

   private Customer first, last;
   private int size;
   
   public LinkedQueue () {
      first = last = null;
   }
   
   public boolean isEmpty () {     
      return first == null;
   }
   
   public void enqueue (Customer c) {
      //Adds Customer c to the back of the queue
      
      //if the queue is empty, first should reference the new object
      if ( isEmpty() ) {
         first = c;
      } else {
      
         //before we change last to reference the new object,
         //set the current last object's next reference to point
         //to the new object
         last.setNext (c);
      }
      
      //last should always reference the new object
      last = c;
      size++;
      
      
   }
   
   public Customer dequeue () {
      //Removes and return the first Customer in the queue
      
      if ( isEmpty() ) {
         System.out.println ("The queue the already empty");
         return null;
      }
      
      //Store a temp reference to the object we want to remove
      Customer temp = first;
      
      //Set first to reference the current first object's next reference
      //(which is the current second object in the list)
      first = first.getNext ();
      
      //if the queue is now empty, set last to null
      if ( isEmpty () ) {
         last = null;
      }
      size--;
      return temp;
   }
   
   public Customer getFirst()
   {
      return first;
   }
   public Customer getLast()
   {
      return last;
   }
   public int getSize()
   {
      return size;
   }
   

}