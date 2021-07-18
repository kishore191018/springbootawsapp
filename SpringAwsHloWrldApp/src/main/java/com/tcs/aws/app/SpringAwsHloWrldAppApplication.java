package com.tcs.aws.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringAwsHloWrldAppApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsHloWrldAppApplication.class, args);
/*
		BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIA2P7TLDBHCDGUCTGX",
				"FBGHcMsjxIX+e2TDyYlto4XNkzLkTX6756BgMJ92");

		// Creating S3 Client credentials will from from CLI path
		// final AmazonS3 s3 = AmazonS3ClientBuilder.standard().build();

		// Creating S3 Client by passing access_key and secret key by programmatically
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds))
				.build();

		S3Object object = s3.getObject("lokesh-user-0709", "json_test.txt");
		S3ObjectInputStream stream = object.getObjectContent();
		ObjectMapper mapper = new ObjectMapper();
		try {
			DemoUser user = mapper.readValue(stream, DemoUser.class);
			System.out.println(user);
			//s3.createBucket("lokesh-user1-0709");
			user.setCmpnyId(2);
			user.setLimit(0);
			user.setLnggCd(2);
			user.setOffset(3);
			user.setPrjctId(2);
			user.setStkhldrId(23);
			user.setUserId("Lokesh");
			File file=new File("test.txt");
			mapper.writeValue(file, user);
			//s3.putObject("lokesh-user1-0709","test.txt",file);
			//s3.deleteObject("lokesh-user1-0709", "test.txt");
			s3.deleteBucket("lokesh-user1-0709");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// List of s3 buckets
		List<Bucket> buckets = s3.listBuckets();
		buckets.stream().forEach(bkts -> {

			System.out.println("Bucket Name : " + bkts.getName() + " Owner : " + bkts.getOwner().getDisplayName());
		});
		*/
	}
}
