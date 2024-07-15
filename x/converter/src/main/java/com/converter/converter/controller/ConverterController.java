package com.converter.converter.controller;

import com.converter.converter.dto.currencyDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Validated
@RestController
@RequestMapping("/api/converter")
@AllArgsConstructor
public class ConverterController {

    @PostMapping("/currenciesvalue")
    public ResponseEntity<Integer> currencyconvert(@RequestBody currencyDTO currencyDto) {
        int res = 1;
        if ( (Objects.equals(currencyDto.getTo(), "inr")) && (Objects.equals(currencyDto.getFrom(), "usa") ) ) {
            res = answer(85);
        }


        else if ((currencyDto.getTo() == "inr" && currencyDto.getFrom() == "eur") | (currencyDto.getTo() == "eur" && currencyDto.getFrom() == "inr")) {
            answer(100);

        }

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    private int answer(int i){
        return i;
    }
}
