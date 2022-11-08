package starter.Categories;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetIdCategori {

    private String url, url1;

    public void setUrlGetValidCategoriId(){
        url = "https://alta-shop.herokuapp.com/api/categories/10";
    }

    public void requestValidCategoriId(){
        given().when().get(url);
    }

    public void getValidCategoriId(){
        then().body("data.ID", equalTo(10));
    }

    public void setUrlGetInvalidIdCategori(){
        url1 = "https://alta-shop.herokuapp.com/api/categories/0";
    }

    public void requestInvalidValidCategoriId(){
        given().when().get(url1);
    }


}
