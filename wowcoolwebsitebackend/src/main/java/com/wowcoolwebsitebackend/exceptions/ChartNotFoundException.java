package com.wowcoolwebsitebackend.exceptions;

import java.io.Serial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Chart not found")
public class ChartNotFoundException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;
}
