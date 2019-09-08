package com.demo.webflux.bootstrap;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.demo.webflux.model.Address;
import com.demo.webflux.model.Fine;
import com.demo.webflux.model.User;
import com.demo.webflux.model.Vehicle;
import com.demo.webflux.services.FineService;
import com.demo.webflux.services.UserService;
import com.demo.webflux.services.VehicleService;
import com.demo.webflux.util.UserType;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserService userService;
	@Autowired
	private FineService fineService;
	@Autowired
	private VehicleService vehicleService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		/*Fine f1 = new Fine(1, 600, true, new Date(2019, 8, 12));
		Fine f2 = new Fine(2, 700, true, new Date(2019, 11, 9));
		fineService.saveFine(f1).block();
		fineService.saveFine(f2).block();
		
		Vehicle v1 = new Vehicle(1, "67ua", new Date(2019, 7, 13), null);
		v1.setFines(Arrays.asList(f1, f2));
		vehicleService.saveVehicle(v1).block();*/
		
		/*User u1 = new User();
		u1.setFirstName("Suhani");
		u1.setLastName("Sharma");
		u1.setAge(21);
		u1.setUserType(UserType.INDIVIDUAL);
		u1.setUserId(5001);
		Address addr1 = new Address(1, "Itina", "Bangalore", "India", "231", "560100", "Karnataka", "Neeladri");
		u1.setAddress(addr1);
		u1.setVehicles(Arrays.asList(v1));
		User m = userService.saveUser(u1).block();*/
		
	}
}
