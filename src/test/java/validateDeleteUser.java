import org.junit.Test;
import static io.restassured.RestAssured.given;

public class validateDeleteUser {

/*Chama o DELETE para exclusão do usuario*/

    String url = "https://reqres.in/api/2";
    @Test
    public void deleteUserTest(){
             given().
             when().
                delete(url).
             then()
                .statusCode(204);
    }
}
