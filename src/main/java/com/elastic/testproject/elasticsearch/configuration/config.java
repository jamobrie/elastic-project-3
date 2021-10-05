//package com.elastic.testproject.elasticsearch.configuration;
//
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
//import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.core.convert.ElasticsearchCustomConversions;
//
//@Configuration
////@EnableElasticsearchRepositories(basePackages = "com.elastic.testproject.elasticsearch.repository")
////@ComponentScan(basePackages = {"com.elastic.testproject.elasticsearch"})
//public class config extends AbstractElasticsearchConfiguration {
//
//    @Autowired
//    private RestHighLevelClient restHighLevelClient;
//
//    @Value("${elasticsearch.url}")
//    public String elasticsearchUrl;
//
//    //Bean created
//    //Connect to elasticSearch
//    @Bean
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//        final ClientConfiguration config = ClientConfiguration.builder()
//                .connectedTo(elasticsearchUrl)
//                .build();
//        return RestClients.create(config).rest();
//    }
//
//}
