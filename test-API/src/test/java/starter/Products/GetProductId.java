package starter.Products;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetProductId {

    private String url, url1;
    private Long id;

    public void setUrlListProductId(){
        url = "https://alta-shop.herokuapp.com/api/products/550";
    }

    public void requestIdProduct(){
        given().when().get(url);
    }

    public void verifyProductId(){
        then().body("data.ID", equalTo(550));
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }

    public void verifyStatusCode404(){
        then().statusCode(404);
    }

    public void errorMessageProductId(){
        then().body("error", equalTo("record not found"));
    }

    public void setUrlInvalidProductId(){
        url1 = "https://alta-shop.herokuapp.com/api/products/0";
    }

    public void requestInvalidIdProduct(){
        given().when().get(url1);
    }

    public Long getIdProject(){
        given().when().get(url);
        id = lastResponse().body().path("[0].id");
        return id;
    }

    public void requestGetDetail(){
        given().when().get(url + "/" + id);
    }

    public void validateResponseId(){
        then().body("ID", equalTo(id));
    }
}
