package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Bddfeatures",glue="StepDef")

public class Run1 extends AbstractTestNGCucumberTests{

}
