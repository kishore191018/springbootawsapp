package com.tcs.aws.app.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class AwsTest extends AwsDemoTestControllerTest{

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testEmployee() throws Exception {
		MvcResult result=mockMvc.perform(get("/name")).andExpect(status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
		//.andExpect(jsonPath("$.").value("Lokesh Reddy"));
		
		/**mockMvc.perform	(
					post("/name").contentType(MediaType.APPLICATION_JSON).content("")
						)
						.andExpect(status().isOk());
						**/

	}
}
