package com.currency.currency.controller;


import com.currency.currency.dto.CurrencyDTO;
import com.currency.currency.dto.ResponseDTO;
import com.currency.currency.service.IConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/currency")
@AllArgsConstructor
public class currencycontroller {

    public final IConverter iConverter;

    @PostMapping("/convert")
    public ResponseEntity<ResponseDTO> createEmployee(@RequestBody CurrencyDTO currencyDTO){
        System.out.println(currencyDTO);
        int res = iConverter.fetchcurrencyvalue(currencyDTO);
        System.out.println(currencyDTO.getAmount()*res);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDTO("201","Created Successfully"));
    }
}
