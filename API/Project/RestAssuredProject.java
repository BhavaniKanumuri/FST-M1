package activities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredProject {
	
	//Declare a request Specification
	RequestSpecification requestSpec;
	int id;
		
	@BeforeClass
	public void setUp() {
		//Create request Specification
		requestSpec=new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setBaseUri("https://api.github.com").log(LogDetail.ALL)
				.addHeader("Authorization","token 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")
				.build();
		
	}
	@Test(priority=0)
	public void postReq() {

	String reqBody = "{ \"title\": \"TestAPIKey\", \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCuW37bblMRSXALec80vD8+dak8twzPsj/D25u2dANYBeczGIDtI0yroJIVJQ+rJBl5mzmzOFByh99M5V/EMx+tNJ6EnUGdYxikR69kNtd26Ouj5ruKuGdNq55IvoiMI/ULLhCACMcwRGEgnEtpZYC3acsCUtrpxMo0TxfYHdtcJIHzHs2wqhMN0fPhRGgBC+/wiqSPVDTQq6b7KhRKM292vEUFuSTjIEq6F3pXvlKwfB0mQZ5KuxL0/clbqDq787OMO7KESjX4U6c0tmwqRF9t4bHZE3iIWGMVtaB/vXrZOQvl6LYp0WyrzGOHGFGKYkObHZN/xpCFcQYv8M0ic3rWS8H8kEITYXj6NKHlE2AORu8GdJMArJ83dq6yTgcYRbYg7Tpl0rgZJRzdn2wOkyYZtIlS4OO2B6aJd4adgA2Aly3Eo6JyFsEnwvGn+c/XFtWGL69Qee48zQfAwdk6rO02CLaNnuDuAnLUBJE6mynLT2tldNSOicztX0/rzYluJXc=\"}";
		Response response= given().spec(requestSpec)
				.body(reqBody)
				.when().post("/user/keys");
		id= response.then().extract().path("id");
		System.out.println(reqBody);
		response.then().statusCode(201);
				
	}
	
	@Test(priority=1)
	public void getReq() {
		
		Response response= given().spec(requestSpec)
				.when().get("/user/keys");
		//id= response.then().extract().path("id");
		System.out.println(response.then().log().all());
		response.then().statusCode(200);
				
	}
	@Test(priority=2)
	public void deleteReq() {
		
		Response response= given().spec(requestSpec)
				.when()
				.pathParam("keyId",id)
				.delete("/user/keys/{keyId}");
		
		System.out.println(response.then().log().all());
		response.then().statusCode(204);
				
	}
	
}
