package com.demo.webflux.config.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.http.MediaType.*;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


import com.demo.webflux.handlers.UserHandler;

@Configuration
public class UserRouterConfig {
	@Bean
	public RouterFunction<ServerResponse> userHandlerFunction(UserHandler userHandler){
		return RouterFunctions.route(GET("/individual/user")
				.and(accept(APPLICATION_JSON)), userHandler::getUserByIdAndType)
				.and(RouterFunctions.route(accept(APPLICATION_JSON), userHandler::getUserByIdAndType));
	}
}
