
public class DoropEnemy extends Enemy {
	public DoropEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	
	public void move() {
		super.move();
		vy+=vx+0.1;
	}
	
}
