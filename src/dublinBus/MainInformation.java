package dublinBus;

import java.io.IOException;
import java.text.Format.Field;

import org.json.JSONException;

public class MainInformation {
	public static void main(String[] args) throws IOException, JSONException {
		try { 
			java.lang.reflect.Field field = Class.forName("javax.crypto.JceSecurity").
			getDeclaredField("isRestricted");
			field.setAccessible(true);
			field.set(null, java.lang.Boolean.FALSE); 
			} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		StopObjectGetter sog = new StopObjectGetter();
		sog.getDublinBusObjects("https://data.dublinked.ie/cgi-bin/rtpi/realtimebusinformation?stopid=1712&format=json");
	}
	

}
