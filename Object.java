public class Object {
	
	private Point2D position;	//The cartesian co-ordinates of the player
	private Vector2D velocity;	//The 2D velocity values
	private double direction;	//The rotation of the ship
	private double speed;		//The speed of the ship
	
	public void update () {
		
		double vy = this.velocity.getY();
		double vx = this.velocity.getX();
		
		vy += Math.sin(this.direction) * 0.3;
		vx += Math.cos(this.direction) * 0.3;
		
		this.velocity.setY(vy);
		this.velocity.setX(vx);
		
		int py = (int)this.position.getY();
		int px = (int)this.position.getX();
		
		this.position.setY(py + vy;);
		this.position.setX(px + vx;);
		
	}
	
	public void accelerate (
	
	//Position g&s
	public Point2D getPosition () {
		return this.position;
	}
	public void setPosition (Point2D pos) {
		this.position = pos;
	}
	//Velocity g&s
	public Vector2D getVelocity () {
		return this.velocity;
	}
	public void setVelocity (double vel) {
		this.velocity = velocity;
	}
	//Direction g&s
	public double getDirection () {
		return this.direction;
	}
	public void setDirection (Point2D vel) {
		this.velocity = velocity;
	}
		
}