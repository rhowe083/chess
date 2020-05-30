package chess.springboot;
/**
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author ryanhowe
 *
 */
@SpringBootApplication
public class ChessApiApp {
	
	/**
	 * Main method which call the static method "run" from
	 * SpringApplication.
	 * 
	 * 	This;
	 * 		 sets up default configurations
	 * 		 Starts spring application context
	 * 		 Performs class path scan
	 * 		 Starts Tomcat server
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ChessApiApp.class, args);

	}
}
