package fp.lifeexpect;

import java.time.LocalDate;
import java.util.List;

public interface Lifeexpect extends Comparable <Lifeexpect>{
	
	public Integer getYear();
	public void setYear(Integer year);
	public Float getTotal_population();
	public void setTotal_population(Float total_population);
	public Float getMales();
	public void setMales(Float males);
	public Float getFemales();
	public void setFemales(Float females);
	public String getCountry();
	public void setCountry(String country);
	public Boolean getTotal_population_more_than_70();
	public void setTotal_population_more_than_70(Boolean total_population_more_than_70);
	public void setfecha(LocalDate fecha);
	public List<String> getCaracteristicas();
	public void setCaracteristicas(List<String>caracteristicas);
	
	

}
