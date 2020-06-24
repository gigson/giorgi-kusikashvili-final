package giorgi.kusikashvili;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@WebService
public class CurrencyService {

    private final Map<String, Currency> currencies = new HashMap<>();

    public CurrencyService() {
        currencies.put("USD", new Currency("USD desc", 1.12345));
        currencies.put("EUR", new Currency("EUR desc", 2.12345));
    }

    @WebMethod
    public double getCurrency(String currency) {
        return currencies.get(currency).getRate();
    }

    @WebMethod
    public String getCurrencyDescription(String currency) {
        return currencies.get(currency).getDescription();
    }

    @WebMethod
    public String getDate() {
        return LocalDateTime.now().toString();
    }

}
