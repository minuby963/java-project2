
public class Individual {
	private PointPosition position;
	private int age;
	private Condition condition;
	
	public Individual(){
		age=0;
		condition = new Condition();
	}
	public Individual(PointPosition position){
		setPosition(position);
		setAge(0);
		setCondition(new Condition());
	}
	public Individual(PointPosition position, int age, Condition con){
		setPosition(position);
		setAge(age);
		setCondition(con);
	} 
	
	public void setPosition(PointPosition pos){
		this.position = pos;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setCondition(Condition con){
		this.condition = new Condition(con);
	}
	public void updateAge(){
		age = age+1;
	}
	
	@Override
	public String toString(){
		return "POINT: \n"+position.toString()+"age: "+age+"\n"+condition.toString();
		//return "POINT: \n"+position.toString()+"age: "+age+"\n"+condition.toString();
	}
}
