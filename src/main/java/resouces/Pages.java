package resouces;

import org.openqa.selenium.support.PageFactory;

import com.skyscanner.BaseMain;
import com.skyscanner.page_objects.HomePage;
import com.skyscanner.page_objects.ResultsPage;

public class Pages {

	static <T> T getPages(T page) {
		PageFactory.initElements(new BaseMain().getDriver(), page);
		return page;
	}

	public static HomePage home() {
		HomePage page = new HomePage();
		return getPages(page);
	}

	public static ResultsPage results() {
		ResultsPage page = new ResultsPage();
		return getPages(page);
	}

}
