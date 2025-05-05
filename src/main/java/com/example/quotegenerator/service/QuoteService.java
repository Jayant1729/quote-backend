package com.example.quotegenerator.service;



import com.example.quotegenerator.model.Quote;
import com.example.quotegenerator.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    private final QuoteRepository quoteRepository;

    private final String[] randomQuotes = {
            "Believe in yourself!",
            "Stay positive!",
            "Never give up!",
            "Dream big!",
            "Work hard in silence, let success make the noise.",
            "Persistence and Determination are the only 2 key to success"
    };

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(randomQuotes.length);
        return new Quote(randomQuotes[index]);
    }

    public Quote saveQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    public List<Quote> getAllSavedQuotes() {
        return quoteRepository.findAll();
    }
}

