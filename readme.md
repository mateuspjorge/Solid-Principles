# PROJETO CRIADO COM O OBJETIVO DE FIXAÇÃO DO CONTEÚDO SOBRE OS PRINCÍPIOS SOLID NA PRÁTICA

Este documento consiste na abordagem dos princípios SOLID.

---

## Princípios SOLID

SOLID é um acrónimo que representa cinco princípios de design de software destinados a fazer o código mais
compreensível, flexível e escalável:

1. **S** - Single Responsibility Principle (Princípio da Responsabilidade Única)
2. **O** - Open/Closed Principle (Princípio do Aberto/Fechado)
3. **L** - Liskov Substitution Principle (Princípio da Substituição de Liskov)
4. **I** - Interface Segregation Principle (Princípio da Segregação de Interface)
5. **D** - Dependency Inversion Principle (Princípio da Inversão de Dependência)

---

## Single Responsibility Principle (Princípio da Responsabilidade Única)

Começando com o primeiro princípio do acrónimo, a responsabilidade única afirma que uma classe deveria somente ter uma
única responsabilidade.

E como isso poderia ajudar-nos na construção de um software melhor?

- Uma classe com uma única responsabilidade terá menos casos de testes.
- Menos funcionalidade numa única classe terá menos dependência.
- Melhora na organização, classes menores e bem organizadas ficam mais fáceis de encontrar num projeto.

---

## Open/Closed Principle (Princípio do Aberto/Fechado)

Simplificando esse princípio, classes deveriam ser abertas para extensão, mas fechadas para modificação. Ao fazer isso,
paramos de modificar o código existente e causar novos bugs potenciais. Claro, a única exceção à regra é ao consertar
erros no código existente.

---

## Liskov Substitution Principle (Princípio da Substituição de Liskov)

O próximo da lista é Liskov Substitution, sem dúvidas é o princípio mais complexo dos outros 5. Se uma classe A é um
subtipo da classe B, então nos deveriamos ter capacidade para substituir B com A sem implicar no comportamento do nosso
programa.