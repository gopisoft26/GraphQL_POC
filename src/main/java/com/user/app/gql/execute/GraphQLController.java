package com.user.app.gql.execute;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.execution.AsyncExecutionStrategy;
import graphql.schema.GraphQLSchema;

@RestController
public class GraphQLController {

	private final GraphQL graphQL;

	@Autowired
	public GraphQLController(GraphQLSchema graphQLSchema) {
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).queryExecutionStrategy(new AsyncExecutionStrategy()).build();
	}

	@PostMapping("/graphql")
	public Map<String, Object> executeQuery(@RequestBody String query) {
		ExecutionResult executionResult = graphQL.execute(query);
		return executionResult.toSpecification();
	}
}
