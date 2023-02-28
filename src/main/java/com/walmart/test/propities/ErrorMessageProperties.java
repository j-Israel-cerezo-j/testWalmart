package com.walmart.test.propities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "messages.error")
@Getter
@Setter
public class ErrorMessageProperties {
	private String empetyNotNull;

}
