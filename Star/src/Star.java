import java.awt.*;
public class Star{
    private int x, y;
    private int heigth, width;
    private Color color;
    
    public Star(int x,int y, int heigth, int width){
	this.x = x;
	this.y = y;
	this.heigth = heigth;
	this.width = width;
	color = randomizeColors();
    }
    
    public void paint(Graphics g) {
	    g.setColor(color);
		g.drawLine(x+0       ,y+heigth  ,x+width/2,y+0);
		g.drawLine(x+width/2 ,y+0       ,x+width  ,y+heigth);
		g.drawLine(x+width   ,y+heigth  ,x+0      ,y+heigth/3);
		g.drawLine(x+0       ,y+heigth/3,x+width  ,y+heigth/3);
		g.drawLine(x+width   ,y+heigth/3,x+0      ,y+heigth);
    }
    private Color randomizeColors() {
    	int red = (int)(Math.random()*256);
    	int green = (int)(Math.random()*256);
    	int blue = (int)(Math.random()*256);
    	Color myColor = new Color(red,green,blue);
    	return myColor;
    }
    
}
