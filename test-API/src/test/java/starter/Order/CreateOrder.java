package starter.Order;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreateOrder {

    private String url, token;

    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlCreateOrder(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }

    public void setBodyCreateOrder(){
        body.put("product_id", 2);
        body.put("quantity", 1);
        data.add(body);
    }

    public void setRequestCreateOrder(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(data)
                .when().post(url);
    }
}
