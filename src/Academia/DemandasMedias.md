
## ETAPA 7 — @Override, Overload de Métodos e toString
> **Aulas cobertas:** @Override | Overload/Sobrecarga de métodos | Referência de memória x Valor = toString

**Adicione em `Pessoa`:**
- `@Override public String toString()` → retorna "Pessoa{nome=[nome], idade=[idade]}"
- Teste: `System.out.println(aluno)` antes e depois do toString() para ver a diferença

**Adicione sobrecarga em `Aluno`:**
- `pagar()` → imprime "Pagando mensalidade cheia: R$ [mensalidade]"
- `pagar(double desconto)` → imprime "Pagando com desconto de [desconto]%: R$ [valor calculado]"

**Adicione sobrecarga em `Professor`:**
- `ministrarAula()` → "Ministrando aula padrão de [especialidade]"
- `ministrarAula(String turma)` → "Ministrando aula de [especialidade] para a turma [turma]"
- `ministrarAula(String turma, int duracaoMinutos)` → inclui duração no print

---

## ETAPA 8 — Final, Encapsulamento, Getters e Setters
> **Aulas cobertas:** Final Methods | Final class | Encapsulamento | Getters e Setters

**Encapsule tudo:**
- Torne TODOS os atributos de `Pessoa`, `Aluno` e `Professor` `private`
- Crie getters (`getNome()`, `getIdade()`...) e setters (`setNome()`, `setIdade()`...)
- Nos setters, adicione validação simples:
  - `setIdade(int idade)`: só aceita idade > 0
  - `setMensalidade(double v)`: só aceita valor > 0
  - `setCpf(String cpf)`: só aceita se tiver 11 dígitos (use `cpf.length()`)

**Adicione em `Pessoa`:**
- `public final String gerarCodigo()` → retorna os 3 primeiros chars do nome + idade. Ex: "JOA25"
- Esse método é `final`: nenhuma subclasse pode sobrescrever

**Crie `Contrato.java`:**
- `public final class Contrato` → ninguém pode herdar dessa classe
- Atributos: `nomeAluno` (String), `dataInicio` (String), `valorMensal` (double)
- Método `exibirContrato()` → imprime tudo formatado

---

## ETAPA 9 — ENUMs
> **Aulas cobertas:** ENUMS — Uma classe especial

**Crie no package `Academia`:**

**`GraduacaoEnum.java`**
```
BRANCA, AZUL, ROXA, MARROM, PRETA
```
Cada valor com um atributo `descricao` (String). Ex: PRETA("Mestre da academia")
- Construtor do enum com `descricao`
- Método `getDescricao()`

**`TipoPlanoEnum.java`**
```
BASICO, PREMIUM, VIP
```
Cada valor com `valorMensal` (double). Ex: VIP(400.0)
- Construtor com `valorMensal`
- Método `getValorMensal()`

**Refatore `Aluno.java`:**
- `graduacao` vira `GraduacaoEnum graduacao`
- `mensalidade` some — o valor vem de `TipoPlanoEnum plano`
- Atualize os métodos que usavam esses campos

**No `AcademiaMain`:**
- `aluno.setGraduacao(GraduacaoEnum.ROXA)`
- `aluno.setPlano(TipoPlanoEnum.PREMIUM)`
- `System.out.println(aluno.getPlano().getValorMensal())`

---

## ETAPA 10 — List e Generics
> **Aulas cobertas:** List — Um array com super poderes | Generics Parte 1 e 2 | Refatorando o código

**Crie `Repositorio.java`** (classe genérica):
```java
public class Repositorio<T> {
    private List<T> lista = new ArrayList<>();
    public void adicionar(T item) { ... }
    public void remover(T item) { ... }
    public List<T> listar() { ... }
    public int total() { ... }
}
```

**Crie:**
- `RepositorioAluno.java extends Repositorio<Aluno>`
  - Método extra: `buscarPorNome(String nome)` → retorna o Aluno ou null
- `RepositorioProfessor.java extends Repositorio<Professor>`
  - Método extra: `buscarPorEspecialidade(String especialidade)` → retorna lista filtrada

**No `AcademiaMain`:**
- Cadastre 3 alunos e 2 professores nos repositórios
- Liste todos
- Busque por nome e exiba
- Remova um e liste de novo

---

## ETAPA 11 — Records
> **Aulas cobertas:** Records — Um jeito melhor de trabalhar com classes

**Crie:**

**`AulaRecord.java`** (record)
- Campos: `modalidade` (String), `professor` (String), `data` (String), `duracaoMinutos` (int)

**`PagamentoRecord.java`** (record)
- Campos: `nomeAluno` (String), `valor` (double), `data` (String), `plano` (TipoPlanoEnum)

**No `AcademiaMain`:**
- Crie 2 AulaRecord e 2 PagamentoRecord
- Tente mudar um campo depois de criar → veja o erro (records são imutáveis)
- `System.out.println(aula)` → observe o toString() automático do record

---

## ETAPA 12 — Stack
> **Aulas cobertas:** Stack — O último a entrar é o primeiro a sair | Array x List x Stack

**No `AcademiaMain`** adicione uma seção de histórico:

```java
Stack<AulaRecord> historicoDeAulas = new Stack<>();
```

- `push()` 3 aulas diferentes
- `peek()` → mostra qual foi a última sem remover
- `pop()` em loop até esvaziar → imprime cada aula na ordem LIFO
- Explique no comentário do código por que Stack é útil para histórico (último evento = mais relevante)

---

## ETAPA 13 — Queue
> **Aulas cobertas:** Queue — Estrutura de dados

**No `AcademiaMain`** adicione uma seção de fila de espera:

```java
Queue<Aluno> filaDeEspera = new LinkedList<>();
```

- `offer()` 4 alunos na fila
- `peek()` → mostra quem é o próximo sem tirar da fila
- Simule 2 vagas abrindo: use `poll()` 2 vezes e mostre quem entrou
- Mostre quem ainda está na fila com `filaDeEspera.size()`

---

## ETAPA 14 — LinkedList, ArrayList e Collection
> **Aulas cobertas:** LinkedList x ArrayList | LinkedList teórica | LinkedList — Introdução a Collection | Desafio 6

**Crie `GerenciadorDeAlunos.java`:**
- Use `LinkedList<Aluno>` internamente (não ArrayList)
- Métodos:
  - `adicionarNoInicio(Aluno a)` → `addFirst()`
  - `adicionarNoFim(Aluno a)` → `addLast()`
  - `removerPrimeiro()` → `removeFirst()`
  - `removerUltimo()` → `removeLast()`
  - `listarTodos()` → imprime em ordem

**Crie `GerenciadorDeModalidades.java`:**
- `HashSet<String> modalidades` → sem duplicatas, sem ordem
- `LinkedHashSet<String> modalidadesEmOrdem` → sem duplicatas, mantém ordem de inserção
- Métodos: `adicionarModalidade(String m)`, `listarModalidades()`

**No `AcademiaMain`:**
- Adicione as mesmas modalidades nos dois sets
- Tente adicionar uma duplicada e veja que ignora
- Imprima os dois e compare a ordenação

---

## ETAPA FINAL — Refatoração Geral
> **Aulas cobertas:** Refatorando o código — Resumão de tudo | HashSet | LinkedHashSet x TreeSet

**Organize o projeto em sub-packages:**
```
Academia/
  model/       → Pessoa, Aluno, Professor, Contrato
  enums/       → GraduacaoEnum, TipoPlanoEnum
  interfaces/  → Pagante, Instrutor
  records/     → AulaRecord, PagamentoRecord
  service/     → Repositorio, RepositorioAluno, RepositorioProfessor,
                 GerenciadorDeAlunos, GerenciadorDeModalidades
  Main.java
```

**Adicione `TreeSet`:**
- Em `GerenciadorDeModalidades`, adicione `TreeSet<String> modalidadesAlfabeticas`
- Compare HashSet (sem ordem), LinkedHashSet (ordem de inserção) e TreeSet (ordem alfabética)

**Checklist final antes de considerar pronto:**
- [ ] Todos os atributos são `private` com getters/setters
- [ ] Setters têm validação de dados
- [ ] Toda classe tem `toString()` útil
- [ ] `Pessoa` é abstract com `apresentar()` abstract
- [ ] `Contrato` é final (não pode ser herdada)
- [ ] `gerarCodigo()` em Pessoa é final (não pode ser sobrescrito)
- [ ] ENUMs com atributos e métodos funcionando
- [ ] Repositório usa Generics `<T>`
- [ ] Records sendo usados para dados imutáveis
- [ ] Stack para histórico, Queue para fila de espera
- [ ] LinkedList, HashSet, LinkedHashSet, TreeSet todos em uso
- [ ] Main demonstra polimorfismo com `Pessoa[]`
