package example;

import mypackage.GetProductListServiceServiceLocator;
import mypackage.GetProductListService_PortType;

public class GetProductListService {
    public static void main(String[] argv) {
        try {
            GetProductListServiceServiceLocator getProductListServiceServiceLocator = new GetProductListServiceServiceLocator();
            GetProductListService_PortType getProductListService = getProductListServiceServiceLocator.getGetProductListService();
            String summer = getProductListService.getProductListService();
            System.out.println(summer);
        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
