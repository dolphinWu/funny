package com.dolphinwu.view;

import com.dolphinwu.listener.KeyListenerImpl;
import com.dolphinwu.listener.WindowListenerImpl;
import com.dolphinwu.util.CommonUtils;
import com.dolphinwu.util.ConfigUtils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author wudaoping
 *
 */
public class MainView extends Frame {

	private static final long serialVersionUID = -892958169374060075L;
	
	private static final int APPLICATION_WIGHT = ConfigUtils.getIntProperty("mianView.size.width");
	private static final int APPLICATION_HEIGHT = ConfigUtils.getIntProperty("mianView.size.height");
	
	public MainView() {
		initView();
	}

	private void initView() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - APPLICATION_WIGHT) / 2, (screenSize.height - APPLICATION_HEIGHT) / 2);
		this.setSize(APPLICATION_WIGHT, APPLICATION_HEIGHT);
		addBackground();
		this.setResizable(false);
		this.setMenuBar(new NavBar());
		this.setVisible(true);
		this.addWindowListener(new WindowListenerImpl());
		this.addKeyListener(new KeyListenerImpl());
	}
	
	private void addBackground() {
		URL fileURLFromResources = CommonUtils.getFileURLFromResources("image/background.jpg");
		Icon image = new ImageIcon(fileURLFromResources);
		JLabel label = new JLabel(image);
		label.setLocation(2, 2);
		label.setSize(APPLICATION_WIGHT, APPLICATION_HEIGHT);
		this.add(label);
	}
}