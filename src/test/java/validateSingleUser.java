import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;



public class validateSingleUser {

String url = "https://reqres.in/api";

    @Test
    /*Valida a resposta do Get Single User - Código 200 e o Schema definido*/
    public void validateSingleUser() {
        given().
            when()
                .get(url+"/users/2").prettyPeek().
            then()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.id", is(2)).
            assertThat()
                .body(matchesJsonSchemaInClasspath("schema_getSingleUser.json"));
    }


}