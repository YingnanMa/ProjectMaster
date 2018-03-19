package project301.ActivityTest;

/**
 * @classname : ProviderActivityTest
 * @class Detail : User in this activity can choose to be a provider or requestor
 * @Date :   18/03/2018
 * @author : Wang Dong
 * @version 1.0
 * @copyright : copyright (c) 2018 CMPUT301W18T25
 */

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import project301.R;
import project301.allUserActivity.LogInActivity;
import project301.allUserActivity.SignUpActivity;
import project301.allUserActivity.UserCharacterActivity;
import project301.providerActivity.ProviderBidHistoryActivity;
import project301.providerActivity.ProviderEditInfoActivity;
import project301.providerActivity.ProviderMainActivity;
import project301.providerActivity.ProviderMapActivity;
import com.robotium.solo.Solo;

public class ProviderActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public ProviderActivityTest() {
        super(LogInActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }


    public void testProviderMainActivity() {
        solo.assertCurrentActivity("Wrong Activity", LogInActivity.class);

        solo.enterText((EditText) solo.getView(R.id.login_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.login_password),"passward");

        solo.clickOnButton("Log In");

        solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("provider");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        //solo.goBack();

        solo.enterText((EditText) solo.getView(R.id.search_info),"some test");

        solo.clickOnButton("Search");

        //solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        //solo.goBack();

        //solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("View On Map");

        solo.assertCurrentActivity("Wrong Activity", ProviderMapActivity.class);

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        solo.clickOnButton("Bid History");

        solo.assertCurrentActivity("Wrong Activity", ProviderBidHistoryActivity.class);

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        solo.clickOnButton("edit profile");

        solo.assertCurrentActivity("Wrong Activity", ProviderEditInfoActivity.class);

        solo.enterText((EditText) solo.getView(R.id.edit_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.edit_email),"wdong2@ualberta.ca");

        solo.enterText((EditText) solo.getView(R.id.edit_phone),"1234567890");

        solo.enterText((EditText) solo.getView(R.id.edit_passward),"abc");

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);
    }

    public void testProviderEditProfileActivity() {
        solo.assertCurrentActivity("Wrong Activity", LogInActivity.class);
/**
 solo.clickOnButton("Log In");
 solo.assertCurrentActivity("Wrong Activity", SignUpActivity.class);
 solo.enterText((EditText) solo.getView(R.id.signup_name),"wdong2");
 */

        solo.enterText((EditText) solo.getView(R.id.login_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.login_password),"passward");

        solo.clickOnButton("Log In");

        solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("provider");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        //solo.goBack();

        //solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("edit profile");

        solo.assertCurrentActivity("Wrong Activity", ProviderEditInfoActivity.class);

        solo.enterText((EditText) solo.getView(R.id.edit_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.edit_email),"wdong2@ualberta.ca");

        solo.enterText((EditText) solo.getView(R.id.edit_phone),"1234567890");

        solo.enterText((EditText) solo.getView(R.id.edit_passward),"abc");

        solo.clickOnButton("Save");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        solo.enterText((EditText) solo.getView(R.id.search_info),"some test");

        solo.goBack();

        solo.enterText((EditText) solo.getView(R.id.edit_name),"");

        solo.enterText((EditText) solo.getView(R.id.edit_email),"");

        solo.enterText((EditText) solo.getView(R.id.edit_phone),"");

        solo.enterText((EditText) solo.getView(R.id.edit_passward),"");

        solo.clickOnButton("Back");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        solo.goBack();

        solo.goBack();

        solo.goBack();

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", LogInActivity.class);

    }

    public void testProviderMapActivity() {
        solo.assertCurrentActivity("Wrong Activity", LogInActivity.class);

        solo.clickOnButton("Sign Up");

        solo.assertCurrentActivity("Wrong Activity", SignUpActivity.class);
/**
 solo.clickOnButton("Log In");
 solo.assertCurrentActivity("Wrong Activity", SignUpActivity.class);
 solo.enterText((EditText) solo.getView(R.id.signup_name),"wdong2");
 */

        solo.enterText((EditText) solo.getView(R.id.signup_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.signup_password),"passward");

        solo.clickOnButton("Log In");

        solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("provider");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        //solo.goBack();

        //solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("View On Map");

        solo.assertCurrentActivity("Wrong Activity", ProviderMapActivity.class);

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);
    }

    public void testProviderBidHistoryActivity() {

        solo.assertCurrentActivity("Wrong Activity", LogInActivity.class);

        solo.clickOnButton("Sign Up");

        solo.assertCurrentActivity("Wrong Activity", SignUpActivity.class);
/**
 solo.clickOnButton("Log In");
 solo.assertCurrentActivity("Wrong Activity", SignUpActivity.class);
 solo.enterText((EditText) solo.getView(R.id.signup_name),"wdong2");
 */

        solo.enterText((EditText) solo.getView(R.id.signup_name),"wdong2");

        solo.enterText((EditText) solo.getView(R.id.signup_password),"passward");

        solo.clickOnButton("Log In");

        solo.assertCurrentActivity("Wrong Activity", UserCharacterActivity.class);

        solo.clickOnButton("provider");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

        solo.clickOnButton("Bid History");

        solo.assertCurrentActivity("Wrong Activity", ProviderBidHistoryActivity.class);

        solo.clickOnButton("Back");

        solo.assertCurrentActivity("Wrong Activity", ProviderMainActivity.class);

    }
}
