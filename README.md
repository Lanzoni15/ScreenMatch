# 🎥 Avaliação de Filmes em Java

Projeto desenvolvido como parte dos meus estudos em **Programação Orientada a Objetos (POO)** com Java. A aplicação simula um sistema básico de cadastro e avaliação de filmes, permitindo registrar informações, adicionar notas e calcular a média das avaliações.

> 💡 **Objetivo:** Demonstrar domínio dos fundamentos de POO, como encapsulamento, organização de classes, atributos e métodos.

---

## ✨ Funcionalidades

- ✅ Cadastro de filmes com nome, ano e duração  
- ✅ Exibição da ficha técnica do filme  
- ✅ Registro de avaliações por nota  
- ✅ Cálculo automático da média das avaliações  

---

## 📁 Estrutura do Projeto

```bash
.
├── Filme.java       # Classe principal com atributos e métodos de lógica do filme
└── Principal.java   # Classe de execução para testes e simulação
```

## 🧠 Conceitos Aplicados

- 📦 Classes e objetos
- 🔐 Encapsulamento (a ser evoluído com modificadores de acesso)
- ♻️ Reutilização de métodos
- 📈 Cálculo dinâmico com atributos acumulativos

## 💻 Código de Exemplo

```bash
Filme meuFilme = new Filme();
meuFilme.nome = "O poderoso chefão";
meuFilme.anoDeLancamento = 1970;
meuFilme.duracaoEmMinutos = 180;

meuFilme.exibeFichaTecnica();
meuFilme.avalia(8);
meuFilme.avalia(5);
meuFilme.avalia(10);

System.out.println(meuFilme.pegaMedia()); // Exibe a média das notas
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

 - Aplicar modificadores de acesso (private, public)
 - Criar métodos getters e setters
 - Utilizar construtores
 - Melhorar estrutura com pacotes (package)
 - Criar testes automatizados com JUnit

## 👨‍💻 Autor
Arthur Lanzoni
📍 Estudante de Desenvolvimento Back-End | Java & Spring