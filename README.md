# Atividade 011 - Padrão Decorator

Refatoração do sistema de pedidos de bebidas utilizando o padrão **Decorator**, incluindo o desafio adicional do caramelo.

## Estrutura

| Classe | Papel |
|---|---|
| `Beverage` | Componente: abstração com `getDescription()` e `getCost()` |
| `Coffee` (R$ 5,00), `Tea` (R$ 4,00) | Componentes concretos |
| `BeverageDecorator` | Decorador base: implementa `Beverage` e guarda a bebida envolvida |
| `MilkDecorator` (+ R$ 1,50), `ChocolateDecorator` (+ R$ 2,00), `WhippedCreamDecorator` (+ R$ 2,50), `CaramelDecorator` (+ R$ 1,00) | Decoradores concretos |
| `Main` | Monta as bebidas e exibe descrição e preço usando apenas `Beverage` |

Para o desafio adicional, bastou criar a classe `CaramelDecorator`. Nenhuma classe existente foi alterada.

## Como executar

```bash
javac -d out src/*.java
java -cp out Main
```

## Questões para reflexão

**a) Qual problema existente no código inicial foi resolvido com o Decorator?**

No código inicial, cada combinação de bebida e adicionais precisava de uma subclasse própria (`CoffeeWithMilk`, `CoffeeWithMilkAndChocolate`...). Com chá e mais adicionais, o número de classes explodiria, e preços e descrições ficariam repetidos. Com o Decorator, cada adicional é uma classe só, e as combinações são montadas em tempo de execução, envolvendo uma bebida na outra.

**b) Quais classes representam o componente, os componentes concretos, o decorador base e os decoradores concretos na sua implementação?**

- Componente: `Beverage`
- Componentes concretos: `Coffee` e `Tea`
- Decorador base: `BeverageDecorator`
- Decoradores concretos: `MilkDecorator`, `ChocolateDecorator`, `WhippedCreamDecorator` e `CaramelDecorator`

**c) Por que o decorador deve implementar a mesma abstração do objeto que ele envolve?**

Para que uma bebida decorada continue sendo uma `Beverage`. Assim o cliente usa a bebida do mesmo jeito, decorada ou não, e um decorador pode envolver outro decorador, formando uma corrente de adicionais.

**d) Como a composição e a delegação permitem combinar adicionais sem criar uma subclasse para cada combinação?**

Cada decorador guarda uma referência para a bebida que envolve (composição). Quando `getCost()` ou `getDescription()` é chamado, ele repassa a chamada para essa bebida (delegação) e acrescenta só o seu valor e o seu nome. Empilhando decoradores, os valores se somam. Por isso dá para fazer qualquer combinação, inclusive repetir o mesmo adicional, sem criar classes novas.

**e) Como a inclusão de um novo adicional se relaciona com o princípio Open/Closed (OCP)?**

O OCP diz que o código deve estar aberto para extensão e fechado para modificação. Para adicionar o caramelo, só foi criada a classe `CaramelDecorator`, sem alterar as bebidas nem os outros decoradores. O sistema foi estendido sem mexer no que já funcionava.
