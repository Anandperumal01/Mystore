package api.endpoints;

/* 
 https://petstore.swagger.io/#/
 
 Domain or common url or Base url =https://petstore.swagger.io/v2
 endpoint=user/    (remaining limit--user/
 url--->uniform resource limit
 
Create user(Post) : https://petstore.swagger.io/v2/user
Get user (Get) : https://petstore.swagger.io/v2/user/{username}
Update user (put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

 */


public class Routes {

	public static String base_url="https://petstore.swagger.io/v2";
	
	//User module
	public static String post_url=base_url+"/user";
	// below user name is path parameter
	public static String get_url=base_url+"/user{username}";
	public static String update_url=base_url+"/user{username}";
	public static String delete_url=base_url+"/user{username}";
	
	
	//Store Module
	
	   // here we will create store module urls
	
	// pet module
	   
	// here we will create pet module urls
	
	
}
