package br.com.Juan_J0rge.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String messege, String details) {}
