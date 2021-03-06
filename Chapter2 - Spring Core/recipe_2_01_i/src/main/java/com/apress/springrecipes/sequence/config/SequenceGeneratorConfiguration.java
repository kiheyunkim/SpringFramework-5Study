package com.apress.springrecipes.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apress.springrecipes.sequence.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {

	public SequenceGeneratorConfiguration() {
		System.out.println("created");
		// TODO Auto-generated constructor stub
	}
	
    @Bean 	//Set Bean name -> @Bean(name="mys1")
    public SequenceGenerator sequenceGenerator() {

        SequenceGenerator seqgen = new SequenceGenerator();
        seqgen.setPrefix("30");
        seqgen.setSuffix("A");
        seqgen.setInitial(100000);
        return seqgen;
    }
}