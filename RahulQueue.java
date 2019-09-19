
package rahulqueue;

class Queue
{
    int queue [] = new int[5];
    int front;
    int rear;
    int size;
    
    public void insert(int data)
    {
        if(!isfull()){
            queue[rear]= data;
            
        
            
            rear++;
            size++;
        }
        else
            System.out.println("queue is full");
        
        
    }
    void delete()
    {
        if(size!=0)
            
        {
            int dataa =queue[front];
            front++;
            size--;
        }
        else
            System.out.println("queue is empty");
        
        
      
    }
    
    void show()
    {
     for(int i=0;i<=size;i++)
     {
         System.out.print(queue[front+i]+" ");
         
     }
    }
    boolean isfull()
    {
        return  size==5;
    }
    
    }
    
        
    class RahulQueue
    {
        public static void main(String args[])
        {
            Queue en= new Queue();
            
            en.insert(55);
            en.insert(58);
            en.insert(59);
            en.delete();
            en.show();
            
        }
        
        
    }

    



