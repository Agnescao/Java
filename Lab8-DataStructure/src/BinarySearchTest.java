

import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 

public class BinarySearchTest  {
	
	public static boolean search(int[] list,int target){
		boolean res=false;
        int LI=0;
        int UI=list.length-1;
        int LOC = (UI+LI)/2;
        while(res == false && UI >= LI){
	     if(list[LOC] == target) {res=true;}
	     else if (target < list[LOC]) {UI = LOC -1;}
	     else {LI = LOC +1;}
	     LOC = (UI+LI)/2;
        }
        return res;

}

public static void main(String[] args)
{
			int[] list={1,3,5,6,7,9,11,17};
			int target=Console.readInt("Enter Target:");
			boolean res=search(list,target);
			System.out.println("Target Found: "+res);
			}
}
