package com.github.week6day2.controller;

import com.github.week6day2.dto.SampleData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleCSRController {

    @GetMapping("/sample")
    public List<SampleData> getSampleList(){
        List<SampleData> sampleDataList = new ArrayList<>();
        sampleDataList.add(new SampleData(1,"sample item1"));
        sampleDataList.add(new SampleData(2,"sample item2"));
        sampleDataList.add(new SampleData(3,"sample item3"));
        sampleDataList.add(new SampleData(4,"sample item4"));
        return sampleDataList;
    }
}
