package org.rabbit.spring.demos.impl;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	private NumberFormat currNumberFormat = NumberFormat
			.getCurrencyInstance(Locale.US);

	public String getFormattedPrice(double inputPrice) {
		return currNumberFormat.format(inputPrice);
	}
}