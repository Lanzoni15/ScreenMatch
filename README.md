# 🎥 Avaliação de Filmes e Séries em Java

Projeto desenvolvido como parte dos meus estudos em **Programação Orientada a Objetos (POO)** com Java. A aplicação simula um sistema básico de cadastro e avaliação de **filmes e séries**, permitindo registrar informações, adicionar notas, calcular médias e estimar a duração total para maratonar.

> 💡 **Objetivo:** Demonstrar domínio dos fundamentos de POO, com foco em herança, encapsulamento, sobrescrita de métodos e organização de pacotes.

---

## ✨ Funcionalidades

- ✅ Cadastro de filmes com nome, ano e duração
- ✅ Cadastro de séries com temporadas, episódios e duração por episódio
- ✅ Exibição da ficha técnica de títulos
- ✅ Registro de avaliações com diferentes notas
- ✅ Cálculo automático da média das avaliações
- ✅ Cálculo da duração total de uma série para maratona
- ✅ Atributos protegidos com `private` e acesso via métodos públicos
- ✅ Sobrescrita de métodos com `@Override`

---

## 📁 Estrutura do Projeto

```bash
.
├── br
│   └── com
│       └── alura
│           └── screenmatch
│               └── modelos
│                   ├── Filme.java     # Classe Filme com campo específico 'diretor'
│                   ├── Serie.java     # Classe Serie com lógica de duração por episódios
│                   └── Titulo.java    # Classe mãe com atributos e métodos comuns
└── Principal.java                     # Classe principal de execução
```

## 🧠 Conceitos Aplicados

- 📦 Organização em pacotes (package)
- 🧬 Herança entre classes (Filme e Serie herdam de Titulo)
- 🔐 Encapsulamento com private, getters e setters
- 🔁 Reutilização e sobrescrita de métodos (@Override)
- 📊 Lógica para cálculo de média de avaliações
- ⏱️ Cálculo da duração total de uma série
- 🧹 Boas práticas de escrita e manutenção de código

## ⏱️ Calculadora de Tempo

A classe CalculadoraDeTempo permite somar automaticamente a duração total de diferentes títulos (filmes e séries), utilizando polimorfismo ao aceitar qualquer objeto que herde da classe Titulo.

# 🧮 Exemplo de uso:
```bash
Filme filme1 = new Filme();
filme1.setDuracaoEmMinutos(120);

Serie serie1 = new Serie();
serie1.setTemporadas(2);
serie1.setEpisodiosPorTemporada(10);
serie1.setMinutosPorEpisodio(45);

CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
calculadora.inclui(filme1);
calculadora.inclui(serie1);

System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");
```

## 📌 Conceito aplicado:
✅ Polimorfismo: a calculadora utiliza a classe Titulo como parâmetro genérico, permitindo reutilização do método inclui() para diferentes tipos de mídia (filmes e séries).


## 💻 Código de Exemplo

```bash
Filme meuFilme = new Filme();
meuFilme.setNome("O Poderoso Chefão");
meuFilme.setAnoDeLancamento(1970);
meuFilme.setDuracaoEmMinutos(180);
meuFilme.exibeFichaTecnica();
meuFilme.avalia(8);
meuFilme.avalia(5);
meuFilme.avalia(10);

System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
System.out.println("Média: " + meuFilme.pegaMedia());

Serie lost = new Serie();
lost.setNome("Lost");
lost.setAnoDeLancamento(2000);
lost.setTemporadas(6);
lost.setEpisodiosPorTemporada(24);
lost.setMinutosPorEpisodio(42);

System.out.println("Duração total para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");

```

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Lanzoni15/ScreenMatch.git
```

2. Compile os arquivos Java:

```bash
javac br/com/alura/screenmatch/modelos/*.java Principal.java
```

3. Execute:

```bash
java Principal
```

## 🔧 Próximos Passos

- Aplicar construtores personalizados
- Separar responsabilidades com o padrão MVC
- Criar interface gráfica (JavaFX ou Swing)
- Criar testes unitários com JUnit
- Persistir dados em arquivos ou banco de dados

## 👨‍💻 Autor

Arthur Lanzoni
📍 Estudante de Desenvolvimento Back-End | Java & Spring