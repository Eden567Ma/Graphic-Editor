package pobj.pinboard.document;

import javafx.scene.paint.Color;

public abstract class AbstractClip {
	
	double haut, gauche, bas, droite;
	Color couleur;
	
	public AbstractClip(double left, double top, double right, double bottom, Color color){
		haut=top;
		bas=bottom;
		gauche=left;
		droite=right;
		couleur=color;
	}
   
   public double getTop() {
		
		return haut;
	}


	public double getLeft() {
		// TODO Auto-generated method stub
		return gauche;
	}


	public double getBottom() {
		// TODO Auto-generated method stub
		return bas;
	}

	
	public double getRight() {
		// TODO Auto-generated method stub
		return droite;
	}

	
	public void setGeometry(double left, double top, double right, double bottom) {
		haut=top;
		bas=bottom;
		droite= right;
		gauche=left;
		
		
	}

	
	public void move(double x, double y) {
		haut=haut+y;
		bas=bas+y;
		droite= droite+x;
		gauche=gauche+x;
		
	}


	public boolean isSelected(double x, double y) {
		
		return gauche<=x && droite >=x && haut<=y && bas>=y ;
	}

	
	public void setColor(Color c) {
		couleur=c;
		
	}

	
	public Color getColor() {
	
		return couleur;
	}


	
}
