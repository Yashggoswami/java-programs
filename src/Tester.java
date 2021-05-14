
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
// import java.lang.Double;
class Student {
	
    private static Double put;
	private static Entry<String,Double> min;

	public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
	   HashMap<String,Double> map=new HashMap<>();

	   Iterator<Entry<String,Double>> itr=studentMarks.entrySet().iterator();
		
	  

		// Iterator<String> itr=studentMarks.keySet().iterator();
		// Double max=Double.MIN_VALUE;
		// String str="";
		// Double min=Double.MAX_VALUE;
		// String str1="";
		// while(itr.hasNext())
		// {	String temp=itr.next();
		// 	if(studentMarks.get(temp)>max){
		// 		max=studentMarks.get(temp);
		// 		str=temp;
		// 	}
		// 	if(studentMarks.get(temp)<min){
		// 		min=studentMarks.get(temp);
		// 		str1=temp;
		// 	}
			
		// }
		// map.put(str,max);
	    // map.put(str1,min);

		return map;
	// Double maxvalue=Collections.max(studentMarks.values());
    //   Double minvalue=Collections.min(studentMarks.values());
	  
    //   for(Map.Entry<String,Double> pair:studentMarks.entrySet())
    //   {
    //       if(pair.getValue()==minvalue || pair.getValue()==maxvalue)
    //         map.put(pair.getKey(),pair.getValue());
    //   }
	// 	return map;
	}

}

public class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}