package br.ufrn.searchsystem.repositories.repository2;

import br.ufrn.searchsystem.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordsRepository2 extends JpaRepository<Word, Long> {
}