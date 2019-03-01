package com.dolphinwu.listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerImpl implements WindowListener {
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	/**
	 * 激活״̬
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	/**
	 * 失去焦点
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}