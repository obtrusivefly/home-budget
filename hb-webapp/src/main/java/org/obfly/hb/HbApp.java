package org.obfly.hb;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.obfly.hb.page.HomePage;

public class HbApp extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
