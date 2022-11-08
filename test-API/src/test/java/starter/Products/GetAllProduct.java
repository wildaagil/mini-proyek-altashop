package starter.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetAllProduct {

    private String url;

    public void setUrlListProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public void requestListProduct(){
        given().when().get(url);
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }
}
