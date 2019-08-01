package cl.quartz.config;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ConfigureJob
 * 
 * @author ccontrerasc
 *
 */
@Configuration
public class ConfigureJob {

	/********************************
	 * JOB A
	 */
	@Bean
	public JobDetail jobADetails() {
		return JobBuilder.newJob(AJob.class)
				.withIdentity("sampleJobA")
				.storeDurably()
				.build();
	}

	@Bean
	public Trigger jobATrigger(JobDetail jobADetails) {

		return TriggerBuilder.newTrigger()
				.forJob(jobADetails)
				.withIdentity("sampleTriggerA")
				.withSchedule
				(CronScheduleBuilder.cronSchedule("0/2 * * ? * * *"))
				.build();
	}
	/********************************/

	/********************************
	 * JOB B
	 */
	@Bean
	public JobDetail jobBDetails() {
		return JobBuilder
				.newJob(BJob.class)
				.withIdentity("sampleJobB")
				.storeDurably()
				.build();
	}

	@Bean
	public Trigger jobBTrigger(JobDetail jobBDetails) {

		return TriggerBuilder.newTrigger()
				.forJob(jobBDetails)
				.withIdentity("sampleTriggerB")
				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * ? * * *"))
				.build();
	}
	/********************************/
}
