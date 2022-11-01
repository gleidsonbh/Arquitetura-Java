package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.Medicamento;

@Component
public class HigienePessoalTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Medicamento m1 = new Medicamento();		
		m1.composicao = "PANTOPRAZOL SÓDICO SESQUIIDRATADO (40MG)";
		m1.indicacao = "Alívio dos sintomas por problemas no estômago";
		m1.rms = "1.8326.0187.009-8";
		System.out.println("Medicamento - " + m1);
		
		Medicamento m2 = new Medicamento();
		m2.composicao = "LOSARTANA POTÁSSICA (50MG)";
		m2.indicacao = "Tratamento da hipertensão arterial.";
		m2.rms = "1.5584.0428.015-9";
		System.out.println("Medicamento - " + m2);
		
		Medicamento m3 = new Medicamento();
		m3.composicao = "PREDNISONA (20MG)";
		m3.indicacao = "Tratamento de doenças endócrinas";
		m3.rms = "1.0181.0578.005-5";
		System.out.println("Medicamento - " + m3);
		
	}
}
