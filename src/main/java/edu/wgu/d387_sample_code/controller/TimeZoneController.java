package edu.wgu.d387_sample_code.controller;


import edu.wgu.d387_sample_code.convertor.TimeConversion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time")
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneController {

    @GetMapping("/convert")
    public String convertTimeZone() {
        return TimeConversion.TimeConverter();
    }
}
