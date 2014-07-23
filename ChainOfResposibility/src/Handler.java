public abstract class Handler {
	private Handler successor=null;
	protected Handler getSuccessor(){
		return successor;
	}
	protected void setSuccessor(Handler successor){
		this.successor=successor;
	}
	protected abstract void handleRequest(double request);
}