package com.dolphinwu.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerImpl implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped:" + e.getKeyChar());
		System.out.println("keyTyped:" + e.getKeyCode());
		System.out.println("keyTyped:" + e.getKeyLocation());
		System.out.println("keyTyped:" + e.getWhen());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed:" + e.getKeyChar());
		System.out.println("keyPressed:" + e.getKeyCode());
		System.out.println("keyPressed:" + e.getKeyLocation());
		System.out.println("keyPressed:" + e.getWhen());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased:" + e.getKeyChar());
		System.out.println("keyReleased:" + e.getKeyCode());
		System.out.println("keyReleased:" + e.getKeyLocation());
		System.out.println("keyReleased:" + e.getWhen());
	}

}