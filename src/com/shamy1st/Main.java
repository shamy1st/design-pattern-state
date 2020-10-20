package com.shamy1st;

import com.shamy1st.state.Canvas;
import com.shamy1st.state.EraserTool;

public class Main {

	public static void main(String[] args) {
		
		Canvas canvas = new Canvas();
		
		canvas.setCurrentTool(new EraserTool());
		
		canvas.mouseDown();
		canvas.mouseUp();
		
	}
}
