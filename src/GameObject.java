
public class GameObject {
	private BoundingBox box;
	
	public GameObject(BoundingBox box){
		this.box = box;
	}

	/**
	 * @return the box
	 */
	public BoundingBox getBox() {
		return box;
	}

	/**
	 * @param box the box to set
	 */
	public void setBox(BoundingBox box) {
		this.box = box;
	}
}
