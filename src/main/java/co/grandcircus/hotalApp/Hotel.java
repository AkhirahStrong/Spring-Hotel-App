package co.grandcircus.hotalApp;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	private String city;
	private int  pricePerNight;
	
	public Hotel() {
		
	}

	public Hotel(Long id, String name, String city, int pricePerNight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
	}
	
	
	
	

		

}
