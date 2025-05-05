package com.example.quotegenerator.controller;


import com.example.quotegenerator.model.Quote;
import com.example.quotegenerator.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }

    @PostMapping("/save")
    public Quote saveQuote(@RequestBody Quote quote) {
        return quoteService.saveQuote(quote);
    }

    @GetMapping("/saved")
    public List<Quote> getAllSavedQuotes() {
        return quoteService.getAllSavedQuotes();
    }
}

