package br.com.programa.java;

public class Calculo {
	public float ExecutarCalculo(float Valor1, float Valor2, float Valor3 ){
		float Soma = Valor1 + Valor2 + Valor3;
		// Regra de negócio, retornar 0 em caso de soma negativa
		if (Soma < 0 )
			Soma = 0;
		return Soma;
	}

}
