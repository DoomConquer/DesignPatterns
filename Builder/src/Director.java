public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder=builder;
	}
	public Message construct(){
		builder.builderSubject();
		builder.buildBody();
		builder.buildSendDate();
		return builder.getMessage();
	}
}