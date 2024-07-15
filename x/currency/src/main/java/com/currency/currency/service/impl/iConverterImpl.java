package com.currency.currency.service.impl;

import com.currency.currency.dto.CurrencyDTO;
import com.currency.currency.service.IConverter;
import com.currency.currency.service.client.ConverterFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class iConverterImpl implements IConverter {

    public final ConverterFeignClient converterFeignClient;

    @Override
    public int fetchcurrencyvalue(CurrencyDTO currencyDTO){
        return converterFeignClient.currencyvalue(currencyDTO).getBody();
    }

}
