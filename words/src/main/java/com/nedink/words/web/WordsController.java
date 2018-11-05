package com.nedink.words.web;

import com.nedink.words.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordsController {

    private WordsService wordsService;

    @Autowired
    public WordsController(WordsService wordsService) {
        this.wordsService = wordsService;
    }

    @GetMapping("/count")
    public ResponseEntity getCount() {
        return new ResponseEntity(wordsService.getCount(), HttpStatus.OK);
    }

    @GetMapping(params = "regex")
    public ResponseEntity getByRegex(@RequestParam String regex) {
        List<String> result = wordsService.getByRegex(regex);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping(value = "/count", params = "regex")
    public ResponseEntity getCountByRegex(@RequestParam String regex) {
        long result = wordsService.getCountByRegex(regex);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
