package com.itheima.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomerStrToDate implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(source);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		// return null;
	}

}
