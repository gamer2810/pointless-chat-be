package vn.k3k.pointlesschat.config.elasticsearch;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Component
public class elasticSearch extends AbstractElasticsearchConfiguration{
    
    @Override
    @Bean
    public RestHighLevelClient elasHighLevelClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder();
    }
}
