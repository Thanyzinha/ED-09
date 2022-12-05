/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula09;

/**
 *
 * @author Nathany
 */
public class Aula09 {

    public static void main(String[] args) {
        Pessoas  pessoa1 = new  Pessoas ( "1 Ana" , "9328-5567" , "Rua Joviano Antonio Fernades n 810 Setor Cristo" , "***********" );
        Pessoas  pessoa2 = new  Pessoas ( "2 Andre" , "9890-0090" , "Rua 24 n 90 Cristina Parque" , "***********" );
        Pessoas  pessoa3 = new  Pessoas ( "3 Carlos" , "9200-2394" , "Alameda X qd 03 Vicentinopoles" , "************" );
        Pessoas  pessoa4 = new  Pessoas ( "4 Daniel" , "9486-8879" , "Rua Campinas n 78 Setor Marista" , "************" );
        Pessoas  pessoa5 = new  Pessoas ( "5 Marcos" , "9860-1267" , "Rua Jk qd 13 Monte Escuro " , "************" );
        Pessoas  pessoa6 = new  Pessoas ( "6 Jose" , "9899-7474" , "Rua Lago n 75 Setor KL" , "************" );
        Pessoas  pessoa7 = new  Pessoas ( "7 Allan" , "9643-8424" , "Rua Buriti n 90 Olinto " , "************" );
        Pessoas  pessoa8 = new  Pessoas ( "8 Uilian" , "9766-3232" , "Rua 22 n 89 Zona Leste" , "************" );
        Pessoas  pessoa9 = new  Pessoas ( "9 Luis" , "9681-6556" , "Rua Rio de Janeiro n 55 Centro" , "************" );
        Pessoas  pessoa10 = new  Pessoas ( "10 ELizangela" , "3413-2952" , "Avenida PT n 13 Lulandia" , "************" );
        Pessoas  pessoa11 = new  Pessoas ( "11 Roberta" , "9877-6522" , "Rua 66 qd V Vila Norte" , "************" );
        Pessoas  pessoa12 = new  Pessoas ( "12 Monique" , "8566-2332" , "Rua das Araras n 666 Lirios Verde" , "************" );
        Pessoas  pessoa13 = new  Pessoas ( "13 Antonio" , "3413-2728" , "Alameda do Adeus n 37 Preto Azul" , "************" );
        Pessoas  pessoa14 = new  Pessoas ( "14 Gabriel" , "4328-9696" , "Rua 2 n 24 Morro 2" , "************" );
        Pessoas  pessoa15 = new  Pessoas ( "15 Luara" , "9544-6611" , "Rua 6 n 120 Vila Pirinópolis" , "************" );
        Pessoas  pessoa16 = new  Pessoas ( "16 Micael" , "3416-8787" , "Rua 33 n 420 São Francisco" , "************" );
        Pessoas  pessoa17 = new  Pessoas ( "17 Dominique" , "9655-1234" , " Rua Aranha n 66 Setor Leste" , "************" );
        Pessoas  pessoa18 = new  Pessoas ( "18 Selange" , "3146-8558" , "Rua 33 n 11 Horizonte" , "************" );
        Pessoas  pessoa19 = new  Pessoas ( "19 Beatriz" , "9748-1112" , "Avenida da Alegria n 36 Aeroporto" , "************" );
        Pessoas  pessoa20 = new  Pessoas ( "20 Pablo" , "7894-6666" , "Alameda das corujas n 1380 Rio Quente" , "************" );
        Lista  lista = new  Lista ();

        lista . addFinal ( pessoa1 );
        lista . addFinal ( pessoa2 );
        lista . addFinal ( pessoa3 );
        lista . addFinal ( pessoa4 );
        lista . addFinal ( pessoa5 );
        lista . addFinal ( pessoa6 );
        lista . addFinal ( pessoa7 );
        lista . addFinal ( pessoa8 );
        lista . addFinal ( pessoa9 );
        lista . addFinal ( pessoa10 );
        lista . addFinal ( pessoa11 );
        lista . addFinal ( pessoa12 );
        lista . addFinal ( pessoa13 );
        lista . addFinal ( pessoa14 );
        lista . addFinal ( pessoa15 );
        lista . addFinal ( pessoa16 );
        lista . addFinal ( pessoa17 );
        lista . addFinal ( pessoa18 );
        lista . addFinal ( pessoa19 );
        lista . addFinal ( pessoa20 );

        lista.sortear();
        System.out.println(lista.tamanho);
    }
}
