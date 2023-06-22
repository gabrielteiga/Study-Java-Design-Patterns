# Projeto de estudos sobre Design Patterns

O projeto se baseia na criação de uma loja fictícia no qual são elaborados calculadoras de impostos e de descontos, utilizando Design Patterns. *O projeto é voltado exclusivamente de cunho educativo dentro de um cenário fictício.* 

## 5 vantagens de aprender Design Patterns:

1. Reutilização de código: Design Patterns fornecem soluções testadas e comprovadas para problemas recorrentes no desenvolvimento de software. Ao aplicar esses padrões, você pode reutilizar o código existente e evitar a reinvenção da roda. Isso resulta em economia de tempo e esforço, além de melhorar a qualidade e a manutenibilidade do código.

2. Boas práticas de programação: Design Patterns encapsulam práticas recomendadas e princípios de design de software. Ao aprender e aplicar esses padrões, você adquire uma compreensão mais profunda de conceitos-chave, como encapsulamento, abstração, modularidade e separação de preocupações. Isso ajuda a escrever código mais limpo, coeso e escalável.

3. Comunicação e colaboração: Design Patterns fornecem uma linguagem comum para descrever e comunicar soluções de design. Ao utilizar esses padrões, você pode se comunicar de forma mais eficiente com outros desenvolvedores, facilitando a colaboração em projetos em equipe. Os Design Patterns são amplamente conhecidos e reconhecidos na indústria, tornando mais fácil compartilhar conhecimento e ideias com outros profissionais.

4. Flexibilidade e extensibilidade: Design Patterns promovem o design flexível e extensível de sistemas. Eles ajudam a separar componentes e responsabilidades, permitindo que você faça alterações em partes específicas do código sem afetar o restante do sistema. Isso torna o código mais adaptável a mudanças futuras, seja para adicionar novos recursos, modificar comportamentos ou corrigir problemas.

5. Desenvolvimento de habilidades de resolução de problemas: Ao estudar Design Patterns, você aprende a identificar problemas comuns no desenvolvimento de software e a aplicar soluções adequadas. Isso desenvolve suas habilidades de resolução de problemas e amplia sua capacidade de projetar soluções robustas e eficientes. A capacidade de reconhecer padrões e aplicar soluções existentes a novos problemas é uma habilidade valiosa em qualquer área do desenvolvimento de software.

---

# Design Patterns utilizados no projeto

## Strategy

O Design Pattern Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los individualmente e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

### Componentes principais

- **Contexto**: É a classe que interage com a estratégia. Ela possui uma referência para a interface da estratégia e chama os métodos definidos nessa interface para executar o algoritmo.

- **Estratégia**: É uma interface ou classe abstrata que define os métodos necessários para a execução do algoritmo. Cada estratégia concreta implementa esses métodos de maneira específica.

- **Estratégias Concretas**: São as implementações específicas da interface ou classe abstrata da estratégia. Cada estratégia representa uma variação do algoritmo que o contexto pode usar.

### Vantagens do Design Pattern Strategy

- **Encapsulamento**: O padrão Strategy permite encapsular cada algoritmo individualmente em uma classe separada, facilitando a manutenção e a modificação.

- **Flexibilidade**: O contexto pode alternar entre diferentes estratégias em tempo de execução sem afetar seu código, proporcionando maior flexibilidade para o sistema.

- **Extensibilidade**: O padrão facilita a adição de novas estratégias sem alterar o código existente, permitindo que o sistema evolua e se adapte a requisitos futuros.

- **Reaproveitamento**: As estratégias podem ser reutilizadas em diferentes contextos, evitando a duplicação de código e promovendo a modularidade.

- **Clareza e manutenibilidade**: O padrão Strategy torna o código mais legível, pois separa as diferentes estratégias em classes distintas, facilitando a compreensão e a manutenção do sistema.

O Design Pattern Strategy é valioso quando há algoritmos que podem variar e precisam ser selecionados dinamicamente. Ele promove a modularidade, a flexibilidade e o reuso de código, contribuindo para a construção de sistemas mais flexíveis e de fácil manutenção.

[Saiba mais](https://refactoring.guru/design-patterns/strategy)

---

## Chain of Responsibility

O padrão de projeto Chain of Responsibility é um dos padrões comportamentais do design pattern. Ele permite que uma solicitação seja passada por uma cadeia de objetos responsáveis pelo processamento, de modo que cada objeto na cadeia possa decidir se processa a solicitação ou a passa para o próximo objeto na cadeia.

Nesse padrão, cada objeto na cadeia possui uma referência para o próximo objeto na cadeia. Quando uma solicitação é feita, ela percorre a cadeia até encontrar um objeto capaz de lidar com a solicitação.

### Uso do Padrão Chain of Responsibility

O padrão Chain of Responsibility é adequado para situações em que há vários objetos que podem lidar com uma solicitação e a decisão sobre qual objeto deve processar a solicitação deve ser tomada em tempo de execução.

Esse padrão é comumente usado em casos como:

- Tratamento de eventos em interfaces gráficas de usuário, onde vários componentes podem estar interessados em manipular um evento específico.

- Processamento de solicitações em um sistema de software, onde diferentes processadores podem ser responsáveis por diferentes tipos de solicitações.

### Benefícios do Padrão Chain of Responsibility

O padrão Chain of Responsibility oferece os seguintes benefícios:

1. Desacoplamento: O padrão ajuda a desacoplar o remetente de uma solicitação dos destinatários, permitindo que vários objetos possam lidar com a solicitação de forma independente.

2. Flexibilidade e extensibilidade: A cadeia de objetos pode ser configurada dinamicamente e novos objetos podem ser facilmente adicionados ou removidos da cadeia sem afetar o remetente.

3. Reutilização: Os objetos responsáveis pelo processamento da solicitação podem ser reutilizados em diferentes cadeias ou contextos.

4. Suporte a lógica condicional: O padrão permite a implementação de lógica condicional flexível e dinâmica para determinar qual objeto deve processar uma solicitação.

[Saiba mais](https://refactoring.guru/design-patterns/chain-of-responsibility)

---

## Template Method

O Template Method é um padrão comportamental que permite definir o esqueleto de um algoritmo em uma classe base, enquanto permite que subclasses especializadas substituam etapas específicas desse algoritmo sem alterar sua estrutura geral. 

### Beneficios

- **Reutilização de código**: O Template Method promove a reutilização de código ao definir um algoritmo comum em uma classe base, permitindo que várias subclasses compartilhem essa implementação básica, evitando a duplicação de código.

- **Flexibilidade**: O padrão oferece flexibilidade ao permitir que as subclasses substituam ou estendam partes específicas do algoritmo base, sem modificar sua estrutura geral. Isso permite adaptar o comportamento do algoritmo para diferentes situações.

- **Padronização**: O Template Method ajuda a estabelecer um padrão consistente para a estrutura de algoritmos em um sistema. Ao fornecer uma estrutura comum, facilita a compreensão e manutenção do código por parte dos desenvolvedores.

- **Inversão de controle**: O padrão inverte o controle do fluxo de execução, permitindo que as subclasses forneçam implementações específicas em pontos-chave do algoritmo. Dessa forma, a classe base pode chamar os métodos fornecidos pelas subclasses, adaptando-se às suas necessidades.

- **Separation of concerns**: O Template Method ajuda a separar as preocupações relacionadas ao algoritmo base das implementações específicas das subclasses. Isso permite que as classes se concentrem em suas tarefas específicas, tornando o código mais modular e de fácil manutenção.

- **Extensibilidade**: O padrão facilita a extensão do comportamento do algoritmo ao adicionar novas subclasses que implementam etapas específicas. Isso permite que o algoritmo base seja estendido sem a necessidade de modificar seu código existente.

[Saiba mais](https://refactoring.guru/design-patterns/template-method)

---

## State

Parecido com o Design Pattern Strategy, quase irmaos gemeos. Esse pattern realmente representa o significado de status, utilizamos quando ha essa troca de estados ou precisamos aplicar alguma regra ou algoritmo baseado em um estado de um objeto/classe, diferente do strategy. Dado um estado, transite para outro estado, utilizando regras de transições de estados, hora de usar o *Design Pattern State*.

### Beneficios

- **Separação de responsabilidades**: Cada estado encapsula seu próprio comportamento, promovendo uma estrutura de código modular e fácil de entender.

- **Adição de novos estados**: A adição de novos estados é simples e não requer modificações no código existente, tornando-o mais flexível e extensível.

- **Eliminação de condicionais complexos**: Evita a necessidade de condicionais complexos para controlar o comportamento do objeto com base no estado, tornando o código mais legível e fácil de manter.

- **Princípio Open/Closed**: O padrão State adere ao princípio Open/Closed, permitindo a adição de novos comportamentos sem modificar o código existente.

- **Simplificação da lógica de contexto**: Reduz a quantidade de lógica relacionada ao estado no objeto principal, simplificando sua implementação e focando em seu propósito principal.

[Saiba mais](https://refactoring.guru/design-patterns/state)

---

## Command

Um padrão que representa um comando que precisa ser executado. O padrão de design Command é um padrão comportamental que encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com diferentes solicitações, faça fila ou registre solicitações e ofereça suporte a operações desfazer.

### Benefícios

- **Desacopla remetentes e destinatários**: O padrão Command desacopla o objeto invocador do objeto receptor, permitindo que eles evoluam independentemente um do outro.
- **Flexibilidade e extensibilidade**: Adicionar novos comandos é fácil e não requer modificações no código existente.
- **Suporte a operações desfazer**: O padrão Command suporta operações desfazer, permitindo reverter ações sequencialmente.
- **Registra e filas de solicitações**: As solicitações podem ser registradas ou colocadas em uma fila para implementar recursos como repetição de comandos ou refazer.
- **Suporte a transações**: O padrão Command pode ser usado para implementar transações, agrupando comandos em uma única transação.

### Command Handler

O Command representa uma única ação ou solicitação específica que deve ser executada. Ele encapsula os parâmetros e o contexto necessários para realizar essa ação. Em outras palavras, o Command define a intenção do que precisa ser feito, mas não sabe como executá-lo.

O Command Handler, por sua vez, é responsável por receber o Command e executar a ação correspondente. Ele conhece a lógica de negócio e implementa os detalhes da execução do comando. O Command Handler é responsável por realizar as operações específicas relacionadas àquele tipo de comando.

A separação entre o Command e o Command Handler traz benefícios, como:

- Separação de responsabilidades: O Command se concentra na representação da solicitação, enquanto o Command Handler se concentra na lógica de execução da ação. Isso permite que cada componente tenha uma única responsabilidade bem definida.

- Reutilização de comandos: Ao separar o Command e o Command Handler, você pode reutilizar o mesmo Command com diferentes implementações de Command Handler. Isso proporciona flexibilidade e extensibilidade, permitindo que você adicione ou modifique o comportamento do Command sem afetar outros componentes.

- Testabilidade: A separação facilita a criação de testes unitários para o Command Handler, pois você pode testar isoladamente a lógica de execução sem a necessidade de criar instâncias completas do Command.

- Manutenibilidade: A divisão entre Command e Command Handler facilita a manutenção do código, pois as alterações relacionadas à lógica de execução do comando são isoladas no Command Handler, reduzindo o impacto em outros componentes.

[Saiba Mais](https://refactoring.guru/design-patterns/command)

---

## Observer

O padrão de projeto Observer é um dos padrões comportamentais do design pattern. Ele define uma relação de um-para-muitos entre objetos, onde a modificação de um objeto notifica e atualiza automaticamente todos os outros objetos dependentes.

Nesse padrão, existe um objeto chamado "subject" (sujeito) que mantém uma lista de seus "observers" (observadores). Quando ocorre uma mudança no estado do "subject", todos os "observers" registrados são notificados e atualizados de acordo.

### Uso do Padrão Observer

O padrão Observer é útil em situações onde existem objetos que precisam saber quando o estado de outro objeto muda, sem que haja um acoplamento direto entre eles. Além disso, ele proporciona uma forma flexível de adicionar e remover observadores conforme necessário.

Este padrão é amplamente utilizado em aplicações onde ocorre a necessidade de notificar automaticamente partes interessadas sobre alterações de estado, como por exemplo:

- Atualizações em interfaces gráficas de usuário (GUIs), onde componentes de interface gráfica precisam reagir a eventos gerados por outros componentes.
- Publicação e assinatura de eventos, onde uma entidade publica eventos e outras entidades se inscrevem para receber esses eventos.

### Benefícios do Padrão Observer

O padrão Observer traz os seguintes benefícios:

1. Desacoplamento: Os objetos observadores não possuem conhecimento direto sobre o objeto observado, reduzindo o acoplamento entre eles.
2. Extensibilidade: É possível adicionar e remover observadores sem modificar o objeto observado.
3. Reutilização: Observadores podem ser reutilizados em diferentes contextos, facilitando a modularidade do código.
4. Comunicação assíncrona: Observadores são notificados de forma assíncrona, permitindo que continuem suas operações sem bloquear o objeto observado.

[Saiba mais](https://refactoring.guru/design-patterns/observer)

---
