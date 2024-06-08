package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;

public class UsersTests {
	
	Faker faker;
	User userPayload;
	@BeforeClass
	public void setupData() {
		
		faker=new Faker();
		userPayload=new User();
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setUsername(faker.name().firstName());
		userPayload.setUsername(faker.name().lastName());
		userPayload.setUsername(faker.internet().safeEmailAddress());
		userPayload.setUsername(faker.internet().password(7,12));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	
	}
	@Test(priority=1)
	public void testPostUser() {
		
		Response response=UserEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2)
	public void testGetUserByName() {
		Response response=UserEndPoints.readUser(this.userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 201);
		
	}

}
