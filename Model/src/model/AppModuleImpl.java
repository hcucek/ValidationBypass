package model;

import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 18 11:08:34 CEST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for EmployeesVO1.
     * @return EmployeesVO1
     */
    public EmployeesVOImpl getEmployeesVO1() {
        return (EmployeesVOImpl) findViewObject("EmployeesVO1");
    }
}

