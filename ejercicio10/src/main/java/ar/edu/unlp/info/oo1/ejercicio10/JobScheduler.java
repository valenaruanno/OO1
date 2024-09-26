package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	private Strategy strategy;
	private List<JobDescription> jobs;

	public JobScheduler(Strategy strategy) {
	this.strategy = strategy;
	this.jobs = new ArrayList<JobDescription>();
	}

	public void schedule(JobDescription job) {
	this.jobs.add(job);
	}

	public void unschedule(JobDescription job) {
	if (job != null) {
	this.jobs.remove(job);
	}
	}

	public Strategy getStrategy() {
	return this.strategy;
	}

	public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
	}

	public List<JobDescription> getJobs() {
	return this.jobs;
	}

	public JobDescription next() {
	JobDescription job = (this.strategy.next(jobs));
	this.unschedule(job);
	return job;
	}
}
