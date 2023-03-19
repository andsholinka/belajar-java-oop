package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class NestedApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("PT. INKA Florist");

        Company.Employee employee = company.new Employee();
        employee.setName("Feb");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
