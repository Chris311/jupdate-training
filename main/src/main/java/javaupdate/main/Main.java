package javaupdate.main;

import java.util.logging.Logger;

import javaupdate.util.StringUtil;

public class Main {

	private static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.info(StringUtil.flip("!dlroW olleH"));
		throw new RuntimeException("test");
	}

}
