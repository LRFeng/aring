package com.aring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.aring.handler.SystemWebSocketHandler;
import com.aring.interceptor.WebSocketHandshakeInterceptor;

@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer{


	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		//用来注册websocket server实现类，第二个参数是访问websocket的地址
		registry.addHandler(systemWebSocketHandler(),"/webSocketServer.do").addInterceptors(new WebSocketHandshakeInterceptor());
		 
		//这个是使用Sockjs的注册方法
        registry.addHandler(systemWebSocketHandler(), "/sockjs/webSocketServer.do").addInterceptors(new WebSocketHandshakeInterceptor())
                .withSockJS();
	}
	
	@Bean
    public WebSocketHandler systemWebSocketHandler(){
        return new SystemWebSocketHandler();
    }

}
