package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo("java","computer science"));
		todos.add(new Todo("eclipse","computer science"));
		todos.add(new Todo("java script","computer science"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
}	