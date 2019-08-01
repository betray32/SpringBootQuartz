package cl.quartz.launcher;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Carga inicial
 * 
 * @author ccontrerasc
 *
 */
@SpringBootApplication(scanBasePackages = { "cl.quartz.dao", "cl.quartz.properties" , "cl.quartz.commandline" , "cl.quartz.config" })
public class QuartzTestApplication {

	private static final Log log = LogFactory.getLog(QuartzTestApplication.class);

	/**
	 * MAIN
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
		log.info("Inicializando - Quartz Spring Boot");
		log.info("> Started at: " + date);

		SpringApplication.run(QuartzTestApplication.class, args);
	}

}
