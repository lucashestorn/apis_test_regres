import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class validateUpdateUser {
    @Test
    /*Chama o serviço pelo metodo POST*/
    public void updateUserTest() {
        String myJson = "{\"name\":\"Lucas Alterado\",\"job\": \"QA Analyst\"}";
        String url = "https://reqres.in/api/users/2";

            given()
                .contentType("application/json")
                .body(myJson).
            when()
                .put(url).prettyPeek().
            then()
                .statusCode(200)
                .body(containsString("updatedAt"));
    }
}
