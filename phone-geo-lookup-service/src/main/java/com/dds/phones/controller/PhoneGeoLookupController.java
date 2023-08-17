package com.dds.phones.controller;

import com.dds.phones.service.PhoneGeoLookupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PhoneGeoLookupController {

    private final PhoneGeoLookupService service;

    @GetMapping("/lookup")
    public List<String> getCountriesByPhone(@RequestParam(name = "phone") String phone) {
        log.debug("Request for phone: {}", phone);
        return service.getCountriesByPhone(phone);
    }
}
