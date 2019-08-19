/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Solicite ao usuário que informe as
        três notas (de 0 a 10) de um aluno, e calcule a 
        média e teste as condições:
        1) Se a média for menor ou igual a 5.0 (Reprovado)
        2) Se a média for menor ou igual a 7.0(Aprovado)
        3) Se a média for menor ou igual a 9.0 (Muito bom)
        4) Se a média for maior do que 9.0 (Excelente)
        */
        
        Scanner entrada = new Scanner (System.in);
        
        float nota1, nota2, nota3, media;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3= entrada.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("PRIMEIRA NOTA: " + nota1);
        System.out.println("SEGUNDA NOTA: " + nota2);
        System.out.println("TERCEIRA NOTA: " + nota3);
        System.out.format("MEDIA: %.2f ", media);
        
        if (media <= 5.0){
            System.out.println("Reprovado!!!");
        }
        else if (media > 5.0 && media <= 7.0) {
            System.out.println("Aprovado!!!");
        }
        else if (media > 7.0 && media <= 9.0 ){
            System.out.println("Muito Bom");
        }
            else{
            System.out.println("Excelente!!!");
            }     
    }
    
}