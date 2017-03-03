package dublinBus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StopObjectGetter {
	 void getDublinBusObjects(String s) throws IOException, JSONException{
		JSONObject json = readJsonFromUrl(s);
		if(json != null){
			JSONArray resultsArray = json.getJSONArray("results");
			String stopID = json.getString("stopid");
			if(resultsArray.length() != 0 && !stopID.equals("")){
				for (int i = 0; i < resultsArray.length(); i++) {
					JSONObject jo = resultsArray.getJSONObject(i);
					
					String arrivaldatetime = jo.getString("arrivaldatetime") != null ? jo.getString("arrivaldatetime") : "";
					String duetime = jo.getString("duetime") != null ? jo.getString("duetime") : "";
					String departuredatetime = jo.getString("departuredatetime") != null ? jo.getString("departuredatetime") : "";
					String departureduetime = jo.getString("departureduetime") != null ? jo.getString("departureduetime") : "";
					String scheduledarrivaldatetime =
							jo.getString("scheduledarrivaldatetime") != null ? jo.getString("scheduledarrivaldatetime") : "";
					String scheduleddeparturedatetime =
							jo.getString("scheduleddeparturedatetime") != null ? jo.getString("scheduleddeparturedatetime") : "";
					String destination = jo.getString("destination") != null ? jo.getString("destination") : "";
					String destinationlocalized =
							jo.getString("destinationlocalized") != null ? jo.getString("destinationlocalized") : "";
					String origin = jo.getString("origin") != null ? jo.getString("origin") : "";
					String originlocalized = jo.getString("originlocalized") != null ? jo.getString("originlocalized") : "";
					String operator = jo.getString("operator") != null ? jo.getString("operator") : "";
					String additionalinformation = 
							jo.getString("additionalinformation") != null ? jo.getString("additionalinformation") : "";
					String lowfloorstatus = jo.getString("lowfloorstatus") != null ? jo.getString("lowfloorstatus") : "";
					String route = jo.getString("route") != null ? jo.getString("route") : "";
					String sourcetimestamp = jo.getString("sourcetimestamp") != null ? jo.getString("sourcetimestamp") : "";
					String monitored = jo.getString("monitored") != null ? jo.getString("monitored") : "";	
					
					LocalDateTime currentTime = LocalDateTime.now();			
					String uniqueNumber = stopID + " " + scheduledarrivaldatetime;
					
					StopObject stop = new StopObject(uniqueNumber,arrivaldatetime,duetime,departuredatetime,departureduetime,
							scheduledarrivaldatetime,scheduleddeparturedatetime,destination,destinationlocalized,origin,
							originlocalized,operator,additionalinformation,lowfloorstatus,route,sourcetimestamp,
							monitored,currentTime);
					
				}
			}
		}
	}
	
	String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	}
	JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	}
}
