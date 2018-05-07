package features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:features",
//        features = "classpath:features",
//@CucumberOptions(features = "classpath:features/bigdata/bigData.feature:55",
        glue = "step",
        format = {"pretty", "html:target/RegTestSuite-Reports"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}

