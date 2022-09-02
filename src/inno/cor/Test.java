package inno.cor;

public class Test {
    public static void main(String[] args) {
        RequestHandle hrRequestHandle = new HRRequestHandle();
        RequestHandle pmRequestHandle = new PMRequestHandle(hrRequestHandle);
        RequestHandle tlRequestHandle = new TLRequestHandle(pmRequestHandle);

        Request request = new LeaveRequest();
        tlRequestHandle.handleRequest(request);

        System.out.println("======");

        request = new AddMoneyRequest();
        tlRequestHandle.handleRequest(request);

        System.out.println("======");

        request = new DimissionRequest();
        pmRequestHandle.handleRequest(request);


    }
}
