package starter.Products;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRating {

    private String url;

    public void setUrlRating(){
        url = "https://alta-shop.herokuapp.com/api/products/2/ratings";
    }

    public void requestRating(){
        given().when().get(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void verifyRating(){
        then().body("data", equalTo(3));
    }
}
