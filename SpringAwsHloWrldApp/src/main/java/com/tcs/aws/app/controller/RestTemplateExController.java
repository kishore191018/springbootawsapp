package com.tcs.aws.app.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RestTemplateExController {

	@RequestMapping(value = "restCheck", method = RequestMethod.GET)
	public ResponseEntity<String> restTempCheck() throws URISyntaxException, JsonProcessingException {

		RestTemplate client = new RestTemplateBuilder().setConnectTimeout(Duration.ofSeconds(10))
				.setConnectTimeout(Duration.ofSeconds(10)).build();
		URI url = new URI("http://localhost:2021/hloworld/api/name");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, Charset.forName("UTF-8")));
		// headers.set(FwCommonConstant.C_FW_AUTHORIZATION,
		// param.getAuthorizationKey());
		// ResponseEntity<?> res = null;
		HttpEntity<Object> req = new HttpEntity<Object>(headers);
		// res = client.exchange(new RequestEntity<>(null, headers, HttpMethod.POST,
		// url), this.getClass());
		ResponseEntity<Object> res = client.exchange(url, HttpMethod.GET, req, Object.class);
		ObjectMapper obj = new ObjectMapper();
		String emp = obj.writeValueAsString(res.getBody());
		return new ResponseEntity<String>(emp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "restPostCheck", method = RequestMethod.GET)
	public ResponseEntity<String> restTempPostCheck() throws URISyntaxException, JsonProcessingException {

		RestTemplate client = new RestTemplateBuilder().setConnectTimeout(Duration.ofSeconds(10))
				.setConnectTimeout(Duration.ofSeconds(10)).build();
		URI url = new URI("http://localhost:2021/hloworld/insertEmp");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, Charset.forName("UTF-8")));
		// headers.set(FwCommonConstant.C_FW_AUTHORIZATION,
		// param.getAuthorizationKey());
		// ResponseEntity<?> res = null;
		HttpEntity<Object> req = new HttpEntity<Object>(headers);
		// res = client.exchange(new RequestEntity<>(null, headers, HttpMethod.POST,
		// url), this.getClass());
		Employee emp=new Employee();
		emp.setId(1020);
		emp.setName("Lokesh_Post_Check");
		emp.setSal(2000);
		ResponseEntity<Object> res = client.exchange(new RequestEntity<>(emp,headers, HttpMethod.POST, url), Object.class);
		ObjectMapper obj = new ObjectMapper();
		String emp1 = obj.writeValueAsString(res.getBody());
		return new ResponseEntity<String>(emp1, HttpStatus.OK);
	}
}
