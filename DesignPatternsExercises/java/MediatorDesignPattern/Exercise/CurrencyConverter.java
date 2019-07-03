import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	private static Map<String, Float> conversionToDollarRates = new HashMap<>();
	__________(3)__________ {
		conversionToDollarRates.put("USD", (float) 1);
		conversionToDollarRates.put("EUR", (float) 0.9378);
		conversionToDollarRates.put("GBP", (float) 0.7974);
		conversionToDollarRates.put("INR", (float) 64.54);
	}

	public static float convert(String currency, float amount) {
		return amount / conversionToDollarRates.get(currency);
	}
}
