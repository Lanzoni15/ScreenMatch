# 🎥 Avaliação de Filmes em Java

Projeto desenvolvido como parte dos meus estudos em **Programação Orientada a Objetos (POO)** com Java. A aplicação simula um sistema básico de cadastro e avaliação de filmes, permitindo registrar informações, adicionar notas e calcular a média das avaliações.

> 💡 **Objetivo:** Demonstrar domínio dos fundamentos de POO, com foco em encapsulamento, uso de getters/setters e organização de pacotes.

---

## ✨ Funcionalidades

- ✅ Cadastro de filmes com nome, ano e duração
- ✅ Exibição da ficha técnica do filme
- ✅ Registro de avaliações com diferentes notas
- ✅ Cálculo automático da média das avaliações
- ✅ Atributos protegidos com private e acesso via métodos públicos

---

## 📁 Estrutura do Projeto

```bash
.
├── br
│   └── com
│       └── alura
│           └── screenmatch
│               └── modelos
│                   └── Filme.java      # Classe modelo com encapsulamento e lógica de negócio
└── Principal.java                      # Classe principal de execução

```

## 🧠 Conceitos Aplicados

- 📦 Organização em pacotes (package)
- 🔐 Encapsulamento com private, getters e setters
- 🔁 Reutilização de métodos
- 📊 Lógica para cálculo da média de avaliações
- 🧹 Boas práticas de escrita e manutenção de código

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
```

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Lanzoni15/nome-do-repo.git
```

2. Compile os arquivos Java:

```bash
javac Filme.java Principal.java
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