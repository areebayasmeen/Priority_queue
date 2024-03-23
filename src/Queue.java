import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Queue {
    int front=-1;
    int rear=-1;
   int[] array=new int[10];

   void enqueue(int data){
       if(rear== array.length-1){
           System.out.println("queue full");
       }

       if(rear==-1 && front==-1){
         front=0;
         rear=0;
         array[rear]=data;
         return;
       }

        int insertIndex=rear;
       for(int i=rear;i>=front;i--) {
           if (data < array[i]) {
               array[i+1]=array[i];
               insertIndex--;
           }
       }
       array[insertIndex+1]=data;
       rear++;


   }



   int dequeue(){
       int data=array[front];
       front++;
         return data;  }


    void display(){
       for(int i=front;i<=rear;i++){
           System.out.println(array[i]);
       }
    }
}
