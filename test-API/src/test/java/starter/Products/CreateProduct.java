package starter.Products;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class CreateProduct {

    private String url;

    private JSONObject body = new JSONObject();

    public void setUrlCreateProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public void setBodyProduct(){
        List<Integer> category = new LinkedList<>();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", 299);
        category.add(2);
        body.put("categories", category);
    }

    public void requestProduct(){
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
