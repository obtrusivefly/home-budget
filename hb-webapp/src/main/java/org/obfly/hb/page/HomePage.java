package org.obfly.hb.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

    public HomePage(final PageParameters parameters) {
    	 
        add(new Label("message", "Hello World, Wicket"));
 
    }
	
}
