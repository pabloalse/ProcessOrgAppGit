package com.santander.controller;

import org.junit.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void noParamUserShouldDisplayMessageError() throws Exception {
        this.mockMvc.perform(get("/user")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Error User"));
    }

    @Test
    public void noParamGroupShouldDisplayMessageError() throws Exception {
        this.mockMvc.perform(get("/group")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Error Group"));
    }

    @Test
    public void noParamUserGroupShouldDisplayMessageError() throws Exception {
        this.mockMvc.perform(get("/userGroup")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Error User and Group"));
    }


    @Test
    public void paramUserShouldReturnGroups() throws Exception {
        this.mockMvc.perform(get("/user").param("user", "E1234567"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("G1234567"));
    }

    @Test
    public void paramGroupShouldReturnGroupInfo() throws Exception {
        this.mockMvc.perform(get("/group").param("group", "G1234567"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("I675"));
    }

    @Test
    public void paramUserGroupMessageError() throws Exception {

    }




}