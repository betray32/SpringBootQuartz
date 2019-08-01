package cl.quartz.commandline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cl.quartz.dao.OracleProcedures;

/**
 * StartupApp
 * 
 * @author ccontrerasc
 *
 */
@Component
public class StartupApp implements CommandLineRunner {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(StartupApp.class);

	@Autowired
	private OracleProcedures dao;

	/**
	 * Ejecucion automatica
	 */
	@Override
	public void run(String... args) throws Exception {

		log.info("Run Automatico desde [CommandLineRunner]");
		dao.obtenerParametros();

	}

}
