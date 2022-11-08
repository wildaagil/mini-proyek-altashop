package starter.Categories;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CreateCategori {

    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlCategori(){
        url = "https://alta-shop.herokuapp.com/api/categories";
    }

    public void setBodyCategori(){
        body.put("name", "gaming");
        body.put("description", "for gaming purposes");
    }

    public void setBodyEmptyNameCategori(){
        body.put("name", "");
        body.put("description", "for gaming purposes");
    }

    public void setBodyEmptyDescriptionCategori(){
        body.put("name", "gaming");
        body.put("description", "");
    }

    public void requesCategori(){
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void verifyStatusCode500(){
        then().statusCode(500);
    }

//    public void setNameCategori(){
//        body.put("name", "arg0");
//    }
//
//    public void setdescriptionCategori(){
//        body.put("description", "for gaming purposes");
//    }
}
