package com.yatish.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.convert.CassandraConverter;
import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@ComponentScan("com.yatish")
@EnableCassandraRepositories(basePackages = {"com.yatish.repositories"})
public class CassandraApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CassandraApplication.class, args);
		
	}
	
//	@Autowired
//    private Environment environment;
// 
//	@Autowired
//	CassandraClusterFactoryBean cluster;
	
//    @Bean
//    public CassandraClusterFactoryBean cluster() {
// 
//        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
//        cluster.setContactPoints(environment.getProperty("cassandra.contactpoints"));
//        cluster.setPort(Integer.parseInt(environment.getProperty("cassandra.port")));
// 
//        return cluster;
//    }
 
//    @Bean
//    public CassandraMappingContext mappingContext() {
//        return new BasicCassandraMappingContext();
//    }
// 
//    @Bean
//    public CassandraConverter converter() {
//        return new MappingCassandraConverter(mappingContext());
//    }
// 
//    @Bean
//    public CassandraSessionFactoryBean session() throws Exception {
// 
//        CassandraSessionFactoryBean session = new CassandraSessionFactoryBean();
//        session.setCluster(cluster.getObject());
//        session.setKeyspaceName(environment.getProperty("cassandra.keyspace"));
//        session.setConverter(converter());
//        session.setSchemaAction(SchemaAction.NONE);
// 
//        return session;
//    }
// 
//    @Bean
//    public CassandraOperations cassandraTemplate() throws Exception {
//        return new CassandraTemplate(session().getObject());
//    }
	
	
}
