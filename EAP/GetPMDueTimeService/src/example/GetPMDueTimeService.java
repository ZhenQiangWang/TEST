package example;

import mypackage.GetPMDueTimeServiceServiceLocator;
import mypackage.GetPMDueTimeService_PortType;

public class GetPMDueTimeService {
    public static void main(String[] argv) {
        try {
            GetPMDueTimeServiceServiceLocator getPMDueTimeServiceServiceLocator = new GetPMDueTimeServiceServiceLocator();
            GetPMDueTimeService_PortType getPMDueTimeService = getPMDueTimeServiceServiceLocator.getGetPMDueTimeService();
            String summer = getPMDueTimeService.getPMDueTimeService("PWWB04");
            System.out.println(summer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
