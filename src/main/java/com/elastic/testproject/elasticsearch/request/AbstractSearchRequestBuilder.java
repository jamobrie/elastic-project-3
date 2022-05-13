package com.elastic.testproject.elasticsearch.request;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractSearchRequestBuilder<T, U> {

    public static final String SORT_BY_RELEVANCE = "relevance";
    public static final String TITLE_FIELD_NAME = "title"; // Remove this
    public static final String FORM_TITLE_FIELD_NAME = "form_title";

    @Getter
    private final String[] indices;

    public AbstractSearchRequestBuilder(List<String> domains, String language) {
        this.indices = new String[]{"jimmy"};
    }

    protected abstract T query(String query);

    protected abstract T aggregations(Optional<FacetsAliasRequest> facets);

    protected abstract T highlighting(Boolean highlighting);

    protected abstract T sorting(Optional<Sort> sort);

    protected abstract T paging(Optional<Page> page);

    protected abstract U build() throws BuilderValidationException;

//    protected SortBuilder<?> getDefaultSortBuilder(Sort.OrderEnum orderEnum, String sortFieldName) {
//        SortBuilder<?> sortBuilder = null;
//        final SortOrder sortOrder =
//                (Sort.OrderEnum.ASC == orderEnum) ? SortOrder.ASC : SortOrder.DESC;
//        if (SORT_BY_RELEVANCE.equalsIgnoreCase(sortFieldName)) {
//            sortBuilder = new ScoreSortBuilder().order(sortOrder);
//        } else {
//            sortBuilder = new FieldSortBuilder(sortFieldName).order(sortOrder);
//        }
//        return sortBuilder;
//    }

}
