package com.githubaction.github_action_build_deploy;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
public class LiveDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetLiveData() throws Exception {
        // Perform a GET request to /live-data
        mockMvc.perform(MockMvcRequestBuilders.get("/live-data"))
                .andExpect(MockMvcResultMatchers.status().isOk())  // Assert that the status code is 200 OK
                .andExpect(MockMvcResultMatchers.content().string(org.hamcrest.Matchers.containsString("Live data as of:")));  // Assert that the response contains live data string
    }
}