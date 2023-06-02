package Test_Case;
import org.testng.annotations.Test;

import Page_Functions.MarketplacePage;
import Page_Functions.Marketplace_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;

public class Marketplace_Test_Case_Implementation extends CoreTestIntegration {
	
	@Test
	public void checkAnchorLinks() {
		MarketplacePage.pageToMarketplace();
		Marketplace_Page_Func.checkLinks();
	}
}
