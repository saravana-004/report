package Stream;

public class Players {
	private String name,team;
	private int  age,run,jersyNo;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setTeam(String team) {
		this.team=team;
}
	public String getTeam() {
		return team;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setRun(int run) {
		this.run=run;
	}
	public int getRun() {
		return run;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo=jersyNo;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public Players(String name,String team,int age,int run,int jersyNo) {
		this.name=name;
		this.team=team;
		this.age=age;
		this.run=run;
		this.jersyNo=jersyNo;
	}
	public String toString() {
		return name+team+age+run+jersyNo;
	}
}
