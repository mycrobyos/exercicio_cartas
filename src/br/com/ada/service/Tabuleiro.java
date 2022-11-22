package br.com.ada.service;

import java.util.List;
import java.util.Optional;

import br.com.ada.model.Carta;
import br.com.ada.model.Jogador;

public interface Tabuleiro {
  
  public void inserirJogador(List<Jogador> jogador);

  public Boolean jogar(Jogador jogador, Carta carta);

  public Optional<Jogador> verificaVencedor();

}
