package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class Activite8Application {

	@Autowired
    private DataSource dataSource;
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Activite8Application.class, args);
	}

	

	
	@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;
   }
    
    @Autowired
    public MyCommandLineRunner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	@Override
    public void run(String... args) throws Exception {
        // Code à exécuter au démarrage de l'application
    }
}
	
	@Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

	@Override
    public void run(String... args) throws Exception {
        // Récupérer tous les enregistrements de la table 'wilaya'
        List<Wilaya> wilayas = jdbcTemplate.query(
                "SELECT * FROM wilaya",
                BeanPropertyRowMapper.newInstance(Wilaya.class)
        );

        // Afficher les informations des wilayas dans la console
        for (Wilaya wilaya : wilayas) {
            System.out.println("ID: " + wilaya.getId());
            System.out.println("Nom Arabe: " + wilaya.getNomArabe());
            System.out.println("Nom Latin: " + wilaya.getNomLatin());
            System.out.println("Nom Tamazight: " + wilaya.getNomTamazight());
            System.out.println("Actif: " + wilaya.isActif());
            System.out.println("Date de création: " + wilaya.getDateCreation());
            System.out.println("Date de mise à jour: " + wilaya.getDateMaj());
            System.out.println("Compte création: " + wilaya.getCompteCreation());
            System.out.println("Compte maj: " + wilaya.getCompteMaj());
            System.out.println("--------------------------------");
        }
    }
}