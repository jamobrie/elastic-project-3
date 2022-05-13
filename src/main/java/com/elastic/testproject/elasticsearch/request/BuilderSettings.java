package com.elastic.testproject.elasticsearch.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class BuilderSettings {

    private List<String> domains;
    private String Language;

}
