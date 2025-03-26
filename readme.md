# Ideia inicial do projeto

Abstract Factory
- Cria família de objetos (peças, tabuleiros)

Builder
- Constrói objetos complexos ( tabuleiro, posicionamento de peças, regras).

Prototype
- Clona peças semelhantes (peão, peças da dama...)

Factory Method
- Definir uma interface para criar objetos mas deixar as subclasses decidirem quais classes instanciar.

Bridge
- Separar a abstração da implementação (Regras comuns + interface de implementação {Validar movimento})

Decorator
- Adicionar componentes individuais (habilidades) sem modificar a classe base

Flyweight
- Células do tabuleiro podem compartilhar o mesmo estado, reduzindo o consumo de recursos.