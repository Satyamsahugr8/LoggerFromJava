package com.Example;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggerConfiguration {

	public static Logger configurator(String className) {

		Logger LOGGER = Logger.getLogger(className);

		try {

			Formatter customFormatter = new Formatter() {

				@Override
				public String format(LogRecord record) {
					return String.format("%s %s %s %s - %s%n",   DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss.SSS").format(LocalDateTime.now()),
							record.getLevel(), record.getSourceClassName(), record.getSourceMethodName(), record.getMessage());
				}
			};

			FileHandler fileHandler = new FileHandler("C:\\Users\\satya\\git\\LoggerFromJava\\src\\main\\resources\\apps.log", true);
			fileHandler.setFormatter(customFormatter);
			LOGGER.addHandler(fileHandler);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return LOGGER;
	}
	
}
