
public class linkedlist{
    node head;
    class node{
        int data1;
        node next;//reference variable ;
        node(int val)
        {
            data=val;
            next=null;
        }
            
    }
    
    linkedlist(){
        head=null;  
    }
    public void insertatbeg(int value)
    {
        node nodeobj=new node(value);
        //when node null
        if(head==null)
        {
            head=nodeobj;
        }
        else{
            //when alreadyb a node 
            nodeobj.next=head;
            head=nodeobj;
        }
    }
}
