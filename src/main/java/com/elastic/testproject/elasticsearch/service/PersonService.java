package com.elastic.testproject.elasticsearch.service;

import com.elastic.testproject.elasticsearch.document.Person;
import com.elastic.testproject.elasticsearch.request.BuilderSettings;
import com.elastic.testproject.elasticsearch.request.FormsDefaultSearchRequest;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
public class PersonService {

//    @Autowired
//    private final PersonRepository repository;

    private final RestHighLevelClient restHighLevelClient;

    public void save(final Person person) {
//        repository.save(person);
    }

    @SneakyThrows
    public Person findByQueryAndBuilderSettings(final String query, BuilderSettings builderSettings) {
//        return repository.findById(id).orElse(null);

        SearchRequest searchRequest = null;

        searchRequest = new FormsDefaultSearchRequest.Builder(
                builderSettings.getDomains(), builderSettings.getLanguage())
                //Add sort after check
        .query(query)
        .build();

        restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

        return new Person();
    }


}
