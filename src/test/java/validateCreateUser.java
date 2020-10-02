import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class validateCreateUser {
    @Test
    /*Chama o serviço pelo metodo POST*/

    public void createUserTest() {
        String myJson = "{\"name\":\"Lucas Magno\",\"job\": \"QA Analyst\"}";
        String url = "https://reqres.in/api/users/";

            given()
                .contentType("application/json")
                .body(myJson).
            when()
                .post(url).prettyPeek().
            then()
                .statusCode(201)
                .body(containsString("createdAt"));
    }
}
