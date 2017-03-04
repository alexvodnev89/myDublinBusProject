package dublinBus;



public class StopObject {
	String uniqueNumber, arrivaldatetime, duetime, departuredatetime, departureduetime, scheduledarrivaldatetime, scheduleddeparturedatetime,
	destination, destinationlocalized, origin, originlocalized, operator, additionalinformation, lowfloorstatus, route, sourcetimestamp,
	monitored;
	
	protected StopObject(String id,String a,String b,String c,String d,String e,String f,String g,String h,String i,
			String j,String k,String l,String m,String n,String o,String p){
		uniqueNumber = id; arrivaldatetime = a; duetime = b; departuredatetime = c; departureduetime = d; scheduledarrivaldatetime = e;
		scheduleddeparturedatetime = f; destination = g; destinationlocalized = h; origin = i; originlocalized =j; operator = k;
		additionalinformation = l; lowfloorstatus = m; route = n; sourcetimestamp = o; monitored = p;	
	}
	
	public boolean equals(Object ob){
	  	if(!(ob instanceof StopObject)) return false;
	  	StopObject temp = (StopObject)ob;
	  	return uniqueNumber.equals(temp.uniqueNumber);
	}
	
	public String toString(){
		return  "Unique number : " + uniqueNumber + "\n" +
				"Arrivaldate time : "+ arrivaldatetime + "\n" + "Due time : " + duetime + "\n" +
				"Departure date time : " + 	departuredatetime + "\n" + 
				"Departure due time : " + departureduetime + "\n" + 
				"Scheduled arrival date time : " + scheduledarrivaldatetime + "\n" + 
				"Scheduled departure date time : " + scheduleddeparturedatetime + "\n" + 
				"Destination : " + destination + "\n" + 
				"Destination localized : " + destinationlocalized + "\n" + 
				"Origin : " + origin + "\n" + 
				"Origin localized : " + originlocalized + "\n" + 
				"Operator : " + operator + "\n" + 
				"Additional information : " + additionalinformation + "\n" + 
				"Low floor status : " + lowfloorstatus + "\n" + 
				"Route : " + route + "\n" + 
				"Source time stamp : " + sourcetimestamp + "\n" + 
				"Monitored : " + monitored;	
	}
	
	
	
}
