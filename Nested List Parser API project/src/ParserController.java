package com.example.nestedlist.controller;

import com.example.nestedlist.dto.*;
import com.example.nestedlist.service.ParserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ParserController {

    private final ParserService parserService;

    public ParserController(ParserService parserService) {
        this.parserService = parserService;
    }

    @PostMapping("/parse")
    public ParseResponse parse(@RequestBody ParseRequest request) {
        return parserService.parse(request);
    }
}