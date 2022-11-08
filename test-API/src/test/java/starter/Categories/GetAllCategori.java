package starter.Categories;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllCategori {

    private String url;

    public void setUrlGetAllCategori(){
        url = "https://alta-shop.herokuapp.com/api/categories";
    }

    public void requestCategori(){
        given().when().get(url);
    }
}
