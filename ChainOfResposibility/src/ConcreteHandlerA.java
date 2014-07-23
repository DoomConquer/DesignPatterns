public class ConcreteHandlerA extends Handler{
	@Override
	public void handleRequest(double request){
		if(request<0.5){
			System.out.println("Concrete handler A.");
		}
		else{
			if(getSuccessor()!=null){
				getSuccessor().handleRequest(request);
			}
			else{
				System.out.println("Request is not handle.");
			}
		}
	}
}