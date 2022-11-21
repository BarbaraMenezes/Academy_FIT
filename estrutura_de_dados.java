package atividade_extra;

import java.util.Scanner;

public class estrutura_de_dados {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cod, setor;
		String nome, gerada, tipo = null,tp_setor;
		System.out.print(
				"-Tipo de Produto\r\n" + "* 101 – Automotivo\r\n" + "* 102 – Alimentos\r\n" + "* 103 – Bebidas \n");

		System.out.print("Informe o Tipo de Produto:");
		cod = ler.nextInt();
		if (cod == 101) {
			tipo = "Automotivo";
		} else if (cod == 102) {
			tipo = "Alimentos";
		} else if (cod == 103) {
			tipo = "Bebidas";
		}

		System.out.print("- Setor \n" + "* 50 – Eletro\r\n" + "* 60 – Veículos\r\n" + "* 70 – Alimentos \n");

		System.out.print("Informe o Setor:");
		setor = ler.nextInt();

		if (setor == 50) {
			tp_setor = "Eletro";
		} else if (cod == 60) {
			tp_setor = "Veículos";
		} else if (cod == 70) {
			tp_setor = "Alimentos";
		}
		String cod_for,compare;
		compare= new String("0000");
		System.out.print("Informe o Código do Fornecedor:");
	    cod_for = ler.next();
	    boolean comparar=cod_for.length()<compare.length();
		if(comparar) {
		int cont;
		String mais,forn_cod;
		mais=new String("0");
		for(cont=0;comparar;cont++); {
			forn_cod= cont+"cod_for";
			
			System.out.print(forn_cod);
		}
		}
		System.out.print(	cod_for.length());
		
	
		System.out.print(tipo);

	}

}
