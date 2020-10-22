# State Design Pattern (Java Implementation)

**State** design pattern allows object behaviour to change based on its state.
![](https://github.com/shamy1st/design-pattern-state-java/blob/main/state-uml.png)
### Problem: 
Based on current selected tool (brush, eraser, ...), draw different things on canvas.

    public enum ToolType {
        BRUSH,
        ERASER
    }

    public class Canvas {
        private ToolType currentTool;

        public void mouseDown() {
            if(currentTool == ToolType.BRUSH) {
                System.out.println("Brush Icon");
            } else if (currentTool == ToolType.ERASER) {
                System.out.println("Eraser Icon");
            }
        }

        public void mouseUp() {
            if(currentTool == ToolType.BRUSH) {
                System.out.println("Draw Brush");
            } else if (currentTool == ToolType.ERASER) {
                System.out.println("Eraser Something");
            }
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-state-java/blob/main/state-solution-uml.png)
