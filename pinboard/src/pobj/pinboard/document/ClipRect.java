package pobj.pinboard.document;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ClipRect extends AbstractClip implements Clip{
	
	private GraphicsContext ctx;
	

	
	public ClipRect(double left, double top, double right, double bottom, Color color){
		super(left,top, right, bottom, color);

	}
	
	@Override
	public void draw(GraphicsContext ctx) {
		ctx.setFill(Color.RED);		
		ctx.fillRect(getLeft(),getTop(),getRight()-getLeft(),getBottom()-getTop());		
	}	

	@Override
	public boolean isSelected(double x, double y) {
		
		return super.getLeft()<=x && super.getRight() >=x && super.getTop()<=y && super.getBottom()>=y ;
	}


	@Override
	public Clip copy() {
		return new ClipRect(super.getLeft(), super.getTop(), super.getRight(), super.getBottom(), super.getColor());
	}

}
