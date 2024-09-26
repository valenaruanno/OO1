package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class LIFO implements Strategy {
	public JobDescription next(List<JobDescription> jobs) {
        JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
            nextJob = jobs.get(jobs.size() - 1);
        }
        return nextJob;
    }

}
