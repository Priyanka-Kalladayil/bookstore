package com.rak.bookstore;

import com.rak.bookstore.mapper.BookstoreMapper;
import org.junit.Before;
import org.junit.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

@SpringBootTest
public class BookstoreTestApplication {

    @Autowired
    private ApplicationContext context;

    @MockBean
    BookstoreMapper mapper;

    @Test
    public void contextLoads() {
        assertThat(context, notNullValue());
    }


    @Before
    public void springUp() {
        context = new AnnotationConfigApplicationContext( getClass() );
        context.getAutowireCapableBeanFactory().autowireBean( this );
    }

    @Bean
    public BookstoreMapper mapper () {
        return Mappers.getMapper(BookstoreMapper.class);
    }

}
