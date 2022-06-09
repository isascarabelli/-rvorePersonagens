/*
 * Trabalho de Laboratório de Algoritmos e Estruturas de Dados II
 * Desenvolvido por: Isabela Ferreira Scarabelli / Paulo Éder Cardoso Medeiros / Pedro Henrique de Almeida Santos
 * 
 * O seguinte código indica um personagem de acordo com as habilidades selecionados pelo usuário e utiliza a estrutura de dados árvore.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArvoreArvore a = new ArvoreArvore();
        No aux = new No(0, null, null, null, "");
        Scanner sc = new Scanner(System.in);
        int resp1, resp2, resp3;

        aux = a.getRaiz();

        System.out.println("Digite 1 para Ataque ou 2 para Defesa: ");
        resp1 = sc.nextInt();

        if (resp1 == 1) {
            aux = a.raiz.esq;
            System.out.println("Digite 1 para suporte, 2 para Tanque ou 3 para Dano: ");
            resp2 = sc.nextInt();

            if (resp2 == 1) {
                aux = a.atq.dir;
                System.out.println(
                        "Digite 1 para um suporte com mais cura e menos dano\nDigite 2 para um suporte com mais dano e menos cura: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.suporteatq.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.curasupatq.nome);
                    System.out.println("Link da sua carta " + a.curasupatq.link);

                } else if (resp3 == 2) {
                    aux = a.suporteatq.dir;
                    System.out.println("Parabéns, seu personagem é a " + a.danosupatq.nome);
                    System.out.println("Link da sua carta " + a.danosupatq.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else if (resp2 == 2) {
                aux = a.atq.meio;
                System.out.println(
                        "Digite 1 para um Tanque com mais dano e menos vida\nDigite 2 para um Tanque com menos dano e mais vida: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.tankatq.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.danotankatq.nome);
                    System.out.println("Link da sua carta " + a.danotankatq.link);

                } else if (resp3 == 2) {
                    aux = a.tankatq.dir;
                    System.out.println("Parabéns, seu personagem é o " + a.vidatankatq.nome);
                    System.out.println("Link da sua carta " + a.vidatankatq.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else if (resp2 == 3) {
                aux = a.atq.dir;
                System.out.println(
                        "Digite 1 para um DPS com mais velocidade e menos vida\nDigite 2 para um DPS com menos velocidade e mais vida: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.danoatq.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.rapidodanoatq.nome);
                    System.out.println("Link da sua carta " + a.rapidodanoatq.link);

                } else if (resp3 == 2) {
                    aux = a.danoatq.dir;
                    System.out.println("Parabéns, seu personagem é o " + a.vidadanoatq.nome);
                    System.out.println("Link da sua carta " + a.vidadanoatq.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else {
                System.out.println("Digite um número válido!!!");
            }

        } else if (resp1 == 2) {
            aux = a.raiz.dir;
            System.out.println("Digite 1 para suporte, 2 para Tanque ou 3 para Dano: ");
            resp2 = sc.nextInt();

            if (resp2 == 1) {
                aux = a.def.esq;
                System.out.println(
                        "Digite 1 para um suporte com mais cura e menos dano\nDigite 2 para um suporte com mais dano e menos cura: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.suportedef.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.curasupdef.nome);
                    System.out.println("Link da sua carta " + a.curasupdef.link);

                } else if (resp3 == 2) {
                    aux = a.suportedef.dir;
                    System.out.println("Parabéns, seu personagem é o " + a.danosupdef.nome);
                    System.out.println("Link da sua carta " + a.danosupdef.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else if (resp2 == 2) {
                aux = a.def.meio;
                System.out.println(
                        "Digite 1 para um Tanque com mais dano e menos vida\nDigite 2 para um Tanque com menos dano e mais vida: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.tankdef.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.danotankdef.nome);
                    System.out.println("Link da sua carta " + a.danotankdef.link);

                } else if (resp3 == 2) {
                    aux = a.tankdef.dir;
                    System.out.println("Parabéns, seu personagem é a " + a.vidatankdef.nome);
                    System.out.println("Link da sua carta " + a.vidatankdef.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else if (resp2 == 3) {
                aux = a.def.dir;
                System.out.println(
                        "Digite 1 para um DPS com mais velocidade e menos vida\nDigite 2 para um DPS com menos velocidade e mais vida: ");
                resp3 = sc.nextInt();

                if (resp3 == 1) {
                    aux = a.danodef.esq;
                    System.out.println("Parabéns, seu personagem é o " + a.rapidodanodef.nome);
                    System.out.println("Link da sua carta " + a.rapidodanodef.link);

                } else if (resp3 == 2) {
                    aux = a.danodef.dir;
                    System.out.println("Parabéns, seu personagem é o " + a.vidadanodef.nome);
                    System.out.println("Link da sua carta " + a.vidadanodef.link);

                } else {
                    System.out.println("Digite um número válido!!!");
                }
            } else {
                System.out.println("Digite um número válido!!!");
            }
        }

        sc.close();
    }
}
