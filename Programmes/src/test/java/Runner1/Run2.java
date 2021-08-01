package Runner1;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="BddFeatures",glue="StepDef2")
public class Run2 extends AbstractTestNGCucumberTests {

}
