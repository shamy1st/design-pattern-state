package com.shamy1st.state;

public class Canvas {
	
	private Tool currentTool;

	public void mouseDown() {
		this.currentTool.mouseDown();
	}
	
	public void mouseUp() {
		this.currentTool.mouseUp();
	}
	
	public Tool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
}
