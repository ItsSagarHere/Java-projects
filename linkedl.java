import java.util.*;

public class linkedl {
   node head;
  
    class node{
        String data;
        node next;
        node(String data){
        this.data=data;
        this.next=null;
        }
    }
     public void add(String data){
        node n = new node(data);
        if (head == null){
            head = n;
            return;
        }
       n.next = head;
       head =n;
     }
public void addmiddle(String data, int p){
    node n = new node(data);
    if (head == null){
        head = n;
        return;
    }
        node curr = head;
        for( int i=1;i<p;i++){
            
            curr = curr.next;
            if(curr == null){
              System.out.println("list end enter valid position to add node");
              return;
            }
           }
           n.next=curr.next;
           curr.next=n;
          }
     public void addlast(String data){
        node n = new node(data);
        if (head == null){
            head = n;
            return;
        }
       node curr = head;
       while(curr.next!=null){
        System.out.println("Previous of current node"+"  "+curr.data +"->");
        curr = curr.next;
       }
       curr.next=n;
     }
     public void show(){
        if (head == null){
         System.out.println("Empty");
         return;
        }
        node cn = head;
        while(cn!=null){
            System.out.print(cn.data +"->");
            cn = cn.next;

        }
        System.out.println("null");
     }

    public static void main(String args[]){
        linkedl list = new linkedl();
        
        int s,h,p;
        
       do{
        System.out.println("Enter 1.add/2.show and 0.exit from main menu");
        Scanner sc =new Scanner(System.in);
              s = sc.nextInt();
              
              if(s==1){
                do{
                    System.out.println("Enter 1.add/2.addmiddle/3.addlast and 0.Exit");
                   Scanner scp =new Scanner(System.in);
                 h = scp.nextInt();
                 if(h==1){
                    list.add("is");    
                    list.add("august");
                    
                 }
                 if(h==2){
                    System.out.println("Enter Position aftr add");
                   Scanner sp =new Scanner(System.in);
                   p = sp.nextInt();
                    list.addmiddle("pompom",p);
                  }

                 if(h==3){
                    list.addlast("sskm");
                  }
                  else{
              System.out.println("Enter Valid no");
       }
                }
                while(h != 0);
              }
              if(s==2){
                list.show();
               
              }
              else
              System.out.println("Enter Valid no for main menu");
              
       }
        while(s != 0);
        
    }
}
