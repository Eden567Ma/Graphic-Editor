package pobj.pinboard.document;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Board implements Clip{
	
	private double haut, bas, gauche, droite;
	private Color couleur;
	private Clip c;
	private List<Clip>  liste;
	
	public Board() {
		liste= new ArrayList<Clip>();

	}
	
	public List<Clip> getContents(){
		return liste;
	}
	
	 public void addClip(Clip clip) {
		 liste.add(clip);
	 }
	 
	 public void addClip(List<Clip> clip) {
		 
		 for( Clip element : clip) {
		     liste.add(element);
		 }
	 }
	 public void removeClip(Clip clip) {
		 liste.remove(clip);
	 }
	 
	 public void removeClip(List<Clip> clip) {
		 
		 for( Clip element : clip) {
		     liste.remove(element);
		 }
	 }

	@Override
	public void draw(GraphicsContext ctx) {
		c=new ClipRect(0, 0,ctx.getCanvas().getWidth(),ctx.getCanvas().getHeight(),Color.WHITE);
		for (Clip w : liste ) {
			w.draw(ctx);
		}
			
	}

	@Override
	public double getTop() {
		return haut;
	}

	@Override
	public double getLeft() {
		return gauche;
	}

	@Override
	public double getBottom() {
		return bas;
	}

	@Override
	public double getRight() {
		return droite;
	}

	@Override
	public void setGeometry(double left, double top, double right, double bottom) {
		haut=top;
		bas=bottom;
		droite= right;
		gauche=left;
				
	}
	@Override
	public void move(double x, double y) {
		haut=haut+y;
		bas=bas+y;
		droite= droite+x;
		gauche=gauche+x;
		
	}

	@Override
	public boolean isSelected(double x, double y) {
		
		return gauche<=x && droite >=x && haut<=y && bas>=y ;
	}

	@Override
	public void setColor(Color c) {
		couleur=c;
		
	}

	@Override
	public Color getColor() {
	
		return couleur;
	}

	@Override
	public Clip copy() {
		return c.copy();
	}

}
