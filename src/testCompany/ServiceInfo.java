package testCompany;

public class ServiceInfo
{
    public ServiceAuthInfo abisInfo = new ServiceAuthInfo();
    public ServiceAuthInfo jbossInfo = new ServiceAuthInfo();

    public static void main(String[] args)
    {
        ServiceInfo serviceInfo = new ServiceInfo();
        System.out.println(serviceInfo.abisInfo.password);
    }
}
