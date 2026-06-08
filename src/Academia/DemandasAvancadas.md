
## ETAPA 1 — Tempo de Compilação x Execução
> **Aulas cobertas:** Tempo de compilação x Execução — Java sempre foi Estático

**Demonstre o sistema de tipos estático do Java no contexto da Academia:**

**No `AcademiaMain` crie uma seção de testes de casting:**
- Crie um `Pessoa[] membros` com alunos e professores misturados
- Tente fazer cast direto sem verificar → compile, rode e observe o `ClassCastException`
- Corrija usando `instanceof`:
  ```java
  if (membro instanceof Aluno a) {
      a.treinar(); // só chama se for Aluno
  }
  ```

**Crie `ValidadorDeAcesso.java`:**
- Método `verificarTipo(Pessoa p)` → usa `instanceof` para identificar se é Aluno, Professor ou só Pessoa
- Retorna uma String descrevendo o tipo encontrado
- Demonstra que o Java garante o tipo **em compilação**, mas o cast só é validado **em execução**

**Escreva um comentário de 3 linhas no método** explicando a diferença: o que o compilador garante vs o que só a JVM descobre.

---

## ETAPA 2 — Escopo Estático + Variáveis Globais
> **Aulas cobertas:** Escopo estático + variáveis globais — PSVM

**Adicione em `Aluno.java`:**
- `public static int totalAlunos` → incrementa no construtor, decrementa quando removido
- `public static final int CAPACIDADE_MAXIMA = 50`
- Método `static int getVagasDisponiveis()` → retorna `CAPACIDADE_MAXIMA - totalAlunos`

**Adicione em `Professor.java`:**
- `public static int totalProfessores` → incrementa no construtor
- `public static final double PISO_SALARIAL = 1800.0`
- Método `static boolean salarioValido(double salario)` → retorna `salario >= PISO_SALARIAL`

**No `AcademiaMain`:**
- Instancie 3 alunos e 2 professores
- Imprima `Aluno.totalAlunos`, `Aluno.getVagasDisponiveis()`, `Professor.totalProfessores`
- Tente `Professor.salarioValido(1200.0)` → imprime aviso se abaixo do piso
- Observe: `totalAlunos` pertence à **classe**, não ao objeto — qualquer instância enxerga o mesmo valor

---

## ETAPA 3 — Análise da Complexidade de Algoritmos
> **Aulas cobertas:** Análise da Complexidade de Algoritmos

**Crie `BuscadorDeAlunos.java`:**

**O(n) — Busca linear:**
```java
public Aluno buscarPorNome(List<Aluno> alunos, String nome) {
    // percorre um por um — no pior caso, varre tudo
}
```

**O(log n) — Busca binária (lista ordenada por nome):**
```java
public Aluno buscarBinario(List<Aluno> alunosOrdenados, String nome) {
    // divide a lista ao meio a cada iteração
}
```

**O(n²) — Comparação de pares:**
```java
public void listarDuplasDeMesmaGraduacao(List<Aluno> alunos) {
    // dois loops aninhados — todos contra todos
}
```

**No `AcademiaMain`:**
- Monte uma lista de 5 alunos com graduações variadas
- Chame os três métodos e imprima os resultados
- Adicione um comentário em cada método indicando sua complexidade e o motivo

---

## ETAPA 4 — Introdução a Big O
> **Aulas cobertas:** Introdução a BigO

**Adicione em `BuscadorDeAlunos.java` dois métodos que resolvem o mesmo problema de formas diferentes:**

**Versão O(n) — verificar se há duplicata de CPF:**
```java
public boolean temCpfDuplicadoLinear(List<Aluno> alunos) {
    // compara cada aluno com todos os outros (dois loops)
}
```

**Versão O(n) com Set — mesma verificação, mais eficiente:**
```java
public boolean temCpfDuplicadoComSet(List<Aluno> alunos) {
    // usa HashSet para rastrear CPFs já vistos
}
```

**No `AcademiaMain`:**
- Monte uma lista com CPF duplicado propositalmente
- Chame os dois métodos e confirme que chegam ao mesmo resultado
- Adicione comentário explicando por que a versão com Set escala melhor para listas grandes

---

## ETAPA 5 — Big O Além da Complexidade de Tempo
> **Aulas cobertas:** BigO — Não é sobre complexidade APENAS, por favor entenda isso!

**Crie `AnalisadorDePlanos.java`:**

**Tradeoff tempo x espaço — cache de resultados:**
```java
private Map<String, Double> cacheMediaPorGraduacao = new HashMap<>();

public double calcularMediaMensalidade(List<Aluno> alunos, String graduacao) {
    // se já calculou antes, retorna do cache (O(1) em tempo, O(n) em espaço)
    // se não, calcula e armazena
}
```

**Sem cache para comparação:**
```java
public double calcularMediaSemCache(List<Aluno> alunos, String graduacao) {
    // recalcula toda vez — O(n) em tempo, O(1) em espaço extra
}
```

**No `AcademiaMain`:**
- Chame `calcularMediaMensalidade` duas vezes com a mesma graduação
- Imprima uma mensagem indicando quando veio do cache e quando foi calculado
- Escreva um comentário explicando: Big O descreve **tempo E espaço** — às vezes você troca um pelo outro

---

## ETAPA 6 — Streams Parte 1
> **Aulas cobertas:** Streams — Melhor feature do Java [Parte 1]

**Crie `RelatorioAcademia.java`** com métodos que usam Streams sobre `List<Aluno>` e `List<Professor>`:

```java
// filter + collect
public List<Aluno> alunosComMensalidadeAcimaDe(List<Aluno> alunos, double valor) { ... }

// map + collect
public List<String> nomesDeAlunos(List<Aluno> alunos) { ... }

// filter + map + collect
public List<String> nomesDeAlunosGraduacaoRoxa(List<Aluno> alunos) { ... }

// count
public long totalAlunosPremium(List<Aluno> alunos) { ... }

// anyMatch
public boolean temProfessorDeMusculacao(List<Professor> professores) { ... }
```

**No `AcademiaMain`:**
- Monte lista com pelo menos 4 alunos de graduações e mensalidades variadas
- Chame cada método e imprima os resultados com título descritivo
- Reescreva UM dos métodos na forma tradicional (for + if) ao lado e compare as linhas de código

---

## ETAPA 7 — Streams Parte 2
> **Aulas cobertas:** Streams — Melhor feature do Java [Parte 2]

**Expanda `RelatorioAcademia.java`:**

```java
// reduce — soma total de mensalidades
public double somaTodasMensalidades(List<Aluno> alunos) { ... }

// min / max
public Optional<Aluno> alunoMaisCaroCaro(List<Aluno> alunos) { ... }
public Optional<Aluno> alunoMaisBarato(List<Aluno> alunos) { ... }

// Collectors.groupingBy — agrupa alunos por graduação
public Map<String, List<Aluno>> agruparPorGraduacao(List<Aluno> alunos) { ... }

// Collectors.averagingDouble
public double mediaMensalidade(List<Aluno> alunos) { ... }

// Stream encadeado: filtra premium → extrai nomes → ordena → imprime
public void imprimirAlunosPremiumOrdenados(List<Aluno> alunos) { ... }
```

**No `AcademiaMain`:**
- Demonstre cada método com a lista completa de alunos
- No `groupingBy`, percorra o Map e imprima cada graduação com seus alunos
- Para `min`/`max`, use `.ifPresent()` no Optional em vez de `.get()` diretamente

**Checklist final do nível avançado:**
- [ ] `instanceof` com pattern matching usado para casting seguro
- [ ] Campos e métodos `static` com responsabilidade clara (contador, constante, utilitário)
- [ ] Três complexidades implementadas e comentadas: O(1), O(n), O(log n) e O(n²)
- [ ] Tradeoff tempo x espaço demonstrado com cache real
- [ ] Streams com `filter`, `map`, `collect`, `count`, `anyMatch`
- [ ] Streams com `reduce`, `min`, `max`, `groupingBy`, `averagingDouble`
- [ ] Nenhum Stream substituído por loop sem motivo — entende quando cada um serve
