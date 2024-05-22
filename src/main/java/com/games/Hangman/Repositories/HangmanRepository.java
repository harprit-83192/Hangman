package com.games.Hangman.Repositories;

import com.games.Hangman.Entities.Hangman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangmanRepository extends JpaRepository<Hangman, Long> {
}
