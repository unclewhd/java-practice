package com.wanghaidong.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    public int bid;
    public User user;
    public String title;
    public List<Section> sections;

    public Book() {
        this.sections = new ArrayList<>();
    }

    public Book(int bid, User user, String title) {
        this.bid = bid;
        this.user = user;
        this.title = title;
        this.sections = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", sections=" + sections +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return bid == book.bid &&
                Objects.equals(user, book.user) &&
                Objects.equals(title, book.title) &&
                Objects.equals(sections, book.sections);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bid, user, title, sections);
    }
}
