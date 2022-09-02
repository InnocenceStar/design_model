package inno.cor;

public class PMRequestHandle implements RequestHandle{

    RequestHandle requestHandle;
    public PMRequestHandle(RequestHandle requestHandle){
        this.requestHandle = requestHandle;
    }

    @Override
    public void handleRequest(Request request) {
        if(request instanceof AddMoneyRequest){
            System.out.println("要加薪，项目经理审批");
        }else{
            requestHandle.handleRequest(request);
        }
    }
}
