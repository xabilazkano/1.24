import java.util.ArrayList;
import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("element");
	    arraylist.add("element2");
	    arraylist.add(1,"element1"); //we will add element1 between the previous elements
	    arraylist.add("element");
	    
	    System.out.println("The elements of the arraylist are:");
	    for (int i=0;i<arraylist.size();i++) { //we use size to know the length of the arraylist
	    	System.out.println(arraylist.get(i)); //we use get to get the values of the arraylist
	    }
	    
	    System.out.println("Tell me the value of an element and I will tell you if exists or not.");
	    String element = sc.next();
	    
	    if (arraylist.contains(element)) {
	    	System.out.println("The element exists in the arraylist and its first index is "+ arraylist.indexOf(element)); //it tells the first index
	    	System.out.println("The last index of this element is "+arraylist.lastIndexOf(element)); //it tells the last index
	    }
	    else {
	    	System.out.println("The element doesn't exist in the arraylist");
	    }
	    
	    
	    boolean flag =true;
	    while (flag) {
	    System.out.println("Tell me the index of the element you want to remove");
	    if (sc.hasNextInt()) {
	    	int rm =sc.nextInt();
	    	if (rm<=arraylist.size() && rm>=0) {
	    		arraylist.remove(rm); //we remove an element with an specific index
	    		System.out.println("The element has been removed");
	    		 for (int i=0;i<arraylist.size();i++) { 
	    		    	System.out.println(arraylist.get(i)); 
	    		    	flag=false;
	    		    }
	    	}
	    	else {
	    		System.out.println("Incorrect index");
	    	}
	    }
	    else {
	    	System.out.println("Incorrect index");
	    	sc.next();
	    	
	    }
	    }
	    
	    boolean flag1 = true;
	    while (flag1) {
	    System.out.println("Tell me the name of an element and I will erase it");
	    element = sc.next();
	    if (arraylist.contains(element)) {
	    	arraylist.remove(element); // we remove an specific element
	    	System.out.println("The element has been removed");
	    	flag1=false;
	    	for (int i=0;i<arraylist.size();i++) { 
   		    	System.out.println(arraylist.get(i)); 
   		    }
	    }
	    else {
	    	System.out.println("The element doesn't exist");
	    }
	    }
	    
	    arraylist.clear(); //it removes all the elements
	    System.out.println("All the elements have been erased");
	    
	    System.out.println("Is the arraylist empty?");
	    System.out.println(arraylist.isEmpty()); //it tells us if the arraylist is empty
	    
	    System.out.println("We will add element,element1 and element2");
	    arraylist.add("element"); //we add some elements 
	    arraylist.add("element1");
	    arraylist.add("element2");

	    ArrayList arraylistcopy = (ArrayList) arraylist.clone(); //we clone our arraylist
	    System.out.println("The elements of the cloned arraylist are:");
	    for (int i=0;i<arraylistcopy.size();i++) { 
		    	System.out.println(arraylistcopy.get(i)); 
		    }
	    
	    Object[] array = arraylist.toArray(); //we create an array from the arraylist
	    System.out.println("The values of the array are:");
	    for (int i =0;i<array.length;i++) {
	    	System.out.println(array[i]);
	    }
	}

}
