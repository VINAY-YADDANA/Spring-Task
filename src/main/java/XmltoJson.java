import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmltoJson {
	
	//public static int PRETTY_PRINT_INDENT_FACTOR=6;
	
	public static int index=0;

	public static void main(String[] args) throws IOException {
		try {
		Path path = Paths.get("src/test/resources/Xmlfile.xml");
		 
		String xmlstr = Files.readAllLines(path).get(index);
		         
		JSONObject jsonobj = XML.toJSONObject(xmlstr);
		
		String formated=jsonobj.toString(3);
		         
		System.out.println(formated);
	}
		catch(JSONException e)
		{
			System.out.println(e.toString());
		}
	}

}
