
public class EnamyBase extends Enemy{
	public EnamyBase(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		if(x>300)vx=-1;
		if(x<100)vx=1;
	}

}
