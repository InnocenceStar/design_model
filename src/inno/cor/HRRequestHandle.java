package inno.cor;

public class HRRequestHandle implements RequestHandle{
    @Override
    public void handleRequest(Request request) {
        if(request instanceof DimissionRequest){
            System.out.println("要离职，人事审批");
        }
        System.out.println("请求完毕");
    }
}
