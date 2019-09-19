class Queue
{
    int queue [];
    int front;
    int rear;
    int size;
    
    public void insert(int data)
    {
        if(!isfull())
            
        {
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
     for(int i=0;i>=size;i++)
     {
         System.out.println(queue[front+i]);
         
     }
    }
    boolean isfull()
    {
        return  size==5;
    }
    
    }
    
        
    class Demo
    {
        public static void main(String args[])
        {
            Queue en= new Queue();
            en.insert(50);
            en.insert(55);
            en.insert(58);
            en.insert(59);
            en.delete();
            en.show();
            
        }
        
        
    }

    



