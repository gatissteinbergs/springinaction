package com.spring.in.action.part1.controller;

import com.spring.in.action.part1.repo.IngredientRepository;
import com.spring.in.action.part1.repo.OrderRepository;
import com.spring.in.action.part1.repo.TacoRepository;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IngredientRepository ingredientRepository;

    @MockBean
    private TacoRepository designRepository;

    @MockBean
    private OrderRepository orderRepository;

    @Test
    public void testHomePage() throws Exception {
        mockMvc
                .perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(Matchers.containsString("Welcome to...")));
    }
}
