package com.elastic.testproject.elasticsearch.document;

import com.elastic.testproject.elasticsearch.helper.Indices;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@Document(indexName = Indices.PERSON_INDEX)//this person object belongs to an index ... method for default creation, set as true
@Setting(settingPath = "static/es-settings.json")
public class Person {

    //This is mapping

    //Keyword used for IDs, emails, hostnames
    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String name;


}
