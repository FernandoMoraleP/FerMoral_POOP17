import java.io.*;

public class StringReader {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public String leeString() {
		String dato = null;
		try {
			dato = br.readLine();
		} catch(Exception ex) {}
		return dato;
	}
}