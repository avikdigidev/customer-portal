package com.ms.example.customerdataservice.config;

import org.kie.api.*;
import org.kie.api.builder.*;
import org.kie.api.runtime.*;
import org.kie.internal.io.*;
import org.springframework.context.annotation.*;

import java.io.*;

@Configuration
public class DroolConfig {

	private KieServices kieServices = KieServices.Factory.get();

	private KieFileSystem getKieFileSystem() {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(ResourceFactory.newClassPathResource("customerRules.xls"));
		return kieFileSystem;

	}

	@Bean
	public KieContainer getKieContainer() {
		System.out.println("Container created...");
		getKieRepository();
		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		return kieServices.newKieContainer(kieModule.getReleaseId());

	}

	private void getKieRepository() {
		final KieRepository kieRepository = kieServices.getRepository();
		kieRepository.addKieModule(() -> kieRepository.getDefaultReleaseId());
	}

	@Bean
	public KieSession getKieSession() throws IOException {
		System.out.println("session created...");
		return getKieContainer().newKieSession();

	}



}
