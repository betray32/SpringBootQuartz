package cl.quartz.config;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * JOB B
 * 
 * @author ccontrerasc
 *
 */
public class BJob implements Job {
	
	@Override
	public void execute(JobExecutionContext context) {
		System.out.println("Job b says hi !");
	}
}
