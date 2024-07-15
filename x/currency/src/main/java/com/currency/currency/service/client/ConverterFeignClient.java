package com.currency.currency.service.client;

import com.currency.currency.dto.CurrencyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "converter-client", url = "http://localhost:8090/api/converter")
public interface ConverterFeignClient {

    @GetMapping("/currenciesvalue")
    ResponseEntity<Integer> currencyvalue(CurrencyDTO currencyDTO);
}
