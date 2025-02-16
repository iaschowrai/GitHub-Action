package com.githubaction.github_action_build_deploy;
import com.githubaction.github_action_build_deploy.controller.LiveDataController;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LiveDataController.class) // Specify your controller here
public class LiveDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetLiveData() throws Exception {
        mockMvc.perform(get("/live-data"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello,Irshad"));
    }
}
