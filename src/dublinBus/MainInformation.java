package dublinBus;

import java.io.IOException;

import org.json.JSONException;

public class MainInformation {

	public static void main(String[] args) throws IOException, JSONException {
		StopObjectGetter sog = new StopObjectGetter();
		sog.getDublinBusObjects("https://data.dublinked.ie/cgi-bin/rtpi/realtimebusinformation?stopid=1712&format=json");
	}

}
