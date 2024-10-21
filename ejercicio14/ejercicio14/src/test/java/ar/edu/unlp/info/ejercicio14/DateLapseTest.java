package ar.edu.unlp.info.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	private DateLapse d;
	
	@BeforeEach
	void setUp() throws Exception{
		LocalDate fechaIni = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2024, 10, 8);
		d = new DateLapse(fechaIni, fechaFin);
	}
	
	@Test
	void sizeInDaysTest () {
		assertEquals (4, d.sizeInDays());
	}
	
	@Test
	void includesDateTest () {
		LocalDate fecha = LocalDate.of(2024, 10, 5);
		assertTrue (d.includesDate(fecha), "La fecha se encuentra en el rango");
		LocalDate fecha2 = LocalDate.of(2024, 10, 10);
		assertFalse (d.includesDate(fecha2), "La fecha no se encuentra en el rango");
		
	}
}
