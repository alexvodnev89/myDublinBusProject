package dublinBus;

import java.io.IOException;

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
		sog.getDublinBusObjects(1712);

		

	}
	

}
