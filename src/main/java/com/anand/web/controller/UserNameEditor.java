package com.anand.web.controller;

import java.beans.PropertyEditorSupport;

public class UserNameEditor extends PropertyEditorSupport {

	public void setAsText(String userName) throws IllegalArgumentException {

		if (userName.contains("Mr.") || userName.contains("Ms.")) {

			setValue(userName);
		} else {
			userName = "Gay. "+ userName;
			setValue(userName);
		}

	}
}
