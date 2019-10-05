// Ep2_RedeSocial.java
// EP2 para mostrar dados de uma rede social - Felipe Furquim - 07/06/19 00h35

import java.util.Scanner;
        
public class Ep2_RedeSocial {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int aa, bb, e, f, i, j, m, s, t, v, w, cont, cont2, cont3, cont4, contMutuo;        // aa, bb, cc, dd, a, b, c, d, e, f, g, h, i, j, k, l, m, o, p, q, r, s, t, u, v, w, x, y, z, cont, cont2, cont3, cont4 contMutuo = contadores e validadores;
        int n;
        int iMaisSeguidores = 0;  
        int iMenosSeguidores = 0;
        int iMaisSeguidos = 0;
        int iMenosSeguidos = 0;
        
        aa = 0;
        bb = 0;
        e = 0;
        f = 0;
        i = 0;
        j = 0;
        m = 0;
        s = 0;
        t = 0;
        v = 0;
        w = 0;
        cont = 1;
        cont2 = 1;
        cont3 = 1;
        cont4 = 1;
        contMutuo = 0;
        
        int[][] rede;
        
        // Inserir usuários;
        
        String entrada = input.nextLine();
        String[] nomes = entrada.split("\\|");
        
        n = nomes.length;
        rede = new int [n][n];

        // Falar quem segue quem
   
        String entrada2 = input.nextLine();
        
        // Se o segundo input for vazio;
        
        if(entrada2.equals("")) {
        
            // Declaração de arrays dependente de n;

            int numSeguidores[] = new int [n];
            int numSeguidos[] = new int [n];
            String mutuo[] = new String [n * n];
            String sMaisSeguidores[] = new String [n];
            String sMenosSeguidores[] = new String [n];
            String sMaisSeguidos[] = new String [n];
            String sMenosSeguidos[] = new String [n];

            // Se tiver apenas um usuário;

            if(n == 1) {

                System.out.println(0);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
            }

            else {

                // Número de seguidores que cada um tem;

                for(int q = 0; q < n; q++) {    

                    for(int p = 0; p < n; p++) { 

                        if(rede[p][q] == 1) {
                            numSeguidores[q] = numSeguidores[q] + 1;
                        }  
                    }           
                }

                // Quem tem mais seguidores;

                sMaisSeguidores[s] = nomes[0]; 

                for(int r = 1; r < numSeguidores.length; r++) {

                    if(numSeguidores[r] > numSeguidores[iMaisSeguidores]) {

                        iMaisSeguidores = r;
                        sMaisSeguidores[s] = nomes[r];
                        cont = 1;
                        t = 0;
                    }
                    else if(numSeguidores[r] == numSeguidores[iMaisSeguidores]) {

                        t++;
                        sMaisSeguidores[s+t] = nomes[r];
                        cont++;
                    }            
                }

                // Quem tem menos seguidores;

                sMenosSeguidores[v] = nomes[0]; 

                for(int a = 1; a < numSeguidores.length; a++) {

                    if(numSeguidores[a] < numSeguidores[iMenosSeguidores]) {

                        iMenosSeguidores = a;
                        sMenosSeguidores[s] = nomes[a];
                        cont2 = 1;
                        w = 0;
                    }
                    else if(numSeguidores[a] == numSeguidores[iMenosSeguidores]) {

                        w++;
                        sMenosSeguidores[v+w] = nomes[a];
                        cont2++;
                    }            
                }

                // Número de seguidos que cada um tem;

                for(int c = 0; c < n; c++) {    

                    for(int d = 0; d < n; d++) { 

                        if(rede[c][d] == 1) {
                            numSeguidos[c] = numSeguidos[c] + 1;
                        }  
                    }           
                }

                // Quem mais segue;

                sMaisSeguidos[e] = nomes[0]; 

                for(int g = 1; g < numSeguidos.length; g++) {

                    if(numSeguidos[g] > numSeguidos[iMaisSeguidos]) {

                        iMaisSeguidos = g;
                        sMaisSeguidos[e] = nomes[g];
                        cont3 = 1;
                        f = 0;
                    }
                    else if(numSeguidos[g] == numSeguidos[iMaisSeguidos]) {

                        f++;
                        sMaisSeguidos[e+f] = nomes[g];
                        cont3++;
                    }            
                }

                // Quem menos segue;

                sMenosSeguidos[aa] = nomes[0]; 

                for(int cc = 1; cc < numSeguidos.length; cc++) {

                    if(numSeguidos[cc] < numSeguidos[iMenosSeguidos]) {

                        iMenosSeguidos = cc;
                        sMenosSeguidos[aa] = nomes[cc];
                        cont4 = 1;
                        bb = 0;
                    }
                    else if(numSeguidos[cc] == numSeguidos[iMenosSeguidos]) {

                        bb++;
                        sMenosSeguidos[aa+bb] = nomes[cc];
                        cont4++;
                    }            
                }

                // Seguidores mútuos;

                for(int k = 0; k < n; k++){

                    int l = 0;

                    while(l < n){

                        if( k <= l){
                            if(rede[k][l] == 1 && rede[l][k] == 1){

                                mutuo[m] = nomes[k];
                                mutuo[m+1] = nomes[l];

                                m+=2;
                                contMutuo++;
                            }
                        }
                        l++; 
                    }
                }

                // Imprimir a matriz;

                for(int y = 0; y < n; y++) {

                    for(int z = 0; z < n; z++) {

                        System.out.printf("%s ", rede[y][z]);  
                    }
                    System.out.println(""); 
                }  

                // Imprimir usuario com mais seguidores;

                System.out.printf("%d ", numSeguidores[iMaisSeguidores]);

                for(int u = 0; u < cont; u++) {

                    if(u == 0) {
                    System.out.printf("%s", sMaisSeguidores[u]);

                    if( u == cont - 1)
                        System.out.println("");
                    }

                    else if( u == cont - 1)
                        System.out.printf("|%s\n", sMaisSeguidores[u]);

                    else
                        System.out.printf("|%s", sMaisSeguidores[u]);
                }

                 // Imprimir usuario com menos seguidores;

                System.out.printf("%d ", numSeguidores[iMenosSeguidores]);

                for(int b = 0; b < cont2; b++) {

                    if(b == 0) {
                    System.out.printf("%s", sMenosSeguidores[b]);

                    if( b == cont2 - 1)
                        System.out.println("");
                    }

                    else if( b == cont2 - 1)
                        System.out.printf("|%s\n", sMenosSeguidores[b]);

                    else
                        System.out.printf("|%s", sMenosSeguidores[b]);
                }

                // Imprimir usuario que mais segue;

                System.out.printf("%d ", numSeguidos[iMaisSeguidos]);

                for(int h = 0; h < cont3; h++) {

                    if(h == 0) {
                    System.out.printf("%s", sMaisSeguidos[h]);

                    if( h == cont3 - 1)
                        System.out.println("");
                    }

                    else if( h == cont3 - 1)
                        System.out.printf("|%s\n", sMaisSeguidos[h]);

                    else
                        System.out.printf("|%s", sMaisSeguidos[h]);
                }

                // Imprimir usuario que menos segue;

                System.out.printf("%d ", numSeguidos[iMenosSeguidos]);

                for(int dd = 0; dd < cont4; dd++) {

                    if(dd == 0) {
                    System.out.printf("%s", sMenosSeguidos[dd]);

                    if( dd == cont4 - 1)
                        System.out.println("");
                    }

                    else if( dd == cont4 - 1)
                        System.out.printf("|%s\n", sMenosSeguidos[dd]);

                    else
                        System.out.printf("|%s", sMenosSeguidos[dd]);
                }

                // Imprimir seguidores mútuos

                for(int o = 0; o < contMutuo * 2; o++ ) {

                    if( o == 0 )
                        System.out.printf("%s", mutuo[o]);

                    else if(o == (contMutuo  * 2) - 1)
                            System.out.printf("|%s\n", mutuo[o]);

                    else
                        System.out.printf("|%s", mutuo[o]);

                }
            }
        }
        
        // Se tem o segundo input;
        
        else {
        
            String[] seguindo = entrada2.split("\\|");

            // Declaração de arrays dependente de n;

            int numSeguidores[] = new int [n];
            int numSeguidos[] = new int [n];
            String mutuo[] = new String [n * n];
            String sMaisSeguidores[] = new String [n];
            String sMenosSeguidores[] = new String [n];
            String sMaisSeguidos[] = new String [n];
            String sMenosSeguidos[] = new String [n];

            // Se tiver apenas um usuário;

            if(n == 1) {

                System.out.println(0);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
                System.out.printf("0 %s\n", nomes[0]);
            }

            else {

                // Criar a matriz;

                while(j < seguindo.length) {

                    int validador = 0;
                    i = 0;

                    while(validador == 0) {
                        if(seguindo[j].equals(nomes[i])) {

                            for(int x = 0; x < n; x++) {

                                if(seguindo[j+1].equals(nomes[x])) {

                                    rede[i][x] = 1;
                                    validador++;
                                }
                            }
                        }

                        else {
                            i++;
                        }
                    }
                    j+=2;
                }

                // Número de seguidores que cada um tem;

                for(int q = 0; q < n; q++) {    

                    for(int p = 0; p < n; p++) { 

                        if(rede[p][q] == 1) {
                            numSeguidores[q] = numSeguidores[q] + 1;
                        }  
                    }           
                }

                // Quem tem mais seguidores;

                sMaisSeguidores[s] = nomes[0]; 

                for(int r = 1; r < numSeguidores.length; r++) {

                    if(numSeguidores[r] > numSeguidores[iMaisSeguidores]) {

                        iMaisSeguidores = r;
                        sMaisSeguidores[s] = nomes[r];
                        cont = 1;
                        t = 0;
                    }
                    else if(numSeguidores[r] == numSeguidores[iMaisSeguidores]) {

                        t++;
                        sMaisSeguidores[s+t] = nomes[r];
                        cont++;
                    }            
                }

                // Quem tem menos seguidores;

                sMenosSeguidores[v] = nomes[0]; 

                for(int a = 1; a < numSeguidores.length; a++) {

                    if(numSeguidores[a] < numSeguidores[iMenosSeguidores]) {

                        iMenosSeguidores = a;
                        sMenosSeguidores[s] = nomes[a];
                        cont2 = 1;
                        w = 0;
                    }
                    else if(numSeguidores[a] == numSeguidores[iMenosSeguidores]) {

                        w++;
                        sMenosSeguidores[v+w] = nomes[a];
                        cont2++;
                    }            
                }

                // Número de seguidos que cada um tem;

                for(int c = 0; c < n; c++) {    

                    for(int d = 0; d < n; d++) { 

                        if(rede[c][d] == 1) {
                            numSeguidos[c] = numSeguidos[c] + 1;
                        }  
                    }           
                }

                // Quem mais segue;

                sMaisSeguidos[e] = nomes[0]; 

                for(int g = 1; g < numSeguidos.length; g++) {

                    if(numSeguidos[g] > numSeguidos[iMaisSeguidos]) {

                        iMaisSeguidos = g;
                        sMaisSeguidos[e] = nomes[g];
                        cont3 = 1;
                        f = 0;
                    }
                    else if(numSeguidos[g] == numSeguidos[iMaisSeguidos]) {

                        f++;
                        sMaisSeguidos[e+f] = nomes[g];
                        cont3++;
                    }            
                }

                // Quem menos segue;

                sMenosSeguidos[aa] = nomes[0]; 

                for(int cc = 1; cc < numSeguidos.length; cc++) {

                    if(numSeguidos[cc] < numSeguidos[iMenosSeguidos]) {

                        iMenosSeguidos = cc;
                        sMenosSeguidos[aa] = nomes[cc];
                        cont4 = 1;
                        bb = 0;
                    }
                    else if(numSeguidos[cc] == numSeguidos[iMenosSeguidos]) {

                        bb++;
                        sMenosSeguidos[aa+bb] = nomes[cc];
                        cont4++;
                    }            
                }

                // Seguidores mútuos;

                for(int k = 0; k < n; k++){

                    int l = 0;

                    while(l < n){

                        if( k <= l){
                            if(rede[k][l] == 1 && rede[l][k] == 1){

                                mutuo[m] = nomes[k];
                                mutuo[m+1] = nomes[l];

                                m+=2;
                                contMutuo++;
                            }
                        }
                        l++; 
                    }
                }

                // Imprimir a matriz;

                for(int y = 0; y < n; y++) {

                    for(int z = 0; z < n; z++) {

                        System.out.printf("%s ", rede[y][z]);  
                    }
                    System.out.println(""); 
                }  

                // Imprimir usuario com mais seguidores;

                System.out.printf("%d ", numSeguidores[iMaisSeguidores]);

                for(int u = 0; u < cont; u++) {

                    if(u == 0) {
                    System.out.printf("%s", sMaisSeguidores[u]);

                    if( u == cont - 1)
                        System.out.println("");
                    }

                    else if( u == cont - 1)
                        System.out.printf("|%s\n", sMaisSeguidores[u]);

                    else
                        System.out.printf("|%s", sMaisSeguidores[u]);
                }

                 // Imprimir usuario com menos seguidores;

                System.out.printf("%d ", numSeguidores[iMenosSeguidores]);

                for(int b = 0; b < cont2; b++) {

                    if(b == 0) {
                    System.out.printf("%s", sMenosSeguidores[b]);

                    if( b == cont2 - 1)
                        System.out.println("");
                    }

                    else if( b == cont2 - 1)
                        System.out.printf("|%s\n", sMenosSeguidores[b]);

                    else
                        System.out.printf("|%s", sMenosSeguidores[b]);
                }

                // Imprimir usuario que mais segue;

                System.out.printf("%d ", numSeguidos[iMaisSeguidos]);

                for(int h = 0; h < cont3; h++) {

                    if(h == 0) {
                    System.out.printf("%s", sMaisSeguidos[h]);

                    if( h == cont3 - 1)
                        System.out.println("");
                    }

                    else if( h == cont3 - 1)
                        System.out.printf("|%s\n", sMaisSeguidos[h]);

                    else
                        System.out.printf("|%s", sMaisSeguidos[h]);
                }

                // Imprimir usuario que menos segue;

                System.out.printf("%d ", numSeguidos[iMenosSeguidos]);

                for(int dd = 0; dd < cont4; dd++) {

                    if(dd == 0) {
                    System.out.printf("%s", sMenosSeguidos[dd]);

                    if( dd == cont4 - 1)
                        System.out.println("");
                    }

                    else if( dd == cont4 - 1)
                        System.out.printf("|%s\n", sMenosSeguidos[dd]);

                    else
                        System.out.printf("|%s", sMenosSeguidos[dd]);
                }

                // Imprimir seguidores mútuos

                for(int o = 0; o < contMutuo * 2; o++ ) {

                    if( o == 0 )
                        System.out.printf("%s", mutuo[o]);

                    else if(o == (contMutuo  * 2) - 1)
                            System.out.printf("|%s\n", mutuo[o]);

                    else
                        System.out.printf("|%s", mutuo[o]);

                }
            }
        }
    }
}