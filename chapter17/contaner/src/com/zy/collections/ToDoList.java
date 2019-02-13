package com.zy.collections;

import java.util.*;

public class ToDoList extends PriorityQueue<ToDoList.TodoItem> {
    static class TodoItem implements Comparable<TodoItem> {
        private String str;
        private char pri;
        private int sec;
        public TodoItem(String item, char primary, int second) {
            str = item;
            pri = primary;
            sec = second;
        }
        @Override
        public int compareTo(TodoItem rhs) {
            if (pri < rhs.pri) {
                return -1;
            } else if (pri > rhs.pri) {
                return 1;
            } else {
                if (sec < rhs.sec) {
                    return -1;
                } else if (sec > rhs.sec) {
                    return 1;
                } else
                {
                    return 0;
                }
            }
        }
        public String toString() {
            return str + ":" + pri + " " + sec;
        }
    }
    public void add(String s, char pri, int sec) {
        super.offer(new TodoItem(s, pri, sec));
    }
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        todoList.add("Empty trash", 'c', 4);
        todoList.add("Fee dog", 'a', 2);
        while (todoList.peek() != null) {
            System.out.println(todoList.remove());
        }
    }
}
