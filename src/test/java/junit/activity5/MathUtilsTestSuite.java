package junit.activity5;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("junit")  // Specify the package containing your test classes
public class MathUtilsTestSuite {
}
