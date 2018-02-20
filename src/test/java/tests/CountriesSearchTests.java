package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.CountriesSearchSteps;

@RunWith(SerenityRunner.class)
public class CountriesSearchTests {
	
	@Steps
	CountriesSearchSteps countriesSearchSteps;
	
	@Test
	   public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
	       countriesSearchSteps.searchCountryByCode("US");
	       countriesSearchSteps.searchIsExecutedSuccesfully();
	       countriesSearchSteps.iShouldFindCountry("United States of America");
	   }

	   @Test
	   public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
	       countriesSearchSteps.searchCountryByCode("IN");
	       countriesSearchSteps.searchIsExecutedSuccesfully();
	       countriesSearchSteps.iShouldFindCountry("India");
	   }


}
