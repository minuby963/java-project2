public class PointPosition {
	private int posX;
	private int posY;
	
	public PointPosition(PointPosition position){
		posX = position.getPosX();
		posY = position.getPosY();
	}
	public PointPosition(int x, int y){
		setPosX(x);
		setPosY(y);
	}
	public void setPosX(int x){
		posX = x;
	}
	
	public void setPosY(int y){
		posY = y;
	}
	public int getPosX(){
		return posX;
	}

	public int getPosY(){
		return posY;
	}
	@Override
	public String toString(){
		return "posX: "+posX+" posY: "+posY+"\n";
	}
	
}
