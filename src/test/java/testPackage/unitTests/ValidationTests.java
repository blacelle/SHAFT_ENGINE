package testPackage.unitTests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;
import io.github.shafthq.shaft.tools.io.ReportManagerHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import poms.GoogleSearch;

public class ValidationTests {
    private WebDriver driver;

    @Test(description = "Assert that assertEquals works as expected when the two values are equal.")
    public void assertEquals_true_expectedToPass() {
        Validations.verifyThat().number(1).isEqualTo(1).perform();
        Validations.assertThat().number(1).isEqualTo(1);
    }

    @Test
    public void assertEquals_true_expectedToPass__() {
        Validations.assertThat().number(1).isEqualTo(1).perform();
    }

    @Test
    public void assertEquals_longCharacters() {
        Validations.verifyThat().object("jLvZpYHnzi7J2LioTBKIRg22r9Fz2qKoPbhnPk8vVo2IKvtdbZWVzWBvQ9fPhDO9Mg290JmiviQBiBTd9IEqoqvZFSCrL2J8wOIDhJLt0lg8hYGGDgkaPWhwMtjJN0jgxLikgXK8i5TAhlrCU8sVFTbGYtCdcA104FEZBR8UtaFUYyp1bjNOYBlH9BOk5k3CKPplDYMLCxsDNqbTCSSzEGAA88DbImhBiKRlC6amHQj3GS6BsYmBRpMj2YUmtJhstEH8flwdX7VWU4QT9Ym1IU4HTslNjsnmoagkqit9D2mtaWuPhZPaslBT7P0liynOCOxe9FFcGKydmAz3UV1PhcKOA7TZy8F5xKd2R3mcyYzeFT5pec7lDfMBrwXTeSoGs8FZtWMmQJYlKLqFRhJxzaJhsTWIj0HENyyrdBPDqy4scf0pp4HrWtn5GVTWxjmEzxuGEx9g9H9ImIphLXpCBIrpT5Jm8jhhxjm9GUtaFGPrVALKAKJk1")
                .isEqualTo("jLvZpYHnzi7J2LioTBKIRg22r9Fz2qKoPbhnPk8vVo2IKvtdbZWVzWBvQ9fPhDO9Mg290JmiviQBiBTd9IEqoqvZFSCrL2J8wOIDhJLt0lg8hYGGDgkaPWhwMtjJN0jgxLikgXK8i5TAhlrCU8sVFTbGYtCdcA104FEZBR8UtaFUYyp1bjNOYBlH9BOk5k3CKPplDYMLCxsDNqbTCSSzEGAA88DbImhBiKRlC6amHQj3GS6BsYmBRpMj2YUmtJhstEH8flwdX7VWU4QT9Ym1IU4HTslNjsnmoagkqit9D2mtaWuPhZPaslBT7P0liynOCOxe9FFcGKydmAz3UV1PhcKOA7TZy8F5xKd2R3mcyYzeFT5pec7lDfMBrwXTeSoGs8FZtWMmQJYlKLqFRhJxzaJhsTWIj0HENyyrdBPDqy4scf0pp4HrWtn5GVTWxjmEzxuGEx9g9H9ImIphLXpCBIrpT5Jm8jhhxjm9GUtaFGPrVALKAKJk1")
                .perform();
        Validations.assertThat().object("jLvZpYHnzi7J2LioTBKIRg22r9Fz2qKoPbhnPk8vVo2IKvtdbZWVzWBvQ9fPhDO9Mg290JmiviQBiBTd9IEqoqvZFSCrL2J8wOIDhJLt0lg8hYGGDgkaPWhwMtjJN0jgxLikgXK8i5TAhlrCU8sVFTbGYtCdcA104FEZBR8UtaFUYyp1bjNOYBlH9BOk5k3CKPplDYMLCxsDNqbTCSSzEGAA88DbImhBiKRlC6amHQj3GS6BsYmBRpMj2YUmtJhstEH8flwdX7VWU4QT9Ym1IU4HTslNjsnmoagkqit9D2mtaWuPhZPaslBT7P0liynOCOxe9FFcGKydmAz3UV1PhcKOA7TZy8F5xKd2R3mcyYzeFT5pec7lDfMBrwXTeSoGs8FZtWMmQJYlKLqFRhJxzaJhsTWIj0HENyyrdBPDqy4scf0pp4HrWtn5GVTWxjmEzxuGEx9g9H9ImIphLXpCBIrpT5Jm8jhhxjm9GUtaFGPrVALKAKJk1")
                .isEqualTo("jLvZpYHnzi7J2LioTBKIRg22r9Fz2qKoPbhnPk8vVo2IKvtdbZWVzWBvQ9fPhDO9Mg290JmiviQBiBTd9IEqoqvZFSCrL2J8wOIDhJLt0lg8hYGGDgkaPWhwMtjJN0jgxLikgXK8i5TAhlrCU8sVFTbGYtCdcA104FEZBR8UtaFUYyp1bjNOYBlH9BOk5k3CKPplDYMLCxsDNqbTCSSzEGAA88DbImhBiKRlC6amHQj3GS6BsYmBRpMj2YUmtJhstEH8flwdX7VWU4QT9Ym1IU4HTslNjsnmoagkqit9D2mtaWuPhZPaslBT7P0liynOCOxe9FFcGKydmAz3UV1PhcKOA7TZy8F5xKd2R3mcyYzeFT5pec7lDfMBrwXTeSoGs8FZtWMmQJYlKLqFRhJxzaJhsTWIj0HENyyrdBPDqy4scf0pp4HrWtn5GVTWxjmEzxuGEx9g9H9ImIphLXpCBIrpT5Jm8jhhxjm9GUtaFGPrVALKAKJk1")
                .perform();
    }

    @Test
    public void assertEquals_longCharacters_Discreet() {
        boolean discreetLoggingState = ReportManagerHelper.getDiscreteLogging();
        ReportManagerHelper.setDiscreteLogging(true);
        Validations.assertThat().object("1LH5pROcDBjjQk0t0mCr0lXuzQu9lcGj28kY8R1H81X67eVAQJgWQhILiRWVPUgZ6uCtK5cnBkF55Jr9vYngjGO1Iyf0Mktv6lruDlL9T8MAUPcUZJGHZtji6nIeadujDSNmWMj5d6C8zlFqw0CRqBU0hO5adIasHgBSNoLotAjce3NGXoDwAlp3rYreeV16VIyZXROQY")
                .isEqualTo("1LH5pROcDBjjQk0t0mCr0lXuzQu9lcGj28kY8R1H81X67eVAQJgWQhILiRWVPUgZ6uCtK5cnBkF55Jr9vYngjGO1Iyf0Mktv6lruDlL9T8MAUPcUZJGHZtji6nIeadujDSNmWMj5d6C8zlFqw0CRqBU0hO5adIasHgBSNoLotAjce3NGXoDwAlp3rYreeV16VIyZXROQY")
                .perform();
        ReportManagerHelper.setDiscreteLogging(discreetLoggingState);
    }

    @Test
    public void assertEquals_true_expectedToFail() {
        try {
            Validations.assertThat().number(1).isEqualTo(2);
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertEquals_false_expectedToPass() {
        Validations.assertThat().number(1).doesNotEqual(2);
    }

    @Test
    public void assertEquals_false_expectedToFail() {
        try {
            Validations.assertThat().number(1).doesNotEqual(1);
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_true_greaterThan_expectedToPass() {
        Validations.assertThat().number(10).isGreaterThanOrEquals(2).perform();
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_true_equals_expectedToPass() {
        Validations.assertThat().number(1).isGreaterThanOrEquals(1).perform();
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_true_greaterThan_expectedToFail() {
        try {
            Validations.assertThat().number(2).isGreaterThanOrEquals(1).perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_true_equals_expectedToFail() {
        try {
            Validations.assertThat().number(1).isGreaterThanOrEquals(0).perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_false_greaterThan_expectedToPass() {
        Validations.assertThat().number(1).isLessThan(10).perform();
    }

    @Test
    public void assertComparativeRelation_greaterThanOrEquals_false_greaterThan_expectedToFail() {
        try {
            Validations.assertThat().number(1).isLessThan(2).perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_true_expectedToPass() {
        Validations.assertThat().element(driver, GoogleSearch.googleLogo_image).exists().perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_true_expectedToFail() {
        try {
            Validations.assertThat().element(driver, By.id("fakeElement")).exists().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_false_expectedToPass() {
        Validations.assertThat().element(driver, By.id("fakeElement")).doesNotExist().perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_false_expectedToFail() {
        try {
            Validations.assertThat().element(driver, By.id("hplogo")).doesNotExist().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_true_multipleElementsFound_expectedToFail() {
        try {
            Validations.assertThat().element(driver, By.xpath("//div")).exists().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementExists_false_multipleElementsFound_expectedToFail() {
        try {
            Validations.assertThat().element(driver, By.xpath("//div")).doesNotExist().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_literalComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().isEqualTo("Automation");
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_literalComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().isEqualTo("Automation123");
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_regexComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().matchesRegex("Automation.*").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_regexComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().matchesRegex("Automation").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_containsComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().contains("Automation").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_containsComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().contains("Automation1234").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_caseInsensitiveComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "AUTOMATION");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().equalsIgnoringCaseSensitivity("AutomaTion").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_true_caseInsensitiveComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "AUTOMATION");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().equalsIgnoringCaseSensitivity("AutomaTion123").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_literalComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotEqual("Automation").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_literalComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotEqual("Automation123").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_regexComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotMatchRegex("Automation").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_regexComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotMatchRegex("Automation.*").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_containsComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotContain("Automation1234").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_containsComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "Automation123");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotContain("Automation").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_caseInsensitiveComparison_expectedToPass() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "AUTOMATION");
        Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotEqualIgnoringCaseSensitivity("AutomaTion123").perform();
    }

    @Test(groups = {"WebBased"})
    public void assertElementAttribute_false_caseInsensitiveComparison_expectedToFail() {
        new ElementActions(driver).type(GoogleSearch.getSearchBox_textField(), "AUTOMATION");
        try {
            Validations.assertThat().element(driver, GoogleSearch.getSearchBox_textField()).text().doesNotEqualIgnoringCaseSensitivity("AutomaTion").perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertFileExists_true_expectedToPass() {
        Validations.assertThat().file("src/main/java/com/shaft/gui/element/", "ElementActions.java").exists().perform();
    }

    @Test
    public void assertFileExists_true_expectedToFail() {
        try {
            Validations.assertThat().file("src/main/java/com/shaft/gui/element/", "ElementActions.java_fail").exists().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void assertFileExists_false_expectedToPass() {
        Validations.assertThat().file("src/main/java/com/shaft/gui/element/", "ElementActions.java_fail").doesNotExist().perform();
    }

    @Test
    public void assertFileExists_false_expectedToFail() {
        try {
            Validations.assertThat().file("src/main/java/com/shaft/gui/element/", "ElementActions.java").doesNotExist().perform();
        } catch (AssertionError e) {
            Assert.assertTrue(true);
        }
    }

    @AfterMethod(onlyForGroups = {"WebBased"}, alwaysRun = true)
    public void afterMethod() {
        new BrowserActions(driver).closeCurrentWindow();
    }

    @BeforeMethod(onlyForGroups = {"WebBased"})
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
        new BrowserActions(driver).navigateToURL("https://www.google.com/ncr", "https://www.google.com/");
    }
}