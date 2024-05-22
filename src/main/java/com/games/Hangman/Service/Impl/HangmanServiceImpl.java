package com.games.Hangman.Service.Impl;

import com.games.Hangman.Entities.Hangman;
import com.games.Hangman.Repositories.HangmanRepository;
import com.games.Hangman.Service.HangmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;

@Service
public class HangmanServiceImpl implements HangmanService {

    @Autowired
    private HangmanRepository hangmanRepository;

    private final String[] words = {"Hangman", "Apple", "Cat", "Bark", "Hyundai"};

    public Hangman startNewGame(){
        String word = words[new Random().nextInt(words.length)];
        Hangman hangman = new Hangman();
        hangman.setWord(word);
        hangman.setMaskedWord("_".repeat(word.length()));
        hangman.setAttemptsLeft(6);
        hangman.setGuessedLetters(new HashSet<>());
        return hangmanRepository.save(hangman);
    }

    public Hangman makeGuess(Long gameId, char guess){
        Hangman hangman = hangmanRepository.findById(gameId).orElseThrow();
        if(hangman.getGuessedLetters().contains(guess) || hangman.getAttemptsLeft() <= 0){
            return hangman;
        }
        hangman.getGuessedLetters().add(guess);

        if(hangman.getWord().indexOf(guess) >= 0){
            StringBuilder newMaskedWord = new StringBuilder(hangman.getMaskedWord());
            for(int i=0;i<hangman.getWord().length();i++){
                if(hangman.getWord().charAt(i)==guess){
                    newMaskedWord.setCharAt(i, guess);
                }
            }
            hangman.setMaskedWord(newMaskedWord.toString());
        }else{
            hangman.setAttemptsLeft(hangman.getAttemptsLeft() -1);
        }

        return hangmanRepository.save(hangman);
    }
}
