
import java.util.*;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
    List<String> names=new ArrayList<String>();
    names.add("Ankit");
    names.add("rohit");
    names.add("anuj");
    names.add("");
    names.add("");
    names.add("sajan");
    names.add("Raj");
    
    int count_empty=(int)names.stream().filter((name) -> name.isEmpty()).count();
    System.out.println("total empty number is "+count_empty);
    

    //use of map
    
   List<Integer>numbers=new LinkedList<Integer>();
   numbers.add(1);
   numbers.add(2);
   numbers.add(3);
   numbers.add(4);
   List<Integer>squaredNumbers=numbers.stream().map(num ->num*num)
		   .collect(Collectors.toList());
   System.out.println("squared numbers are " +squaredNumbers);
   
   //using limit
   
   numbers.stream().limit(5).forEach(num->System.out.print("" +num));
   System.out.println("...");
	Random r=new Random();
	r.ints().limit(10).forEach(num->System.out.println("" +num));
	
	// using sorted
	
	}
	
	
	
	

}