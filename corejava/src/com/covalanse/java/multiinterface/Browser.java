package com.covalanse.java.multiinterface;

public class Browser {
	void open(Google g) {
		g.login();
		g.shareDocument();
	}

}
