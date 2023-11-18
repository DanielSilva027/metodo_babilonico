/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculando a raiz de um numero positivo utilizando o metodo babilonico
        Scanner in = new Scanner(System.in);
 
        double raiz = 0.0;      
        double radicando = 0.0;  
        double novaSuposicao = 0.0;  
        double erroAproximacao = 0.0;
        double suposicaoInicial = 0.0;
        double precicaoDaResposta = 0.0001;   //1E-14 
        
        System.out.print("Digite um numero: "); 
        radicando = in.nextDouble();
        
        if(radicando < 0){
            System.out.println("A raiz quadrada de número negativo resulta em um numero complexo, não trabalhamos com esse tipo de operação!");
            
        } else if(radicando == 0){
            System.out.println("Raiz quadrada de 0 = 0");
        
        } else{
            //mudando a precisao para numero menores
            if(radicando < 1){
            precicaoDaResposta = 0.0000000001;
            }
            //calculando uma suposição proxima do radicando
            while((suposicaoInicial * suposicaoInicial) < radicando){
                suposicaoInicial++;
                
            }
            
            novaSuposicao = radicando / suposicaoInicial;
            //Aplicacao do metodo
            do{
                suposicaoInicial = (suposicaoInicial + novaSuposicao)/2;
                novaSuposicao = radicando / suposicaoInicial;
                
                erroAproximacao = (novaSuposicao * novaSuposicao) - radicando;
                
                //|erroAproximacao| - modulo de erroAproximacao
                if (erroAproximacao < 0){
                    erroAproximacao = erroAproximacao * -1;
         
                }
               
            }while(erroAproximacao > precicaoDaResposta);
            
            raiz = novaSuposicao;
            
            System.out.println("A raiz quadrada de " + radicando + " = " + raiz); 
        }
    }
}