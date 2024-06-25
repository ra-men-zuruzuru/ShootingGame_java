
public class DoropEnemy extends Enemy {
	public DoropEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=1*GameWorld.stage;
	}
	public void draw(MyFrame f) {
		f.setColor(0, 126, 0);
		f.fillRect(x, y, 30, 10);
		f.fillRect(x+10, y+10, 10, 20);
	}
	
	public void move() {
		super.move();
		vy+=GameWorld.stage*0.5;
	}
	
}
