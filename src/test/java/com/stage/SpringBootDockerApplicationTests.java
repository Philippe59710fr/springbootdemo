package com.stage;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootDockerApplicationTests
{
        @Autowired
	private MockMvc mockMvc;

/*
	@Test
	void contextLoads() {
	}
*/
	@Test
	public void testHome() throws Exception {
d
		this.mockMvc.perform(get("/api")).andDo(print()).andExpect(status().isOk())
//				.andExpect(jsonPath("$.content").value("Hello Docker World"));
				.andExpect(jsonPath("$").value("Hello Docker World"));
	}

}
