

public class BSTree
{   Node head;
    Node tail;
	public
	BSTree()  { tail = new Node(0, null, 0, null, null);
			  head = new Node(-1, null, 0, null, tail);}

	void  insert(int k, String nm, int a)
		{
		    Node  p, x;
		    p = head; x = head.right;
		    while (x!=tail)
			{ 	p = x;
		  		x = (k < x.key) ? x.left : x.right;}
				x = new Node (k, nm,a, tail, tail);
				if (k < p.key) p.left = x;
	          		else           p.right = x;
					}


        Node   search(int k)
				{
					Node   x= head.right;
                    tail.key=k;
                    boolean found=false;
					while (x!=tail && found==false)
						{ 	if (k==x.key) found=true;
		  					else if (k < x.key)     x= x.left ;
                                 else               x= x.right;
                        }
					if (x==tail)       return null;
	          		else               return   x;
				}
        void  delete(int id)
        {
        	 Node  p, x;
 		     p = head; x = head.right;
			while (x!=tail )
				{
				  p=x;
        	      if(x.key==id){x=x.right;}
        	      
        	    	  
        	      }
        		
        	}
        }
	