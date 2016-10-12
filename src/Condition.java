public class Condition {
	private int condition;
	/*
	 * 0 - dead
	 * 1 - alive
	 * 2 - starved
	 * 
	 * 
	 */
	public Condition(){
		condition = 1;
	}
	public Condition(Condition con){
		condition = con.getConditionSymbol();
	}
	public Condition(String con){
		switch(con.toLowerCase()){
		case "dead":
			condition = 0;
			break;
		case "alive":
			condition = 1;
			break;
		case "starved":
			condition = 2;
			break;
		default:
			condition = 3;
			break;
		}
	}
	public int getConditionSymbol(){
		return condition;
	}
	public String getConditionName(){
		switch(condition){
		case 0:
			return "dead";
		case 1:
			return "alive";
		case 2:
			return "starved";
		default:
			return "Unknown";
		}
	}
	@Override
	public String toString(){
		return "condition: "+getConditionName()+" \n";
	}
}
