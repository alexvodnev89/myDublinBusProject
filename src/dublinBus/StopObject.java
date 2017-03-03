package dublinBus;

import java.time.LocalDateTime;


public class StopObject {
	String uniqueNumber, arrivaldatetime, duetime, departuredatetime, departureduetime, scheduledarrivaldatetime, scheduleddeparturedatetime,
	destination, destinationlocalized, origin, originlocalized, operator, additionalinformation, lowfloorstatus, route, sourcetimestamp,
	monitored;
	LocalDateTime queryTime;
	
	protected StopObject(String id,String a,String b,String c,String d,String e,String f,String g,String h,String i,
			String j,String k,String l,String m,String n,String o,String p,LocalDateTime q){
		uniqueNumber = id; arrivaldatetime = a; duetime = b; departuredatetime = c; departureduetime = d; scheduledarrivaldatetime = e;
		scheduleddeparturedatetime = f; destination = g; destinationlocalized = h; origin = i; originlocalized =j; operator = k;
		additionalinformation = l; lowfloorstatus = m; route = n; sourcetimestamp = o; monitored = p; queryTime = q;	
	}
	
	public boolean equals(Object ob){
	  	if(!(ob instanceof StopObject)) return false;
	  	StopObject temp = (StopObject)ob;
	  	return uniqueNumber.equals(temp.uniqueNumber);
	}
	
	public String toString(){
		return "test git";
	}
	
	
	
}
