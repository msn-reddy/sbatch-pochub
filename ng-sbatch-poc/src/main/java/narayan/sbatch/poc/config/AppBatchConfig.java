package narayan.sbatch.poc.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class AppBatchConfig {

	private JobBuilderFactory jobs;
	private StepBuilderFactory steps;

	public AppBatchConfig(JobBuilderFactory jobs, StepBuilderFactory steps) {
		this.jobs = jobs;
		this.steps = steps;
	}
	
	

}
