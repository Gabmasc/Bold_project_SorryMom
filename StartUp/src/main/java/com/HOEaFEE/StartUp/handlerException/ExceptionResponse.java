package com.HOEaFEE.StartUp.handlerException;

import java.util.Date;

public record ExceptionResponse(Date timeStamp, String message, String details) {}
