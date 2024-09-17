package TiposDeDados;

        /*
        Crie um programa que represente três ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivas missões.
        Cada ninja tem um nome, uma idade e uma missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão.


        Use um loop for para verificar se o ninja pode concluir a missão baseado na sua idade:
        Ninjas menores de 15 anos só podem concluir missões de nível C ou D.
        Ninjas com 15 anos ou mais podem concluir missões de qualquer nível.
        Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e imprima o resultado.
         */

    public class DesafioNinjas {
        public static void main(String[] args) {

            // Informações dos ninjas e suas missões
            String[] nomes = {"Kakashi", "Gaara", "Shikamaru"};
            int[] idades = {42, 19, 20};
            String[] missoes = {"Treinamento do Time 7", "Proteção da Vila da Areia", "Resgate do Hokage"};
            String[] niveisDificuldade = {"Rank A", "Rank S", "Rank B"};
            boolean[] missaoConcluida = {true, false, true}; // Inicialmente, o status das missões

            // Loop para verificar se o ninja pode concluir a missão
            for (int i = 0; i < nomes.length; i++) {
                boolean podeConcluir = false;

                // Verificando se o ninja pode concluir a missão
                if (idades[i] >= 15) {
                    podeConcluir = true; // Ninjas com 15 anos ou mais podem concluir qualquer missão
                } else if (niveisDificuldade[i].equals("Rank C") || niveisDificuldade[i].equals("Rank D")) {
                    podeConcluir = true; // Ninjas menores de 15 anos só podem concluir missões Rank C ou D
                }

                // Atualizando o status da missão
                missaoConcluida[i] = podeConcluir;

                // Exibindo as informações de cada ninja e o resultado da verificação
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Idade: " + idades[i] + " anos");
                System.out.println("Missão: " + missoes[i]);
                System.out.println("Nível de Dificuldade: " + niveisDificuldade[i]);
                System.out.println("Status: " + (missaoConcluida[i] ? "Concluída" : "Não Concluída"));
                System.out.println();
            }
        }

    }