package Test_Case;
import org.testng.annotations.Test;
import Page_Functions.Marketplace_Page_Func;
import Utils.CoreActions;
import Utils.TestIntegrationMarketplace;
public class Marketplace_Test_Case_Implementation extends TestIntegrationMarketplace {
	
	@Test
	public void checkAnchorLinks() {
		Marketplace_Page_Func.checkLinks();
	}
}
