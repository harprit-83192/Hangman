package com.games.Hangman.Controller;

import com.games.Hangman.Entities.Hangman;
import com.games.Hangman.Service.HangmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class HangmanController {

    @Autowired
    private HangmanService hangmanService;

    @PostMapping("/start")
    public Hangman startNewGame(){
        return hangmanService.startNewGame();
    }

    @PostMapping("/{gameId}/guess")
    public Hangman makeGuess(@PathVariable Long gameId, @RequestParam char guess){
        return hangmanService.makeGuess(gameId, guess);
    }
}
