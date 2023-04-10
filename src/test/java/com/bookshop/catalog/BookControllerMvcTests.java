package com.bookshop.catalog;

import com.bookshop.catalog.domain.BookNotFoundException;
import com.bookshop.catalog.domain.BookService;
import com.bookshop.catalog.web.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


/**
 * 仅测试 controller
 *
 * User: fuzongyang
 * Date: 2023/4/7
 * Time: 16:13
 */
@WebMvcTest(BookController.class)
public class BookControllerMvcTests {

    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void whenGetBookNotExistingThenShouldReturn404() throws Exception {
        String isbn = "73737313940";
        given(bookService.viewBookDetail(isbn))
                .willThrow(BookNotFoundException.class);
        mockMvc
                .perform(get("/v1/books/" + isbn))
                .andExpect(status().isNotFound());
    }

}
