import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class createProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

	        try (OutputStream output = new FileOutputStream(System.getProperty("user.dir") + "\\config.properties")) {

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("db.url", "localhost");
	            prop.setProperty("db.user", "mkyong");
	            prop.setProperty("db.password", "password");

	            // save properties to project root folder
	            prop.store(output, null);

	            System.out.println(prop);

	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	    }
	}
}