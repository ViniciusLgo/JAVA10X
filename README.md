# JAVA10X

Repositorio de estudos de Java organizado por nivel: basico, intermediario e avancado.

A ideia deste projeto e guardar exemplos pequenos, executaveis e comentados para revisar conceitos da linguagem sem depender apenas de anotacoes soltas.

## Como rodar

Compile todos os arquivos:

```powershell
$arquivos = Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName }
& 'C:\Program Files\Java\jdk-24\bin\javac.exe' -d out $arquivos
```

Rode a trilha completa:

```powershell
& 'C:\Program Files\Java\jdk-24\bin\java.exe' -cp out TrilhaJava.MainTrilhaJava
```

Rode um nivel especifico:

```powershell
& 'C:\Program Files\Java\jdk-24\bin\java.exe' -cp out NivelFacil.MainFacil
& 'C:\Program Files\Java\jdk-24\bin\java.exe' -cp out NivelMedio.Main
& 'C:\Program Files\Java\jdk-24\bin\java.exe' -cp out NivelAvancado.MainAvancado
```

## Mapa dos modulos

### NivelFacil

Entrada organizada:

- `src/NivelFacil/MainFacil.java`
- `src/NivelFacil/menu/MenuNivelFacil.java`

Conteudos principais:

- tipos primitivos
- tipos nao primitivos
- `String`
- `if`, `else`, ternario e `switch`
- lacos de repeticao
- arrays
- introducao a `Scanner`

Os arquivos antigos do pacote `NivelFacil` continuam no projeto como exemplos separados para revisar cada aula individualmente.

### NivelMedio

Entrada organizada:

- `src/NivelMedio/Main.java`
- `src/NivelMedio/menu/MenuNivelMedio.java`

Conteudos principais:

- heranca
- classe abstrata
- interface
- enum
- encapsulamento
- `toString`
- `record`
- generics
- `Array`, `List` e `Stack`
- Banco Konoha com abstracao, polimorfismo, sobrecarga e sobrescrita

Pacotes importantes:

- `src/NivelMedio/ninjas`
- `src/NivelMedio/contratos`
- `src/NivelMedio/hokages`
- `src/NivelMedio/equipamentos`
- `src/NivelMedio/banco`
- `src/NivelMedio/bijus`

### NivelAvancado

Entrada organizada:

- `src/NivelAvancado/MainAvancado.java`
- `src/NivelAvancado/menu/MenuAvancado.java`

Conteudos principais:

- tempo de compilacao x tempo de execucao
- por que Java e uma linguagem estatica
- escopo `static`
- ideia correta de "variavel global" em Java
- `public static void main(String[] args)`
- analise da complexidade de algoritmos
- introducao a Big O
- Big O como crescimento, nao apenas "complexidade"
- Streams parte 1: `stream`, `filter`, `map`, `forEach`
- Streams parte 2: `collect`, `mapToInt`, `sum`, `sorted`

Pacotes importantes:

- `src/NivelAvancado/fundamentos`
- `src/NivelAvancado/complexidade`
- `src/NivelAvancado/streams`

## Menu central

O menu central fica em:

- `src/TrilhaJava/MainTrilhaJava.java`
- `src/TrilhaJava/menu/MenuTrilhaJava.java`

Ele executa a trilha completa nesta ordem:

1. Nivel facil
2. Nivel medio
3. Nivel avancado

Use esse menu quando quiser revisar tudo que foi aprendido dentro do sistema.

## Ordem sugerida de estudo

1. Rode `NivelFacil.MainFacil` e revise a base.
2. Rode `NivelMedio.Main` e foque em POO e collections.
3. Rode `NivelAvancado.MainAvancado` e revise static, Big O e Streams.
4. Rode `TrilhaJava.MainTrilhaJava` para ver tudo junto.

## Macetes gerais

- Se o erro aparece no `javac`, normalmente e erro de compilacao: sintaxe, tipo, import ou contrato.
- Se o erro aparece depois que o programa comeca, normalmente e erro de execucao: regra, dado invalido, indice errado ou entrada inesperada.
- `static` pertence a classe; atributo normal pertence ao objeto.
- `PSVM` e o ponto de entrada que a JVM procura para iniciar o programa.
- Big O descreve crescimento quando a entrada aumenta.
- Stream nao muda a lista original; ele cria um fluxo para filtrar, transformar e coletar dados.

## Status atual

O projeto agora tem uma trilha completa para revisar basico, intermediario e avancado em Java.
