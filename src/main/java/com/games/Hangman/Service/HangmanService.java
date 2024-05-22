package com.games.Hangman.Service;

import com.games.Hangman.Entities.Hangman;
import org.springframework.stereotype.Service;

@Service
public interface HangmanService {

    Hangman startNewGame();

    Hangman makeGuess(Long gameId, char guess);
}
