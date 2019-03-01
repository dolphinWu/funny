package com.dolphinwu.view;

import java.awt.*;

public class NavBar extends MenuBar{
	
	private static final long serialVersionUID = -2654932942420298031L;

	public NavBar() {
		Menu menu = new Menu("文件");
		this.add(menu);
		menu.add(new MenuItem("新建"));
	}
	
	
}
