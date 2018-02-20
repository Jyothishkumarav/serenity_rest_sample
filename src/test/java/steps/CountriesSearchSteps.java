package steps;

import static org.hamcrest.CoreMatchers.is;

import io.restassured.response.Response;
import io.restassured.specification.ProxySpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CountriesSearchSteps {
	
	 private String ISO_CODE_SEARCH = "http://services.groupkt.com/country/get/iso2code/";
	   private Response response;

	   @Step
	   public void searchCountryByCode(String code){
		   SerenityRest.proxy(new ProxySpecification("165.225.104.34", 9480, "http"));
	       response = SerenityRest.when().get(ISO_CODE_SEARCH + code);
	   }

	   @Step
	   public void searchIsExecutedSuccesfully(){
	       response.then().statusCode(200);
	   }

	   @Step
	   public void iShouldFindCountry(String country){
	       response.then().body("RestResponse.result.name", is(country));
	   }

}
