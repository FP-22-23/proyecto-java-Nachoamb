package fp.lifeexpect;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import fp.utiles.Checkers;

public class LifeexpectImpl implements Lifeexpect{
	
	private Integer Year;
	private Float Total_population;
	private Float Males;
	private Float Females;
	private String Country;
	private Boolean Total_population_more_than_70;
	private LocalDate fecha;
	private tipo_dato tipo_dato;
	private List<String> caracteristicas;
	
	
	
	public LifeexpectImpl(LocalDate fecha, Integer year, Float total_population, Float males, Float females, String country,
			Boolean total_population_more_than_70, tipo_dato tipo_dato, List<String> caracteristicas) {
		
		Checkers.check("La fecha debe ser igual o anterior a la de hoy",
				fecha.isBefore(LocalDate.now()));
		Checkers.check("La población total debe ser mayor que cero", total_population > 0.0);
		
		
		

		this.Year = year;
		this.Total_population = total_population;
		this.Males = males;
		this.Females = females;
		this.Country = country;
		this.Total_population_more_than_70 = total_population_more_than_70;
		this.fecha = fecha;
		this.tipo_dato = tipo_dato;
		this.caracteristicas = caracteristicas;
	}
	
	public LifeexpectImpl(LocalDate fecha, Integer year, Float total_population, String country
			) {
		
		Checkers.check("La fecha debe ser igual o anterior a la de hoy",
				fecha.isBefore(LocalDate.now()));
		Checkers.check("La población total debe ser mayor que cero", total_population > 0.0);
		
		this.Year = year;
		this.Total_population = total_population;
		this.Country = country;
		caracteristicas = new List<string>;
		this.fecha = fecha;
		
		
	}	
		


	public Integer getYear() {
		return Year;
	}


	public void setYear(Integer year) {
		Year = year;
	}


	
	public int hashCode() {
		return Objects.hash(Females, Males, Total_population, Total_population_more_than_70, Year, fecha);
	}


	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeexpectImpl other = (LifeexpectImpl) obj;
		return Objects.equals(Females, other.Females) && Objects.equals(Males, other.Males)
				&& Objects.equals(Total_population, other.Total_population)
				&& Objects.equals(Total_population_more_than_70, other.Total_population_more_than_70)
				&& Objects.equals(Year, other.Year) && Objects.equals(fecha, other.fecha);
	}


	public Float getTotal_population() {
		return Total_population;
	}


	public void setTotal_population(Float total_population) {
		Checkers.check("La población total deber ser mayor que cero", total_population > 0.0);
	 Total_population = total_population;
	}


	public Float getMales() {
		return Males;
	}


	public void setMales(Float males) {
		Males = males;
	}


	public Float getFemales() {
		return Females;
	}
	public List<String> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<String>caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	public void setFemales(Float females) {
		Females = females;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public Boolean getTotal_population_more_than_70() {
		return Total_population_more_than_70;
	}


	public void setTotal_population_more_than_70(Boolean total_population_more_than_70) {
		Total_population_more_than_70 = total_population_more_than_70;
	}
	public void setfecha(LocalDate fecha) {
		Checkers.check("La fecha debe ser igual o anterior a la de hoy",fecha.isBefore(LocalDate.now()));
		this.fecha = fecha;
		
	}
	
	
	public String toString() {
		return "LifeexpectImpl [year=" + Year + ", total_population=" + Total_population +
				", Total_population_more_than_70=" + Total_population_more_than_70 + ", country="
				+ Country + ", females =" + Females + ", males =" + Males + ", caracteristicas ="
				+ caracteristicas + "]";
				
				
				
				
				
						
	}
	public int compareTo(Lifeexpect o) {
		int r;
		r=this.getTotal_population().compareTo(o.getTotal_population());
		if (r==0) {
			r=this.getFemales().compareTo(o.getFemales());
				if (r==0) {
					r=this.getYear().compareTo(o.getYear());
				}
		}
		return r;
	}
}







	
	
	


