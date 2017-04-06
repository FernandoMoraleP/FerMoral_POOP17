import java.io.*;

public class LongReader {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public Long leeLong() {
		Long dato = 0L;
		try {
			dato = Long.parseLong(br.readLine());
		} catch(Exception ex) {}
		return dato;
	}
}