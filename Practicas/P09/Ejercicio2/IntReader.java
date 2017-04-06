import java.io.*;

public class IntReader {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public int leeInt() {
		int dato = 0;
		try {
			dato = Integer.parseInt(br.readLine());
		} catch(Exception ex) {}
		return dato;
	}
}