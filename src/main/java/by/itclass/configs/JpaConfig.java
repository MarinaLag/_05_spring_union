package by.itclass.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import jakarta.persistence.EntityManagerFactory;


@EnableJpaRepositories("by.itclass.model.repositories")
public class JpaConfig {
    @Bean
    public JpaVendorAdapter vendorAdapter(){
        return new HibernateJpaVendorAdapter();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean factory(JpaVendorAdapter vendorAdapter){
        var container = new LocalContainerEntityManagerFactoryBean();
        container.setJpaVendorAdapter(vendorAdapter);
        container.setPackagesToScan("by.itclass.model.entities");
        return container;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        var transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }


}
