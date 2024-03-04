package pobj.pinboard.document;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ClipEllipse extends AbstractClip implements Clip{
	
	private GraphicsContext ctx;
	//private double haut, gauche, bas, droite;
	//Color couleur; 
	
	public ClipEllipse(double left, double top, double right, double bottom, Color color) {
		super(left,top, right, bottom, color);
	
		
	}
	
	
	@Override 
	public boolean isSelected(double x, double y) {
		double cx, cy, rx, ry, cote1, cote2;
		cx=(super.getLeft()+super.getRight())/2;
		cy=(super.getBottom()+super.getTop())/2;
		rx=(super.getRight()-super.getLeft())/2;
		ry=(super.getBottom()-super.getTop())/2;
		cote1=((x-cx)/rx);
		cote2=((y-cy)/ry);
		return (Math.pow(cote1, 2)+Math.pow(cote2,  2))<=1;
	}


	@Override
	public void draw(GraphicsContext ctx) {
		ctx.setFill(Color.BLUE);		
		ctx.fillOval(getLeft(),getTop(),getRight()-getLeft(),getBottom()-getTop());
	}


	@Override
	public Clip copy() {
		return new ClipEllipse(getLeft(),getTop(),getRight(),getBottom(), getColor());
	}
	
	
}
