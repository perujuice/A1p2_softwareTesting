package a1p2_softwaretesting;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
    BookTest.class, 
})
public class LibraryTestSuite {
    // This class is just a holder for the suite annotations
}



