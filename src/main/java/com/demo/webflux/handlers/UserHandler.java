package com.demo.webflux.handlers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.demo.webflux.model.User;
import com.demo.webflux.services.UserService;
import com.demo.webflux.util.CustomResponse;
import com.demo.webflux.util.UserType;

import reactor.core.publisher.Mono;

@Component
public class UserHandler {
	private UserService service;

	public UserHandler(UserService service) {
		this.service = service;
	}

	private static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// /[individual][organisation]/user
	public Mono<ServerResponse> getUserByIdAndType(ServerRequest serverRequest) {
		String path = serverRequest.uri().getPath();
		String userTypeStr = path.split("/")[1];
		UserType userType = null;

		switch (userTypeStr) {
			case "individual":
				userType = UserType.INDIVIDUAL;
				break;
			case "organisational":
				userType = UserType.ORGANISATION;
				break;
		}
		Optional<String> userIdStr = serverRequest.queryParam("userId");

		if (userIdStr.isPresent() && isInteger(userIdStr.get())) {
			// replace with call to repo
			User u = new User(Integer.parseInt(userIdStr.get()), 21, "mi", "se", userType, null, null);
			Mono<User> user = Mono.just(u);
			return ServerResponse.ok().body(user, User.class);
		}
		return ServerResponse.badRequest().body(Mono.just(new CustomResponse(HttpStatus.BAD_REQUEST.value(),
				HttpStatus.BAD_REQUEST.toString(), "Invalid user id")), CustomResponse.class);
	}
}
