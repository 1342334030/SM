package com.example.demo.dto;

public class EmpAndMgr {
    String empName;
    String mgrName;

    public EmpAndMgr() {
    }

    public EmpAndMgr(String empName, String mgrName) {
        this.empName = empName;
        this.mgrName = mgrName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    @Override
    public String toString() {
        return "EmpAndMgr{" +
                "empName='" + empName + '\'' +
                ", mgrName='" + mgrName + '\'' +
                '}';
    }
}
