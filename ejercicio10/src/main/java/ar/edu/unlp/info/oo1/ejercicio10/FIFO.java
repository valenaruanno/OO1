package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class FIFO implements Strategy{
	public JobDescription next(List<JobDescription> jobs) {
        JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
            nextJob = jobs.get(0);
        }
        return nextJob;
    }
}
