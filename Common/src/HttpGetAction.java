import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpGetAction {
	public static void main(String[] args) {
		try {
			String s = postUrlDataResult("http://192.168.82.85:7001/mycim2/lotQDN.do?sys=OA&sqr=1");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String postUrlDataResult(String strArry) throws MalformedURLException, IOException {
		URL realurl = new URL(strArry);
		BufferedReader reader = new BufferedReader(new InputStreamReader(realurl.openStream()));
		StringBuilder inputLine = new StringBuilder();
		String str = "";
		while ((str = reader.readLine()) != null) {
			inputLine.append(str);
		}
		str = inputLine.toString();
		if (str.startsWith("\"") && str.endsWith("\"")) {
			str = str.substring(1, str.length() - 1);
		}
		if (str.contains("</")) {
			str = str.substring(str.indexOf(">") + 1, str.lastIndexOf("<"));
		}
		return str;
	}
}
