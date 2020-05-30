package chess.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ryanhowe
 *
 */
@RestController
public class moveController {
	
	@RequestMapping("/message")
	public String message() {
		return "Hello";
	}

}
