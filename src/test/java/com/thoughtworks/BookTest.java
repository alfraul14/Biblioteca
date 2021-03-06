package com.thoughtworks;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    //printf("%-40s, %-20s, %-4s", aTitle, anAuthor, aYear)

    @Test
    public void shouldReturnProperlyFormattedBook(){
        Book book = new Book("aaa", "bbb", "ccc");

        assertThat(book.details(), is(String.format("%-40s %-20s %-4s", "aaa", "bbb", "ccc")));
    }

}
