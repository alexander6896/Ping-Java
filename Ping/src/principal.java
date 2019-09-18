import java.io.BufferedReader;
import java.io.InputStreamReader;

public class principal {

	public static void runSystemCommand(String command) {
		try {

			Process p = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = "";

			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			System.out.println("El error" + e.getMessage());
		}
	}

	public static void main(String[] args) {

		String ip = "google.com.mx";
		runSystemCommand("ping " + ip);

	}

}
