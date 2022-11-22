package br.com.ada.service;

import java.util.List;
import java.util.Optional;

import br.com.ada.model.Carta;
import br.com.ada.model.Jogador;

public class TabuleiroVersus implements Tabuleiro {


  private List<Jogador> jogadores;

  @Override
  public void inserirJogador(List<Jogador> jogadores) {
    
    if (jogadores.size() != 2){
      throw new IllegalArgumentException("Deve haver apenas 2 jogadores");
    }

    this.jogadores = jogadores;
    
  }

  @Override
  public Boolean jogar(Jogador jogador, Carta carta) {

    if(jogador.getPontos() >=  carta.getCusto()){
      
    } else {
      
    }
    
    
    return null;
  }

  @Override
  public Optional<Jogador> verificaVencedor() {
    // TODO Auto-generated method stub
    return Optional.empty();
  }
  
}
