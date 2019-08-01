package cl.quartz.config;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * Job A
 * 
 * @author ccontrerasc
 *
 */
public class AJob implements Job {

	@Override
	public void execute(JobExecutionContext context) {
		System.out.println("Job a says hi !");
	}
}
