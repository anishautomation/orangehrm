package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import ca.qaguru.pages.VacancyPage;
import org.testng.annotations.Test;

public class VacancyTests extends TestBase {

        @Test
        public void searchAllVacanciesTest(){
            new VacancyPage(driver)
                    .searchAllVacancies()
                    .isDisplayed();
        }

        @Test
        public void addVacancyTest(){
            new VacancyPage(driver)
                    .addNewVacancy("QA Engineer", "Bettin", "John Smith");
        }

        @Test
        public void addDuplicateTest(){
            new VacancyPage(driver)
                    .addDuplicateVacancy("QA Engineer", "Kurian", "John Smith");
        }





}
