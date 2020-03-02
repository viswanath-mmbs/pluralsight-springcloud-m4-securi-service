package pluralsight.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class PluralsightSpringcloudM4SecuriServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM4SecuriServiceApplication.class, args);
	}
	
	@RequestMapping("/tolldata")
	public ArrayList<TollUsage> getTollData() {
		
		TollUsage toll1 = new TollUsage("100", "Station150", "KA53 EZ 9779", "1-Jan-2019");
		TollUsage toll2 = new TollUsage("101", "Station150", "KA53 EZ 9779", "1-Jan-2019");
		TollUsage toll3 = new TollUsage("102", "Station150", "KA53 EZ 9779", "1-Jan-2019");
		
		ArrayList<TollUsage> tollusage = new ArrayList<>();
		tollusage.add(toll1);
		tollusage.add(toll2);
		tollusage.add(toll3);
		return tollusage;
	}
	
	public static class TollUsage {
		
		public String Id;
		public String stationId;
		public String licensePlate;
		public String timestamp;
		
		
		public TollUsage() {
			super();
		}

		public TollUsage(String id, String stationId, String licensePlate, String timestamp) {
			super();
			Id = id;
			this.stationId = stationId;
			this.licensePlate = licensePlate;
			this.timestamp = timestamp;
		}
		
	}

}
