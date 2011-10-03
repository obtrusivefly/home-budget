package org.obfly.hb;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.obfly.hb.page.HomePage;

public class HbApp extends WebApplication{
	
    public void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }


	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
