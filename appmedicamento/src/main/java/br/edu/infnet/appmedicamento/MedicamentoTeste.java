package br.edu.infnet.appmedicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appmedicamento.model.domain.Medicamento;
import br.edu.infnet.appmedicamento.model.service.MedicamentoService;

@Component
public class MedicamentoTeste implements ApplicationRunner {

	@Autowired
	private MedicamentoService medicamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Medicamento m1 = new Medicamento();		
		m1.setDescricao("Pantoprazol 40mg Medley Genérico com 42 Comprimidos Revestidos");
		m1.setFabricante("Medley");
		m1.setValor(14.99f);		
		m1.setComposicao("PANTOPRAZOL SÓDICO SESQUIIDRATADO (40MG)");
		m1.setIndicacao("Alívio dos sintomas por problemas no estômago");
		m1.setRms("1.8326.0187.009-8");
		System.out.println("Medicamento - " + m1);
		medicamentoService.incluir(m1);
		
		Medicamento m2 = new Medicamento();
		m2.setDescricao("Losartana Potássica 50mg EMS Genérico com 30 Comprimidos");
		m2.setFabricante("EMS");
		m2.setValor(9.99f);				
		m2.setComposicao("LOSARTANA POTÁSSICA (50MG)");
		m2.setIndicacao("Tratamento da hipertensão arterial.");
		m2.setRms("1.5584.0428.015-9");
		System.out.println("Medicamento - " + m2);
		medicamentoService.incluir(m2);
		
		Medicamento m3 = new Medicamento();
		m3.setDescricao("Prednisona 20mg Medley Genérico com 10 Comprimidos");
		m3.setFabricante("Medley");
		m3.setValor(6.99f);				
		m3.setComposicao("PREDNISONA (20MG)");
		m3.setIndicacao("Tratamento de doenças endócrinas");
		m3.setRms("1.0181.0578.005-5");
		System.out.println("Medicamento - " + m3);
		medicamentoService.incluir(m3);
		
	}

}
