import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {
	public static int PRETTY_PRINT_INDENT_FACTOR = 2;

	public static int index = 0;

	public static void main(String[] args) throws IOException {
		try {
			String root = "root";
			Path path = Paths.get("src/test/resources/jsondata.json");

			String jsonstr = Files.readAllLines(path).get(index);

			JSONObject jsonobj = new JSONObject(jsonstr);

			// System.out.println(XML.toString(json));
			String formated=jsonobj.toString(PRETTY_PRINT_INDENT_FACTOR);
	         
			//System.out.println(formated);

			System.out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<" + root + ">" + XML.toString(jsonobj)
					+ "</" + root + ">");
		}

		catch (JSONException e) {
			System.out.println(e.toString());
		}

	}

}
