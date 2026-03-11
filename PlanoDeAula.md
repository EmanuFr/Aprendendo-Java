# 🚀 Jornada Java: Do Júnior ao Sênior (Edição Completa)

## 🟢 Módulo 1: Primeiros Passos (Júnior Base)

_Foco: Sintaxe, lógica e fundamentos._

- [x] JVM, Bytecode e JRE: O que acontece quando você clica em "Run".
- [x] Variáveis e Tipos Primitivos vs. Objetos (Wrappers).
- [x] Estruturas de Controle: if, else, switch e laços for/while.
- [x] 🛠️ **PROJETO 1: Calculadora de Console Pro**
      _Criar uma calculadora que aceita operações via argumentos de linha de comando (args[]) e mantém um histórico de operações em um array simples._

## 🟡 Módulo 2: Interatividade e Robustez

_Foco: Programas que não quebram e interagem com o usuário._

- [ ] Tratamento de Exceções: Aprender a usar try-catch-finally e a criar sua própria Exception.
- [ ] Leitura de Dados: Dominar o `java.util.Scanner`.
- [ ] Debug: Aprender a colocar breakpoints na IDE.
- [ ] 🛠️ **PROJETO 2: Sistema de Login com Validação**
      _Um programa que solicita usuário e senha. Ele deve tratar erros de entrada (ex: números onde deveriam ser letras) e impedir ataques de força bruta simples com um contador._

## 🟠 Módulo 3: O Coração - POO

_Foco: Pensar em moldes e responsabilidades._

- [x] Classes, Atributos e Métodos.
- [ ] Construtores: Aprender a sobrecarga de construtores (`this()`).
- [ ] Encapsulamento: Uso rigoroso de `private` e a importância dos Getters/Setters.
- [ ] Records (Java 16+): Entender a forma moderna de criar classes de dados.
- [ ] 🛠️ **PROJETO 3: Gestão de Biblioteca Personalizada**
      _Criar classes Livro e Usuario. Aplicar regras de negócio (ex: um usuário não pode retirar um livro se já tiver 3 em mãos)._

## 🔴 Módulo 4: Estruturas de Dados Dinâmicas

_Foco: Gerenciar grandes volumes de informação._

- [x] ArrayList e iteração com for-each.
- [ ] Collections API: Diferenças práticas entre List, Set (evitar duplicados) e Map (chave/valor).
- [ ] Generics: Entender como o Java garante que uma lista de Strings só aceite Strings.
- [ ] 🛠️ **PROJETO 4: Mini-Almoxarifado (Estoque)**
      _Sistema que armazena produtos em um HashMap. Deve permitir buscar um produto instantaneamente pelo código de barras e listar produtos esgotados usando HashSet._

## 🟣 Módulo 5: POO Avançada e Java Funcional

_Foco: Código elegante, flexível e moderno._

- [ ] Herança e Polimorfismo: Criar comportamentos genéricos que se especializam.
- [ ] Interfaces e Contratos: O segredo para desacoplar seu código.
- [ ] Streams API & Lambdas: Processar coleções de forma declarativa (Java 8+).
- [ ] 🛠️ **PROJETO 5: Processador de Folha de Pagamento**
      _Sistema com diferentes tipos de funcionários (Gerente, Dev, Estagiário). Usar Streams para calcular o gasto total da empresa e filtrar quem ganha acima de um valor X com apenas uma linha de código._

## 🔵 Módulo 6: O Caminho para o Pleno (Ecossistema)

_Foco: Tecnologias que o mercado exige._

- [ ] Maven ou Gradle: Como gerenciar bibliotecas externas.
- [ ] Spring Boot 3: O framework padrão do mercado. Criar sua primeira API REST.
- [ ] Banco de Dados & JPA: Salvar dados de verdade em um banco SQL (PostgreSQL/H2).
- [ ] Docker: Criar um Dockerfile para rodar sua aplicação em qualquer lugar.
- [ ] 🛠️ **PROJETO 6: API REST de Catálogo de Filmes**
      _Uma API onde você pode Cadastrar, Listar, Atualizar e Deletar (CRUD) filmes, conectada a um banco de dados real._

## 💎 Módulo 7: Voando para Sênior (Engenharia de Software)

_Foco: Manutenibilidade, escala e qualidade._

- [ ] SOLID & Clean Code: Escrever código que seus colegas de trabalho consigam ler.
- [ ] Testes Automatizados: JUnit 5 e Mockito (Obrigatório para Sêniors).
- [ ] Design Patterns: Singleton, Factory, Strategy e Observer.
- [ ] Java 21 Virtual Threads: O futuro da alta performance no Java.
- [ ] 🛠️ **PROJETO 7: Sistema de Notificações Assíncrono**
      _Um microserviço que recebe pedidos de notificação via API, processa usando filas (RabbitMQ ou Kafka) e envia e-mails simulados, com cobertura de testes de 100%._
