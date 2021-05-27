# Jogo-das-Palavras-Embaralhadas
Proposta de projeto do curso de Orientação a Objetos com Java do Instituto Tecnológico de Aeronáutica - ITA

O projeto contém as seguintes características:

-Principal: Instancía um objeto de FrabricaMecanica para iniciar o jogo;
-Fábrica de Mecânica: Instancía de forma randômica as implementações da interface MecanicaDoJogo;
-Fábrica de Embaralhadores: Instancía de forma randômica as implementações da interface Embaralhadores;
-Banco de palavras: Salva em uma list as palavras de um arquivo de texto;

As implementações de MecanicaDoJogo são os modos de jogo e suas regras, no caso Morte Súbita e Três Vidas. Estas também possui o método para instânciar um objeto de FabricaDeEmbaralhadores.
As implementações de Embaralhadores são as formas de embaralhar uma palavra, no caso aleatório e par-ímpar(separa os caracteres pares e ímpares de uma palavra), são responsáveis por retirar uma palavra do banco de palavras.

A idéia de utilizar interfaces é permitir, nas próximas versões, criar vários modos de jogo e várias formas de embaralhar uma palavra, podendo tornar o jogo mais dinâmico.

O que foi pedido pelo curso e ainda não foi alcançado, é fazer da classe principal a única responsável por lê as entradas e enviar as mensagens do jogo como saída.

Link da demonstração:
https://youtu.be/WEvrbyjRKNU
