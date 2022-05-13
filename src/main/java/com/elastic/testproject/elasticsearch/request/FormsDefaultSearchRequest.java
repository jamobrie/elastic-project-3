package com.elastic.testproject.elasticsearch.request;

import lombok.Getter;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.List;
import java.util.Optional;

public class FormsDefaultSearchRequest extends SearchRequest{

    public FormsDefaultSearchRequest(Builder builder) {
        this.indices(builder.getIndices());
        this.source(builder.getSearchSourceBuilder());
    }

    public static class Builder extends AbstractSearchRequestBuilder<Builder, SearchRequest> {

        @Getter
        private final SearchSourceBuilder searchSourceBuilder;

        public Builder(List<String> domains, String language) {
            super(domains, language);
            this.searchSourceBuilder = new SearchSourceBuilder();
        }

        @Override
        public Builder query(String query) {
            this.searchSourceBuilder.query(
                    QueryBuilders.matchPhraseQuery(FORM_TITLE_FIELD_NAME, query));
            return this;
        }

        @Override
        protected Builder aggregations(Optional<FacetsAliasRequest> facets) {
            return null;
        }

        @Override
        protected Builder highlighting(Boolean highlighting) {
            return null;
        }

        @Override
        protected Builder sorting(Optional<Sort> sort) {
            return null;
        }

        @Override
        protected Builder paging(Optional<Page> page) {
            return null;
        }

        private void validate() throws BuilderValidationException {
            BuilderValidator builderValidator = new BuilderValidator();
            validateIndices(builderValidator);
            validateSearchSourceBuilder(builderValidator);
            builderValidator.throwValidationExceptionIfNeeded();
        }

        private void validateSearchSourceBuilder(BuilderValidator builderValidator) {
        }

        private void validateIndices(BuilderValidator builderValidator) {
        }

        @Override
        public SearchRequest build() throws BuilderValidationException {
            validate();
            return new FormsDefaultSearchRequest(this);
        }
    }


}
