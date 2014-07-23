public class ConcreteHandlerC extends Handler{
	@Override
	public void handleRequest(double request){
		if(request>=1){
			System.out.println("Concrete handler C.");
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