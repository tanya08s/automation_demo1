package Object_Repository;

import org.openqa.selenium.By;

public class Broker_Manage_Brokerage_Page {
	
	public static final By decline_team=By.xpath("((//table[@id='manage_brokerage_dt']//tbody//tr//td)[6]//div//button)[2]");
    public static final By accept_team=By.xpath("((//div[@id='manage_brokerageteamMember_mx_wd_cont']//table[@id='manage_brokerage_dt']//tbody//tr//td)[6]//div//button)[1]");
    public static final By team_acceptance_alert= By.xpath("//div[@class='toastHeader']");

}
