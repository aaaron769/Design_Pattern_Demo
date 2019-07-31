package FactoryPattern_Demo;


import java.io.*;

/**
 * this is the client request and asks planFactory to crate an instance based
 * on the users input string saying.
 */
class GenerateBill{
    public static void main(String args[])throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();

        // the getPlan in the planFactory will create instance of user rquest based on input string
        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName);
        p.getRate();
        p.calculateBill(4);
    }
}//end of GenerateBill class.
