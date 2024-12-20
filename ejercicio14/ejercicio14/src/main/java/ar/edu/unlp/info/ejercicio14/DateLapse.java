package ar.edu.unlp.info.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		super();
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays (LocalDate from, LocalDate to) {
		return (int) this.from.until(this.to, ChronoUnit.DAYS);
	}
	
	public int sizeInDays () {
		return (int) this.from.until(this.to, ChronoUnit.DAYS);
	}
	public boolean includesDate (LocalDate fecha) {
		return ((fecha.isAfter(from) || (fecha.isEqual(from))) && ((fecha.isBefore(to)) || (fecha.isEqual(to))));
	}
}

